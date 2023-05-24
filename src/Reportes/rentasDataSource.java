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
    
    public rentasDataSource(){
        index=-1;
        String Datos = a.obtener("/obtener_rentas");
        //Separar por filas
        String [] filas = Datos.split("\\|");
        //Separar por columnas
        String [][] columnas = new String[filas.length][4];
        for(int i=0;i<filas.length;i++){
            columnas[i]=filas[i].split("__");
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
    
    public static JRDataSource getDataSource(){
        return new rentasDataSource();
    }
}
