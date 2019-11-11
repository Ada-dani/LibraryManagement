package Liberarie;

import java.sql.*;
/**
 *
 * @author OMAR
 */
class Conex {
    // variable static agar dpt diakses oleh class lain tanpa object
    public static Connection conn = null;
    public static Statement st = null;
    public static String NameDb, User, Password, Url;
    //variable judul aplikasi
    public String NomApplication = "kirjastohallinta";  
            
    //constructor yg memberikan fungsi utama dan pertama dipanggil
    public Conex() throws Exception {
        //mengisi variable string dengan value tool2 database
        NameDb = "e1100755_kirjastohallinta";
        User = "e1100755";
        Password = "5fuusxSz9NeG";
        String jdbcDriver = "com.mysql.jdbc.Driver";
        Url = "jdbc:mysql://mysql.cc.puv.fi:3306/e1100755_kirjastohallinta" + NameDb;
        //hanya pesan di console agar terlihat sukses atau tidaknya
        System.out.println("Trying to build a connection to'" + Url + "'with user '" + User + "' and password '" + Password + "' ...");
        //mencoba menghubungkan driver aplikasi jdbc ke db
        try {
            Class.forName(jdbcDriver);
            conn = DriverManager.getConnection(Url, User, Password);
            st =  conn.createStatement();
            System.out.println("Success Connection");
        } catch (Exception e) {
            System.out.println("Connection failed");
        }

    }
}

