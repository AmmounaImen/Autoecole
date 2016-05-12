package classes;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class connections {
    private String dbURL = "//localhost:3306/ecoleauto";
    private String user = "root";
    private String password = "";
    public static java.sql.Connection dbConnect = null;
    public static java.sql.Statement dbStatement = null;
    
     public Boolean connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            dbConnect = DriverManager.getConnection("jdbc:mysql:" + this.dbURL, this.user, this.password);
            dbStatement = dbConnect.createStatement();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(connections.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(connections.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(connections.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(connections.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
     
   public ResultSet exec(String sql) {
        try {
            
            connections cnx = new connections();
            cnx.connect();
            ResultSet rs = dbStatement.executeQuery(sql);
            //cnx.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(connections.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
   
    public void close() {
        try {
            dbStatement.close();
            dbConnect.close();
            dbConnect.close();
        } catch (SQLException ex) {
            Logger.getLogger(connections.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
