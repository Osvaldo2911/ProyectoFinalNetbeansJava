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

public class login extends javax.swing.JFrame {

    SQLite_Conexion a = new SQLite_Conexion();
    
    public login() {
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
        lblLogoGolden = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpbackLogin.setBackground(new Color(40, 40, 40, 200));

        lblCrearCuenta.setForeground(java.awt.SystemColor.textHighlight);
        lblCrearCuenta.setText("Crear cuenta");
        lblCrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCrearCuentaMousePressed(evt);
            }
        });

        jtfUsuario.setText("Usuario");
        jtfUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        jtfUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfUsuario.setNextFocusableComponent(jtfContraseña);

        jtfContraseña.setText("Contraseña");
        jtfContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfContraseña.setNextFocusableComponent(btnIniciarSesion);

        btnIniciarSesion.setText("Iniciar Sesion");
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        btnIniciarSesion.setNextFocusableComponent(lblCrearCuenta);
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        lblLogoGolden.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblLogoGolden.setForeground(new java.awt.Color(204, 204, 0));
        lblLogoGolden.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoGolden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/banner.png"))); // NOI18N
        lblLogoGolden.setNextFocusableComponent(btnIniciarSesion);

        lblText.setBackground(new Color(40, 40, 40, 255));
        lblText.setForeground(java.awt.SystemColor.textHighlight);
        lblText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblText.setOpaque(true);
        lblText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTextMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpbackLoginLayout = new javax.swing.GroupLayout(jpbackLogin);
        jpbackLogin.setLayout(jpbackLoginLayout);
        jpbackLoginLayout.setHorizontalGroup(
            jpbackLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpbackLoginLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpbackLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLogoGolden, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(jtfUsuario)
                    .addComponent(jtfContraseña)
                    .addComponent(lblCrearCuenta)
                    .addComponent(btnIniciarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jpbackLoginLayout.setVerticalGroup(
            jpbackLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpbackLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogoGolden, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIniciarSesion)
                .addGap(8, 8, 8)
                .addComponent(lblText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCrearCuenta)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jpbackLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 280, 240));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/login.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        String Usuario = jtfUsuario.getText();
        String Contraseña = jtfContraseña.getText();
        String r = a.buscarUsuario(Usuario,Contraseña);
        if (r.equals("")) {
            lblText.setText("Usuario o contraseña incorecta");
            lblText.setForeground(Color.red);
        } else if(!"".equals(r)){
            lblText.setText("Bienvenido");
            lblText.setForeground(Color.green);
            Principal p = new Principal();
            p.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void lblCrearCuentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrearCuentaMousePressed
      Registro r = new Registro();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblCrearCuentaMousePressed

    private void lblTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTextMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTextMousePressed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JPanel jpbackLogin;
    private javax.swing.JTextField jtfContraseña;
    private javax.swing.JTextField jtfUsuario;
    private javax.swing.JLabel lblCrearCuenta;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLogoGolden;
    private javax.swing.JLabel lblText;
    // End of variables declaration//GEN-END:variables
}
