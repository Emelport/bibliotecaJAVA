/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.login;

import Reportes.rentasDataSource;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import com.abcs.*;
import com.capturas.*;
import com.funciones.Api;
import com.consultas.*;
import static java.lang.System.exit;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.WindowConstants;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
//importar jasper report


/**
 * @author Elias
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        //Sacar la resolucion de la pantalla y poner el frame en el centro
        //que el maximo de la longitud y altura sea la resolucion de la pantalla
        this.setSize(getMaximumSize());
        this.setLocationRelativeTo(null);
        this.setExtendedState(Principal.MAXIMIZED_BOTH);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane(){
            ImageIcon icon = new ImageIcon(getClass().getResource("../imgs/fondo.jpg"));
            Image image = icon.getImage();
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Abcs = new javax.swing.JMenu();
        Autores = new javax.swing.JMenuItem();
        Clientes = new javax.swing.JMenuItem();
        Libros = new javax.swing.JMenuItem();
        Proveedores = new javax.swing.JMenuItem();
        Tarjetas = new javax.swing.JMenuItem();
        Capturas = new javax.swing.JMenu();
        Ventas = new javax.swing.JMenuItem();
        Compras = new javax.swing.JMenuItem();
        Consultas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        Consulta4 = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenu();
        CerrarSesion = new javax.swing.JMenuItem();
        SalirF = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(getMaximumSize());
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/logo_con_fondo-removebg-preview.png"))); // NOI18N
        jLabel10.setToolTipText("");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel10KeyPressed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 1022, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 153));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenuBar1.setForeground(new java.awt.Color(0, 51, 102));
        jMenuBar1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jMenuBar1.setSelectionModel(null);

        Abcs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/altas-icon.png"))); // NOI18N
        Abcs.setText("Archivos");
        Abcs.setToolTipText("");
        Abcs.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Abcs.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        Autores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        Autores.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Autores.setText("Autores");
        Autores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoresActionPerformed(evt);
            }
        });
        Abcs.add(Autores);

        Clientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_DOWN_MASK));
        Clientes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Clientes.setText("Clientes");
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });
        Abcs.add(Clientes);

        Libros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_DOWN_MASK));
        Libros.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Libros.setText("Libros");
        Libros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibrosActionPerformed(evt);
            }
        });
        Abcs.add(Libros);

        Proveedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_DOWN_MASK));
        Proveedores.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Proveedores.setText("Proveedores");
        Proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedoresActionPerformed(evt);
            }
        });
        Abcs.add(Proveedores);

        Tarjetas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.ALT_DOWN_MASK));
        Tarjetas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Tarjetas.setText("Tarjetas");
        Tarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TarjetasActionPerformed(evt);
            }
        });
        Abcs.add(Tarjetas);

        jMenuBar1.add(Abcs);

        Capturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/capturas-icon.png"))); // NOI18N
        Capturas.setText("  Capturas");
        Capturas.setToolTipText("");
        Capturas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Capturas.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        Ventas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Ventas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Ventas.setText("Ventas");
        Ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VentasMouseClicked(evt);
            }
        });
        Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentasActionPerformed(evt);
            }
        });
        Capturas.add(Ventas);

        Compras.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Compras.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Compras.setText("Compras");
        Compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprasActionPerformed(evt);
            }
        });
        Capturas.add(Compras);

        jMenuBar1.add(Capturas);

        Consultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/reportes-icon.png"))); // NOI18N
        Consultas.setText("Reportes");
        Consultas.setToolTipText("");
        Consultas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Consultas.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Consultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultasActionPerformed(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/editar.png"))); // NOI18N
        jMenuItem1.setText("Consultas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Consultas.add(jMenuItem1);

        Consulta4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Consulta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta4ActionPerformed(evt);
            }
        });
        Consultas.add(Consulta4);

        jMenuBar1.add(Consultas);

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/salida.png"))); // NOI18N
        Salir.setText("<-SALIR");
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Salir.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        CerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        CerrarSesion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        CerrarSesion.setText("Cerrar Sesion");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });
        Salir.add(CerrarSesion);

        SalirF.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        SalirF.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        SalirF.setText("Salir");
        SalirF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirFActionPerformed(evt);
            }
        });
        Salir.add(SalirF);

        jMenuBar1.add(Salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentasMouseClicked
        
    }//GEN-LAST:event_VentasMouseClicked

    private void VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentasActionPerformed
        //Abrrir el formulario de ventas
     
        Ventas v = new Ventas();
        jDesktopPane1.add(v);
        v.setVisible(true);
        v.setLocation(0, 0);
        v.setClosable(true);
        v.setIconifiable(true);
        v.setMaximizable(true);
        v.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        v.toFront();
        v.requestFocus();
        v.setResizable(false);
        v.setLocation(100, 0);
        v.show();
        

    }//GEN-LAST:event_VentasActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
          // TODO add your handling code here:

    }//GEN-LAST:event_formKeyPressed

    private void ComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprasActionPerformed
        // TODO add your handling code here:
        Compras_2 v = new Compras_2();
        jDesktopPane1.add(v);
        v.setVisible(true);
        v.setLocation(0, 0);
        v.setClosable(true);
        v.setIconifiable(true);
        v.setMaximizable(true);
        v.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        v.toFront();
        v.requestFocus();
        v.setResizable(false);
        v.setLocation(100, 0);
        v.show();
    }//GEN-LAST:event_ComprasActionPerformed

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
        // TODO add your handling code here:
        Clientes v = new Clientes();
        inicializarFrame(v);
    }//GEN-LAST:event_ClientesActionPerformed

    private void LibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibrosActionPerformed
        // TODO add your handling code here:
        Libros v = new Libros();
        inicializarFrame(v);
    }//GEN-LAST:event_LibrosActionPerformed

    private void TarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TarjetasActionPerformed
        // TODO add your handling code here:
        Tarjetas v = new Tarjetas();
        inicializarFrame(v);
    }//GEN-LAST:event_TarjetasActionPerformed

    private void jLabel10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel10KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel10KeyPressed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_SalirActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        // TODO add your handling code here:
           int res= biblio_funciones.mensajeDecision("Deseas Cerrar la sesion actual?", "CIERRE DE SESION", "SI", "NO");
        if (res==0) {
            this.dispose();
            Login lo = new Login();
            lo.show();
        }
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void SalirFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirFActionPerformed
        // TODO add your handling code here:
           int res= biblio_funciones.mensajeDecision("Deseas Salir del Programa?", "SALIR", "SI", "NO");
        if (res==0) {
               exit(0);
        }
    }//GEN-LAST:event_SalirFActionPerformed

    private void Consulta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta4ActionPerformed
        // TODO add your handling code here:

     
    }//GEN-LAST:event_Consulta4ActionPerformed

    private void ConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultasActionPerformed
        // TODO add your handling code here:
    
        
    }//GEN-LAST:event_ConsultasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Consultas cons = new Consultas();
        cons.show();       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ProveedoresActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        Proveedor proveedores = new Proveedor();
        inicializarFrame(proveedores);
    }   
    
     private void AutoresActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        Autores autores = new Autores();
        inicializarFrame(autores);
    } 
     
     private void inicializarFrame(JInternalFrame frame) {
        jDesktopPane1.add(frame);
        frame.setVisible(true);
        frame.setLocation(0, 0);
        frame.setClosable(true);
        frame.setIconifiable(true);
        frame.setMaximizable(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.toFront();
        frame.requestFocus();
        frame.setResizable(false);
        frame.setLocation(100, 100);
        frame.show();
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Abcs;
    private javax.swing.JMenuItem Autores;
    private javax.swing.JMenu Capturas;
    private javax.swing.JMenuItem CerrarSesion;
    private javax.swing.JMenuItem Clientes;
    private javax.swing.JMenuItem Compras;
    private javax.swing.JMenuItem Consulta4;
    private javax.swing.JMenu Consultas;
    private javax.swing.JMenuItem Libros;
    private javax.swing.JMenuItem Proveedores;
    private javax.swing.JMenu Salir;
    private javax.swing.JMenuItem SalirF;
    private javax.swing.JMenuItem Tarjetas;
    private javax.swing.JMenuItem Ventas;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
