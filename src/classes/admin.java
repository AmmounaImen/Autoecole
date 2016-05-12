
package classes;





import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
// id_admin, nom_admin, email_admin, pseudo, mdp, etat_admin
public class admin {
    
    private int id_admin;
    private String nom_admin;
    private String email_admin;
    private String pseudo;
    private String mdp;
    
    
    
    
    
    
    
    public static  int num_amodif=0;
    public static  Boolean mode_amodif=false;

    public admin(int num_amodif, String toString, String toString0, String toString1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public String getNom_admin() {
        return nom_admin;
    }

    public void setNom_admin(String nom_admin) {
        this.nom_admin = nom_admin;
    }

    public String getEmail_admin() {
        return email_admin;
    }

    public void setEmail_admin(String email_admin) {
        this.email_admin = email_admin;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

  

    public static int getNum_amodif() {
        return num_amodif;
    }

    public static void setNum_amodif(int num_amodif) {
        admin.num_amodif = num_amodif;
    }

    public static Boolean getMode_amodif() {
        return mode_amodif;
    }

    public static void setMode_amodif(Boolean mode_amodif) {
        admin.mode_amodif = mode_amodif;
    }

    public admin(int id_admin, String nom_admin, String email_admin, String pseudo, String mdp) {
        this.id_admin = id_admin;
        this.nom_admin = nom_admin;
        this.email_admin = email_admin;
        this.pseudo = pseudo;
        this.mdp = mdp;
        //this.etat_admin = etat_admin;
    }

    @Override
    public String toString() {
        return "admin{" + "id_admin=" + id_admin + ", nom_admin=" + nom_admin + ", email_admin=" + email_admin + ", pseudo=" + pseudo + ", mdp=" + mdp + '}';
    }

    

    
    
    
    
    public static ResultSet liste_admin(){
        try{
            connections con =new connections();
            con.connect();
            ResultSet rsc= con.exec("SELECT * FROM admin");
            
            return rsc;    
            
        }catch(Exception ex){
            return null;
        }
        
    }
    
    public static ResultSet select_admin(String id_admin){
        try{
            connections con =new connections();
            con.connect();
            ResultSet rsc= con.exec("SELECT * FROM admin where `id_admin`="+id_admin);
            
            return rsc;    
            
        }catch(Exception ex){
            return null;
        }
        
    }
   /* // id_admin, nom_admin, email_admin, pseudo, mdp, etat_admin*/ 
    public static Boolean ajouterAdmin(admin cnd){
        try{
            connections cnx=new connections();
            cnx.connect();
            String s= "insert into `admin` ( `nom_admin`, `email_admin`, `pseudo`, `mdp`)  values (?,?,?,?)";
            PreparedStatement ps=connections.dbConnect.prepareStatement(s);
            cnx.exec(s);
            
            ps.setString(1, cnd.getNom_admin());
            ps.setString(2, cnd.getEmail_admin());
            ps.setString(3, cnd.getPseudo());
            ps.setString(4, cnd.getMdp());
           // ps.setBoolean(5, cnd.getEtat_admin());
            

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
    public static Boolean modifierAdmin(admin cnd){
        try{
            connections cnx=new connections();
            cnx.connect();
            String s= "update `admin` set `nom_admin`=?, `email_admin`=?, `pseudo`=?, `mdp`=? where `id_admin`=?";
            PreparedStatement ps=connections.dbConnect.prepareStatement(s);
            cnx.exec(s);
            
            ps.setString(1, cnd.getNom_admin());
            ps.setString(2, cnd.getEmail_admin());
            ps.setString(3, cnd.getPseudo());
            ps.setString(4, cnd.getMdp());
            //ps.setBoolean(5, cnd.getEtat_admin());
            ps.setInt(5, cnd.getId_admin());
            

            int t = ps.executeUpdate();
            cnx.close();
            if(t>0){
                return true;
            }else{
                return false;
            } 
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Erreur modification :" + se.getMessage());
            return false;
        }   
    }
    
    
    
    public static Boolean supprimerAdmin(int id_admin){
            try{
            connections cnx=new connections();
            cnx.connect();
            String s= "delete from `admin` where `id_admin`=?";
            PreparedStatement ps=connections.dbConnect.prepareStatement(s);
            cnx.exec(s);
            
            ps.setInt(1, id_admin);
            
            int t = ps.executeUpdate();
            cnx.close();
            if(t>0){
                return true;
            }else{
                return false;
            } 
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Erreur Suppresion :" + se.getMessage());
            return false;
        }   
    }
    
    
    
    
    
}


