
package Liberarie;

import Liberarie.FormPlus;
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


public class User1 extends javax.swing.JFrame {
    public static String folder;
public static void cetak(String str) {
        System.out.println(str);
    }
public static String gambar(String id) {
        return folder + File.separator + id.trim() + ".jpg";
    }
    /** Creates new form FormUtama */
    public User1() {
        initComponents();
        folder = System.getProperty("user.dir") + File.separator + "images";
        //folder = getClass().getResource("").getFile().toString() + "images";
        cetak(folder);
        new File(folder).mkdir();
        
         ArrayList values = new ArrayList();

        // buat table 
        String[] colHeads = {"id_user", "name", "age", "sex", "address"};
        int noOfRows = (values.size());
        int no = 0;
        
        //table.setBounds(20, 20, 350, 200);
        tabMode = new DefaultTableModel(null, colHeads);
        table.setModel(tabMode);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbPencarianBerdasarkan = new javax.swing.JComboBox();
        txtPencarian = new javax.swing.JTextField();
        scroll_panel = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        buttonMakeOver7 = new komponenMakeOver.buttonMakeOver();
        btnQuit1 = new komponenMakeOver.buttonMakeOver();
        btnBackReg1 = new komponenMakeOver.buttonMakeOver();
        btnHapus1 = new komponenMakeOver.buttonMakeOver();
        btnEdit1 = new komponenMakeOver.buttonMakeOver();
        btnAdd1 = new komponenMakeOver.buttonMakeOver();
        btnAdd2 = new komponenMakeOver.buttonMakeOver();
        btAll = new komponenMakeOver.buttonMakeOver();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU UTAMA");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(153, 102, 255));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search for");

        cmbPencarianBerdasarkan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IdUser", "Nom", "Age", "Sex", "Address" }));

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        scroll_panel.setViewportView(table);

        buttonMakeOver7.setForeground(new java.awt.Color(255, 255, 255));
        buttonMakeOver7.setText("User Data Library");
        buttonMakeOver7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        buttonMakeOver7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMakeOver7ActionPerformed(evt);
            }
        });

        btnQuit1.setForeground(new java.awt.Color(255, 255, 255));
        btnQuit1.setText("Quit");
        btnQuit1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnQuit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuit1ActionPerformed(evt);
            }
        });

        btnBackReg1.setForeground(new java.awt.Color(255, 255, 255));
        btnBackReg1.setText("Back");
        btnBackReg1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnBackReg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackReg1ActionPerformed(evt);
            }
        });

        btnHapus1.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus1.setText("Delete");
        btnHapus1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnHapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapus1ActionPerformed(evt);
            }
        });

        btnEdit1.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit1.setActionCommand("Edit");
        btnEdit1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEdit1.setLabel("Edit");
        btnEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit1ActionPerformed(evt);
            }
        });

        btnAdd1.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd1.setText("Add");
        btnAdd1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });

        btnAdd2.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd2.setText("Search");
        btnAdd2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd2ActionPerformed(evt);
            }
        });

        btAll.setForeground(new java.awt.Color(255, 255, 255));
        btAll.setText("All");
        btAll.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnQuit1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBackReg1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnHapus1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cmbPencarianBerdasarkan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(btnAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(btAll, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scroll_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(buttonMakeOver7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonMakeOver7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuit1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnBackReg1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbPencarianBerdasarkan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAll, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scroll_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        getContentPane().add(jPanel1, "card2");
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        new PosteCentral(this);
    }//GEN-LAST:event_formWindowActivated

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        
}//GEN-LAST:event_tableMouseClicked

    private void btnQuit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuit1ActionPerformed
        System.exit(0);
        
}//GEN-LAST:event_btnQuit1ActionPerformed

    private void btnBackReg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackReg1ActionPerformed
        this.dispose();
        Home a = new Home();
        a.show();
    }//GEN-LAST:event_btnBackReg1ActionPerformed

    private void btnHapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapus1ActionPerformed
        try {
            if (table.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(this, "Select a Data to Delete !!\nClik OK to Continue!!", "Error !!", JOptionPane.WARNING_MESSAGE);
            } else {
                if (JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this data? ", "Confirmation", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    HapusData(table.getValueAt(table.getSelectedRow(), 0).toString());
                }
            }
        } catch (Exception e1) {
            System.out.println("ERREUR 1" + e1);
            JOptionPane.showMessageDialog(this, "Select a Data to Delete  !!\nClik OK à Continue!!", "Error !!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnHapus1ActionPerformed

    private void btnEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit1ActionPerformed
        this.setFocusable(false);
        try {
            int JumlahBaris = table.getSelectedRowCount();
            System.out.println(JumlahBaris);
            if (JumlahBaris < 0) {
                JOptionPane.showMessageDialog(this, "Choose Data for Update !!\nClik OK to Continue!!", "Error !!", JOptionPane.WARNING_MESSAGE);
            } else {
                UbahData(table.getValueAt(table.getSelectedRow(), 0).toString());
            }
        } catch (Exception e1) {
            System.out.println("ERREUR 1" + e1);
            JOptionPane.showMessageDialog(this, "Choose Data for Update!!\nClik OK à Continue!!", "Error !!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEdit1ActionPerformed

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        this.setFocusable(false);
        TambahData();
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void buttonMakeOver7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMakeOver7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMakeOver7ActionPerformed

    private void btnAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd2ActionPerformed
        CariData(cmbPencarianBerdasarkan.getSelectedIndex(), txtPencarian.getText());
    }//GEN-LAST:event_btnAdd2ActionPerformed

    private void btAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAllActionPerformed
    CariData(cmbPencarianBerdasarkan.getSelectedIndex(), "");
        txtPencarian.setText("");
        cmbPencarianBerdasarkan.setSelectedIndex(0);
    }//GEN-LAST:event_btAllActionPerformed
public void pilihFoto(){
                    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new User1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private komponenMakeOver.buttonMakeOver btAll;
    private komponenMakeOver.buttonMakeOver btnAdd1;
    private komponenMakeOver.buttonMakeOver btnAdd2;
    private komponenMakeOver.buttonMakeOver btnBackReg1;
    private komponenMakeOver.buttonMakeOver btnEdit1;
    private komponenMakeOver.buttonMakeOver btnHapus1;
    private komponenMakeOver.buttonMakeOver btnQuit1;
    private komponenMakeOver.buttonMakeOver buttonMakeOver7;
    private javax.swing.JComboBox cmbPencarianBerdasarkan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scroll_panel;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtPencarian;
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
                    Kondisi = "id_user";
                    break;
                case 1:
                    Kondisi = "name";
                    break;
                case 2:
                    Kondisi = "age";
                    break;
                case 3:
                    Kondisi = "sex";
                    break;
                case 4:
                    Kondisi = "address";
                    break;
            }
            if ((Kondisi != "") && (Parameter != "")) {
                SQLKondisi = " where " + Kondisi + " like '%" + Parameter + "%'";
            }

            Conex.conn = DriverManager.getConnection(Conex.Url, Conex.User, Conex.Password);
            Statement Update_st = Conex.conn.createStatement();
            String SQLSearch = "select * from user" + SQLKondisi;
            ResultSet Update_rs = Update_st.executeQuery(SQLSearch);
            while (Update_rs.next()) {
                Object[] data = {Update_rs.getString("id_user"), Update_rs.getString("name"), Update_rs.getString("age"), Update_rs.getString("sex"), Update_rs.getString("address")};
                tabMode.addRow(data);
                //
            }
        } catch (Exception e2) {
        //
        }

    }

    public void UpdateBarisData() {
        CariData(0, "");

    }

    public void TambahData() {
        try {
            FormPlus FTambah=new FormPlus(new User1(),"Form Plus","");
            FTambah.setTitle("Form Plus");
            FTambah.show();
        } catch (Exception e2) {
        //
        }
        UpdateBarisData();
    }
   
    public void HapusData(String Nom) {
        try {
            DriverManager.getConnection(Conex.Url, Conex.User, Conex.Password);
            Statement Delete_st = Conex.conn.createStatement();
            Delete_st.executeUpdate("delete from user where id_user = '" + Nom + "' ");
        } catch (Exception e2) {
        //
        }
        UpdateBarisData();
    }

    public void UbahData(String Nom) {
        try {
            //Add Ubah = new Add(jf, "EDIT", Nama);
            FormPlus FTambah=new FormPlus(new User1(), "Form Changer",Nom);
            FTambah.setTitle("Form Changer");   
            FTambah.show();
            
        

        } catch (Exception e2) {
        //
        }
        UpdateBarisData();
    }
    
    public class Painter extends Canvas {

        Image image;

        public void setImage(String file) {
            URL url = null;
            try {
                url = new File(file).toURI().toURL();
            } catch (Exception ex) {
                cetak(ex.toString());
            }
            image = getToolkit().getImage(url);
            repaint();
        }

        public void paint(Graphics g) {
            try{
            double d = image.getHeight(this) / this.getHeight();
            double w = image.getWidth(this) / d;
            double x = this.getWidth() / 1.5 - w / 1.5;
            g.drawImage(image, (int) x, 0, (int) (w), this.getHeight(), this);
        }catch(Exception a){
         System.out.println("Pas de Lignes Sélectionnées");   
        }
        }
    }
    public static class NIOCopier {

        public NIOCopier(String asal, String tujuan) throws IOException {
            FileInputStream inFile = new FileInputStream(asal);
            FileOutputStream outFile = new FileOutputStream(tujuan);
            FileChannel inChannel = inFile.getChannel();
            FileChannel outChannel = outFile.getChannel();
            for (ByteBuffer buffer = ByteBuffer.allocate(1024 * 1024);
                    inChannel.read(buffer) != -1;
                    buffer.clear()) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    outChannel.write(buffer);
                }
            }
            inChannel.close();
            outChannel.close();
        }
    }
}
