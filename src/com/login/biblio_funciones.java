/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Elias
 */
public class biblio_funciones {
    
    //encriptar contraseña con MD5
    public static String encriptar(String password){
        String passwordEncriptado = null;
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(password.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
            }
            passwordEncriptado = sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        return passwordEncriptado;
    }

    //Dialog que pide un string
    public static String pedirString(String mensaje, String titulo){
        String respuesta = javax.swing.JOptionPane.showInputDialog(null, mensaje, titulo, 3);
        return respuesta;
    }

   
    //MessageBox personalizado con un mensaje, un titulo y un tipo de mensaje
    public static void mensaje(String mensaje, String titulo, int tipo){
        javax.swing.JOptionPane.showMessageDialog(null, mensaje, titulo, tipo);
        //ejemplo de uso: mensaje("Mensaje de prueba", "Titulo de prueba", 1);
    }

  
    //MessageBox personalizado con un mensaje, un titulo y 2 botones de respuesta
    public static int mensajeDecision(String mensaje, String titulo, String boton1, String boton2){
        int respuesta = javax.swing.JOptionPane.showConfirmDialog(null, mensaje, titulo, 0, 3, null);
        return respuesta;
    }

    public static List<String> tratarRequest(String datos) {
        //Separa los datos por | para cada fila y por -- para cada columna
        String[] filas = datos.split("\\|");
        //Lista con su nombre y su id
        List<String> lista = new java.util.ArrayList<>();
        
        for (String fila : filas) {
            String[] columnas = fila.split("--");
            lista.add(columnas[0]+"_"+columnas[1]);  
        }

        //mostrar la lista en un dialog
        return lista;
    
    }
    
    

}
