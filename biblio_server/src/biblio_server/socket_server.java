/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblio_server;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

/**
 *
 * @author Elias
 */
public class socket_server {

    // Contructor que cree un socket en un puerto 
    private final Socket socket;
    private final ServerSocket serverSocket;

    public socket_server(int puerto) throws IOException {
        serverSocket = new ServerSocket(puerto);
        socket = serverSocket.accept();

        // se crea un hilo para que el servidor pueda recibir y enviar datos al mismo tiempo
        new Thread(() -> {
            try {
                while (true) {
                    String solicitud = recibirSolicitud();
                    procesarSolicitud(solicitud);
                }
            } catch (IOException ex) {
                System.out.println("Error al recibir solicitud");
            }
        }).start();

        
    }
    
    // metodo para recibir solicitudes de los clientes
    public String recibirSolicitud() throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String solicitud = entrada.readLine();
        return solicitud;
    }
    // metodo para enviar datos al cliente
    public void enviarDatos(String datos) throws IOException {
        PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
        salida.println(datos);
    } 

    // si el cliente se desconecta se cierra el socket
    public void desconectar() throws IOException {
        socket.close();
    }

    // procesar la solicitud del cliente y ejecutar la funcion correspondiente de la clase biblio_funciones
    public void procesarSolicitud(String solicitud) throws IOException {
        String[] datos = solicitud.split(",");
        String respuesta = "";
        switch (datos[0]) {
            case "insertar":
                try {
                    biblio_funciones.insertar(datos[1], datos[2].split(";"));
                    respuesta = "Datos insertados";
                } catch (SQLException ex) {
                    respuesta = "Error al insertar datos";
                }
                break;
            case "actualizar":
                try {
                    biblio_funciones.actualizar(datos[1], datos[2].split(";"), datos[3]);
                    respuesta = "Datos actualizados";
                } catch (SQLException ex) {
                    respuesta = "Error al actualizar datos";
                }
                break;
            case "eliminar":
                try {
                    biblio_funciones.eliminar(datos[1], datos[2]);
                    respuesta = "Datos eliminados";
                } catch (SQLException ex) {
                    respuesta = "Error al eliminar datos";
                }
                break;
            case "consultar":
                try {
                    respuesta = biblio_funciones.consultar(datos[1], datos[2]);
                } catch (SQLException ex) {
                    respuesta = "Error al consultar datos";
                }
                break;
            default:
                respuesta = "Solicitud no valida";
                break;
        }
        enviarDatos(respuesta);
    }
}
