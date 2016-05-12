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
public class tableseanceModel_1 extends AbstractTableModel{
    
    private  List<seance> list_seance=new ArrayList<seance>();
    private final String []cols=new String[]{"date_seance","heure_seance","duree_seance","type_seance","presence_seance"};

    public tableseanceModel_1() {
        super();
        //result from db query todo
        
    }
    
  public void filldatafromDb(seance seanc){
      if(seanc!=null)addcandidat(seanc);
      
  }
  public void clearmodel(){
      for(int i=0;i<list_seance.size();i++){
      removecandidat(i);
  }
  }
    @Override
    public int getRowCount() {
       return list_seance.size();}

    @Override
    public String getColumnName(int column) {
        return cols[column];}
   
    @Override
    public int getColumnCount() {
     return cols.length;}

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     switch(columnIndex){
         case 0:return list_seance.get(rowIndex).getDate_seance();
         case 1:return list_seance.get(rowIndex).getHeure_seance();
         case 2:return list_seance.get(rowIndex).getDuree_seance();
         case 3:return list_seance.get(rowIndex).getType_seance();
         case 4:return list_seance.get(rowIndex).getPresence_seance();
         
         default:return null;
         
     }}
    //remplir && supp
    public void addcandidat(seance seanc){
        System.out.println("added");
        list_seance.add(seanc);
        fireTableRowsInserted(list_seance.size()-1,list_seance.size()-1);
    }
    public void removecandidat(int index){
        list_seance.remove(index);
        fireTableRowsDeleted(index, index);
    }

    public List<seance> getLis_cand() {
        return list_seance;
    }
    
    
}
