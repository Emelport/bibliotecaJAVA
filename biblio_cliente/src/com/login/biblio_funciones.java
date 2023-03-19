/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
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

    // Desencriptar contraseña con MD5
    public static String desencriptar(String password){
        String passwordDesencriptado = null;
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(password.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
            }
            passwordDesencriptado = sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        return passwordDesencriptado;
    }

    //MessageBox personalizado con un mensaje, un titulo y un tipo de mensaje
    public static void mensaje(String mensaje, String titulo, int tipo){
        javax.swing.JOptionPane.showMessageDialog(null, mensaje, titulo, tipo);
        //ejemplo de uso: mensaje("Mensaje de prueba", "Titulo de prueba", 1);
    }

    //Cuando se cierra la ventana de login, se cierra el programa
    public static void cerrar(){
        System.exit(0);
    }

    //cuando se cierra alguna ventana, se cierra la ventana actual
    public static void cerrarVentana(javax.swing.JFrame ventana){
        ventana.dispose();
    }

    //Ocultar la ventana actual
    public static void ocultarVentana(javax.swing.JFrame ventana){
        ventana.setVisible(false);
    }

    //Mostrar la ventana actual
    public static void mostrarVentana(javax.swing.JFrame ventana){
        ventana.setVisible(true);
    }


    // enviar un mensaje al socket del servidor
    public static void enviarInstruccion(Socket socket, String mensaje){
        try {
            ObjectOutputStream salida = new ObjectOutputStream(socket.getOutputStream());
            salida.writeObject(mensaje);
        } catch (IOException ex) {
            Logger.getLogger(biblio_funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }





}
