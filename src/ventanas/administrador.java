/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.sql.*;
import clases.conexion;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;


/**
 *
 * @author Jairo de León
 */
public class administrador extends javax.swing.JFrame {

    String user, nombre_usuario;
    public static int sesion_usuario;
    
    /**
     * Creates new form administrador
     */
    public administrador() {
        initComponents();
        user = login.user;
        sesion_usuario = 1;
        
        setTitle("Administrador - Sesion de " +user);
        setSize(650,430);
        setResizable(false);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/image/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
        
        try {
            Connection cn = conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
            "select nombreusuario from usuario where nombreusuario = '"+ user + "'");
            
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                nombre_usuario = rs.getString("nombre_usuario");
                jLabel1_nombreusuario.setText(nombre_usuario);
            }
        } catch (Exception e) {
            
            System.err.println("Error en conexion desde la interfaz Administrador");
            
        }
        
        }

    @Override
    public Image getIconImage(){
           Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("image/icon.png"));
           return retValue; 
    }   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1_registrarusuario = new javax.swing.JButton();
        jLabel1_nombreusuario = new javax.swing.JLabel();
        jButton1_gestionarusuario = new javax.swing.JButton();
        jButton1_creatividad = new javax.swing.JButton();
        jButton1_capturista = new javax.swing.JButton();
        jButton1_tecnico = new javax.swing.JButton();
        jButton1_acercade = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1_registrarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/addUser.png"))); // NOI18N
        jButton1_registrarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_registrarusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_registrarusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 120, 100));

        jLabel1_nombreusuario.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1_nombreusuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1_nombreusuario.setText("jLabel1");
        getContentPane().add(jLabel1_nombreusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton1_gestionarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/informationuser.png"))); // NOI18N
        getContentPane().add(jButton1_gestionarusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 120, 100));

        jButton1_creatividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/creatividad.png"))); // NOI18N
        getContentPane().add(jButton1_creatividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 120, 100));

        jButton1_capturista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/capturista.png"))); // NOI18N
        getContentPane().add(jButton1_capturista, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 120, 100));

        jButton1_tecnico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tecnico.png"))); // NOI18N
        getContentPane().add(jButton1_tecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 120, 100));

        jButton1_acercade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/geekipedia.png"))); // NOI18N
        getContentPane().add(jButton1_acercade, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 120, 100));

        jLabel7.setText("Creado por ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestionar Usuarios");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Creatividad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Panel Vista Capturista");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Panel Vista Tecnico");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Acerca De");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_registrarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_registrarusuarioActionPerformed
        
           registrarusuarios registrarUsuarios = new registrarusuarios();
           registrarUsuarios.setVisible(true);
    }//GEN-LAST:event_jButton1_registrarusuarioActionPerformed

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
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_acercade;
    private javax.swing.JButton jButton1_capturista;
    private javax.swing.JButton jButton1_creatividad;
    private javax.swing.JButton jButton1_gestionarusuario;
    private javax.swing.JButton jButton1_registrarusuario;
    private javax.swing.JButton jButton1_tecnico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_nombreusuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
