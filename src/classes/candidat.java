
package classes;




import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class candidat {
    private int id_candidat;
    private String reference_candidat;
    private String nom_candidat;
    private String cin_candidat;
    private Date  dn_candidat;
    private String adresse_candidat;
    private int ville_candidat;
    private String gsm_candidat;
    private String email_candidat;
    private String observation_candidat;
    private Date  date_inscription_candidat;
    private String categorie_permis_candidat;
    private double montant_candidat;
     private String typecontrat;
    /* */
    public static  int num_amodif=0;
    public static  Boolean mode_amodif=false;

    public int getId_candidat() {
        return id_candidat;
    }

    public candidat(int id_candidat, String reference_candidat, String nom_candidat, String cin_candidat) {
        this.id_candidat = id_candidat;
        this.reference_candidat = reference_candidat;
        this.nom_candidat = nom_candidat;
        this.cin_candidat = cin_candidat;
    }
    

    public candidat(int id_candidat, String reference_candidat, String nom_candidat, String cin_candidat, Date dn_candidat, String adresse_candidat, int ville_candidat, String gsm_candidat, String email_candidat, String observation_candidat, Date date_inscription_candidat, String categorie_permis_candidat, double montant_candidat,String type_contrat) {
        this.id_candidat = id_candidat;
        this.reference_candidat = reference_candidat;
        this.nom_candidat = nom_candidat;
        this.cin_candidat = cin_candidat;
        this.dn_candidat = dn_candidat;
        this.adresse_candidat = adresse_candidat;
        this.ville_candidat = ville_candidat;
        this.gsm_candidat = gsm_candidat;
        this.email_candidat = email_candidat;
        this.observation_candidat = observation_candidat;
        this.date_inscription_candidat = date_inscription_candidat;
        this.categorie_permis_candidat = categorie_permis_candidat;
        this.montant_candidat = montant_candidat;
        this.typecontrat = type_contrat;
    }

    public void setId_candidat(int id_candidat) {
        this.id_candidat = id_candidat;
    }

    public String getNom_candidat() {
        return nom_candidat;
    }

    public void setNom_candidat(String nom_candidat) {
        this.nom_candidat = nom_candidat;
    }

    public String getCin_candidat() {
        return cin_candidat;
    }

    public void setCin_candidat(String cin_candidat) {
        this.cin_candidat = cin_candidat;
    }

    public Date getDn_candidat() {
        return dn_candidat;
    }

    public void setDn_candidat(Date dn_candidat) {
        this.dn_candidat = dn_candidat;
    }

    public String getAdresse_candidat() {
        return adresse_candidat;
    }

    public void setAdresse_candidat(String adresse_candidat) {
        this.adresse_candidat = adresse_candidat;
    }

    public int getVille_candidat() {
        return ville_candidat;
    }

    public void setVille_candidat(int ville_candidat) {
        this.ville_candidat = ville_candidat;
    }

    public String getGsm_candidat() {
        return gsm_candidat;
    }

    public void setGsm_candidat(String gsm_candidat) {
        this.gsm_candidat = gsm_candidat;
    }

    public String getEmail_candidat() {
        return email_candidat;
    }

    public void setEmail_candidat(String email_candidat) {
        this.email_candidat = email_candidat;
    }

    public String getObservation_candidat() {
        return observation_candidat;
    }

    public void setObservation_candidat(String observation_candidat) {
        this.observation_candidat = observation_candidat;
    }

    

    public Date getDate_inscription_candidat() {
        return date_inscription_candidat;
    }

    public void setDate_inscription_candidat(Date date_inscription_candidat) {
        this.date_inscription_candidat = date_inscription_candidat;
    }

    public static int getNum_amodif() {
        return num_amodif;
    }

    public static void setNum_amodif(int num_amodif) {
        candidat.num_amodif = num_amodif;
    }

    public static Boolean getMode_amodif() {
        return mode_amodif;
    }

    public static void setMode_amodif(Boolean mode_amodif) {
        candidat.mode_amodif = mode_amodif;
    }

    public String getReference_candidat() {
        return reference_candidat;
    }

    public void setReference_candidat(String reference_candidat) {
        this.reference_candidat = reference_candidat;
    }

    public String getCategorie_permis_candidat() {
        return categorie_permis_candidat;
    }

    public void setCategorie_permis_candidat(String categorie_permis_candidat) {
        this.categorie_permis_candidat = categorie_permis_candidat;
    }

    public double getMontant_candidat() {
        return montant_candidat;
    }

    public void setMontant_candidat(double montant_candidat) {
        this.montant_candidat = montant_candidat;
    }
 public String gettype_contrat() {
        return typecontrat;
    }

    public void settype_contrat(String type_contrat) {
        this.typecontrat = type_contrat;
    }
    @Override
    public String toString() {
        return "candidat{" + "id_candidat=" + id_candidat + ", reference_candidat=" + reference_candidat + ", nom_candidat=" + nom_candidat + ", cin_candidat=" + cin_candidat + ", dn_candidat=" + dn_candidat + ", adresse_candidat=" + adresse_candidat + ", ville_candidat=" + ville_candidat + ", gsm_candidat=" + gsm_candidat + ", email_candidat=" + email_candidat + ", observation_candidat=" + observation_candidat + ", date_inscription_candidat=" + date_inscription_candidat + ", categorie_permis_candidat=" + categorie_permis_candidat + ", montant_candidat=" + montant_candidat + ",type_contrat=" +typecontrat+'}';
    }

    
    

    
    
    public  static int get_reference_candidat(){
        int max_i_c =0;
        try{
            connections con =new connections();
            con.connect();
            ResultSet rsc= con.exec("SELECT MAX(`id_candidat`)+1 as max_id_c FROM candidat");
            rsc.first();
            max_i_c= rsc.getInt("max_id_c");    
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            max_i_c= 1;
        }
        return max_i_c;
    }
    public static ResultSet liste_candidat(){
        try{
            connections con =new connections();
            con.connect();
            ResultSet rsc= con.exec("SELECT * FROM candidat");
            
            return rsc;    
            
        }catch(Exception ex){
            return null;
        }
        
    }
    
    public static ResultSet select_candidat(Integer numero){
        try{
            connections con =new connections();
            con.connect();
            ResultSet rsc= con.exec("SELECT * FROM candidat where id_candidat="+numero);
            
            return rsc;    
            
        }catch(Exception ex){
            return null;
        }
        
    }
   /* 	id_candidat, nom_candidat, cin_candidat, dn_candidat, adresse_candidat, ville_candidat, gsm_candidat, email_candidat, observation_candidat, date_inscription_candidat */ 
    public static Boolean ajoutercandidat(candidat cnd){
            try{
            connections cnx=new connections();
            cnx.connect();
            String s= "insert into `candidat` ( `reference_candidat`,`nom_candidat`, `cin_candidat`, `dn_candidat`, `adresse_candidat`, `ville_candidat`, `gsm_candidat`, `email_candidat`, `observation_candidat`,  `date_inscription_candidat`,`categorie_permis_candidat`, `montant_candidat`,`type_contrat`)  values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps=connections.dbConnect.prepareStatement(s);
            cnx.exec(s);
            ps.setString(1, cnd.getReference_candidat());          
            ps.setString(2, cnd.getNom_candidat());
            ps.setString(3, cnd.getCin_candidat());
            ps.setDate(4, cnd.getDn_candidat());
            ps.setString(5, cnd.getAdresse_candidat());
            ps.setInt(6, cnd.getVille_candidat());
            ps.setString(7, cnd.getGsm_candidat());
            ps.setString(8, cnd.getEmail_candidat());
            ps.setString(9, cnd.getObservation_candidat());
            ps.setDate(10, cnd.getDate_inscription_candidat());
            ps.setString(11, cnd.getCategorie_permis_candidat());
            ps.setDouble(12, cnd.getMontant_candidat());
             ps.setString(13, cnd.gettype_contrat());
                       
            
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
    
    public static Boolean modifiercandidat(candidat cnd){
            try{
            connections cnx=new connections();
            cnx.connect();
            String s= "update `candidat` set  `reference_candidat`=?, `nom_candidat`=?, `cin_candidat`=?, `dn_candidat`=?, `adresse_candidat`=?, `ville_candidat`=?, `gsm_candidat`=?, `email_candidat`=?, `observation_candidat`=?,  `date_inscription_candidat`=?,`categorie_permis_candidat`=?,`montant_candidat`=?, `type_contrat`=?    where `id_candidat`=?";
            PreparedStatement ps=connections.dbConnect.prepareStatement(s);
            cnx.exec(s);
                      
            
            ps.setString(1, cnd.getReference_candidat());          
            ps.setString(2, cnd.getNom_candidat());
            ps.setString(3, cnd.getCin_candidat());
            ps.setDate(4, cnd.getDn_candidat());
            ps.setString(5, cnd.getAdresse_candidat());
            ps.setInt(6, cnd.getVille_candidat());
            ps.setString(7, cnd.getGsm_candidat());
            ps.setString(8, cnd.getEmail_candidat());
            ps.setString(9, cnd.getObservation_candidat());
            ps.setDate(10, cnd.getDate_inscription_candidat());
            ps.setString(11, cnd.getCategorie_permis_candidat());
            ps.setDouble(12, cnd.getMontant_candidat());
             ps.setString(13, cnd.gettype_contrat());
            ps.setInt(14, cnd.getId_candidat());
                       
            
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
    public static Boolean supprimercandidat(Integer numero){
            try{
            connections cnx=new connections();
            cnx.connect();
            String s= "delete from `candidat` where `id_candidat`=?";
            PreparedStatement ps=connections.dbConnect.prepareStatement(s);
            cnx.exec(s);
            
            ps.setInt(1, numero);
            
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


