package autoecole;


import classes.societe;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



/**
 *
 * @author khalilo
 */
public class frmFicheSociete extends javax.swing.JDialog {

    ResultSet rsdb=null;
    private Boolean mode_modif=false;
    private int num_modif=0;
    
    
    
    
    
    /** Creates new form frmFichePersonnel */
    public frmFicheSociete(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        mode_modif=societe.mode_amodif;
        num_modif=societe.num_amodif;
        
        //JOptionPane.showMessageDialog(null, mode_modif+" : "+ num_modif);
        if(mode_modif==true){
            
            rsdb=societe.select_societe(num_modif);
            
            try {
            rsdb.first();
            id_societe.setText(""+rsdb.getInt("id_societe")+"");
            nom_societe.setText(""+rsdb.getString("nom_societe")+"");
            description_societe.setText(""+rsdb.getString("description_societe")+"");
            adresse_societe.setText(""+rsdb.getString("adresse_societe")+"");
            ville_societe.setText(""+rsdb.getString("ville_societe")+"");
            cp_societe.setText(""+rsdb.getInt("cp_societe")+"");
            tel_societe.setText(""+rsdb.getInt("tel_societe")+"");
            fax_societe.setText(""+rsdb.getInt("fax_societe")+"");
            website_societe.setText(""+rsdb.getString("website_societe")+"");
            email_societe.setText(""+rsdb.getString("email_societe")+"");
            
            id_societe.setEnabled(false);
            dispose();
            } catch (Exception e) {
            }               
            
            
                    
        }else{
         
            id_societe.setText("1");
            nom_societe.setText("");
            adresse_societe.setText("");
            ville_societe.setText("");
            cp_societe.setText("");
            tel_societe.setText("");
            fax_societe.setText("");
            email_societe.setText("");
            id_societe.setEnabled(false);
            
            dispose();
        }
        
        
            
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTextes = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        adresse_societe = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nom_societe = new javax.swing.JTextField();
        fax_societe = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tel_societe = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        id_societe = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        email_societe = new javax.swing.JTextField();
        cp_societe = new javax.swing.JTextField();
        ville_societe = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        description_societe = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        website_societe = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ajout = new komponenMakeOver.buttonMakeOver();
        ajout2 = new komponenMakeOver.buttonMakeOver();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fiche Société");
        setBackground(new java.awt.Color(0, 153, 153));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        panelTextes.setBackground(new java.awt.Color(0, 204, 204));
        panelTextes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("CP :");

        adresse_societe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adresse_societeKeyPressed(evt);
            }
        });

        jLabel6.setText("Tél :");

        nom_societe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nom_societeKeyPressed(evt);
            }
        });

        fax_societe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fax_societeKeyPressed(evt);
            }
        });

        jLabel1.setText("Numero :");

        tel_societe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tel_societeKeyPressed(evt);
            }
        });

        jLabel2.setText("Nom :");

        id_societe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                id_societeKeyPressed(evt);
            }
        });

        jLabel8.setText("Email :");

        jLabel7.setText("Fax :");

        jLabel3.setText("Adresse :");

        email_societe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                email_societeKeyPressed(evt);
            }
        });

        cp_societe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cp_societeKeyPressed(evt);
            }
        });

        ville_societe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ville_societeKeyPressed(evt);
            }
        });

        jLabel10.setText("Ville :");

        description_societe.setColumns(20);
        description_societe.setRows(5);
        jScrollPane1.setViewportView(description_societe);

        jLabel5.setText("Description :");

        website_societe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                website_societeKeyPressed(evt);
            }
        });

        jLabel9.setText("Website :");

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
                .addGroup(panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTextesLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(nom_societe, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTextesLayout.createSequentialGroup()
                        .addGroup(panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTextesLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGap(85, 85, 85))
                            .addGroup(panelTextesLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)
                                .addGap(18, 18, Short.MAX_VALUE)))
                        .addGroup(panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ville_societe, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(adresse_societe, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fax_societe, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(website_societe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                                    .addComponent(tel_societe, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cp_societe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTextesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTextesLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(id_societe, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(email_societe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTextesLayout.createSequentialGroup()
                                .addComponent(ajout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(ajout2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)))))
                .addContainerGap())
        );
        panelTextesLayout.setVerticalGroup(
            panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTextesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_societe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom_societe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(adresse_societe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ville_societe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cp_societe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tel_societe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fax_societe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(website_societe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_societe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(panelTextesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajout2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTextes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTextes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void id_societeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_societeKeyPressed
        if(evt.getKeyCode()==10){   
            nom_societe.requestFocus(); 
        }
    }//GEN-LAST:event_id_societeKeyPressed

    private void nom_societeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nom_societeKeyPressed

        
        if(evt.getKeyCode()==10){            
            adresse_societe.requestFocus();           
        }// TODO add your handling code here:
    }//GEN-LAST:event_nom_societeKeyPressed

    private void adresse_societeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adresse_societeKeyPressed

        if(evt.getKeyCode()==10){            
            ville_societe.requestFocus();           
        }// TODO add your handling code here:
    }//GEN-LAST:event_adresse_societeKeyPressed

    private void ville_societeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ville_societeKeyPressed

        if(evt.getKeyCode()==10){            
            cp_societe.requestFocus();           
        }// TODO add your handling code here:
    }//GEN-LAST:event_ville_societeKeyPressed

    private void cp_societeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cp_societeKeyPressed
        if(evt.getKeyCode()==10){            
            tel_societe.requestFocus();           
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cp_societeKeyPressed

    private void tel_societeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tel_societeKeyPressed
        if(evt.getKeyCode()==10){            
            fax_societe.requestFocus();           
        }         // TODO add your handling code here:
    }//GEN-LAST:event_tel_societeKeyPressed

    private void fax_societeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fax_societeKeyPressed
        if(evt.getKeyCode()==10){            
            email_societe.requestFocus();           
        }         // TODO add your handling code here:
    }//GEN-LAST:event_fax_societeKeyPressed

    private void email_societeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_email_societeKeyPressed
        if(evt.getKeyCode()==10){            
         ajout.requestFocus();           
        }         // TODO add your handling code here:
    }//GEN-LAST:event_email_societeKeyPressed

    private void website_societeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_website_societeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_website_societeKeyPressed

    private void ajout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajout2ActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_ajout2ActionPerformed

    private void ajoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutActionPerformed
         try {
            
        
        if( id_societe.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(this, "Numero incorrecte");
            return ;
        }
        if( nom_societe.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(this, "Nom  incorrecte");
            return;
        }
        
        societe sct = new societe(
                1,
                nom_societe.getText().toString(),
                description_societe.getText().toString(),
                adresse_societe.getText().toString(),
                ville_societe.getText().toString(),
                Integer.parseInt(cp_societe.getText().toString()),
                Integer.parseInt(tel_societe.getText().toString()),
                Integer.parseInt(fax_societe.getText().toString()),
                website_societe.getText().toString(),
                email_societe.getText().toString()
                    );
        
        if(mode_modif==true){
            try {  
                Boolean cFe = societe.modifierSociete(sct);
                    if (cFe==true){
                    JOptionPane.showMessageDialog(null, "Modification Société effectué avec succès...");
                    dispose();
                    }else{
                    JOptionPane.showMessageDialog(null, "Erreur Modification...");
                    }
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                }          
        }else{
                try {  
                Boolean cFe = societe.ajouterSociete(sct);
                    if (cFe==true){
                    JOptionPane.showMessageDialog(null, "Ajout Informations Société effectué avec succès...");
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
        // TODO add your handling code here:
    }//GEN-LAST:event_ajoutActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                frmFicheSociete dialog = new frmFicheSociete(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField adresse_societe;
    private komponenMakeOver.buttonMakeOver ajout;
    private komponenMakeOver.buttonMakeOver ajout2;
    private javax.swing.JTextField cp_societe;
    private javax.swing.JTextArea description_societe;
    private javax.swing.JTextField email_societe;
    private javax.swing.JTextField fax_societe;
    private javax.swing.JTextField id_societe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nom_societe;
    private javax.swing.JPanel panelTextes;
    private javax.swing.JTextField tel_societe;
    private javax.swing.JTextField ville_societe;
    private javax.swing.JTextField website_societe;
    // End of variables declaration//GEN-END:variables
}
