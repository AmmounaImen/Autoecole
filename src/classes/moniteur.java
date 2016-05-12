
package classes;




import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
// id_moniteur, nom_moniteur, cin_moniteur, adresse_moniteur, type_moniteur, gsm_moniteur, date_inscription_moniteur
public class moniteur {
    
    private int id_moniteur;
    private String nom_moniteur;
    private String cin_moniteur;
    private String adresse_moniteur;
    private String type_moniteur;
    private String gsm_moniteur;
    private Date  date_inscription_moniteur;
    
    
    
    
    
    public static  int num_amodif=0;
    public static  Boolean mode_amodif=false;

    public int getId_moniteur() {
        return id_moniteur;
    }

    public void setId_moniteur(int id_moniteur) {
        this.id_moniteur = id_moniteur;
    }

    public String getNom_moniteur() {
        return nom_moniteur;
    }

    public void setNom_moniteur(String nom_moniteur) {
        this.nom_moniteur = nom_moniteur;
    }

    public String getCin_moniteur() {
        return cin_moniteur;
    }

    public void setCin_moniteur(String cin_moniteur) {
        this.cin_moniteur = cin_moniteur;
    }

    public String getAdresse_moniteur() {
        return adresse_moniteur;
    }

    public void setAdresse_moniteur(String adresse_moniteur) {
        this.adresse_moniteur = adresse_moniteur;
    }

    public String getType_moniteur() {
        return type_moniteur;
    }

    public void setType_moniteur(String type_moniteur) {
        this.type_moniteur = type_moniteur;
    }

    public String getGsm_moniteur() {
        return gsm_moniteur;
    }

    public void setGsm_moniteur(String gsm_moniteur) {
        this.gsm_moniteur = gsm_moniteur;
    }

    public Date getDate_inscription_moniteur() {
        return date_inscription_moniteur;
    }

    public void setDate_inscription_moniteur(Date date_inscription_moniteur) {
        this.date_inscription_moniteur = date_inscription_moniteur;
    }

    public static int getNum_amodif() {
        return num_amodif;
    }

    public static void setNum_amodif(int num_amodif) {
        moniteur.num_amodif = num_amodif;
    }

    public static Boolean getMode_amodif() {
        return mode_amodif;
    }

    public static void setMode_amodif(Boolean mode_amodif) {
        moniteur.mode_amodif = mode_amodif;
    }

    public moniteur(int id_moniteur, String nom_moniteur, String cin_moniteur, String adresse_moniteur, String type_moniteur, String gsm_moniteur, Date date_inscription_moniteur) {
        this.id_moniteur = id_moniteur;
        this.nom_moniteur = nom_moniteur;
        this.cin_moniteur = cin_moniteur;
        this.adresse_moniteur = adresse_moniteur;
        this.type_moniteur = type_moniteur;
        this.gsm_moniteur = gsm_moniteur;
        this.date_inscription_moniteur = date_inscription_moniteur;
    }

    @Override
    public String toString() {
        return "moniteur{" + "id_moniteur=" + id_moniteur + ", nom_moniteur=" + nom_moniteur + ", cin_moniteur=" + cin_moniteur + ", adresse_moniteur=" + adresse_moniteur + ", type_moniteur=" + type_moniteur + ", gsm_moniteur=" + gsm_moniteur + ", date_inscription_moniteur=" + date_inscription_moniteur + '}';
    }

    
    
    
    
    public static ResultSet liste_moniteur(){
        try{
            connections con =new connections();
            con.connect();
            ResultSet rsc= con.exec("SELECT * FROM moniteur");
            
            return rsc;    
            
        }catch(Exception ex){
            return null;
        }
        
    }
    
    public static ResultSet select_moniteur(int id_moniteur){
        try{
            connections con =new connections();
            con.connect();
            ResultSet rsc= con.exec("SELECT * FROM moniteur where id_moniteur="+id_moniteur);
            
            return rsc;    
            
        }catch(Exception ex){
            return null;
        }
        
    }
   /* // id_moniteur, nom_moniteur, cin_moniteur, adresse_moniteur, type_moniteur, gsm_moniteur, date_inscription_moniteur*/ 
    public static Boolean ajouterMoniteur(moniteur cnd){
        try{
            connections cnx=new connections();
            cnx.connect();
            String s= "insert into `moniteur` ( `nom_moniteur`, `cin_moniteur`, `adresse_moniteur`, `type_moniteur`, `gsm_moniteur`, `date_inscription_moniteur`)  values (?,?,?,?,?,?)";
            PreparedStatement ps=connections.dbConnect.prepareStatement(s);
            cnx.exec(s);
            ps.setString(1, cnd.getNom_moniteur());
            ps.setString(2, cnd.getCin_moniteur());
            ps.setString(3, cnd.getAdresse_moniteur());
            ps.setString(4, cnd.getType_moniteur());
            ps.setString(5, cnd.getGsm_moniteur());
            ps.setDate(6, cnd.getDate_inscription_moniteur());
            

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
    
    
    public static Boolean modifierMoniteur(moniteur cnd){
        try{
            connections cnx=new connections();
            cnx.connect();
            String s= "update `moniteur` set  `nom_moniteur`=?, `cin_moniteur`=?, `adresse_moniteur`=?, `type_moniteur`=?, `gsm_moniteur`=?, `date_inscription_moniteur`=?  where `id_moniteur`=?";
            PreparedStatement ps=connections.dbConnect.prepareStatement(s);
            cnx.exec(s);

            
            ps.setString(1, cnd.getNom_moniteur());
            ps.setString(2, cnd.getCin_moniteur());
            ps.setString(3, cnd.getAdresse_moniteur());
            ps.setString(4, cnd.getType_moniteur());
            ps.setString(5, cnd.getGsm_moniteur());
            ps.setDate(6, cnd.getDate_inscription_moniteur());
            ps.setInt(7, cnd.getId_moniteur());

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
    
    public static Boolean supprimerMoniteur(int id_moniteur){
            try{
            connections cnx=new connections();
            cnx.connect();
            String s= "delete from `moniteur` where `id_moniteur`=?";
            PreparedStatement ps=connections.dbConnect.prepareStatement(s);
            cnx.exec(s);
            
            ps.setInt(1, id_moniteur);
            
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


