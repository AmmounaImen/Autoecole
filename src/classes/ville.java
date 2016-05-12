
package classes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class ville {
    private int code;
    private String designation;
    public static  int  num_amodif=0;
    public static  Boolean mode_amodif=false;
    public ville(int code, String designation ){
        this.code=code;
        this.designation=designation;
    }
    public int getCode(){
        return code;
    }
    public String getDesignation(){
        return designation;
    }
    public String toStringville(){
        return "code : "+code
                +"\nDesignation : "+designation;
    }
    public static ResultSet liste_ville(){
        try{
            connections con =new connections();
            con.connect();
            ResultSet rsc= con.exec("SELECT * FROM ville ORDER BY nom_ville");
            return rsc;
        }catch(Exception ex){
            return null;
        }
    }
    public static ResultSet select_ville(int code){
        try{
            connections con =new connections();
            con.connect();
            ResultSet rsc= con.exec("SELECT * FROM ville where id_ville="+code);
            return rsc;
        }catch(Exception ex){
            return null;
        }
    }
    public static Boolean ajouterVille(ville vil){
            try{
            connections cnx=new connections();
            cnx.connect();
            String s= "insert into `ville` (   `nom_ville`)  values (?)";
            PreparedStatement ps=connections.dbConnect.prepareStatement(s);
            cnx.exec(s);
            //ps.setInt(1, vil.getCode());
            ps.setString(1, vil.getDesignation());
            int t = ps.executeUpdate();
            cnx.close();
            if(t>0){
                return true;
            }else{
                return false;
            } 
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Erreur d'insertion :" + se.getMessage());
            return false;
        }   
    }
    public static Boolean modifierVille(ville fma){
            try{
            connections cnx=new connections();
            cnx.connect();
            String s= "update `ville` set  `nom_ville`=? where `id_ville`=?";
            PreparedStatement ps=connections.dbConnect.prepareStatement(s);
            cnx.exec(s);
            ps.setString(1, fma.getDesignation());
            ps.setInt(2, fma.getCode());
            int t = ps.executeUpdate();
            cnx.close();
            if(t>0){
                return true;
            }else{
                return false;
            } 
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Erreur d'insertion :" + se.getMessage());
            return false;
        }   
    }
    public static Boolean supprimerVille(int code){
            try{
            connections cnx=new connections();
            cnx.connect();
            String s= "delete from `ville` where `id_ville`=?";
            PreparedStatement ps=connections.dbConnect.prepareStatement(s);
            cnx.exec(s);
            ps.setInt (1, code);
            int t = ps.executeUpdate();
            cnx.close();
            if(t>0){
                return true;
            }else{
                return false;
            } 
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Erreur suppressiion :" + se.getMessage());
            return false;
        }   
    }
}
