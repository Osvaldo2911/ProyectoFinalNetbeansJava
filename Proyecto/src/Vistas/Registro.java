/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import Conexion.SQLite_Conexion;
import Modelos.Usuarios;

/**
 *
 * @author osval
 */
public class Registro extends javax.swing.JFrame {

    SQLite_Conexion a = new SQLite_Conexion();
    public Registro() {
        initComponents();
        iconoEnBD();
    }
    public void iconoEnBD(){      
        URL url = getClass().getResource("/Recursos/figura.png"); 
        ImageIcon icono = new ImageIcon(url);  
        setIconImage(icono.getImage()); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpbackLogin = new javax.swing.JPanel();
        lblCrearCuenta = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jtfContraseña = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtfApP = new javax.swing.JTextField();
        jtfApM = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        lblRetro = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpbackLogin.setBackground(new Color(40, 40, 40, 200));

        lblCrearCuenta.setForeground(java.awt.SystemColor.textHighlight);
        lblCrearCuenta.setText("Iniciar Sesion");
        lblCrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCrearCuentaMousePressed(evt);
            }
        });

        jtfUsuario.setText("Usuario");

        jtfContraseña.setText("Contraseña");

        btnIniciarSesion.setText("Registrarse");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/banner.png"))); // NOI18N

        jtfApP.setText("Apellido Paterno");

        jtfApM.setText("Apellido Materno");

        jtfNombre.setText("Nombre");

        lblRetro.setForeground(java.awt.SystemColor.textHighlight);

        javax.swing.GroupLayout jpbackLoginLayout = new javax.swing.GroupLayout(jpbackLogin);
        jpbackLogin.setLayout(jpbackLoginLayout);
        jpbackLoginLayout.setHorizontalGroup(
            jpbackLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpbackLoginLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpbackLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRetro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(jtfApM, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(jtfContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(btnIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(lblCrearCuenta)
                    .addComponent(jtfApP, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jpbackLoginLayout.setVerticalGroup(
            jpbackLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpbackLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfApP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfApM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnIniciarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRetro, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCrearCuenta)
                .addContainerGap())
        );

        getContentPane().add(jpbackLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 260, 290));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/login.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCrearCuentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrearCuentaMousePressed
        login r = new login();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblCrearCuentaMousePressed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        String r = a.buscarUsuario(jtfUsuario.getText());
        if (r.equals("")) {
            lblRetro.setText("Usuario disponible");
            lblRetro.setForeground(Color.green);
            if(!"".equals(jtfNombre.getText()) && !"".equals(jtfApP.getText()) && !"".equals(jtfApM.getText()) && !"".equals(jtfContraseña.getText())){
                lblRetro.setText("Registro con exito");
                lblRetro.setForeground(Color.green);
                a.agregarUsuario(new Usuarios(jtfUsuario.getText(), jtfNombre.getText(), jtfApP.getText(), jtfApM.getText(), jtfContraseña.getText()));
                login e = new login();
                e.setVisible(true);
                this.setVisible(false);
            } else {
                lblRetro.setText("Rellena todos los campos");
                lblRetro.setForeground(Color.red);
            }
        } else if(!"".equals(r)){
            lblRetro.setText("Nombre de Usuario en uso");
            lblRetro.setForeground(Color.red);
        }
        
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpbackLogin;
    private javax.swing.JTextField jtfApM;
    private javax.swing.JTextField jtfApP;
    private javax.swing.JTextField jtfContraseña;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfUsuario;
    private javax.swing.JLabel lblCrearCuenta;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblRetro;
    // End of variables declaration//GEN-END:variables
}
