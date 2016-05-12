package classes;

import java.sql.*;
import java.awt.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author VANY
 */
public class Conex {
    // variable static agar dpt diakses oleh class lain tanpa object
    public static Connection conn = null;
    public static Statement st = null;
    public static String NomDb, User, Password, Url;

    static Statement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //variable judul aplikasi
    public String NomApplication = "ecoleauto";  
            
    //constructor yg memberikan fungsi utama dan pertama dipanggil
    public Conex() throws Exception {
        //mengisi variable string dengan value tool2 database
        NomDb = "ecoleauto";
        User = "root";
        Password = "";
        String jdbcDriver = "com.mysql.jdbc.Driver";
        Url = "jdbc:mysql://localhost:3306/" + NomDb;
        //hanya pesan di console agar terlihat sukses atau tidaknya
        System.out.println("Essayer de construire une connexion à '" + Url + "' avec user '" + User + "' et password '" + Password + "' ...");
        //mencoba menghubungkan driver aplikasi jdbc ke db
        try {
            Class.forName(jdbcDriver);
            conn = DriverManager.getConnection(Url, User, Password);
            st =  conn.createStatement();
            System.out.println("succès Connexion");
        } catch (Exception e) {
            System.out.println("Échec de la connexion");
        }

    }

    public static Connection getConn() {
        return conn;
    }

    public static void setConn(Connection conn) {
        Conex.conn = conn;
    }
    
    
}

