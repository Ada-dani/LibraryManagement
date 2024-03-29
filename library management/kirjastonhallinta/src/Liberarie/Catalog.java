/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package Liberarie;

import javax.swing.table.DefaultTableModel;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.util.*;
import java.sql.*;
import javax.swing.table.*;

public class Catalog extends javax.swing.JFrame {
public static String folder;
public static void cetak(String str) {
        System.out.println(str);
    }
public static String gambar(String id) {
        return folder + File.separator + id.trim() + ".jpg";
    }
    public Catalog() {
        initComponents();
        folder = System.getProperty("user.dir") + File.separator + "images";
        //folder = getClass().getResource("").getFile().toString() + "images";
        cetak(folder);
        new File(folder).mkdir();
        
         ArrayList values = new ArrayList();

        // buat table 
        String[] colHeads = {"code_book", "title", "author", "editor", "code_editor"};
        int noOfRows = (values.size());
        int no = 0;
        
        //table.setBounds(20, 20, 350, 200);
        tabMode = new DefaultTableModel(null, colHeads);
        tblBook.setModel(tabMode);
        CariData(0, "");
        ImageIcon gambar = new ImageIcon("./img/pb3.png");
    setIconImage(gambar.getImage());

   // cara kedua untuk merubah icon pada swing
    setIconImage(Toolkit.getDefaultToolkit().getImage("./img/pb3.png"));
    setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBook = new javax.swing.JTable();
        buttonMakeOver7 = new komponenMakeOver.buttonMakeOver();
        buttonMakeOver6 = new komponenMakeOver.buttonMakeOver();
        btnBack = new komponenMakeOver.buttonMakeOver();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(153, 102, 255));

        tblBook.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblBook);

        jDesktopPane1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 90, 452, 230);

        buttonMakeOver7.setForeground(new java.awt.Color(255, 255, 255));
        buttonMakeOver7.setText("Librairie Book");
        buttonMakeOver7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        buttonMakeOver7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMakeOver7ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(buttonMakeOver7);
        buttonMakeOver7.setBounds(-10, 0, 590, 80);

        buttonMakeOver6.setForeground(new java.awt.Color(255, 255, 255));
        buttonMakeOver6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jDesktopPane1.add(buttonMakeOver6);
        buttonMakeOver6.setBounds(-10, 70, 620, 10);

        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnBack);
        btnBack.setBounds(40, 330, 130, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        new PosteCentral(this);
    }//GEN-LAST:event_formWindowActivated

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        Home a = new Home();
        a.show();
    }//GEN-LAST:event_btnBackActionPerformed

    private void buttonMakeOver7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMakeOver7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMakeOver7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        Conex conn = new Conex();
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Catalog().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private komponenMakeOver.buttonMakeOver btnBack;
    private komponenMakeOver.buttonMakeOver buttonMakeOver6;
    private komponenMakeOver.buttonMakeOver buttonMakeOver7;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBook;
    // End of variables declaration//GEN-END:variables


    final DefaultTableModel tabMode;
   public void CariData(int IndexPencarian, String Parameter) {
        try {
            int row = tabMode.getRowCount();
            for (int i = 0; i < row; i++) {
                tabMode.removeRow(0);
            }
            String Kondisi = "";
            String SQLKondisi = "";
            switch (IndexPencarian) {
                case 0:
                    Kondisi = "code_book";
                    break;
                case 1:
                    Kondisi = "title";
                    break;
                case 2:
                    Kondisi = "author";
                    break;
                case 3:
                    Kondisi = "editor";
                    break;
                case 4:
                    Kondisi = "code_editor";
                    break;
            }
            if ((Kondisi != "") && (Parameter != "")) {
                SQLKondisi = " where " + Kondisi + " like '%" + Parameter + "%'";
            }

            Conex.conn = DriverManager.getConnection(Conex.Url, Conex.User, Conex.Password);
            Statement Update_st = Conex.conn.createStatement();
            String SQLSearch = "select * from book" + SQLKondisi;
            ResultSet Update_rs = Update_st.executeQuery(SQLSearch);
            while (Update_rs.next()) {
                Object[] data = {Update_rs.getString("code_book"), Update_rs.getString("title"), Update_rs.getString("author"), Update_rs.getString("editor"), Update_rs.getString("code_editor")};
                tabMode.addRow(data);
                //
            }
        } catch (Exception e2) {
        //
        }

    }


}
