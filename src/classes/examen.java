
package classes;




import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import javax.swing.JOptionPane;
// id_examen, date_examen, heure_examen, type_examen, id_candidat, note_examen, resultat_examen, numero_permis
public class examen {
    
    private int id_examen;
    private Date  date_examen;
    private Time heure_examen;
    private int id_candidat;
    private int  note_examen;
    private Boolean  resultat_examen;
    private String  numero_permis;
    private String  type_examen;
    
    public static  int id_candidat_modif=0;
    public static  int num_amodif=0;
    public static  Boolean mode_amodif=false;

    public int getId_examen() {
        return id_examen;
    }

    public String getType_examen() {
        return type_examen;
    }

    public void setType_examen(String type_examen) {
        this.type_examen = type_examen;
    }

    public void setId_examen(int id_examen) {
        this.id_examen = id_examen;
    }

    public Date getDate_examen() {
        return date_examen;
    }

    public void setDate_examen(Date date_examen) {
        this.date_examen = date_examen;
    }

    public Time getHeure_examen() {
        return heure_examen;
    }

    public void setHeure_examen(Time heure_examen) {
        this.heure_examen = heure_examen;
    }

    public int getId_candidat() {
        return id_candidat;
    }

    public void setId_candidat(int id_candidat) {
        this.id_candidat = id_candidat;
    }

    public int getNote_examen() {
        return note_examen;
    }

    public void setNote_examen(int note_examen) {
        this.note_examen = note_examen;
    }

    public Boolean getResultat_examen() {
        return resultat_examen;
    }

    public void setResultat_examen(Boolean resultat_examen) {
        this.resultat_examen = resultat_examen;
    }

    public String getNumero_permis() {
        return numero_permis;
    }

    public void setNumero_permis(String numero_permis) {
        this.numero_permis = numero_permis;
    }

    public examen(int id_examen, Date date_examen, Time heure_examen, int id_candidat, int note_examen, Boolean resultat_examen, String numero_permis, String type_examen) {
        this.id_examen = id_examen;
        this.date_examen = date_examen;
        this.heure_examen = heure_examen;
        this.id_candidat = id_candidat;
        this.note_examen = note_examen;
        this.resultat_examen = resultat_examen;
        this.numero_permis = numero_permis;
        this.type_examen = type_examen;
    }

    @Override
    public String toString() {
        return "examen{" + "id_examen=" + id_examen + ", date_examen=" + date_examen + ", heure_examen=" + heure_examen + ", id_candidat=" + id_candidat + ", note_examen=" + note_examen + ", resultat_examen=" + resultat_examen + ", numero_permis=" + numero_permis + ", type_examen=" + type_examen + '}';
    }

    

   

    
    
    
    
    public static ResultSet liste_examen(){
        try{
            connections con =new connections();
            con.connect();
            ResultSet rsc= con.exec("SELECT * FROM examen");
            
            return rsc;    
            
        }catch(Exception ex){
            return null;
        }
        
    }
    
    public static ResultSet select_examen(int id_sean){
        try{
            connections con =new connections();
            con.connect();
            ResultSet rsc= con.exec("SELECT * FROM examen where id_examen="+id_sean);
            
            return rsc;    
            
        }catch(Exception ex){
            return null;
        }
        
    }
    public static ResultSet liste_examen_candidat(int id_can){
        try{
            connections con =new connections();
            con.connect();
            ResultSet rsc= con.exec("SELECT * FROM examen where id_candidat="+id_can);
            
            return rsc;    
            
        }catch(Exception ex){
            return null;
        }
        
    }
    
   
    public static Boolean ajouterExamen(examen cnd){
        try{
            connections cnx=new connections();
            cnx.connect();
            String s= "insert into `examen` (  `date_examen`, `heure_examen`, `type_examen`, `id_candidat`, `note_examen`, `resultat_examen`, `numero_permis`)  values (?,?,?,?,?,?,?)";
            PreparedStatement ps=connections.dbConnect.prepareStatement(s);
            cnx.exec(s);
           
            ps.setDate(1, cnd.getDate_examen());
            ps.setTime(2, cnd.getHeure_examen());
            ps.setString(3, cnd.getType_examen());
            ps.setInt(4, cnd.getId_candidat());
            ps.setInt(5, cnd.getNote_examen());
            ps.setBoolean(6, cnd.getResultat_examen());
            ps.setString(7, cnd.getNumero_permis());
           
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
    
    
    public static Boolean modifierExamen(examen cnd){
        try{
            connections cnx=new connections();
            cnx.connect();
            String s= "update `examen`  set `date_examen`=?, `heure_examen`=?, `type_examen`=?, `id_candidat`=?, `note_examen`=?, `resultat_examen`=?, `numero_permis`=? where `id_examen`=?";
            PreparedStatement ps=connections.dbConnect.prepareStatement(s);
            cnx.exec(s);
           
            ps.setDate(1, cnd.getDate_examen());
            ps.setTime(2, cnd.getHeure_examen());
            ps.setString(3, cnd.getType_examen());
            ps.setInt(4, cnd.getId_candidat());
            ps.setInt(5, cnd.getNote_examen());
            ps.setBoolean(6, cnd.getResultat_examen());
            ps.setString(7, cnd.getNumero_permis());
            ps.setInt(8, cnd.getId_examen());
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
    
    public static Boolean supprimerExamen(int id_sean){
            try{
            connections cnx=new connections();
            cnx.connect();
            String s= "delete from `examen` where `id_examen`=?";
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


