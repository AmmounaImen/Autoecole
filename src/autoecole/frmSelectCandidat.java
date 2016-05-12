
package autoecole;
import classes.connections;
import classes.candidat;
import java.awt.Color;
import java.awt.Font;
import java.io.File;

import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class frmSelectCandidat extends javax.swing.JDialog {

    ResultSet rsdb=null;
    
    private void remplir_table_candidat(ResultSet aRemplir){
    
    
        try{
        
        DefaultTableModel dtm=new DefaultTableModel();

        jTableClient.setModel(dtm);
        dtm.addColumn("N°");
        dtm.addColumn("Nom");
        dtm.addColumn("Ville");
        dtm.addColumn("CP");
        
        
        
        if (rsdb.next())
        {
            
            rsdb.first();
            do
            {
                Object arr[]={
                    rsdb.getInt("numero"),
                    rsdb.getString("nom"),
                    rsdb.getString("ville"),
                    rsdb.getString("cp"),
                    
                };
                dtm.addRow(arr);
                
            }while(rsdb.next());
            rsdb.first();
        
            jTableClient.setBackground(Color.orange);
            jTableClient.setForeground(Color.blue);
            jTableClient.setRowHeight(24);
            jTableClient.setFont(new Font("Arial", Font.ITALIC, 12));
            jTableClient.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            JTableHeader header = jTableClient.getTableHeader();
            header.setBackground(Color.black);
            header.setForeground(Color.yellow);
            header.setFont(new Font("Arial", Font.BOLD, 13));
            
            
        }
        }catch (Exception exx){

        JOptionPane.showMessageDialog(null, exx.getMessage());
        }
    }
    public frmSelectCandidat(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        connections con =new connections();
        con.connect();
        rsdb=con.exec("select * from candidat");
        remplir_table_candidat(rsdb);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        champRecherche = new javax.swing.JComboBox();
        txtRecherche = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClient = new javax.swing.JTable();
        ajout2 = new komponenMakeOver.buttonMakeOver();
        modif = new komponenMakeOver.buttonMakeOver();
        ajout = new komponenMakeOver.buttonMakeOver();
        supp = new komponenMakeOver.buttonMakeOver();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sélectionner Client");

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        champRecherche.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "numero", "nom", "ville" }));

        txtRecherche.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtRechercheCaretUpdate(evt);
            }
        });
        txtRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRechercheActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setText("Selectionner");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTableClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "N°", "Nom", "Ville"
            }
        ));
        jTableClient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableClientKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClient);

        ajout2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/application-exit-3.png"))); // NOI18N
        ajout2.setText("Fermer");
        ajout2.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        ajout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajout2ActionPerformed(evt);
            }
        });

        modif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/document-edit.png"))); // NOI18N
        modif.setText("Modifier");
        modif.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        modif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifActionPerformed(evt);
            }
        });

        ajout.setForeground(new java.awt.Color(51, 51, 51));
        ajout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/dialog-more.png"))); // NOI18N
        ajout.setText("Ajouter");
        ajout.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        ajout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutActionPerformed(evt);
            }
        });

        supp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/dialog-cancel-2.png"))); // NOI18N
        supp.setText("supprimer");
        supp.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        supp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ajout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(supp, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(ajout2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(champRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(txtRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(champRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ajout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ajout2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modif, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableClientKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableClientKeyPressed
        
        if(evt.getKeyCode()==10){
          modifActionPerformed(null);
        }
        if(evt.getKeyCode()==107){
          ajoutActionPerformed(null);
        }
        if(evt.getKeyCode()==109){
          suppActionPerformed(null);
        }
}//GEN-LAST:event_jTableClientKeyPressed

    private void txtRechercheCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtRechercheCaretUpdate
        connections con =new connections();
        con.connect();
        rsdb=con.exec("select * from candidat where `"+champRecherche.getSelectedItem().toString()+"` LIKE '%"+txtRecherche.getText()+"%'");
        remplir_table_candidat(rsdb);
    }//GEN-LAST:event_txtRechercheCaretUpdate

    private void txtRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRechercheActionPerformed

        
        // TODO add your handling code here:
}//GEN-LAST:event_txtRechercheActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            int sa =jTableClient.getSelectedRow();
            String a_sel=jTableClient.getValueAt(sa, 0).toString();
            
            
            dispose();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vous devez sélectionner un Client!!! \nerr :"+e.getMessage());
        }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void suppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppActionPerformed

        try {
            int sa =jTableClient.getSelectedRow();
            int a_supp=Integer.parseInt(jTableClient.getValueAt(sa, 0).toString());
            
            int n = JOptionPane.showConfirmDialog(null, "Voulez Vraimenet supprimer cet enregistrement?","Suppression",JOptionPane.YES_NO_OPTION);
            
            if(n==JOptionPane.YES_OPTION){
                
                Boolean tfasse5=candidat.supprimercandidat(a_supp);
                if (tfasse5==true){
                    JOptionPane.showMessageDialog(null,"Enregistrement supprimé avec succes");
                    rsdb=candidat.liste_candidat();
                    remplir_table_candidat(rsdb);
                }else{
                    JOptionPane.showMessageDialog(null,"Erreur de suppression");
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vous devez sélectionner un candidat à supprimer !!! \nerr :"+e.getMessage());
        }
        
        
    }//GEN-LAST:event_suppActionPerformed

    private void ajoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutActionPerformed
        candidat.mode_amodif=false;
        candidat.num_amodif=0;
        //frmFicheCandidat fpf = new frmFicheCandidat(null, true);
        //fpf.setResizable(false);
        //fpf.setLocationRelativeTo(null);
        //fpf.setVisible(true);
        rsdb=candidat.liste_candidat();
        remplir_table_candidat(rsdb);
        
        
        
        
            // TODO add your handling code here:
    }//GEN-LAST:event_ajoutActionPerformed

    private void modifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifActionPerformed
        try {
            
            int sa =jTableClient.getSelectedRow();
            int a_modifier=Integer.parseInt(jTableClient.getValueAt(sa, 0).toString());
            
            candidat.mode_amodif=true;
            candidat.num_amodif=a_modifier;
            //JOptionPane.showMessageDialog(null, "Modifier le personnel N°:"+a_modifier+"\n"+personnel.num_amodif);
            
            //frmFicheCandidat fff = new frmFicheCandidat(null, true);
            
            //fff.setResizable(false);
            //fff.setLocationRelativeTo(null);
            //fff.setVisible(true);
            rsdb=candidat.liste_candidat();
            remplir_table_candidat(rsdb);
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vous devez sélectionner un candidat  à modifier !!! \nerr :"+e.getMessage());
        }  // TODO add your handling code here:
    }//GEN-LAST:event_modifActionPerformed

    private void ajout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajout2ActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_ajout2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                frmSelectCandidat dialog = new frmSelectCandidat(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private komponenMakeOver.buttonMakeOver ajout;
    private komponenMakeOver.buttonMakeOver ajout2;
    private javax.swing.JComboBox champRecherche;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClient;
    private komponenMakeOver.buttonMakeOver modif;
    private komponenMakeOver.buttonMakeOver supp;
    private javax.swing.JTextField txtRecherche;
    // End of variables declaration//GEN-END:variables
}