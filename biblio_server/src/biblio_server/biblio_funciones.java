/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblio_server;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.net.Socket;
import java.io.*;
import java.net.ServerSocket;
/**
 *
 * @author Elias
 */
public class biblio_funciones {
    
    // metodo para conectar a la base de datos
    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "root");
            System.out.println("Conectado");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al conectar");
        }
        return conn;
    }

    // metodo para insertar datos en la base de datos con la tabla y un array de datos
    public static void insertar(String tabla, String[] datos) throws SQLException {
        try (Connection conn = getConnection()) {
            String sql = "INSERT INTO " + tabla + " VALUES (";
            for (int i = 0; i < datos.length; i++) {
                sql += "'" + datos[i] + "'";
                if (i < datos.length - 1) {
                    sql += ",";
                }
            }
            sql += ")";
            conn.createStatement().execute(sql);
        }
    }

    // metodo para actualizar datos en la base de datos con la tabla, un array de datos y un id
    public static void actualizar(String tabla, String[] datos, String id) throws SQLException {
        try (Connection conn = getConnection()) {
            String sql = "UPDATE " + tabla + " SET ";
            for (int i = 0; i < datos.length; i++) {
                sql += datos[i];
                if (i < datos.length - 1) {
                    sql += ",";
                }
            }
            sql += " WHERE id = " + id;
            conn.createStatement().execute(sql);
        }
    }
    
    // metodo para eliminar datos en la base de datos con la tabla y un id
    public static void eliminar(String tabla, String id) throws SQLException {
        try (Connection conn = getConnection()) {
            String sql = "DELETE FROM " + tabla + " WHERE id = " + id;
            conn.createStatement().execute(sql);
        }
    }

    // metodo para consultar datos en la base de datos con la tabla y un id
    public static String consultar(String tabla, String id) throws SQLException {
        String resultado;
        try (Connection conn = getConnection()) {
            String sql = "SELECT * FROM " + tabla + " WHERE id = " + id;
            resultado = conn.createStatement().executeQuery(sql).toString();
        }
        return resultado;
    }

    // metodo para consultar todos los datos en la base de datos con la tabla
    public static String consultarTodos(String tabla) throws SQLException {
        String resultado;
        try (Connection conn = getConnection()) {
            String sql = "SELECT * FROM " + tabla;
            resultado = conn.createStatement().executeQuery(sql).toString();
        }
        return resultado;
    }

    // iniciar socket
    public static void iniciarSocket() throws IOException {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Servidor iniciado");
        while (true) {
            try (Socket socket = server.accept()) {
                System.out.println("Cliente conectado");
                DataInputStream entrada = new DataInputStream(socket.getInputStream());
                DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
                String mensaje = entrada.readUTF();
                System.out.println(mensaje);
                salida.writeUTF("Hola cliente");
            }
        }
        
    }


}
