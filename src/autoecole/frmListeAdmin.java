
package autoecole;


import classes.connections;
import classes.admin;
import classes.ville;
import java.awt.Color;
import java.awt.Font;
import java.io.File;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;


public class frmListeAdmin extends javax.swing.JInternalFrame {

    //DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
    //Object[] itemVille;
    ResultSet rsdb=null;
    
    private void remplir_table_admin(ResultSet aRemplir){
    
    
        try{
        
        DefaultTableModel dtm=new DefaultTableModel();

        jTableClient.setModel(dtm);
        dtm.addColumn("ID");
        dtm.addColumn("Nom");
        dtm.addColumn("Identifiant");
        
        
        
        if (rsdb.next())
        {
            
            rsdb.first();
            do
            {
                Object arr[]={rsdb.getInt("id_admin"),
                    rsdb.getString("nom_admin"),
                    rsdb.getString("pseudo")};
                dtm.addRow(arr);
                
            }while(rsdb.next());
            rsdb.first();
            jTableClient.setBackground(Color.WHITE);
            jTableClient.setForeground(Color.blue);
            jTableClient.setRowHeight(24);
            jTableClient.setFont(new Font("Arial", Font.BOLD, 13));
            jTableClient.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            JTableHeader header = jTableClient.getTableHeader();
            header.setBackground(Color.BLACK);
            header.setForeground(Color.BLACK);
            header.setFont(new Font("Arial", Font.BOLD, 13));
            
            TableColumn col = jTableClient.getColumnModel().getColumn(0);
            col.setPreferredWidth(25);
            
        }
        }catch (Exception exx){

        JOptionPane.showMessageDialog(null, exx.getMessage());
        }
        
        
        
        
    }
  
    
    
    public frmListeAdmin() {
        initComponents();
        rsdb=admin.liste_admin();
        remplir_table_admin(rsdb);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        nom_admin = new javax.swing.JTextField();
        email_admin = new javax.swing.JTextField();
        pseudo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        mdp = new javax.swing.JPasswordField();
        mdp1 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        txtRecherche = new javax.swing.JTextField();
        champRecherche = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ajout = new komponenMakeOver.buttonMakeOver();
        supp = new komponenMakeOver.buttonMakeOver();
        nouv = new komponenMakeOver.buttonMakeOver();
        ajout3 = new komponenMakeOver.buttonMakeOver();
        ajout2 = new komponenMakeOver.buttonMakeOver();
        ajout1 = new komponenMakeOver.buttonMakeOver();
        btnBackReg5 = new komponenMakeOver.buttonMakeOver();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClient = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 204, 204));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setMaximizable(true);
        setTitle("Liste des Utilisateurs");
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jTabbedPane1.setBackground(new java.awt.Color(153, 204, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nom_admin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nom_admin.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                nom_adminCaretUpdate(evt);
            }
        });
        nom_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_adminActionPerformed(evt);
            }
        });

        email_admin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email_admin.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                email_adminCaretUpdate(evt);
            }
        });
        email_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_adminActionPerformed(evt);
            }
        });

        pseudo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pseudo.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                pseudoCaretUpdate(evt);
            }
        });
        pseudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pseudoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nom :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Email :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Identifiant :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Mot de passe :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Retaper mdp :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mdp, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nom_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(email_admin)
                            .addComponent(pseudo)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mdp1)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(nom_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pseudo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(mdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(mdp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("    Fiche Utilisateur      ", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

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

        champRecherche.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "nom_admin", "email_admin", "pseudo" }));
        champRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champRechercheActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1460050740_male3.png"))); // NOI18N

        jLabel3.setText("Recherche Utilisateur");

        ajout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/document-export.png"))); // NOI18N
        ajout.setText("ajouter");
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

        nouv.setForeground(new java.awt.Color(51, 51, 51));
        nouv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/dialog-more.png"))); // NOI18N
        nouv.setText("Nouveau");
        nouv.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        nouv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nouvActionPerformed(evt);
            }
        });

        ajout3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/document-print-4.png"))); // NOI18N
        ajout3.setText("imprimer");
        ajout3.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        ajout3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajout3ActionPerformed(evt);
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

        ajout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/view-refresh-4.png"))); // NOI18N
        ajout1.setText("actealiser");
        ajout1.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        ajout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajout1ActionPerformed(evt);
            }
        });

        btnBackReg5.setForeground(new java.awt.Color(255, 255, 255));
        btnBackReg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/edit-find-5.png"))); // NOI18N
        btnBackReg5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnBackReg5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackReg5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(champRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ajout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(supp, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nouv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ajout1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ajout3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ajout2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBackReg5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(champRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(btnBackReg5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nouv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ajout1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajout3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajout2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTableClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "nom", "email"
            }
        ));
        jTableClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientMouseClicked(evt);
            }
        });
        jTableClient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableClientKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClient);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
   
    
    private void txtRechercheCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtRechercheCaretUpdate
        connections con =new connections();
        con.connect();
        rsdb=con.exec("select * from admin where `"+champRecherche.getSelectedItem().toString()+"` LIKE '%"+txtRecherche.getText()+"%'");
        remplir_table_admin(rsdb);
        
    }//GEN-LAST:event_txtRechercheCaretUpdate

    private void jTableClientKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableClientKeyPressed
                
                if(evt.getKeyCode()==10){
               ajoutActionPerformed(null);
                }
                if(evt.getKeyCode()==107){
            nouvActionPerformed(null);
                }
                if(evt.getKeyCode()==109){
                suppActionPerformed(null);
                }
    }//GEN-LAST:event_jTableClientKeyPressed

    private void txtRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRechercheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRechercheActionPerformed

    private void nom_adminCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_nom_adminCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_adminCaretUpdate

    private void nom_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_adminActionPerformed

    private void email_adminCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_email_adminCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_email_adminCaretUpdate

    private void email_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_adminActionPerformed

    private void pseudoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_pseudoCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_pseudoCaretUpdate

    private void pseudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pseudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pseudoActionPerformed

     
    private void jTableClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientMouseClicked
       ResultSet rsdbAdmin=null;
       
       int sa =jTableClient.getSelectedRow();
       String a_modifier=jTableClient.getValueAt(sa, 0).toString();
        try {
            
            rsdbAdmin=admin.select_admin(a_modifier); 
            rsdbAdmin.first();
            nom_admin.setText(rsdbAdmin.getString("nom_admin"));
            email_admin.setText(rsdbAdmin.getString("email_admin"));
            pseudo.setText(rsdbAdmin.getString("pseudo"));
            mdp.setText("mdp");
            mdp1.setText("");
            

            
            //etat_admin.setSelected( rsdbAdmin.getBoolean("etat_admin"));
            
            admin.num_amodif= rsdbAdmin.getInt("id_admin");
            admin.mode_amodif=true;
            
        } catch (Exception exxx) {
            JOptionPane.showMessageDialog (null , exxx.getMessage());
        }
       
        
// TODO add your handling code here:
    }//GEN-LAST:event_jTableClientMouseClicked

    private void suppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppActionPerformed
        try {
            int sa =jTableClient.getSelectedRow();
            int a_supp=Integer.parseInt( jTableClient.getValueAt(sa, 0).toString());

            int n = JOptionPane.showConfirmDialog(null, "Voulez Vraimenet supprimer cet enregistrement?","Suppression",JOptionPane.YES_NO_OPTION);

            if(n==JOptionPane.YES_OPTION){

                Boolean tfasse5=admin.supprimerAdmin(a_supp);
                if (tfasse5==true){
                    JOptionPane.showMessageDialog(null,"Enregistrement supprimé avec succes");
                    rsdb=admin.liste_admin();
                    remplir_table_admin(rsdb);
                }else{
                    JOptionPane.showMessageDialog(null,"Erreur de suppression");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vous devez sélectionner un admin à supprimer !!! \nerr :"+e.getMessage());
        }

    }//GEN-LAST:event_suppActionPerformed

    private void ajoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutActionPerformed
        admin cnd = new admin(admin.num_amodif,nom_admin.getText().toString(),email_admin.getText().toString(),pseudo.getText().toString(),mdp.getText().toString());
        if(admin.mode_amodif==false){

            try {

                Boolean cFe = admin.ajouterAdmin(cnd);
                if (cFe==true){
                    JOptionPane.showMessageDialog(null, "Ajout admin effectué avec succès...");

                }else{
                    JOptionPane.showMessageDialog(null, "Erreur Ajout...");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }else{

            try {

                Boolean cFe = admin.modifierAdmin(cnd);
                if (cFe==true){
                    JOptionPane.showMessageDialog(null, "Modification admin effectué avec succès...");

                }else{
                    JOptionPane.showMessageDialog(null, "Erreur Modification...");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }

        rsdb=admin.liste_admin();
        remplir_table_admin(rsdb);
        //remplir_mode_ajout();

        // TODO add your handling code here:
    }//GEN-LAST:event_ajoutActionPerformed

    private void nouvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nouvActionPerformed
        
        remplir_mode_ajout();

        }

        private void remplir_mode_ajout(){
            nom_admin.setText("");
            email_admin.setText("");
            pseudo.setText("");
            mdp.setText("");
            mdp1.setText("");
            admin.mode_amodif=false;
            admin.num_amodif=0;

            // TODO add your handling code here:
    }//GEN-LAST:event_nouvActionPerformed

    private void ajout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajout1ActionPerformed
      rsdb=admin.liste_admin();
        remplir_table_admin(rsdb);  // TODO add your handling code here:
    }//GEN-LAST:event_ajout1ActionPerformed

    private void ajout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajout2ActionPerformed
        dispose();
                       // TODO add your handling code here:
    }//GEN-LAST:event_ajout2ActionPerformed

    private void ajout3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajout3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ajout3ActionPerformed

    private void champRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champRechercheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champRechercheActionPerformed

    private void btnBackReg5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackReg5ActionPerformed
        connections con =new connections();
        con.connect();
        rsdb=con.exec("select * from admin where `"+champRecherche.getSelectedItem().toString()+"` LIKE '%"+txtRecherche.getText()+"%'");
        remplir_table_admin(rsdb);
        // CariData(ComboBox.getSelectedIndex(), TextField.getText());  // TODO add your handling code here:
    }//GEN-LAST:event_btnBackReg5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private komponenMakeOver.buttonMakeOver ajout;
    private komponenMakeOver.buttonMakeOver ajout1;
    private komponenMakeOver.buttonMakeOver ajout2;
    private komponenMakeOver.buttonMakeOver ajout3;
    private komponenMakeOver.buttonMakeOver btnBackReg5;
    private javax.swing.JComboBox champRecherche;
    private javax.swing.JTextField email_admin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableClient;
    private javax.swing.JPasswordField mdp;
    private javax.swing.JPasswordField mdp1;
    private javax.swing.JTextField nom_admin;
    private komponenMakeOver.buttonMakeOver nouv;
    private javax.swing.JTextField pseudo;
    private komponenMakeOver.buttonMakeOver supp;
    private javax.swing.JTextField txtRecherche;
    // End of variables declaration//GEN-END:variables
}
