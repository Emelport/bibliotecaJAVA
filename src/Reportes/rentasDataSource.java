/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reportes;

import net.sf.jasperreports.engine.*;
import com.funciones.Api;
/**
 *
 * @author Elias
 */
public class rentasDataSource implements JRDataSource {
    
    private final Object [][] listadoRentas;
    private int index;
    Api a = new Api();
    public String json="";
  
    
    public rentasDataSource(){

        //Inicializar el arreglo vacio
        listadoRentas = new String[0][0];
    }
    
    public rentasDataSource(String fecha_ini,String fecha_final){
       
       String ruta = "/obtener_reservaciones/" + fecha_ini + "/" + fecha_final;
       index = -1;
       String datos = a.obtener(ruta);

       // Separar los datos por filas
       String[] filas = datos.split("\\|");
       // Crear matriz para almacenar los valores de los campos
       String[][] columnas = new String[filas.length][];

       // Recorrer las filas y separar los campos
       for (int i = 0; i < filas.length; i++) {
           String fila = filas[i];
           // Separar los campos individuales
           String[] campos = fila.split("--");
           columnas[i] = campos;
        }
    
        listadoRentas = columnas;
    }
    
    @Override
    public boolean next() throws JRException{
        index++;
        return (index<listadoRentas.length);
    }
    
    @Override
    public Object getFieldValue(JRField jrf) throws JRException{
        Object value=null;
        String fieldName=jrf.getName();
        
        switch(fieldName){
            case "ID" -> value=listadoRentas[index][0];
            case "CLIENTE" -> value=listadoRentas[index][1];
            case "LIBRO" -> value=listadoRentas[index][2];
            case "TOTAL" -> value=listadoRentas[index][3];              
        }
        return value;
    }
    
    public static JRDataSource getDataSource(String fecha_ini,String fecha_final){
        return new rentasDataSource(fecha_ini,fecha_final);
    }
      
    public static JRDataSource getDataSource(){
        return new rentasDataSource();
    }
}
