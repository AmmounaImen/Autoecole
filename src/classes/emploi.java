
package classes;




import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import javax.swing.JOptionPane;
// id_seance, date_seance, heure_seance, duree_seance, id_candidat, id_moniteur, note_seance, presence_seance, type_seance
public class emploi {
    
    private int id_seance;
    private Date  date_seance;
    private Time heure_seance;
    private int  duree_seance;
    private int id_candidat;
    
    private String  note_seance;
   
    private String  type_seance;
    
    public static  int id_candidat_modif=0;

    
    
    
    
    public static  int num_amodif=0;
    public static  Boolean mode_amodif=false;

    public int getId_seancee() {
        return id_seance;
    }

    public void setId_seancee(int id_seancee) {
        this.id_seance = id_seancee;
    }

    public Date getDate_seance() {
        return date_seance;
    }

    public void setDate_seance(Date date_seance) {
        this.date_seance = date_seance;
    }

    public Time getHeure_seance() {
        return heure_seance;
    }

    public void setHeure_seance(Time heure_seance) {
        this.heure_seance = heure_seance;
    }

    public int getDuree_seance() {
        return duree_seance;
    }

    public void setDuree_seance(int duree_seance) {
        this.duree_seance = duree_seance;
    }

    public int getId_candidat() {
        return id_candidat;
    }

    public void setId_candidat(int id_candidat) {
        this.id_candidat = id_candidat;
    }

   

    public String getNote_seance() {
        return note_seance;
    }

    public void setNote_seance(String note_seance) {
        this.note_seance = note_seance;
    }

   

    public String getType_seance() {
        return type_seance;
    }

    public void setType_seance(String type_seance) {
        this.type_seance = type_seance;
    }

    public static int getNum_amodif() {
        return num_amodif;
    }

    public static void setNum_amodif(int num_amodif) {
        emploi.num_amodif = num_amodif;
    }

    public static Boolean getMode_amodif() {
        return mode_amodif;
    }

    public static void setMode_amodif(Boolean mode_amodif) {
        emploi.mode_amodif = mode_amodif;
    }

    public emploi(int  id_seancee, Date date_seance, Time heure_seance, int duree_seance, int id_candidat, String note_seance, String type_seance) {
        this.id_seance = id_seancee;
        this.date_seance = date_seance;
        this.heure_seance = heure_seance;
        this.duree_seance = duree_seance;
        this.id_candidat = id_candidat;
       
        this.note_seance = note_seance;
       
        this.type_seance = type_seance;
    }

    @Override
    public String toString() {
        return "seance{" + "id_seancee=" + id_seance + ", date_seance=" + date_seance + ", heure_seance=" + heure_seance + ", duree_seance=" + duree_seance + ", id_candidat=" + id_candidat + ", note_seance=" + note_seance + ", type_seance=" + type_seance + '}';
    }

    
    
    
    
    public static ResultSet liste_seancee(){
        try{
            connections con =new connections();
            con.connect();
            ResultSet rsc= con.exec("SELECT * FROM emploi");
            
            return rsc;    
            
        }catch(Exception ex){
            return null;
        }
        
    }
    
    public static ResultSet select_seancee(int id_sean){
        try{
            connections con =new connections();
            con.connect();
            ResultSet rsc= con.exec("SELECT * FROM seance where id_seancee='"+id_sean+"'");
            
            return rsc;    
            
        }catch(Exception ex){
            return null;
        }
        
    }
    public static ResultSet liste_seancee_candidat(int id_can){
        try{
            connections con =new connections();
            con.connect();
            ResultSet rsc= con.exec("SELECT * FROM emploi where id_candidat="+id_can);
            
            return rsc;    
            
        }catch(Exception ex){
            return null;
        }
        
    }
    
   /* // matricule,marque, modele, date_controle, date_vidange, en_service*/ 
    public static Boolean ajouterSeancee(emploi cnd){
        try{
            connections cnx=new connections();
            cnx.connect();
            String s= "insert into `emploi` ( `date_seance`, `heure_seance`, `duree_seance`, `id_candidat`, `note_seance`, `type_seance`)  values (?,?,?,?,?,?)";
            PreparedStatement ps=connections.dbConnect.prepareStatement(s);
            cnx.exec(s);
// id_seance, date_seance, heure_seance, duree_seance, id_candidat, id_moniteur, note_seance, presence_seance, type_seance
            
            ps.setDate(1, cnd.getDate_seance());
            ps.setTime(2, cnd.getHeure_seance());
            ps.setInt(3, cnd.getDuree_seance());
            ps.setInt(4, cnd.getId_candidat());
           
            ps.setString(5, cnd.getNote_seance());
            
            ps.setString(6, cnd.getType_seance());
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
    
    
    public static Boolean modifierSeancee(emploi cnd){
        try{
            connections cnx=new connections();
            cnx.connect();
            String s= "update  `emploi` set  `date_seance`=?, `heure_seance`=?, `duree_seance`=?, `id_candidat`=?, `note_seance`=?, `type_seance`=?  where `id_seancee`=?";
            PreparedStatement ps=connections.dbConnect.prepareStatement(s);
            cnx.exec(s);
// id_seance, date_seance, heure_seance, duree_seance, id_candidat, id_moniteur, note_seance, presence_seance, type_seance
            
            ps.setDate(1, cnd.getDate_seance());
            ps.setTime(2, cnd.getHeure_seance());
            ps.setInt(3, cnd.getDuree_seance());
            ps.setInt(4, cnd.getId_candidat());
          
            ps.setString(5, cnd.getNote_seance());
        
            ps.setString(6, cnd.getType_seance());
            ps.setInt(7, cnd.getId_seancee());
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
    
    public static Boolean supprimerSeance(int id_sean){
            try{
            connections cnx=new connections();
            cnx.connect();
            String s= "delete from `emploi` where `id_seancee`=?";
            PreparedStatement ps=connections.dbConnect.prepareStatement(s);
            cnx.exec(s);
            
            ps.setInt(1, id_sean);
            
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


