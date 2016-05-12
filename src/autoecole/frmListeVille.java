package autoecole;



import classes.ville;
import java.awt.Color;
import java.awt.Font;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public final class frmListeVille extends javax.swing.JDialog {

    ResultSet rsdb=null;
    
    
    private void remplir_table_famille_article(ResultSet aRemplir){
        try{
        DefaultTableModel dtm=new DefaultTableModel();
        jTableFamilleArticle.setModel(dtm);
        dtm.addColumn("Code");
        dtm.addColumn("Désignarion");
        Boolean colorer=true;
            if (rsdb.next())
            {
                rsdb.first();
                do
                {  
                Object arr[]={
                    rsdb.getString("id_ville"),
                    rsdb.getString("nom_ville")
                };
                dtm.addRow(arr);
                }while(rsdb.next());
            rsdb.first();
            jTableFamilleArticle.setBackground(Color.WHITE);
            jTableFamilleArticle.setForeground(Color.blue);
            jTableFamilleArticle.setRowHeight(24);
            jTableFamilleArticle.setFont(new Font("Arial", Font.BOLD, 12));
            jTableFamilleArticle.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            JTableHeader header = jTableFamilleArticle.getTableHeader();
            header.setBackground(Color.black);
            header.setForeground(Color.BLACK);
            header.setFont(new Font("Arial", Font.BOLD, 13));
            }
        }catch (Exception exx){
            JOptionPane.showMessageDialog(null, exx.getMessage());
        }
    }
    
    
    
    
    
    /** Creates new form frmFichePersonnel */
    public frmListeVille(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        rsdb=ville.liste_ville();
        remplir_table_famille_article(rsdb);
    }
    
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTextes = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableFamilleArticle = new javax.swing.JTable();
        btnAjouter = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnActualiser = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Liste des Villes");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        panelTextes.setBackground(new java.awt.Color(153, 255, 255));
        panelTextes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableFamilleArticle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Code", "Designation"
            }
        ));
        jScrollPane3.setViewportView(jTableFamilleArticle);

        btnAjouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/dialog-more.png"))); // NOI18N
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnSupprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/dialog-cancel-2.png"))); // NOI18N
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        btnModifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/document-edit.png"))); // NOI18N
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnActualiser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/view-refresh-4.png"))); // NOI18N
        btnActualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualiserActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/application-exit-3.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTextesLayout = new javax.swing.GroupLayout(panelTextes);
        panelTextes.setLayout(panelTextesLayout);
        panelTextesLayout.setHorizontalGroup(
            panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTextesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addGap(40, 40, 40))
            .addGroup(panelTextesLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualiser, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTextesLayout.setVerticalGroup(
            panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTextesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualiser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btnModifier, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSupprimer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAjouter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTextes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTextes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

//GEN-FIRST:event_jTableArticleKeyPressed
 
//GEN-LAST:event_jTableArticleKeyPressed

    private void btnActualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualiserActionPerformed
        rsdb=ville.liste_ville();
        remplir_table_famille_article(rsdb);
    }//GEN-LAST:event_btnActualiserActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        
        try {
            
            int sa =jTableFamilleArticle.getSelectedRow();
            String a_modifier=jTableFamilleArticle.getValueAt(sa, 0).toString();
            
            ville.mode_amodif=true;
            ville.num_amodif=Integer.parseInt(a_modifier);
                       
            frmFicheVille fff = new frmFicheVille(null, true);
            
            fff.setResizable(false);
            fff.setLocationRelativeTo(null);
            fff.setVisible(true);
            rsdb=ville.liste_ville();
            remplir_table_famille_article(rsdb);
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vous devez sélectionner un enregistrement  à modifier !!! \nerr :"+e.getMessage());
        }
    }//GEN-LAST:event_btnModifierActionPerformed

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        
        
        try {
            int sa =jTableFamilleArticle.getSelectedRow();
            String a_supp=jTableFamilleArticle.getValueAt(sa, 0).toString();
            
            int n = JOptionPane.showConfirmDialog(null, "Voulez Vraimenet supprimer cet enregistrement?","Suppression",JOptionPane.YES_NO_OPTION);
            
            if(n==JOptionPane.YES_OPTION){
                
                Boolean tfasse5=ville.supprimerVille(Integer.parseInt(a_supp));
                if (tfasse5==true){
                    JOptionPane.showMessageDialog(null,"Enregistrement supprimé avec succes");
                    rsdb=ville.liste_ville();
                    remplir_table_famille_article(rsdb);
                }else{
                    JOptionPane.showMessageDialog(null,"Erreur de suppression");
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vous devez sélectionner un client à supprimer !!! \nerr :"+e.getMessage());
        }
        
        
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        
        
        ville.mode_amodif=false;
        ville.num_amodif=0;
        frmFicheVille fpf = new frmFicheVille(null, true);
        fpf.setResizable(false);
        fpf.setLocationRelativeTo(null);
        fpf.setVisible(true);
        rsdb=ville.liste_ville();
        remplir_table_famille_article(rsdb);
        
        
        
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                frmListeVille dialog = new frmListeVille(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualiser;
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableFamilleArticle;
    private javax.swing.JPanel panelTextes;
    // End of variables declaration//GEN-END:variables
}
