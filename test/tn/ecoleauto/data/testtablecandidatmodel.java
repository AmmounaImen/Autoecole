/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.ecoleauto.data;

import classes.Conex;
import classes.candidat;
import classes.connections;
import classes.tablecandidatModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author Imen
 */

public class testtablecandidatmodel extends TestCase{
    private Conex connex=null;
    private String req="select * from candidat";
    private String req_heur="select * from candidat where type_contrat =?";
    
    private ResultSet resultreq=null;
    private tablecandidatModel model=null;

    @Override
    protected void tearDown() throws Exception {
        super.tearDown(); 
        if(connex.getConn()!=null){
            try{
                connex.getConn().close();
            }catch(SQLException sql){}
        }
    }
    public void testtypecontrat()
    {
        String type="Forfitaire";
        try{
            PreparedStatement prepareStatement = connex.getConn().prepareStatement(req_heur);
            prepareStatement.setString(0, type);
            ResultSet res=prepareStatement.executeQuery();
            assertTrue(res.next());
        }catch(SQLException del){}
        
    
    }
        /*public void testTabledata(){
        try {
            Statement smt=connex.getConn().createStatement();
            resultreq=smt.executeQuery(req);
           model=new tablecandidatModel();
            while (resultreq.next()) {                
                model.filldatafromDb(new candidat(resultreq.getInt("id_candidat"), 
                        "referene_candidat", "nom_candidat", "cin_candidat"));
                
            }
            assertTrue(model.getLis_cand().size()>1);
            System.out.println(model.getLis_cand().size());
        } catch (SQLException ex) {
            Logger.getLogger(testtablecandidatmodel.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    /**/
  /*  @Test
    public void testConnection(){
        assertNotNull(connex.getConn());
    }*/

    @Override
    protected void setUp() throws Exception {
        super.setUp(); 
    connex=new Conex();
    }
    
    
}
