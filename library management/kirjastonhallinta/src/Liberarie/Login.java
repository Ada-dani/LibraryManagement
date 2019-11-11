/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Liberarie;

/**
 *
 * @author OMAR
 */

import javax.swing.JFrame;
import java.sql.*;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
    }

   void log(){
     try {
                        String s1 = txtUser.getText();
                        String s2 = txtPass.getText();
                        String sql = "select * from user where name= '" + s1 + "' and id_user = '" + s2 + "'";
                        ResultSet rs = Conex.st.executeQuery(sql);
                        int JumlahData = 0;
                        while (rs.next()) {
                            JumlahData++;
                        }

                        if (JumlahData == 0) {
                            JOptionPane.showMessageDialog(this, "User or password are incorrect,\nClik OK à Continue !!");
                        } else {
                            this.hide();
                            User1 buka = new User1();
                            buka.show();
                        }
                        txtUser.setText("");
                        txtPass.setText("");
                    } catch (Exception e1) {
                        System.out.println("ERROR 1" + e1);
                    }
}                                     

    private void formWindowActivated(java.awt.event.WindowEvent evt) {                                     
        JFrame form = new JFrame();
//  form.setSize(800, 400);
    new PosteCentral(this);
    }                                                                             

    /*
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
                 Conex conn=new Conex();   
                java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Login().setVisible(true);
            }
        });
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        txtUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        buttonMakeOver7 = new komponenMakeOver.buttonMakeOver();
        buttonMakeOver6 = new komponenMakeOver.buttonMakeOver();
        btnMasuk1 = new komponenMakeOver.buttonMakeOver();
        btnBackReg = new komponenMakeOver.buttonMakeOver();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(153, 102, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USERNAME");
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(30, 130, 110, 14);

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        jDesktopPane1.add(txtPass);
        txtPass.setBounds(135, 180, 220, 20);

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jDesktopPane1.add(txtUser);
        txtUser.setBounds(135, 130, 220, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD");
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(30, 180, 100, 14);

        buttonMakeOver7.setForeground(new java.awt.Color(255, 255, 255));
        buttonMakeOver7.setText("    Members login   ");
        buttonMakeOver7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        buttonMakeOver7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMakeOver7ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(buttonMakeOver7);
        buttonMakeOver7.setBounds(-10, 0, 420, 80);

        buttonMakeOver6.setForeground(new java.awt.Color(255, 255, 255));
        buttonMakeOver6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jDesktopPane1.add(buttonMakeOver6);
        buttonMakeOver6.setBounds(-10, 70, 480, 10);

        btnMasuk1.setForeground(new java.awt.Color(255, 255, 255));
        btnMasuk1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        btnMasuk1.setText("Access");
        btnMasuk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasuk1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnMasuk1);
        btnMasuk1.setBounds(230, 250, 130, 40);

        btnBackReg.setForeground(new java.awt.Color(255, 255, 255));
        btnBackReg.setText("Back");
        btnBackReg.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnBackReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackRegActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnBackReg);
        btnBackReg.setBounds(60, 250, 130, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        log();
    }//GEN-LAST:event_txtPassActionPerformed

    private void btnMasuk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasuk1ActionPerformed
        log();
    }//GEN-LAST:event_btnMasuk1ActionPerformed

    private void btnBackRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackRegActionPerformed
        this.hide();
        Home FUtama = new Home();
        FUtama.show();

    }//GEN-LAST:event_btnBackRegActionPerformed

    private void buttonMakeOver7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMakeOver7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMakeOver7ActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private komponenMakeOver.buttonMakeOver btnBackReg;
    private komponenMakeOver.buttonMakeOver btnMasuk1;
    private komponenMakeOver.buttonMakeOver buttonMakeOver6;
    private komponenMakeOver.buttonMakeOver buttonMakeOver7;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
