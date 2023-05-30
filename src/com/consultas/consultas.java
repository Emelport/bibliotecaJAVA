/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.consultas;

import Reportes.rentasDataSource;
import com.funciones.Api;
import com.login.biblio_funciones;
import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import com.linuxense.javadbf.DBFDataType;
import com.linuxense.javadbf.DBFField;
import com.linuxense.javadbf.DBFWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;



/**
 *
 * @author Elias
 */
public class Consultas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Consultas
     */
        public static JPanel rentas_por_periodo = new JPanel();
        public static JPanel compras_por_periodo = new JPanel();
        public static JPanel localizar_libro = new JPanel();
        public static String consulta = "";
        //Jspinner con modelo de fecha
        public static JSpinner fecha_inicio = new JSpinner(new javax.swing.SpinnerDateModel());
        public static JSpinner fecha_fin = new JSpinner(new javax.swing.SpinnerDateModel());
        public static JSpinner fecha_inicio2 = new JSpinner(new javax.swing.SpinnerDateModel());
        public static JSpinner fecha_fin2 = new JSpinner(new javax.swing.SpinnerDateModel());


    public Consultas() {
        initComponents();

        //Rentas por periodo
        rentas_por_periodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Rentas por periodo"));
        rentas_por_periodo.add(new javax.swing.JLabel("Fecha inicio:"));
        rentas_por_periodo.add(fecha_inicio);
        rentas_por_periodo.add(new javax.swing.JLabel("Fecha fin:"));
        rentas_por_periodo.add(fecha_fin);

        //Compras por periodo
        compras_por_periodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Compras por periodo"));
        compras_por_periodo.add(new javax.swing.JLabel("Fecha inicio:"));
        compras_por_periodo.add(fecha_inicio2);
        compras_por_periodo.add(new javax.swing.JLabel("Fecha fin:"));
        compras_por_periodo.add(fecha_fin2);

        //Localizar libro
        localizar_libro.setBorder(javax.swing.BorderFactory.createTitledBorder("Localizar libro"));
        JTextField nombre = new JTextField();
        nombre.setColumns(20);
        localizar_libro.add(new javax.swing.JLabel("Nombre del Libro:"));
        localizar_libro.add(nombre);
        
        jInternalFrame1.setLayout(new GridLayout(1,1));
        jInternalFrame1.setBackground(new Color(255, 255, 255, 0));
        jInternalFrame1.setTitle("INGRESE LOS PARAMETROS QUE SE SOLICITAN");
    }

    private void consultar() {
        Api a = new Api();
        biblio_funciones.mensaje("Entra", "Prueba", 1);
        // Crear un objeto DBFWriter
        switch(jComboBox1.getSelectedIndex()){
            case 0 -> {
                
                //Sacar datos de los jDateChooser en formato yyyy-mm-dd
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String fechaini = formatter.format(fecha_inicio.getValue()); 
                String fechafin = formatter.format(fecha_fin.getValue());
//              
                String ruta = "/obtener_reservaciones/" + fechaini + "/" + fechafin;
                //String datos = a.obtener(ruta);
                //List<String> filas = biblio_funciones.tratarRequest(datos);
                //DATOS DE PRUEBA 1--proveedor23--mi calle2 mi direccion2 mi codigo postal2--2023-04-11--proveedor2@outlook.com--2023-04-11
                List<String> filas = new ArrayList<>();
                filas.add(" 1--Elias Melendez Portillo--El laberinto--20");
                
                DBFField campos[] = new DBFField[4];
                campos[0] = new DBFField();
                campos[0].setName("ID");
                campos[0].setType(DBFDataType.CHARACTER);
                campos[0].setLength(10);
                
                campos[1] = new DBFField();
                campos[1].setName("CLIENTE");
                campos[1].setType(DBFDataType.CHARACTER);
                campos[1].setLength(10);
                
                campos[2] = new DBFField();
                campos[2].setName("LIBRO");
                campos[2].setType(DBFDataType.CHARACTER);
                campos[2].setLength(10);
                
                campos[3] = new DBFField();
                campos[3].setName("TOTAL");
                campos[3].setType(DBFDataType.CHARACTER);
                campos[3].setLength(10);
                
                //Si no existe el archivo lo crea
                String path = "src/Reportes/rep_cr.dbf"; // Crear lista para almacenar los objetos de datos
                File file = new File(path);
                DBFWriter writer = new DBFWriter(file);
                writer.setFields(campos);
                
                for (String fila : filas) {
                    String[] datos_fila = fila.split("--");
                    Object rowData[] = new Object[3];
                    for (int i = 0; i < datos_fila.length; i++) {
                        rowData[i] = datos_fila[i];
                    }
                    writer.addRecord(rowData);
                    biblio_funciones.mensaje(Arrays.toString(rowData), "Prueba", 1);
                }
                writer.close();
              
            }

            case 1 -> {
                //Sacar datos de los jDateChooser en formato yyyy-mm-dd
                Format formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
                String fecha_inicio = formatter.format(compras_por_periodo.getComponent(1));
                String fecha_fin = formatter.format(compras_por_periodo.getComponent(3));
              
            }
            case 2 -> {
                //Sacar datos de los jDateChooser en formato yyyy-mm-dd
                String nombre = ((JTextField)localizar_libro.getComponent(1)).getText();
                
            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        background.setBackground(new java.awt.Color(0, 102, 153));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONSULTAS");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("Seleccione una consulta:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ventas/Rentas en un periodo.", "Compras en un periodo.", "Localizar Libro." }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );

        jButton1.setText("CONSULTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 530, 380));

        getContentPane().add(background);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        //Cuando se seleccione una opcion del combobox se mostrara el panel correspondiente con los parametros necesarios
        switch(jComboBox1.getSelectedIndex()){
            case 0 -> {
                limpiar();
                consulta = "rentas_por_periodo";
                jInternalFrame1.add(rentas_por_periodo);
                rentas_por_periodo.setVisible(true);
                jInternalFrame1.pack();
            }
            case 1 -> {
                limpiar();
                consulta = "compras_por_periodo";
                jInternalFrame1.add(compras_por_periodo);
                compras_por_periodo.setVisible(true);
                jInternalFrame1.pack();

            }
            case 2 -> {
                limpiar();
                consulta = "localizar_libro";
                jInternalFrame1.add(localizar_libro);
                compras_por_periodo.setVisible(true);
                jInternalFrame1.pack();

            }
            default -> biblio_funciones.mensaje("Opcion no valida", "ERROR", 2);
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
        biblio_funciones.mensaje("Entra", "Prueba", 1);
        // Crear un objeto DBFWriter
        //Sacar datos de los jDateChooser en formato yyyy-mm-dd
       /* SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String fechaini = formatter.format(fecha_inicio.getValue()); 
        String fechafin = formatter.format(fecha_fin.getValue());
            
        String ruta = "/obtener_reservaciones/" + fechaini + "/" + fechafin;
        //String datos = a.obtener(ruta);
        */
        //List<String> filas = biblio_funciones.tratarRequest(datos);
        //DATOS DE PRUEBA 1--proveedor23--mi calle2 mi direccion2 mi codigo postal2--2023-04-11--proveedor2@outlook.com--2023-04-11
        List<String> filas = new ArrayList<>();
        filas.add(" 1--Elias Melendez Portillo--El laberinto--20");

        DBFField campos[] = new DBFField[4];
        campos[0] = new DBFField();
        campos[0].setName("ID");
        campos[0].setType(DBFDataType.CHARACTER);
        campos[0].setLength(10);

        campos[1] = new DBFField();
        campos[1].setName("CLIENTE");
        campos[1].setType(DBFDataType.CHARACTER);
        campos[1].setLength(10);

        campos[2] = new DBFField();
        campos[2].setName("LIBRO");
        campos[2].setType(DBFDataType.CHARACTER);
        campos[2].setLength(10);

        campos[3] = new DBFField();
        campos[3].setName("TOTAL");
        campos[3].setType(DBFDataType.CHARACTER);
        campos[3].setLength(10);

        //Si no existe el archivo lo crea
        String path = "src/Reportes/rep_cr.dbf"; // Crear lista para almacenar los objetos de datos
        File file = new File(path);
        DBFWriter writer = new DBFWriter(file);
        writer.setFields(campos);

        for (String fila : filas) {
            String[] datos_fila = fila.split("--");
            Object rowData[] = new Object[3];
            for (int i = 0; i < datos_fila.length; i++) {
                rowData[i] = datos_fila[i];
            }
            writer.addRecord(rowData);
            biblio_funciones.mensaje(Arrays.toString(rowData), "Prueba", 1);
        }
        writer.close();

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void limpiar(){
        //Verificar cual es la consulta seleccionada y limpiar los campos correspondientes
        //Si no se ha seleccionado ninguna consulta no se hara nada
            switch(consulta){
                case "rentas_por_periodo" -> jInternalFrame1.remove(rentas_por_periodo);
                case "compras_por_periodo" -> jInternalFrame1.remove(compras_por_periodo);
                case "localizar_libro" -> jInternalFrame1.remove(localizar_libro);
            }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
