/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.capturas;

import com.login.biblio_funciones;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elias
 */
public class Compras extends javax.swing.JInternalFrame {
    
    /*
     * Creates new form Ventas
     */
    public Compras() {
        initComponents();
          this.setClosable(true);
        this.setIconifiable(true);
        this.setMaximizable(true);
        //Poder mover la ventana
        this.setResizable(true);
        //Poner el titulo
        this.setTitle("Compras");

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
        GridDetalle = new javax.swing.JPanel();
        deOpt = new javax.swing.JPanel();
        Add = new javax.swing.JPanel();
        Add2 = new javax.swing.JLabel();
        Del = new javax.swing.JPanel();
        del = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jOptionPane1 = new javax.swing.JOptionPane();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        button1 = new java.awt.Button();
        jLabel5 = new javax.swing.JLabel();

        background.setBackground(java.awt.SystemColor.textHighlight);
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GridDetalle.setBackground(new java.awt.Color(153, 153, 153));
        GridDetalle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add2MouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delMouseClicked(evt);
            }
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

        GridDetalle.add(deOpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 370));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Proveedor", "Libro", "Cantidad", "Precio Unitario", "Subtotal", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        GridDetalle.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 1110, 340));

        background.add(GridDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 1140, 340));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 120, -1));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 120, 10));

        jOptionPane1.setMessage("Imprimir Ticket"
        );
        jOptionPane1.setOptionType(jOptionPane1.YES_NO_OPTION);
        jOptionPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jOptionPane1MouseClicked(evt);
            }
        });
        background.add(jOptionPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 30, 170, 110));

        jTextField2.setBorder(null);
        background.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 120, 20));

        jTextField3.setBorder(null);
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        background.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 120, 20));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Subtotal");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 630, -1, -1));

        jTextField4.setBorder(null);
        background.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 630, 120, 20));

        jTextField5.setBorder(null);
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });
        background.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 660, 120, 20));

        button1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        button1.setLabel("PAGAR");
        background.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 610, 190, 70));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("COMPRAS");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1270, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 1356, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Add2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add2MouseClicked
        // TODO add your handling code here:
        //Agregar un renglon a la Jtable
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.addRow(new Object[]{"HarryPotter","2","100","200","200"});
        //Poner el puntero en el campo nuevo
        jTable1.changeSelection(jTable1.getRowCount()-1, 0, false, false);

    }//GEN-LAST:event_Add2MouseClicked

    private void Add2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add2MouseEntered
        // TODO add your handling code here:
        Add.setBackground(Color.red);
    }//GEN-LAST:event_Add2MouseEntered

    private void Add2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add2MouseExited
        // TODO add your handling code here:
        Add.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_Add2MouseExited

    private void AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddMouseEntered

    private void AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AddMouseExited

    private void delMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delMouseClicked
        // TODO add your handling code here:
        //Eliminar un renglon de la Jtable
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.removeRow(jTable1.getSelectedRow());
        jTable1.changeSelection(jTable1.getRowCount()-1, 0, false, false);
    }//GEN-LAST:event_delMouseClicked

    private void delMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delMouseEntered
        // TODO add your handling code here:
        Del.setBackground(Color.red);
    }//GEN-LAST:event_delMouseEntered

    private void delMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delMouseExited
        // TODO add your handling code here:
        Del.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_delMouseExited

    private void jOptionPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jOptionPane1MouseClicked
        // TODO add your handling code here:
        //generar reportes con la libreria i
    }//GEN-LAST:event_jOptionPane1MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked

        //Llenar con la fecha actual en formato date
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        jTextField3.setText(dateFormat.format(date));

    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Add;
    private javax.swing.JLabel Add2;
    private javax.swing.JPanel Del;
    private javax.swing.JPanel GridDetalle;
    private javax.swing.JPanel background;
    private java.awt.Button button1;
    private javax.swing.JPanel deOpt;
    private javax.swing.JLabel del;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}