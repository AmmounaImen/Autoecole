package autoecole;


import classes.ville;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class frmFicheVille extends javax.swing.JDialog {

    ResultSet rsdb=null;
    private Boolean mode_modif=false;
    private int  num_modif=0;
    
    
    
    
    
    /** Creates new form frmFichePersonnel */
    public frmFicheVille(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        mode_modif=ville.mode_amodif;
        num_modif=ville.num_amodif;
        
        //JOptionPane.showMessageDialog(null, mode_modif+" : "+ num_modif);
        if(mode_modif==true){
            
            rsdb=ville.select_ville(num_modif);
            
            try {
            rsdb.first();
            code.setText(""+rsdb.getInt("id_ville")+"");
            designation.setText(""+rsdb.getString("nom_ville")+"");
            code.setEnabled(false);
            dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }               
            
            
                    
        }else{
         
            code.setText("0");
            designation.setText("");
            code.setEnabled(false);
            
            dispose();
        }
        
        
            
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTextes = new javax.swing.JPanel();
        designation = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        ajout = new komponenMakeOver.buttonMakeOver();
        ajout2 = new komponenMakeOver.buttonMakeOver();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fiche Ville");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        panelTextes.setBackground(new java.awt.Color(153, 255, 255));
        panelTextes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        designation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                designationKeyPressed(evt);
            }
        });

        jLabel1.setText("Code :");

        jLabel2.setText("Désignation");

        code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codeKeyPressed(evt);
            }
        });

        ajout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/document-export.png"))); // NOI18N
        ajout.setText("Enregistrer");
        ajout.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        ajout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutActionPerformed(evt);
            }
        });

        ajout2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/application-exit-3.png"))); // NOI18N
        ajout2.setText("Fermer");
        ajout2.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        ajout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajout2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTextesLayout = new javax.swing.GroupLayout(panelTextes);
        panelTextes.setLayout(panelTextesLayout);
        panelTextesLayout.setHorizontalGroup(
            panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTextesLayout.createSequentialGroup()
                .addGroup(panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelTextesLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTextesLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(designation)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelTextesLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(ajout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ajout2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        panelTextesLayout.setVerticalGroup(
            panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTextesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(designation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ajout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajout2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTextes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTextes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void codeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeKeyPressed
        if(evt.getKeyCode()==10){   
            designation.requestFocus(); 
        }
    }//GEN-LAST:event_codeKeyPressed

    private void designationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_designationKeyPressed

        
        if(evt.getKeyCode()==10){            
           ajout.requestFocus();           
        }// TODO add your handling code here:
    }//GEN-LAST:event_designationKeyPressed

    private void ajoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutActionPerformed
        try {
            
        
        
        if( designation.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(this, "Nom  incorrecte");
            return;
        }
        
        ville fma = new ville(
                ville.num_amodif,
                designation.getText().toString()
                    );
        
        if(mode_modif==true){
            try {  
                Boolean cFe = ville.modifierVille(fma);
                    if (cFe==true){
                    JOptionPane.showMessageDialog(null, "Modification Ville effectué avec succès...");
                    dispose();
                    }else{
                    JOptionPane.showMessageDialog(null, "Erreur Modification...");
                    }
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                }          
        }else{
                try {  
                Boolean cFe = ville.ajouterVille(fma);
                    if (cFe==true){
                    JOptionPane.showMessageDialog(null, "Ajout Ville effectué avec succès...");
                    dispose();
                    }else{
                    JOptionPane.showMessageDialog(null, "Erreur Ajout...");
                    }
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                }
        }
        
            
        
        
        } catch (Exception e) {
           JOptionPane.showMessageDialog(this, "Erreur saisie"); 
        }
       
        
    }//GEN-LAST:event_ajoutActionPerformed

    private void ajout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajout2ActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_ajout2ActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                frmFicheVille dialog = new frmFicheVille(new javax.swing.JFrame(), true);
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
    private komponenMakeOver.buttonMakeOver ajout;
    private komponenMakeOver.buttonMakeOver ajout2;
    private javax.swing.JTextField code;
    private javax.swing.JTextField designation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelTextes;
    // End of variables declaration//GEN-END:variables
}
