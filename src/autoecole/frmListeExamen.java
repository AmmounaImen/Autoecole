
package autoecole;


import classes.candidat;
import classes.connections;
import classes.moniteur;
import classes.examen;
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


public class frmListeExamen extends javax.swing.JInternalFrame {

    
    DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
    
    ResultSet rsdb=null;
    ResultSet rsdbcandidat=null;
    
    private void remplir_table_examen(ResultSet aRemplir){
    
    
        try{
        
        DefaultTableModel dtm=new DefaultTableModel();

        jTableExamen.setModel(dtm);
        dtm.addColumn("ID");
        dtm.addColumn("Date");
        dtm.addColumn("Heure");
        dtm.addColumn("Type");
        dtm.addColumn("Note");
        dtm.addColumn("Résultat");
        
        
        
        
        if (rsdb.next())
        {
            
            rsdb.first();
            do
            {
                Object arr[]={rsdb.getInt("id_examen"),
                    rsdb.getDate("date_examen"),
                    rsdb.getTime("heure_examen"),
                    rsdb.getString("type_examen"),
                    rsdb.getInt("note_examen"),
                    rsdb.getBoolean("resultat_examen")
                };
                dtm.addRow(arr);
                
            }while(rsdb.next());
            rsdb.first();
            jTableExamen.setBackground(Color.WHITE);
            jTableExamen.setForeground(Color.blue);
            jTableExamen.setRowHeight(24);
            jTableExamen.setFont(new Font("Arial", Font.BOLD, 13));
            jTableExamen.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            JTableHeader header = jTableExamen.getTableHeader();
            header.setBackground(Color.BLACK);
            header.setForeground(Color.BLACK);
            header.setFont(new Font("Arial", Font.BOLD, 13));
            
            TableColumn col = jTableExamen.getColumnModel().getColumn(2);
            col.setPreferredWidth(220);
            col = jTableExamen.getColumnModel().getColumn(0);
            col.setPreferredWidth(25);
        }
        }catch (Exception exx){

        JOptionPane.showMessageDialog(null, exx.getMessage());
        }
        
        
        
        
    }
  
    private void remplir_table_candidat(ResultSet aRemplir){
    
    
        try{
        
        DefaultTableModel dtm=new DefaultTableModel();
/* 	id_candidat, nom_candidat, cin_candidat, dn_candidat, adresse_candidat, ville_candidat, gsm_candidat, email_candidat, observation_candidat, date_inscription_candidat */ 
        jTableCandidat.setModel(dtm);
        dtm.addColumn("ID");
        dtm.addColumn("CIN");
        dtm.addColumn("Nom");
        
        
        
        if (rsdbcandidat.next())
        {
            
            rsdbcandidat.first();
            do
            {
                Object arr[]={rsdbcandidat.getInt("id_candidat"),
                    rsdbcandidat.getString("cin_candidat"),
                    rsdbcandidat.getString("nom_candidat")};
                dtm.addRow(arr);
                
            }while(rsdbcandidat.next());
            rsdbcandidat.first();
            
            jTableCandidat.setForeground(Color.blue);
            jTableCandidat.setRowHeight(24);
            jTableCandidat.setFont(new Font("Arial", Font.BOLD, 13));
            jTableCandidat.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            JTableHeader header = jTableCandidat.getTableHeader();
            header.setBackground(Color.BLACK);
            header.setForeground(Color.BLACK);
            header.setFont(new Font("Arial", Font.BOLD, 13));
            
            TableColumn col = jTableCandidat.getColumnModel().getColumn(2);
            col.setPreferredWidth(220);
            col = jTableCandidat.getColumnModel().getColumn(0);
            col.setPreferredWidth(25);
        }
        }catch (Exception exx){

        JOptionPane.showMessageDialog(null, exx.getMessage());
        }
        
        
        
        
    }
    
    public frmListeExamen() {
        initComponents();
        rsdbcandidat=candidat.liste_candidat();
        remplir_table_candidat(rsdbcandidat);
        remplir_mode_ajout();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        nom_candidat = new javax.swing.JTextField();
        cin_candidat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        date_examen = new com.toedter.calendar.JDateChooser();
        reference_candidat = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        type_examen = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableExamen = new javax.swing.JTable();
        heure_examen = new javax.swing.JFormattedTextField();
        note_examen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        resultat_examen = new javax.swing.JCheckBox();
        numero_permis = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCandidat = new javax.swing.JTable();
        ajout = new komponenMakeOver.buttonMakeOver();
        supp = new komponenMakeOver.buttonMakeOver();
        nouv = new komponenMakeOver.buttonMakeOver();
        ajout1 = new komponenMakeOver.buttonMakeOver();
        ajout3 = new komponenMakeOver.buttonMakeOver();
        ajout2 = new komponenMakeOver.buttonMakeOver();
        jPanel2 = new javax.swing.JPanel();
        txtRecherche = new javax.swing.JTextField();
        btnRecherche = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setMaximizable(true);
        setTitle("Liste des examens");
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nom_candidat.setEditable(false);
        nom_candidat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nom_candidat.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                nom_candidatCaretUpdate(evt);
            }
        });
        nom_candidat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_candidatActionPerformed(evt);
            }
        });

        cin_candidat.setEditable(false);
        cin_candidat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cin_candidat.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                cin_candidatCaretUpdate(evt);
            }
        });
        cin_candidat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cin_candidatActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nom :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("N° CIN :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Date examen :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("N° Permis :");

        date_examen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        date_examen.setDateFormatString("yyyy-MM-dd");
        date_examen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        reference_candidat.setEditable(false);
        reference_candidat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reference_candidat.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                reference_candidatCaretUpdate(evt);
            }
        });
        reference_candidat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reference_candidatActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Réf :");

        type_examen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        type_examen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Code", "Conduite" }));
        type_examen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_examenActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Type examen :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Heure :");

        jTableExamen.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableExamen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableExamenMouseClicked(evt);
            }
        });
        jTableExamen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableExamenKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTableExamen);

        try {
            heure_examen.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        heure_examen.setText("08:00:00");
        heure_examen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        note_examen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        note_examen.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                note_examenCaretUpdate(evt);
            }
        });
        note_examen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                note_examenActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Note :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Candidat ________________________________________________________________");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 153, 0));
        jLabel16.setText("Date & heure _____________________________________________________________");

        resultat_examen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        resultat_examen.setText("Résultat de l'examen (Réussi)");
        resultat_examen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultat_examenActionPerformed(evt);
            }
        });

        numero_permis.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        numero_permis.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                numero_permisCaretUpdate(evt);
            }
        });
        numero_permis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_permisActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 204, 51));
        jLabel17.setText("Résultat _________________________________________________________________");

        jTableCandidat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableCandidat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCandidatMouseClicked(evt);
            }
        });
        jTableCandidat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableCandidatKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCandidat);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reference_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nom_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel4)
                                .addGap(31, 31, 31)
                                .addComponent(cin_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(note_examen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(resultat_examen)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(numero_permis, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(type_examen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(date_examen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(heure_examen, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel16))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel7)
                        .addGap(0, 116, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reference_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel1)
                    .addComponent(nom_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cin_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(date_examen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(heure_examen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type_examen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(20, 20, 20)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultat_examen)
                    .addComponent(note_examen, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(numero_permis, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("    Fiche Séance    ", jPanel3);

        ajout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/document-export.png"))); // NOI18N
        ajout.setText("Enregistrer");
        ajout.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        ajout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutActionPerformed(evt);
            }
        });

        supp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/dialog-cancel-2.png"))); // NOI18N
        supp.setText("Supprimer");
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
        ajout1.setText("Actualiser");
        ajout1.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        ajout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajout1ActionPerformed(evt);
            }
        });

        ajout3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/document-print-4.png"))); // NOI18N
        ajout3.setText("Imprimer");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(ajout, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(supp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nouv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ajout1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ajout3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ajout2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(386, 386, 386))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nouv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajout1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajout3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajout2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        jLabel3.setText("Recherche Candidat:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/knotes-5.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRecherche)
                .addGap(264, 264, 264))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void btnRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercheActionPerformed
        connections con =new connections();
        con.connect();
        rsdbcandidat=con.exec("select * from candidat where `cin_candidat` LIKE '%"+txtRecherche.getText()+"%' or `nom_candidat` LIKE '%"+txtRecherche.getText()+"%'");
        remplir_table_candidat(rsdbcandidat);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRechercheActionPerformed

    
    
    
    private void txtRechercheCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtRechercheCaretUpdate
        connections con =new connections();
        con.connect();
        rsdbcandidat=con.exec("select * from candidat where `cin_candidat` LIKE '%"+txtRecherche.getText()+"%' or `nom_candidat` LIKE '%"+txtRecherche.getText()+"%'");
        remplir_table_candidat(rsdbcandidat);
        
    }//GEN-LAST:event_txtRechercheCaretUpdate

    private void jTableCandidatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableCandidatKeyPressed
                
                if(evt.getKeyCode()==10){
                    ajoutActionPerformed(null);
                }
                if(evt.getKeyCode()==107){
                   nouvActionPerformed(null);
                }
                if(evt.getKeyCode()==109){
                 suppActionPerformed(null);
                }
    }//GEN-LAST:event_jTableCandidatKeyPressed

    private void txtRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRechercheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRechercheActionPerformed

    private void nom_candidatCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_nom_candidatCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_candidatCaretUpdate

    private void nom_candidatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_candidatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_candidatActionPerformed

    private void cin_candidatCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_cin_candidatCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_cin_candidatCaretUpdate

    private void cin_candidatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cin_candidatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cin_candidatActionPerformed

     
    private void jTableCandidatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCandidatMouseClicked
       ResultSet rsdbCandidat=null;
       
       double reste_=0;
       int sa =jTableCandidat.getSelectedRow();
       int a_modifier=Integer.parseInt(jTableCandidat.getValueAt(sa, 0).toString());
        try {
            
            rsdbCandidat=candidat.select_candidat(a_modifier); 
            rsdbCandidat.first();
            reference_candidat.setText(rsdbCandidat.getString("reference_candidat"));
            nom_candidat.setText(rsdbCandidat.getString("nom_candidat"));
            cin_candidat.setText(rsdbCandidat.getString("cin_candidat"));
            
            examen.id_candidat_modif=rsdbCandidat.getInt("id_candidat");
            rsdb=examen.liste_examen_candidat(examen.id_candidat_modif);
            remplir_table_examen(rsdb);
            remplir_mode_ajout();
            
        } catch (Exception exxx) {
            JOptionPane.showMessageDialog (null , exxx.getMessage());
        }
       
        
// TODO add your handling code here:
    }//GEN-LAST:event_jTableCandidatMouseClicked

    private void reference_candidatCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_reference_candidatCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_reference_candidatCaretUpdate

    private void reference_candidatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reference_candidatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reference_candidatActionPerformed

    private void type_examenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_examenActionPerformed

        
        
        

// TODO add your handling code here:
    }//GEN-LAST:event_type_examenActionPerformed

    private void jTableExamenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableExamenMouseClicked
        ResultSet rsdbExamen=null;
        
        int sa =jTableExamen.getSelectedRow();
        int a_modifier=Integer.parseInt(jTableExamen.getValueAt(sa, 0).toString());
        try {

            rsdbExamen=examen.select_examen(a_modifier);
            rsdbExamen.first();
            
            type_examen.setSelectedItem(rsdbExamen.getString("type_examen"));
            date_examen.setDate(Date.valueOf(rsdbExamen.getString("date_examen")));
            note_examen.setText(String.valueOf(rsdbExamen.getInt("note_examen")));
            
            heure_examen.setText( String.valueOf(rsdbExamen.getTime("heure_examen")));
            resultat_examen.setSelected(rsdbExamen.getBoolean("resultat_examen"));
            numero_permis.setText(String.valueOf(rsdbExamen.getString("numero_permis")));
            
            
            examen.num_amodif=rsdbExamen.getInt("id_examen");
            examen.id_candidat_modif=rsdbExamen.getInt("id_candidat");
            examen.mode_amodif=true;

        } catch (Exception exxx) {
            JOptionPane.showMessageDialog (null , exxx.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jTableExamenMouseClicked

    private void jTableExamenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableExamenKeyPressed

        if(evt.getKeyCode()==10){
          ajoutActionPerformed(null);
        }
        if(evt.getKeyCode()==107){
       nouvActionPerformed(null);
        }
        if(evt.getKeyCode()==109){
          suppActionPerformed(null);
        }
    }//GEN-LAST:event_jTableExamenKeyPressed

    private void note_examenCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_note_examenCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_note_examenCaretUpdate

    private void note_examenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_note_examenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_note_examenActionPerformed

    private void resultat_examenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultat_examenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultat_examenActionPerformed

    private void numero_permisCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_numero_permisCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_numero_permisCaretUpdate

    private void numero_permisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_permisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero_permisActionPerformed

    private void ajoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutActionPerformed
        Date date_examen_=Date.valueOf(df.format(date_examen.getDate()));
        
        
       
        examen cnd = new examen(examen.num_amodif,date_examen_, Time.valueOf(heure_examen.getText()), examen.id_candidat_modif,Integer.parseInt(note_examen.getText().toString()),resultat_examen.isSelected(),numero_permis.getText().toString(),type_examen.getSelectedItem().toString());
        if(examen.mode_amodif==false){
            
            try {  
                
                Boolean cFe = examen.ajouterExamen(cnd);
                    if (cFe==true){
                    JOptionPane.showMessageDialog(null, "Ajout examen effectué avec succès...");
                    remplir_mode_ajout();
                    }else{
                    JOptionPane.showMessageDialog(null, "Erreur Ajout...");
                    }
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
        }else{
            
            
            try {  
                
                Boolean cFe = examen.modifierExamen(cnd);
                    if (cFe==true){
                    JOptionPane.showMessageDialog(null, "Modification examen effectué avec succès...");
                    remplir_mode_ajout();
                    }else{
                    JOptionPane.showMessageDialog(null, "Erreur Modification...");
                    }
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
           
        }
        
                  
        rsdb=examen.liste_examen_candidat(examen.id_candidat_modif);
        remplir_table_examen(rsdb);
        //remplir_mode_ajout();
        
    }//GEN-LAST:event_ajoutActionPerformed

    private void suppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppActionPerformed
        try {
        int sa =jTableExamen.getSelectedRow();
        int a_supp=Integer.parseInt(jTableExamen.getValueAt(sa, 0).toString());
        
        int n = JOptionPane.showConfirmDialog(null, "Voulez Vraimenet supprimer cet enregistrement?","Suppression",JOptionPane.YES_NO_OPTION);
        
        if(n==JOptionPane.YES_OPTION){
        
        Boolean tfasse5=examen.supprimerExamen(a_supp);
        if (tfasse5==true){
        JOptionPane.showMessageDialog(null,"Enregistrement supprimé avec succes");
        rsdb=examen.liste_examen();
        remplir_table_examen(rsdb);
        }else{
        JOptionPane.showMessageDialog(null,"Erreur de suppression");
        }
        }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vous devez sélectionner un examen à supprimer !!! \nerr :"+e.getMessage());
        }
        
        
    }//GEN-LAST:event_suppActionPerformed

    private void nouvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nouvActionPerformed
      remplir_mode_ajout();
    }

    private void remplir_mode_ajout(){
            type_examen.setSelectedItem("Théorique");
            date_examen.setDate(null);
            note_examen.setText("");
            heure_examen.setText("08:00:00");
            resultat_examen.setSelected(false);
            numero_permis.setText("");
            
            examen.mode_amodif=false;
            examen.num_amodif=0;
       

            // TODO add your handling code here:
    }//GEN-LAST:event_nouvActionPerformed

    private void ajout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajout1ActionPerformed
        rsdb=candidat.liste_candidat();
        remplir_table_candidat(rsdb);  // TODO add your handling code here:
    }//GEN-LAST:event_ajout1ActionPerformed

    private void ajout3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajout3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ajout3ActionPerformed

    private void ajout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajout2ActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_ajout2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private komponenMakeOver.buttonMakeOver ajout;
    private komponenMakeOver.buttonMakeOver ajout1;
    private komponenMakeOver.buttonMakeOver ajout2;
    private komponenMakeOver.buttonMakeOver ajout3;
    private javax.swing.JButton btnRecherche;
    private javax.swing.JTextField cin_candidat;
    private com.toedter.calendar.JDateChooser date_examen;
    private javax.swing.JFormattedTextField heure_examen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableCandidat;
    private javax.swing.JTable jTableExamen;
    private javax.swing.JTextField nom_candidat;
    private javax.swing.JTextField note_examen;
    private komponenMakeOver.buttonMakeOver nouv;
    private javax.swing.JTextField numero_permis;
    private javax.swing.JTextField reference_candidat;
    private javax.swing.JCheckBox resultat_examen;
    private komponenMakeOver.buttonMakeOver supp;
    private javax.swing.JTextField txtRecherche;
    private javax.swing.JComboBox type_examen;
    // End of variables declaration//GEN-END:variables
}
