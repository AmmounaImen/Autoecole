/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Imen
 */
public class tablecandidatModel_1 extends AbstractTableModel{
    
    //query
    public static final String ch="";
    private final List<candidat> lis_cand=new ArrayList<candidat>();
    private final String []cols={"id_candidat","reference_candidat","nom_candidat","cin_candidat"};

    public tablecandidatModel_1() {
        super();
    
    }
    
  public void filldatafromDb(candidat cand){
      if(cand!=null)addcandidat(cand);
      
  }
    @Override
    public int getRowCount() {
       return lis_cand.size();}

    @Override
    public String getColumnName(int column) {
        return cols[column];}
   
    @Override
    public int getColumnCount() {
     return cols.length;}

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     switch(columnIndex){
         case 0:return lis_cand.get(rowIndex).getId_candidat();
         case 1:return lis_cand.get(rowIndex).getReference_candidat();
         case 2:return lis_cand.get(rowIndex).getNom_candidat();
         case 3:return lis_cand.get(rowIndex).getCin_candidat();
         default:return null;
         
     }}
    public void clearModel(){
        for(int i=0;i<lis_cand.size();i++){
            removecandidat(i);
        }
    }
    //remplir && supp
    public void addcandidat(candidat cand){
        lis_cand.add(cand);
        fireTableRowsInserted(lis_cand.size()-1,lis_cand.size()-1);
    }
    public void removecandidat(int index){
        lis_cand.remove(index);
        fireTableRowsDeleted(index, index);
    }

    public List<candidat> getLis_cand() {
        return lis_cand;
    }
    
    
}
