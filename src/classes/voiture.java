
package classes;




import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
// matricule,marque, modele, date_controle, date_vidange, en_service
public class voiture {
    
    private String matricule;
    private String marque;
    private String modele;
    private Date  date_controle;
    private Date  date_vidange;
    private Boolean  en_service;

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public Date getDate_controle() {
        return date_controle;
    }

    public void setDate_controle(Date date_controle) {
        this.date_controle = date_controle;
    }

    public Date getDate_vidange() {
        return date_vidange;
    }

    public void setDate_vidange(Date date_vidange) {
        this.date_vidange = date_vidange;
    }

    public Boolean getEn_service() {
        return en_service;
    }

    public void setEn_service(Boolean en_service) {
        this.en_service = en_service;
    }

    

    public static Boolean getMode_amodif() {
        return mode_amodif;
    }

    public static void setMode_amodif(Boolean mode_amodif) {
        voiture.mode_amodif = mode_amodif;
    }

    public voiture(String matricule, String marque, String modele, Date date_controle, Date date_vidange, Boolean en_service) {
        this.matricule = matricule;
        this.marque = marque;
        this.modele = modele;
        this.date_controle = date_controle;
        this.date_vidange = date_vidange;
        this.en_service = en_service;
    }

    @Override
    public String toString() {
        return "voiture{" + "matricule=" + matricule + ", marque=" + marque + ", modele=" + modele + ", date_controle=" + date_controle + ", date_vidange=" + date_vidange + ", en_service=" + en_service + '}';
    }
    
    
    
    
    public static  String num_amodif="";
    public static  Boolean mode_amodif=false;

    
    
    
    
    public static ResultSet liste_voiture(){
        try{
            connections con =new connections();
            con.connect();
            ResultSet rsc= con.exec("SELECT * FROM voiture");
            
            return rsc;    
            
        }catch(Exception ex){
            return null;
        }
        
    }
    
    public static ResultSet select_voiture(String matricule){
        try{
            connections con =new connections();
            con.connect();
            ResultSet rsc= con.exec("SELECT * FROM voiture where matricule='"+matricule+"'");
            
            return rsc;    
            
        }catch(Exception ex){
            return null;
        }
        
    }
   /* // matricule,marque, modele, date_controle, date_vidange, en_service*/ 
    public static Boolean ajouterVoiture(voiture cnd){
        try{
            connections cnx=new connections();
            cnx.connect();
            String s= "insert into `voiture` (`matricule`,`marque`, `modele`, `date_controle`, `date_vidange`, `en_service`)  values (?,?,?,?,?,?)";
            PreparedStatement ps=connections.dbConnect.prepareStatement(s);
            cnx.exec(s);

            ps.setString(1, cnd.getMatricule());
            ps.setString(2, cnd.getMarque());
            ps.setString(3, cnd.getModele());
            ps.setDate(4, cnd.getDate_controle());
            ps.setDate(5, cnd.getDate_vidange());
            ps.setBoolean(6, cnd.getEn_service());

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
    
    
    public static Boolean modifierVoiture(voiture cnd){
        try{
            connections cnx=new connections();
            cnx.connect();
            String s= "update `voiture` set `marque`=?, `modele`=?, `date_controle`=?, `date_vidange`=?, `en_service`=? where `matricule`=?";
            PreparedStatement ps=connections.dbConnect.prepareStatement(s);
            cnx.exec(s);

            
            ps.setString(1, cnd.getMarque());
            ps.setString(2, cnd.getModele());
            ps.setDate(3, cnd.getDate_controle());
            ps.setDate(4, cnd.getDate_vidange());
            ps.setBoolean(5, cnd.getEn_service());
            ps.setString(6, cnd.getMatricule());
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
    
    public static Boolean supprimerVoiture(String matricule){
            try{
            connections cnx=new connections();
            cnx.connect();
            String s= "delete from `voiture` where `matricule`=?";
            PreparedStatement ps=connections.dbConnect.prepareStatement(s);
            cnx.exec(s);
            
            ps.setString(1, matricule);
            
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


