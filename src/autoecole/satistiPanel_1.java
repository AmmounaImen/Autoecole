/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoecole;

import classes.Conex;
import classes.candidat;
import classes.seance;
import classes.tablecandidatModel_1;
import classes.tableseanceModel_1;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.noire.NoireLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.SelectionMode;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Imen
 */
public class satistiPanel_1 extends javax.swing.JPanel {
    private Connection connexion=null;
    private String req_heur="select * from candidat where type_contrat =?";
    private String req_heur_seance="select * from seance where id_candidat =?";
    private tablecandidatModel_1 model,model2;
    private tableseanceModel_1 seancemod1,seancemod2;
    

    /**
     * Creates new form satistiPanel
     */
    public satistiPanel_1() {
        initComponents();
        buildGui();
        initevet();
    }
private void  init(){
        try {
            connexion=new Conex().getConn();
            model=new tablecandidatModel_1();
            model2=new tablecandidatModel_1();
            seancemod1=new tableseanceModel_1();
            seancemod2=new tableseanceModel_1();
        
        } catch (Exception ex) {
            Logger.getLogger(satistiPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            UIManager.setLookAndFeel(new AluminiumLookAndFeel());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
}
private void buildGui(){
    init();
    
        try {
            model.clearModel();
            model2.clearModel();
            PreparedStatement pre2=connexion.prepareStatement(req_heur);
            pre2.setString(1,"Forfitaire");
            ResultSet res2=pre2.executeQuery();
            while(res2.next()){
                model2.filldatafromDb(new candidat(res2.getInt("id_candidat"), 
                        res2.getString("reference_candidat"),res2.getString("nom_candidat")
                                ,res2.getString("cin_candidat")));
            }
            PreparedStatement pre=connexion.prepareStatement(req_heur);
            pre.setString(1,"Contractuelle");
            ResultSet res=pre.executeQuery();
            while(res.next()){
                model.filldatafromDb(new candidat(res.getInt("id_candidat"), 
                        res.getString("reference_candidat"),res.getString("nom_candidat")
                                ,res.getString("cin_candidat")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(satistiPanel.class.getName()).log(Level.SEVERE, null, ex);
        }  
        contracttable.setModel(model);
        forftable.setModel(model2);
        seancecontracttable.setModel(seancemod1);
        forfaitseancetable.setModel(seancemod2);
}
private void initevet(){
    contracttable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    forftable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
   
    contracttable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
         
    getSeances();
}});
forftable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
         
    getSeancesForForf();
}});

}
private void getSeances(){
    if(connexion!=null){
        PreparedStatement prepareStatement=null;
        seancemod1.clearmodel();
        int xid=Integer.parseInt(contracttable.getValueAt(contracttable.getSelectedRow(), 0).toString());
        try{
        
           prepareStatement = connexion.prepareStatement(req_heur_seance);
            prepareStatement.setInt(1, xid);
            System.out.println(xid);
       
            ResultSet res=prepareStatement.executeQuery();
            
         while(res.next()){
                
               // boolean d=res.getInt("presense_seance")==0 ?false:true;
            
             
                seancemod1.addcandidat(new seance(res.getDate("date_seance"), 
                        res.getTime("heure_seance"), res.getInt("duree_seance"),false,
                        res.getString("type_seance")));
             
                
            }
            
            System.out.println("finish");
            System.out.println(seancemod1.getLis_cand().size());
           
           seancecontracttable.repaint();
           contractpanel.repaint();
           
        
        }
        
        
        catch(Exception sq){
            
        }
        finally{
            try {
                if(!prepareStatement.isClosed())prepareStatement.close();
            } catch (SQLException ex) {
                Logger.getLogger(satistiPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }
    
}
private void getSeancesForForf(){
    if(connexion!=null){
        PreparedStatement prepareStatement=null;
        seancemod2.clearmodel();
        int xid=Integer.parseInt(forftable.getValueAt(forftable.getSelectedRow(), 0).toString());
        try{
        
           prepareStatement = connexion.prepareStatement(req_heur_seance);
            prepareStatement.setInt(1, xid);
            System.out.println(xid);
       
            ResultSet res=prepareStatement.executeQuery();
          
         while(res.next()){
                
               // boolean d=res.getInt("presense_seance")==0 ?false:true;
            
             
                seancemod2.addcandidat(new seance(res.getDate("date_seance"), 
                        res.getTime("heure_seance"), res.getInt("duree_seance"),false,
                        res.getString("type_seance")));
             
                
            }
            
            System.out.println("finish");
            System.out.println(seancemod2.getLis_cand().size());
           
           forfaitseancetable.repaint();
           forftable.repaint();
           
        
        }
        
        
        catch(Exception sq){
            
        }
        finally{
            try {
                if(!prepareStatement.isClosed())prepareStatement.close();
            } catch (SQLException ex) {
                Logger.getLogger(satistiPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }
    
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contractpanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        contracttable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        seancecontracttable = new javax.swing.JTable();
        forfpanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        forftable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        forfaitseancetable = new javax.swing.JTable();

        contractpanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Contractuelle"));

        contracttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(contracttable);

        seancecontracttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(seancecontracttable);

        javax.swing.GroupLayout contractpanelLayout = new javax.swing.GroupLayout(contractpanel);
        contractpanel.setLayout(contractpanelLayout);
        contractpanelLayout.setHorizontalGroup(
            contractpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
            .addGroup(contractpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contractpanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                    .addGap(20, 20, 20)))
            .addGroup(contractpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contractpanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addGap(20, 20, 20)))
        );
        contractpanelLayout.setVerticalGroup(
            contractpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
            .addGroup(contractpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contractpanelLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(335, Short.MAX_VALUE)))
            .addGroup(contractpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contractpanelLayout.createSequentialGroup()
                    .addContainerGap(264, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(82, 82, 82)))
        );

        forfpanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Contractuelle"));

        forftable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(forftable);

        forfaitseancetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(forfaitseancetable);

        javax.swing.GroupLayout forfpanelLayout = new javax.swing.GroupLayout(forfpanel);
        forfpanel.setLayout(forfpanelLayout);
        forfpanelLayout.setHorizontalGroup(
            forfpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forfpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(forfpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        forfpanelLayout.setVerticalGroup(
            forfpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forfpanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contractpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(forfpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(forfpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contractpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contractpanel;
    private javax.swing.JTable contracttable;
    private javax.swing.JTable forfaitseancetable;
    private javax.swing.JPanel forfpanel;
    private javax.swing.JTable forftable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable seancecontracttable;
    // End of variables declaration//GEN-END:variables
}
