/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.login;

import com.funciones.Api;
import java.awt.*;

/**
 *
 * @author Elias
 */
public class Login extends javax.swing.JFrame {
    
    public int xMouse=0; 
    public int yMouse=0; 
    /**
     * Creates new form login
     */
    public Login() {
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
        jLabel2 = new javax.swing.JLabel();
        user_Entry = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        psw_Entry = new javax.swing.JPasswordField();
        entrar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        salir = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Barra = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/Free_Sample_By_Wix.jpg"))); // NOI18N
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, -1));

        user_Entry.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        user_Entry.setForeground(new java.awt.Color(204, 204, 204));
        user_Entry.setText("Ingrese su Nombre de Usuario.");
        user_Entry.setBorder(null);
        user_Entry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                user_EntryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                user_EntryFocusLost(evt);
            }
        });
        user_Entry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_EntryMouseClicked(evt);
            }
        });
        user_Entry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_EntryActionPerformed(evt);
            }
        });
        background.add(user_Entry, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 290, 20));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 290, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("USUARIO");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("CONTRASEÑA");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 290, 30));

        psw_Entry.setForeground(new java.awt.Color(204, 204, 204));
        psw_Entry.setText("jPasswordField1");
        psw_Entry.setBorder(null);
        psw_Entry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                psw_EntryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                psw_EntryFocusLost(evt);
            }
        });
        psw_Entry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                psw_EntryMouseClicked(evt);
            }
        });
        psw_Entry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psw_EntryActionPerformed(evt);
            }
        });
        psw_Entry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                psw_EntryKeyPressed(evt);
            }
        });
        background.add(psw_Entry, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 290, 20));

        entrar.setBackground(new java.awt.Color(102, 102, 102));
        entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(239, 237, 237));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ENTRAR");
        jLabel5.setToolTipText("");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout entrarLayout = new javax.swing.GroupLayout(entrar);
        entrar.setLayout(entrarLayout);
        entrarLayout.setHorizontalGroup(
            entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        entrarLayout.setVerticalGroup(
            entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        background.add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, 40));

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setForeground(new java.awt.Color(66, 61, 61));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout salirLayout = new javax.swing.GroupLayout(salir);
        salir.setLayout(salirLayout);
        salirLayout.setHorizontalGroup(
            salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );
        salirLayout.setVerticalGroup(
            salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        background.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        Barra.setBackground(new java.awt.Color(255, 255, 255));
        Barra.setOpaque(false);
        Barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraMouseDragged(evt);
            }
        });
        Barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraMousePressed(evt);
            }
        });

        javax.swing.GroupLayout BarraLayout = new javax.swing.GroupLayout(Barra);
        Barra.setLayout(BarraLayout);
        BarraLayout.setHorizontalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        BarraLayout.setVerticalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        background.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/books-1204029_960_720.jpg"))); // NOI18N
        background.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 570, 610));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel6.setText("CoreBook");
        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 250, 70));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel9.setText("INICIAR SESION");
        background.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMousePressed
        xMouse = evt.getX(); 
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraMousePressed

    private void BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_BarraMouseDragged

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
        salir.setBackground(Color.red);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
        salir.setBackground(Color.white);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        entrar.setBackground(Color.red);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        entrar.setBackground(new Color(204,0,51));
    }//GEN-LAST:event_jLabel5MouseExited

    private void user_EntryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_EntryMouseClicked
        // TODO add your handling code here:
        user_Entry.setText("");
        user_Entry.setForeground(Color.black);
    }//GEN-LAST:event_user_EntryMouseClicked

    private void psw_EntryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_psw_EntryMouseClicked
        // TODO add your handling code here:
        psw_Entry.setText("");
        psw_Entry.setForeground(Color.black);
    }//GEN-LAST:event_psw_EntryMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        String user = user_Entry.getText();
        String psw = String.valueOf(psw_Entry.getPassword());
        
        //validar que los campos no esten vacios
        if(user.equals("")){
            biblio_funciones.mensaje( "Ingrese un Usuario", "AVISO",2);
            user_Entry.requestFocus();
            return;
        }
        if(psw.equals("")){
            biblio_funciones.mensaje( "Ingrese una Contraseña", "AVISO",2);
            psw_Entry.requestFocus();
        }


        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void user_EntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_EntryActionPerformed
        // TODO add your handling code here:
        //salir
        System.exit(0);
    }//GEN-LAST:event_user_EntryActionPerformed

    private void psw_EntryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_psw_EntryFocusGained
        // TODO add your handling code here:
        psw_Entry.setText("");
        psw_Entry.setForeground(Color.black);
    }//GEN-LAST:event_psw_EntryFocusGained

    private void psw_EntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psw_EntryActionPerformed
        //si se presiona enter
        String user = user_Entry.getText();
        String psw = String.valueOf(psw_Entry.getPassword());
        
        Boolean res= login(user,psw);
        if(res) {
            biblio_funciones.mensaje("Bienvenido, " + user, "Acceso Correcto", 1);
            Principal formMenu = new Principal();
            formMenu.show();
            this.dispose();
        }
    }//GEN-LAST:event_psw_EntryActionPerformed

    private void psw_EntryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_psw_EntryFocusLost
        // TODO add your handling code here:
        psw_Entry.setText("****************");
        psw_Entry.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_psw_EntryFocusLost

    private void user_EntryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_user_EntryFocusGained
        user_Entry.setText("");
        user_Entry.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_user_EntryFocusGained

    private void user_EntryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_user_EntryFocusLost
        // TODO add your handling code here:
        user_Entry.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_user_EntryFocusLost

    private void psw_EntryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_psw_EntryKeyPressed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_psw_EntryKeyPressed
    
    public Boolean login(String user,String psw){
        //validar que el usuario exista en la api
        Api api = new Api();
        //armar el json
        String json = "{\"usuario\":\""+user+"\",\"password\":\""+psw+"\"}";
        String res = api.insertar(json,"/verificarCredenciales");

        //si es un uno, el usuario existe 
        if(res.equals("1")){
            return true;
        }else{
            biblio_funciones.mensaje("Usuario o Contraseña Incorrectos", "Acceso Incorrecto", 2);
            return false;
        }   
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JPanel background;
    private javax.swing.JPanel entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField psw_Entry;
    private javax.swing.JPanel salir;
    private javax.swing.JTextField user_Entry;
    // End of variables declaration//GEN-END:variables
}
