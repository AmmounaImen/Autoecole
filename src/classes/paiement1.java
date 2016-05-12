
package classes;




import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class paiement1 {
    
    //id_paiement, id_candidat, date_paiement, type_paiement, numero_cheque, date_cheque, montant_paiement, note_paiement

    private int id_paiement;
    private int id_candidat;
    private Date  date_paiement;
    private String type_paiement;
    private String numero_cheque;
    private Date  date_cheque;
    private double montant_paiement;
   private String note_paiement;
     private String typecontrat;
     private int nbheurecode;
     private int  nbheureconduit;
    /* */
    public static  int num_amodif=0;
    public static  Boolean mode_amodif=false;
    public static  int id_candidat_modif=0;

    public paiement1(int num_amodif, int id_candidat_modif, Date date_paiement_, String toString, String text, Date date_cheque_, double parseDouble, String toString0, String toString1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public paiement1(int num_amodif, int id_candidat_modif, Date date_paiement_, String toString, String text, Date date_cheque_, double parseDouble, String toString0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getId_paiement() {
        return id_paiement;
    }

    public void setId_paiement(int id_paiement) {
        this.id_paiement = id_paiement;
    }

    public int getId_candidat() {
        return id_candidat;
    }

    public void setId_candidat(int id_candidat) {
        this.id_candidat = id_candidat;
    }

    public Date getDate_paiement() {
        return date_paiement;
    }

    public void setDate_paiement(Date date_paiement) {
        this.date_paiement = date_paiement;
    }

    public String getType_paiement() {
        return type_paiement;
    }

    public void setType_paiement(String type_paiement) {
        this.type_paiement = type_paiement;
    }

    public String getNumero_cheque() {
        return numero_cheque;
    }

    public void setNumero_cheque(String numero_cheque) {
        this.numero_cheque = numero_cheque;
    }

    public Date getDate_cheque() {
        return date_cheque;
    }

    public void setDate_cheque(Date date_cheque) {
        this.date_cheque = date_cheque;
    }

    public double getMontant_paiement() {
        return montant_paiement;
    }

    public void setMontant_paiement(double montant_paiement) {
        this.montant_paiement = montant_paiement;
    }

    public String getNote_paiement() {
        return note_paiement;
    }

    public void setNote_paiement(String note_paiement) {
        this.note_paiement = note_paiement;
    }
 
 public String gettype_contrat() {
        return typecontrat;}
 public void settype_contrat(String type_contrat)
 {
        this.typecontrat = type_contrat;
    }
    
 public int getnbheurecode() {
        return nbheurecode;}
 public void setnbheurecode(int nbheurecode)
 {
        this.nbheurecode = nbheurecode;
    }
 public int getnbheureconduite() {
        return nbheureconduit;}
 public void setnbheureconduite(int nbheureconduite)
 {
        this.nbheureconduit = nbheureconduite;
    }
    public static int getNum_amodif() {
        return num_amodif;
    }

    public static void setNum_amodif(int num_amodif) {
        paiement1.num_amodif = num_amodif;
    }

    public static Boolean getMode_amodif() {
        return mode_amodif;
    }

    public static void setMode_amodif(Boolean mode_amodif) {
        paiement1.mode_amodif = mode_amodif;
    }

    public paiement1(int id_paiement, int id_candidat, Date date_paiement, String type_paiement, String numero_cheque, Date date_cheque, double montant_paiement, String note_paiement, String type_contrat,int nbheurecode,int nbheureconduite) {
        this.id_paiement = id_paiement;
        this.id_candidat = id_candidat;
        this.date_paiement = date_paiement;
        this.type_paiement = type_paiement;
        this.numero_cheque = numero_cheque;
        this.date_cheque = date_cheque;
        this.montant_paiement = montant_paiement;
        this.note_paiement = note_paiement;
        this.typecontrat = type_contrat; 
    this.nbheurecode = nbheurecode;
    this.nbheureconduit = nbheureconduite;}

    @Override
    public String toString() {
        return "paiement{" + "id_paiement=" + id_paiement + ", id_candidat=" + id_candidat + ", date_paiement=" + date_paiement + ", type_paiement=" + type_paiement + ", numero_cheque=" + numero_cheque + ", date_cheque=" + date_cheque + ", montant_paiement=" + montant_paiement + ", note_paiement=" + note_paiement +",type_contrat=" + typecontrat + ",nbheurecode=" + nbheurecode +",nbheureconduite=" + nbheureconduit +'}';
    }

    

    
    

    
    
    
    public static ResultSet liste_paiement(){
        try{
            connections con =new connections();
            con.connect();
            ResultSet rsc= con.exec("SELECT * FROM paiement");
            
            return rsc;    
            
        }catch(Exception ex){
            return null;
        }
        
    }
    public static ResultSet liste_paiement_candidat(int id_cand){
        try{
            connections con =new connections();
            con.connect();
            ResultSet rsc= con.exec("SELECT * FROM paiement where id_candidat="+id_cand);
            
            return rsc;    
            
        }catch(Exception ex){
            return null;
        }
        
    }
    public  static Double total_paiement_candidat(int id_cand){
        double tot =0;
        try{
            connections con =new connections();
            con.connect();
            ResultSet rsc= con.exec("SELECT SUM(`montant_paiement`) as total_paiement FROM paiement where id_candidat="+id_cand);
            rsc.first();
            tot= rsc.getDouble("total_paiement");    
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            tot= 0.0;
        }
        return tot;
    }
    
    
    
    
    
     public  static Double mantantàpayer(int id_cand){
        double tot1 =0;
         double tot2=0;
          double tot3=0;
           double tot4=0;
           double tot=0.0;
        try{
            connections con =new connections();
            con.connect();
            ResultSet rsc1= con.exec("SELECT `nbheurecode` ) as total_paiement FROM paiement where id_candidat="+id_cand);
             ResultSet rsc2= con.exec("SELECT `prixheurecode` ) as total_paiement FROM paiement where id_candidat="+id_cand);
             ResultSet rsc3= con.exec("SELECT `nbheureconduite` ) as total_paiement FROM paiement where id_candidat="+id_cand);
             ResultSet rsc4= con.exec("SELECT `prixheureconduite` ) as total_paiement FROM paiement where id_candidat="+id_cand);
            rsc1.first();
            rsc2.first();
            rsc3.first();
            rsc4.first();
            
            tot1= rsc1.getDouble("total_paiement");  
            tot2= rsc2.getDouble("total_paiement");  
            tot3= rsc3.getDouble("total_paiement");  
            tot4= rsc4.getDouble("total_paiement");  
            tot=(tot1*tot2)+(tot3*tot4);
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            tot= 0.0;
        }
        return tot;
    }
    
    public static ResultSet select_paiement(Integer numero){
        try{
            connections con =new connections();
            con.connect();
            ResultSet rsc= con.exec("SELECT * FROM paiement where id_paiement="+numero);
            
            return rsc;    
            
        }catch(Exception ex){
            return null;
        }
        
    }
   /* 	//id_paiement, id_candidat, date_paiement, type_paiement, numero_cheque, date_cheque, montant_paiement, note_paiement */ 
    public static Boolean ajouterPaiement(paiement1 cnd){
            try{
            connections cnx=new connections();
            cnx.connect();
            String s= "insert into `paiement` ( `id_candidat`, `date_paiement`, `type_paiement`, `numero_cheque`, `date_cheque`, `montant_paiement`, `note_paiement`, `type_contrat`, `nbheurecode`, `nbheureconduite`)  values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps=connections.dbConnect.prepareStatement(s);
            cnx.exec(s);
            
            ps.setInt(1, cnd.getId_candidat());
            ps.setDate(2, cnd.getDate_paiement());
            ps.setString(3, cnd.getType_paiement());
            ps.setString(4, cnd.getNumero_cheque());
            ps.setDate(5, cnd.getDate_cheque());
            ps.setDouble(6, cnd.getMontant_paiement());
            ps.setString(7, cnd.getNote_paiement());
             ps.setString(8, cnd.gettype_contrat());
              ps.setInt(9, cnd.getnbheurecode());
               ps.setInt(10, cnd.getnbheureconduite());
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
    
    public static Boolean modifierPaiement(paiement1 cnd){
            try{
            connections cnx=new connections();
            cnx.connect();
            String s= "update  `paiement` set  `id_candidat`=?, `date_paiement`=?, `type_paiement`=?, `numero_cheque`=?, `date_cheque`=?, `montant_paiement`=?, `note_paiement`=? , `type_contrat`=? , `nbheurecode`=?, `nbheureconduite`=? where `id_paiement`=?";
            PreparedStatement ps=connections.dbConnect.prepareStatement(s);
            cnx.exec(s);
            ps.setInt(1, cnd.getId_candidat());
            ps.setDate(2, cnd.getDate_paiement());
            ps.setString(3, cnd.getType_paiement());
            ps.setString(4, cnd.getNumero_cheque());
            ps.setDate(5, cnd.getDate_cheque());
            ps.setDouble(6, cnd.getMontant_paiement());
            ps.setString(7, cnd.getNote_paiement());
             ps.setString(8, cnd.gettype_contrat());
              ps.setInt(9, cnd.getnbheurecode());
               ps.setInt(10, cnd.getnbheureconduite());
            ps.setInt(11, cnd.getId_paiement());
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
    public static Boolean supprimerpaiement(Integer numero){
            try{
            connections cnx=new connections();
            cnx.connect();
            String s= "delete from `paiement` where `id_paiement`=?";
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


