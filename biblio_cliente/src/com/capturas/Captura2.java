/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.capturas;


import predet.*;
import com.login.*;
import java.awt.*;

/**
 *
 * @author Elias
 */
public class Captura2 extends javax.swing.JFrame {
    
    public int xMouse=0; 
    public int yMouse=0; 
    /**
     * Creates new form login
     */
    public Captura2() {
        initComponents();
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
        BtnSalir = new javax.swing.JPanel();
        Salir = new javax.swing.JLabel();
        BtnArrastrar = new javax.swing.JPanel();
        GridDetalle = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        deOpt = new javax.swing.JPanel();
        Add = new javax.swing.JPanel();
        Add2 = new javax.swing.JLabel();
        Del = new javax.swing.JPanel();
        del = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jOptionPane1 = new javax.swing.JOptionPane();
        checkbox1 = new java.awt.Checkbox();
        checkbox2 = new java.awt.Checkbox();
        checkbox3 = new java.awt.Checkbox();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnSalir.setBackground(new java.awt.Color(255, 255, 255));
        BtnSalir.setForeground(new java.awt.Color(66, 61, 61));

        Salir.setBackground(new java.awt.Color(255, 255, 255));
        Salir.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salir.setText("X");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtnSalirLayout = new javax.swing.GroupLayout(BtnSalir);
        BtnSalir.setLayout(BtnSalirLayout);
        BtnSalirLayout.setHorizontalGroup(
            BtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(BtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );
        BtnSalirLayout.setVerticalGroup(
            BtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(BtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        background.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        BtnArrastrar.setBackground(new java.awt.Color(255, 255, 255));
        BtnArrastrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BtnArrastrarMouseDragged(evt);
            }
        });
        BtnArrastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnArrastrarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout BtnArrastrarLayout = new javax.swing.GroupLayout(BtnArrastrar);
        BtnArrastrar.setLayout(BtnArrastrarLayout);
        BtnArrastrarLayout.setHorizontalGroup(
            BtnArrastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        BtnArrastrarLayout.setVerticalGroup(
            BtnArrastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        background.add(BtnArrastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        GridDetalle.setBackground(new java.awt.Color(153, 153, 153));
        GridDetalle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        GridDetalle.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 740, 290));

        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddMouseExited(evt);
            }
        });

        Add2.setBackground(new java.awt.Color(255, 255, 255));
        Add2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/editar.png"))); // NOI18N
        Add2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Add2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Add2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout AddLayout = new javax.swing.GroupLayout(Add);
        Add.setLayout(AddLayout);
        AddLayout.setHorizontalGroup(
            AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Add2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
        );
        AddLayout.setVerticalGroup(
            AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
            .addGroup(AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Add2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)))
        );

        deOpt.add(Add);

        del.setBackground(new java.awt.Color(255, 255, 255));
        del.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        del.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/trash (1).png"))); // NOI18N
        del.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delMouseExited(evt);
            }
        });

        javax.swing.GroupLayout DelLayout = new javax.swing.GroupLayout(Del);
        Del.setLayout(DelLayout);
        DelLayout.setHorizontalGroup(
            DelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
            .addGroup(DelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(del, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
        );
        DelLayout.setVerticalGroup(
            DelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(DelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DelLayout.createSequentialGroup()
                    .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        deOpt.add(Del);

        GridDetalle.add(deOpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 290));

        background.add(GridDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 770, 290));

        jLabel1.setText("jLabel1");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jLabel2.setText("jLabel2");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        jLabel3.setText("jLabel3");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 120, -1));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 120, 10));
        background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 120, 10));

        jOptionPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jOptionPane1MouseClicked(evt);
            }
        });
        background.add(jOptionPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 170, 110));

        checkbox1.setLabel("checkbox1");
        background.add(checkbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        checkbox2.setLabel("checkbox2");
        background.add(checkbox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        checkbox3.setLabel("checkbox3");
        background.add(checkbox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jButton1.setText("jButton1");
        background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jTextField1.setBorder(null);
        background.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 120, 20));

        jTextField2.setBorder(null);
        background.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 120, 20));

        jTextField3.setBorder(null);
        background.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 120, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        // TODO add your handling code here:
        BtnSalir.setBackground(Color.white);
    }//GEN-LAST:event_SalirMouseExited

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        // TODO add your handling code here:
        BtnSalir.setBackground(Color.red);
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        // TODO add your handling code here:
        biblio_funciones.cerrarVentana(this);
    }//GEN-LAST:event_SalirMouseClicked

    private void BtnArrastrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnArrastrarMousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BtnArrastrarMousePressed

    private void BtnArrastrarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnArrastrarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_BtnArrastrarMouseDragged

    private void Add2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add2MouseEntered
        // TODO add your handling code here:
         Add.setBackground(Color.red);
    }//GEN-LAST:event_Add2MouseEntered

    private void delMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delMouseEntered
        // TODO add your handling code here:
        Del.setBackground(Color.red);
    }//GEN-LAST:event_delMouseEntered

    private void AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseEntered
           // TODO add your handling code here:
          
    }//GEN-LAST:event_AddMouseEntered

    private void Add2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add2MouseExited
        // TODO add your handling code here:
         Add.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_Add2MouseExited

    private void AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseExited
        // TODO add your handling code here:
       
    }//GEN-LAST:event_AddMouseExited

    private void delMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delMouseExited
        // TODO add your handling code here:
         Del.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_delMouseExited

    private void jOptionPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jOptionPane1MouseClicked
        // TODO add your handling code here:
        //generar reportes con la libreria i
        
    }//GEN-LAST:event_jOptionPane1MouseClicked

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
            java.util.logging.Logger.getLogger(ventanaX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Captura2().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Add;
    private javax.swing.JLabel Add2;
    private javax.swing.JPanel BtnArrastrar;
    private javax.swing.JPanel BtnSalir;
    private javax.swing.JPanel Del;
    private javax.swing.JPanel GridDetalle;
    private javax.swing.JLabel Salir;
    private javax.swing.JPanel background;
    private java.awt.Checkbox checkbox1;
    private java.awt.Checkbox checkbox2;
    private java.awt.Checkbox checkbox3;
    private javax.swing.JPanel deOpt;
    private javax.swing.JLabel del;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
