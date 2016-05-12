
package classes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class societe {
  
    private final int id_societe;
    private final String nom_societe;
    private final String description_societe;
    private final String adresse_societe;
    private final String ville_societe;
    private final int cp_societe;
    private final int tel_societe;
    private final int fax_societe;
    private final String website_societe;
    private final String email_societe;
    public static  int num_amodif=0;
    public static  Boolean mode_amodif=false;
    
    public societe(int id_societe, String nom_societe, String description_societe,
            String adresse_societe, String ville_societe, int cp_societe,
            int tel_societe, int fax_societe, String website_societe, String email_societe
            ){
        this.id_societe=id_societe;
        this.nom_societe=nom_societe;
        this.description_societe=description_societe;
        this.adresse_societe=adresse_societe;
        this.ville_societe=ville_societe;
        this.cp_societe=cp_societe;
        this.tel_societe=tel_societe;
        this.fax_societe=fax_societe;
        this.website_societe=website_societe;
        this.email_societe=email_societe;
    }
    
    public int getIdSociete(){
        return id_societe;
    }
    public String getNomSociete(){
        return nom_societe;
    }
    public String getDescriptionSociete(){
        return description_societe;
    }
    public String getAdresseSociete(){
        return adresse_societe;
    }
    public String getVilleSociete(){
        return ville_societe;
    }
    public int getCPSociete(){
        return cp_societe;
    }
    public int getTelSociete(){
        return tel_societe;
    }
    public int getFaxSociete(){
        return fax_societe;
    }
    public String getWebsiteSociete(){
        return website_societe;
    }
    public String getEmailSociete(){
        return email_societe;
    }
    public static ResultSet select_societe(Integer id_societe){
        try{
            connections con =new connections();
            con.connect();
            ResultSet rsc= con.exec("SELECT * FROM societe where id_societe="+id_societe);
            return rsc; 
        }catch(Exception ex){
            return null;
        }
    }
    public static Boolean ajouterSociete(societe sct){
            try{
            connections cnx=new connections();
            cnx.connect();
            String s= "insert into `societe` ( `id_societe`,`nom_societe`,`description_societe`,  `adresse_societe`, `ville_societe`, `cp_societe`, `tel_societe`, `fax_societe`, `website_societe`, `email_societe`)  values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps=connections.dbConnect.prepareStatement(s);
            cnx.exec(s);
            ps.setInt(1, sct.getIdSociete());
            ps.setString(2, sct.getNomSociete());
            ps.setString(3, sct.getDescriptionSociete());
            ps.setString(4, sct.getAdresseSociete());
            ps.setString(5, sct.getVilleSociete());
            ps.setInt(6, sct.getCPSociete());
            ps.setInt(7, sct.getTelSociete());
            ps.setInt(8, sct.getFaxSociete());
            ps.setString(9, sct.getWebsiteSociete());
            ps.setString(10, sct.getEmailSociete());
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
    public static Boolean modifierSociete(societe sct){
            try{
            connections cnx=new connections();
            cnx.connect();
            String s= "update `societe` set `nom_societe`=?,`description_societe`=?,  `adresse_societe`=?, `ville_societe`=?, `cp_societe`=?, `tel_societe`=?, `fax_societe`=?, `website_societe`=?, `email_societe`=? where `id_societe`=?";
            PreparedStatement ps=connections.dbConnect.prepareStatement(s);
            cnx.exec(s);
            ps.setString(1, sct.getNomSociete());
            ps.setString(2, sct.getDescriptionSociete());
            ps.setString(3, sct.getAdresseSociete());
            ps.setString(4, sct.getVilleSociete());
            ps.setInt(5, sct.getCPSociete());
            ps.setInt(6, sct.getTelSociete());
            ps.setInt(7, sct.getFaxSociete());
            ps.setString(8, sct.getWebsiteSociete());
            ps.setString(9, sct.getEmailSociete());
            ps.setInt(10, sct.getIdSociete());
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
   
    
    
    
}
