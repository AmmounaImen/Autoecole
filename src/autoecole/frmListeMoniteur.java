
package autoecole;


import classes.connections;
import classes.moniteur;
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


public class frmListeMoniteur extends javax.swing.JInternalFrame {

    DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
    Object[] itemVille;
    ResultSet rsdb=null;
    
    private void remplir_table_moniteur(ResultSet aRemplir){
    
    
        try{
        
        DefaultTableModel dtm=new DefaultTableModel();
/* 	id_moniteur, nom_moniteur, cin_moniteur, dn_moniteur, adresse_moniteur, ville_moniteur, gsm_moniteur, email_moniteur, observation_moniteur, date_inscription_moniteur */ 
        jTableClient.setModel(dtm);
        dtm.addColumn("ID");
        dtm.addColumn("CIN");
        dtm.addColumn("Nom");
        
        
        
        if (rsdb.next())
        {
            
            rsdb.first();
            do
            {
                Object arr[]={rsdb.getInt("id_moniteur"),
                    rsdb.getString("cin_moniteur"),
                    rsdb.getString("nom_moniteur")};
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
            
            TableColumn col = jTableClient.getColumnModel().getColumn(2);
            col.setPreferredWidth(220);
            col = jTableClient.getColumnModel().getColumn(0);
            col.setPreferredWidth(25);
        }
        }catch (Exception exx){

        JOptionPane.showMessageDialog(null, exx.getMessage());
        }
        
        
        
        
    }
  
    
    
    public frmListeMoniteur() {
        initComponents();
        rsdb=moniteur.liste_moniteur();
        remplir_table_moniteur(rsdb);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtRecherche = new javax.swing.JTextField();
        btnRecherche = new javax.swing.JButton();
        champRecherche = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ajout = new komponenMakeOver.buttonMakeOver();
        supp = new komponenMakeOver.buttonMakeOver();
        nouv = new komponenMakeOver.buttonMakeOver();
        ajout1 = new komponenMakeOver.buttonMakeOver();
        ajout3 = new komponenMakeOver.buttonMakeOver();
        ajout2 = new komponenMakeOver.buttonMakeOver();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        nom_moniteur = new javax.swing.JTextField();
        cin_moniteur = new javax.swing.JTextField();
        adresse_moniteur = new javax.swing.JTextField();
        type_moniteur = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        gsm_moniteur = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        date_inscription_moniteur = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClient = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 204, 204));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setMaximizable(true);
        setTitle("Liste des Moniteurs");
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
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

        btnRecherche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/mail-find.png"))); // NOI18N
        btnRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechercheActionPerformed(evt);
            }
        });

        champRecherche.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "cin_moniteur", "nom_moniteur", "type_moniteur" }));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kuser-4.png"))); // NOI18N

        jLabel3.setText("Recherche Candidat:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(337, 337, 337)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(champRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRecherche)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(champRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ajout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/document-export.png"))); // NOI18N
        ajout.setText("Enregistrer");
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

        ajout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/view-refresh-4.png"))); // NOI18N
        ajout1.setText("actealiser");
        ajout1.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        ajout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajout1ActionPerformed(evt);
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

        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nom_moniteur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nom_moniteur.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                nom_moniteurCaretUpdate(evt);
            }
        });
        nom_moniteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_moniteurActionPerformed(evt);
            }
        });

        cin_moniteur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cin_moniteur.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                cin_moniteurCaretUpdate(evt);
            }
        });
        cin_moniteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cin_moniteurActionPerformed(evt);
            }
        });

        adresse_moniteur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        adresse_moniteur.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                adresse_moniteurCaretUpdate(evt);
            }
        });
        adresse_moniteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adresse_moniteurActionPerformed(evt);
            }
        });

        type_moniteur.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        type_moniteur.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Théorique", "Pratique" }));
        type_moniteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_moniteurActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nom :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Numéro CIN :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Adresse :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Type Moniteur:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("GSM :");

        gsm_moniteur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gsm_moniteur.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                gsm_moniteurCaretUpdate(evt);
            }
        });
        gsm_moniteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gsm_moniteurActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Date Inscription :");

        date_inscription_moniteur.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        date_inscription_moniteur.setDateFormatString("yyyy-MM-dd");
        date_inscription_moniteur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jTableClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nom", "GSM"
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(adresse_moniteur)
                                    .addComponent(type_moniteur, 0, 183, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gsm_moniteur))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(date_inscription_moniteur, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nom_moniteur, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cin_moniteur, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cin_moniteur, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(nom_moniteur, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adresse_moniteur, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type_moniteur, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(gsm_moniteur, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(date_inscription_moniteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("    Fiche Moniteur      ", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(112, 112, 112))
                    .addGroup(layout.createSequentialGroup()
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
                        .addComponent(ajout2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nouv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ajout1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajout3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajout2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void btnRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercheActionPerformed

        
        connections con =new connections();
        con.connect();
        rsdb=con.exec("select * from moniteur where `"+champRecherche.getSelectedItem().toString()+"` LIKE '%"+txtRecherche.getText()+"%'");
        remplir_table_moniteur(rsdb);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRechercheActionPerformed

    
    private void txtRechercheCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtRechercheCaretUpdate
        connections con =new connections();
        con.connect();
        rsdb=con.exec("select * from moniteur where `"+champRecherche.getSelectedItem().toString()+"` LIKE '%"+txtRecherche.getText()+"%'");
        remplir_table_moniteur(rsdb);
        
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

    
    private void jTableClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientMouseClicked
       ResultSet rsdbMoniteur=null;
       ResultSet rsdbville=null;
       int sa =jTableClient.getSelectedRow();
       int a_modifier=Integer.parseInt(jTableClient.getValueAt(sa, 0).toString());
        try {
            
            rsdbMoniteur=moniteur.select_moniteur(a_modifier); 
            rsdbMoniteur.first();
            nom_moniteur.setText(rsdbMoniteur.getString("nom_moniteur"));
            cin_moniteur.setText(rsdbMoniteur.getString("cin_moniteur"));
            adresse_moniteur.setText(rsdbMoniteur.getString("adresse_moniteur"));
            gsm_moniteur.setText(rsdbMoniteur.getString("gsm_moniteur"));
            type_moniteur.setSelectedItem(rsdbMoniteur.getString("type_moniteur"));
            date_inscription_moniteur.setDate(Date.valueOf( rsdbMoniteur.getString("date_inscription_moniteur")));
            
            moniteur.num_amodif=rsdbMoniteur.getInt("id_moniteur");
            moniteur.mode_amodif=true;
            
        } catch (Exception exxx) {
            JOptionPane.showMessageDialog (null , exxx.getMessage());
        }
       
        
// TODO add your handling code here:
    }//GEN-LAST:event_jTableClientMouseClicked

    private void ajoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutActionPerformed

       Date date_inscription=Date.valueOf(df.format(date_inscription_moniteur.getDate()));
        
        
        
        
        moniteur cnd = new moniteur(moniteur.num_amodif,nom_moniteur.getText().toString(),cin_moniteur.getText().toString(),adresse_moniteur.getText().toString(),type_moniteur.getSelectedItem().toString(),gsm_moniteur.getText().toString(),date_inscription);
        if(moniteur.mode_amodif==false){
            
            try {  
                
                Boolean cFe = moniteur.ajouterMoniteur(cnd);
                    if (cFe==true){
                    JOptionPane.showMessageDialog(null, "Ajout Moniteur effectué avec succès...");
                    
                    }else{
                    JOptionPane.showMessageDialog(null, "Erreur Ajout...");
                    }
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
        }else{
            
            
            try {  
                
                Boolean cFe = moniteur.modifierMoniteur(cnd);
                    if (cFe==true){
                    JOptionPane.showMessageDialog(null, "Modification Moniteur effectué avec succès...");
                    
                    }else{
                    JOptionPane.showMessageDialog(null, "Erreur Modification...");
                    }
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
           
        }
        
                  
        rsdb=moniteur.liste_moniteur();
        remplir_table_moniteur(rsdb);
        //remplir_mode_ajout();
        // TODO add your handling code here:
    }//GEN-LAST:event_ajoutActionPerformed

    private void suppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppActionPerformed

        try {
        int sa =jTableClient.getSelectedRow();
        int a_supp=Integer.parseInt(jTableClient.getValueAt(sa, 0).toString());
        
        int n = JOptionPane.showConfirmDialog(null, "Voulez Vraimenet supprimer cet enregistrement?","Suppression",JOptionPane.YES_NO_OPTION);
        
        if(n==JOptionPane.YES_OPTION){
        
        Boolean tfasse5=moniteur.supprimerMoniteur(a_supp);
        if (tfasse5==true){
        JOptionPane.showMessageDialog(null,"Enregistrement supprimé avec succes");
        rsdb=moniteur.liste_moniteur();
        remplir_table_moniteur(rsdb);
        }else{
        JOptionPane.showMessageDialog(null,"Erreur de suppression");
        }
        }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vous devez sélectionner un moniteur à supprimer !!! \nerr :"+e.getMessage());
        }
        
        
    }//GEN-LAST:event_suppActionPerformed

    private void nouvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nouvActionPerformed

        remplir_mode_ajout();

        }

        private void remplir_mode_ajout(){
            nom_moniteur.setText("");
            cin_moniteur.setText("");
            adresse_moniteur.setText("");
            gsm_moniteur.setText("");
            date_inscription_moniteur.setDate(null);
            moniteur.mode_amodif=false;
            moniteur.num_amodif=0;
        

            // TODO add your handling code here:
    }//GEN-LAST:event_nouvActionPerformed

    private void ajout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajout1ActionPerformed
      rsdb=moniteur.liste_moniteur();
        remplir_table_moniteur(rsdb);  // TODO add your handling code here:
    }//GEN-LAST:event_ajout1ActionPerformed

    private void ajout3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajout3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ajout3ActionPerformed

    private void ajout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajout2ActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_ajout2ActionPerformed

    private void gsm_moniteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gsm_moniteurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gsm_moniteurActionPerformed

    private void gsm_moniteurCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_gsm_moniteurCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_gsm_moniteurCaretUpdate

    private void type_moniteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_moniteurActionPerformed

    }//GEN-LAST:event_type_moniteurActionPerformed

    private void adresse_moniteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adresse_moniteurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adresse_moniteurActionPerformed

    private void adresse_moniteurCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_adresse_moniteurCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_adresse_moniteurCaretUpdate

    private void cin_moniteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cin_moniteurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cin_moniteurActionPerformed

    private void cin_moniteurCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_cin_moniteurCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_cin_moniteurCaretUpdate

    private void nom_moniteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_moniteurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_moniteurActionPerformed

    private void nom_moniteurCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_nom_moniteurCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_moniteurCaretUpdate

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresse_moniteur;
    private komponenMakeOver.buttonMakeOver ajout;
    private komponenMakeOver.buttonMakeOver ajout1;
    private komponenMakeOver.buttonMakeOver ajout2;
    private komponenMakeOver.buttonMakeOver ajout3;
    private javax.swing.JButton btnRecherche;
    private javax.swing.JComboBox champRecherche;
    private javax.swing.JTextField cin_moniteur;
    private com.toedter.calendar.JDateChooser date_inscription_moniteur;
    private javax.swing.JTextField gsm_moniteur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField nom_moniteur;
    private komponenMakeOver.buttonMakeOver nouv;
    private komponenMakeOver.buttonMakeOver supp;
    private javax.swing.JTextField txtRecherche;
    private javax.swing.JComboBox type_moniteur;
    // End of variables declaration//GEN-END:variables
}
