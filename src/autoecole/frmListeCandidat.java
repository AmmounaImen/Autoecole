
package autoecole;
import classes.MyListRenderer;
import classes.connections;
import classes.candidat;
import classes.paiement;
import classes.seance;
import classes.ville;
import java.awt.Color;
import java.awt.Font;
import java.io.File;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class frmListeCandidat extends javax.swing.JInternalFrame {

    DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
    Object[] itemVille;
    ResultSet rsdb=null;
    ResultSet rsdb_paiement=null;
    ResultSet rsdb_seance=null;
    
    private void remplir_table_candidat(ResultSet aRemplir){
    
    
        try{
        
        DefaultTableModel dtm=new DefaultTableModel();
/* 	id_candidat, nom_candidat, cin_candidat, dn_candidat, adresse_candidat, ville_candidat, gsm_candidat, email_candidat, observation_candidat, date_inscription_candidat */ 
        jTableClient.setModel(dtm);
        dtm.addColumn("ID");
        dtm.addColumn("CIN");
        dtm.addColumn("Nom");
        
        
        
        if (rsdb.next())
        {
            
            rsdb.first();
            do
            {
                Object arr[]={rsdb.getInt("id_candidat"),
                    rsdb.getString("cin_candidat"),
                    rsdb.getString("nom_candidat")};
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
  
    
    private void remplir_table_seance(ResultSet aRemplir){
    
    
        try{
        
        DefaultTableModel dtm=new DefaultTableModel();

        jTableSeance.setModel(dtm);
        dtm.addColumn("ID");
        dtm.addColumn("Date");
        dtm.addColumn("Heure");
        dtm.addColumn("Durée");
        dtm.addColumn("Moniteur");
        dtm.addColumn("Type");
        dtm.addColumn("Présent");
        
        
        
        if (rsdb_seance.next())
        {
            
            rsdb_seance.first();
            do
            {
                Object arr[]={rsdb_seance.getInt("id_seance"),
                    rsdb_seance.getDate("date_seance"),
                    rsdb_seance.getTime("heure_seance"),
                    rsdb_seance.getInt("duree_seance"),
                    rsdb_seance.getInt("id_moniteur"),
                    rsdb_seance.getString("type_seance"),
                    rsdb_seance.getBoolean("presence_seance")
                };
                dtm.addRow(arr);
                
            }while(rsdb_seance.next());
            rsdb_seance.first();
            jTableSeance.setBackground(Color.WHITE);
            jTableSeance.setForeground(Color.blue);
            jTableSeance.setRowHeight(24);
            jTableSeance.setFont(new Font("Arial", Font.BOLD, 13));
            jTableSeance.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            JTableHeader header = jTableSeance.getTableHeader();
            header.setBackground(Color.BLACK);
            header.setForeground(Color.BLACK);
            header.setFont(new Font("Arial", Font.BOLD, 13));
            
            TableColumn col = jTableSeance.getColumnModel().getColumn(2);
            col.setPreferredWidth(220);
            col = jTableSeance.getColumnModel().getColumn(0);
            col.setPreferredWidth(25);
        }
        }catch (Exception exx){

        JOptionPane.showMessageDialog(null, exx.getMessage());
        }
        
        
        
        
    }
    private void remplir_table_paiement(ResultSet aRemplir){
    
    
        try{
        
        DefaultTableModel dtm=new DefaultTableModel();

        jTablePaiement.setModel(dtm);
        dtm.addColumn("ID");
        dtm.addColumn("Date");
        dtm.addColumn("Type");
        dtm.addColumn("N° Cheque");
        dtm.addColumn("Date Chèque");
        dtm.addColumn("Montant");
        
        
        
        if (rsdb_paiement.next())
        {
            
            rsdb_paiement.first();
            do
            {
                Object arr[]={rsdb_paiement.getInt("id_paiement"),
                    rsdb_paiement.getDate("date_paiement"),
                    rsdb_paiement.getString("type_paiement"),
                    rsdb_paiement.getString("numero_cheque"),
                    rsdb_paiement.getDate("date_cheque"),
                    rsdb_paiement.getDouble("montant_paiement")};
                dtm.addRow(arr);
                
            }while(rsdb_paiement.next());
            rsdb_paiement.first();
            jTablePaiement.setBackground(Color.WHITE);
            jTablePaiement.setForeground(Color.blue);
            jTablePaiement.setRowHeight(24);
            jTablePaiement.setFont(new Font("Arial", Font.BOLD, 13));
            jTablePaiement.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            JTableHeader header = jTablePaiement.getTableHeader();
            header.setBackground(Color.BLACK);
            header.setForeground(Color.BLACK);
            header.setFont(new Font("Arial", Font.BOLD, 13));
            
            TableColumn col = jTablePaiement.getColumnModel().getColumn(2);
            col.setPreferredWidth(220);
            col = jTablePaiement.getColumnModel().getColumn(0);
            col.setPreferredWidth(25);
        }
        }catch (Exception exx){

        JOptionPane.showMessageDialog(null, exx.getMessage());
        }
        
        
        
        
    }
    
    public frmListeCandidat() {
        initComponents();
        rsdb=candidat.liste_candidat();
        remplir_table_candidat(rsdb);
        remplir_ville();
        remplir_mode_ajout();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtRecherche = new javax.swing.JTextField();
        btnRecherche = new javax.swing.JButton();
        champRecherche = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        nom_candidat = new javax.swing.JTextField();
        cin_candidat = new javax.swing.JTextField();
        adresse_candidat = new javax.swing.JTextField();
        ville_candidat = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        gsm_candidat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        email_candidat = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        observation_candidat = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        date_inscription_candidat = new com.toedter.calendar.JDateChooser();
        dn_candidat = new com.toedter.calendar.JDateChooser();
        reference_candidat = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        typecontrat = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        montant_candidat = new javax.swing.JTextField();
        categorie_permis_candidat = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClient = new javax.swing.JTable();
        ajout = new komponenMakeOver.buttonMakeOver();
        supp = new komponenMakeOver.buttonMakeOver();
        nouv = new komponenMakeOver.buttonMakeOver();
        ajout1 = new komponenMakeOver.buttonMakeOver();
        ajout3 = new komponenMakeOver.buttonMakeOver();
        ajout2 = new komponenMakeOver.buttonMakeOver();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTablePaiement = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableSeance = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setTitle("Liste des Candidats");
        setMinimumSize(new java.awt.Dimension(87, 30));
        setVisible(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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

        champRecherche.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "cin_candidat", "nom_candidat", "adresse_candidat" }));

        jLabel3.setText("Recherche Candidat:");

        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(51, 255, 255));

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

        adresse_candidat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        adresse_candidat.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                adresse_candidatCaretUpdate(evt);
            }
        });
        adresse_candidat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adresse_candidatActionPerformed(evt);
            }
        });

        ville_candidat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ville_candidat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ville_candidatActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nom :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Numéro CIN :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Date Naisance :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Adresse :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Ville :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("GSM :");

        gsm_candidat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gsm_candidat.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                gsm_candidatCaretUpdate(evt);
            }
        });
        gsm_candidat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gsm_candidatActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Email :");

        email_candidat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email_candidat.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                email_candidatCaretUpdate(evt);
            }
        });
        email_candidat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_candidatActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Observation :");

        observation_candidat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        observation_candidat.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                observation_candidatCaretUpdate(evt);
            }
        });
        observation_candidat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observation_candidatActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Date Inscription :");

        date_inscription_candidat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        date_inscription_candidat.setDateFormatString("yyyy-MM-dd");
        date_inscription_candidat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        dn_candidat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dn_candidat.setDateFormatString("yyyy-MM-dd");
        dn_candidat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

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

        typecontrat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        typecontrat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Contractuelle", "Forfitaire" }));
        typecontrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typecontratActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Catégorie Permis :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Montant :");

        montant_candidat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        montant_candidat.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                montant_candidatCaretUpdate(evt);
            }
        });
        montant_candidat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montant_candidatActionPerformed(evt);
            }
        });

        categorie_permis_candidat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        categorie_permis_candidat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "EC" }));
        categorie_permis_candidat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorie_permis_candidatActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Type contrat :");

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
        ajout1.setText("Actualiser");
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adresse_candidat))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dn_candidat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nom_candidat))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cin_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gsm_candidat))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ville_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(reference_candidat)
                                        .addGap(2, 2, 2)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email_candidat)
                                    .addComponent(observation_candidat)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(date_inscription_candidat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(categorie_permis_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(montant_candidat))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(typecontrat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(104, 104, 104))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reference_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel9)
                    .addComponent(email_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nom_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(observation_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cin_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel11))
                    .addComponent(date_inscription_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(dn_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adresse_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ville_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(gsm_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(categorie_permis_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(montant_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typecontrat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nouv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ajout1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajout3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajout2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("    Fiche Candidat      ", jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTablePaiement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTablePaiement);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 206, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("   Payements...  ", jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTableSeance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTableSeance);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("    Séances ...      ", jPanel5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(champRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRecherche)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(champRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(17, 17, 17)
                .addComponent(jTabbedPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void btnRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercheActionPerformed

        
        connections con =new connections();
        con.connect();
        rsdb=con.exec("select * from candidat where `"+champRecherche.getSelectedItem().toString()+"` LIKE '%"+txtRecherche.getText()+"%'");
        remplir_table_candidat(rsdb);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRechercheActionPerformed

    
        
    
    
    private void txtRechercheCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtRechercheCaretUpdate
        connections con =new connections();
        con.connect();
        rsdb=con.exec("select * from candidat where `"+champRecherche.getSelectedItem().toString()+"` LIKE '%"+txtRecherche.getText()+"%'");
        remplir_table_candidat(rsdb);
        
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

    private void adresse_candidatCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_adresse_candidatCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_adresse_candidatCaretUpdate

    private void adresse_candidatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adresse_candidatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adresse_candidatActionPerformed

    private void gsm_candidatCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_gsm_candidatCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_gsm_candidatCaretUpdate

    private void gsm_candidatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gsm_candidatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gsm_candidatActionPerformed

    private void email_candidatCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_email_candidatCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_email_candidatCaretUpdate

    private void email_candidatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_candidatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_candidatActionPerformed

    private void observation_candidatCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_observation_candidatCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_observation_candidatCaretUpdate

    private void observation_candidatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observation_candidatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_observation_candidatActionPerformed

    private void ville_candidatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ville_candidatActionPerformed
        Object[] itemData = (Object[])ville_candidat.getModel().getSelectedItem();
        ville_candidat.getSelectedItem();
        //txtRecherche.setText(String.valueOf(itemData[0]));
    }//GEN-LAST:event_ville_candidatActionPerformed

     public void remplir_ville(){
         ville_candidat.removeAll();
        ResultSet rsdbVille=null;        
        rsdbVille=ville.liste_ville();
        try{
             
            while(rsdbVille.next()){
                int id=rsdbVille.getInt("id_ville");
                String category=rsdbVille.getString("nom_ville");
                itemVille = new Object[] {id, category};
                ville_candidat.addItem(itemVille);
                 ville_candidat.setRenderer(new MyListRenderer());
            }
            
           
        }catch(Exception exx){
            JOptionPane.showMessageDialog(null, exx.getMessage());
        }
    }
    private void jTableClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientMouseClicked
       ResultSet rsdbCandidat=null;
       ResultSet rsdbville=null;
       int sa =jTableClient.getSelectedRow();
       int a_modifier=Integer.parseInt(jTableClient.getValueAt(sa, 0).toString());
        try {
            
            rsdbCandidat=candidat.select_candidat(a_modifier); 
            rsdbCandidat.first();
            reference_candidat.setText(rsdbCandidat.getString("reference_candidat"));
            nom_candidat.setText(rsdbCandidat.getString("nom_candidat"));
            cin_candidat.setText(rsdbCandidat.getString("cin_candidat"));
            adresse_candidat.setText(rsdbCandidat.getString("adresse_candidat"));
            gsm_candidat.setText(rsdbCandidat.getString("gsm_candidat"));
            observation_candidat.setText(rsdbCandidat.getString("observation_candidat"));
            dn_candidat.setDate(Date.valueOf( rsdbCandidat.getString("dn_candidat")));
            date_inscription_candidat.setDate(Date.valueOf( rsdbCandidat.getString("date_inscription_candidat")));
            email_candidat.setText(rsdbCandidat.getString("email_candidat"));
            categorie_permis_candidat.setSelectedItem(rsdbCandidat.getString("categorie_permis_candidat"));
            montant_candidat.setText( String.valueOf(rsdbCandidat.getDouble("montant_candidat")));
             typecontrat.setSelectedItem(rsdbCandidat.getString("type_contrat"));
            rsdb_paiement=paiement.liste_paiement_candidat(rsdbCandidat.getInt("id_candidat"));
            remplir_table_paiement(rsdb_paiement);
            rsdb_seance=seance.liste_seance_candidat(rsdbCandidat.getInt("id_candidat"));
            remplir_table_seance(rsdb_seance);
            
            rsdbville=ville.select_ville(rsdbCandidat.getInt("ville_candidat"));
            rsdbville.first();
            int id=rsdbville.getInt("id_ville");
            String category=rsdbville.getString("nom_ville");
            Object[] ob= new Object[] {id, category};
            ville_candidat.getModel().setSelectedItem(ob);
            candidat.num_amodif=rsdbCandidat.getInt("id_candidat");
            candidat.mode_amodif=true;
            
        } catch (Exception exxx) {
            JOptionPane.showMessageDialog (null , exxx.getMessage());
        }
       
        
// TODO add your handling code here:
    }//GEN-LAST:event_jTableClientMouseClicked

    private void reference_candidatCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_reference_candidatCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_reference_candidatCaretUpdate

    private void reference_candidatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reference_candidatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reference_candidatActionPerformed

    private void typecontratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typecontratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typecontratActionPerformed

    private void montant_candidatCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_montant_candidatCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_montant_candidatCaretUpdate

    private void montant_candidatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montant_candidatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montant_candidatActionPerformed

    private void categorie_permis_candidatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorie_permis_candidatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categorie_permis_candidatActionPerformed

    private void ajoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutActionPerformed
        
        Date date_inscription=Date.valueOf(df.format(date_inscription_candidat.getDate()));
        Date date_naissance=Date.valueOf(df.format(dn_candidat.getDate()));
        Object[] itemData = (Object[])ville_candidat.getModel().getSelectedItem();
        
        int ville_c= Integer.parseInt(itemData[0].toString());
        candidat cnd = new candidat(candidat.num_amodif, reference_candidat.getText().toString(), nom_candidat.getText().toString(), cin_candidat.getText().toString(), date_naissance,adresse_candidat.getText().toString(), ville_c , gsm_candidat.getText().toString(),email_candidat.getText().toString(), observation_candidat.getText().toString(), date_inscription,categorie_permis_candidat.getSelectedItem().toString() , Double.parseDouble(montant_candidat.getText().toString()),typecontrat.getSelectedItem().toString());
        if(candidat.mode_amodif==false){
            
            try {  
                
                Boolean cFe = candidat.ajoutercandidat(cnd);
                    if (cFe==true){
                    JOptionPane.showMessageDialog(null, "Ajout Candidat effectué avec succès...");
                    
                    }else{
                    JOptionPane.showMessageDialog(null, "Erreur Ajout...");
                    }
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
        }else{
            
            
            try {  
                
                Boolean cFe = candidat.modifiercandidat(cnd);
                    if (cFe==true){
                    JOptionPane.showMessageDialog(null, "Modification Candidat effectué avec succès...");
                    
                    }else{
                    JOptionPane.showMessageDialog(null, "Erreur Modification...");
                    }
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
           
        }
        
                  
        rsdb=candidat.liste_candidat();
        remplir_table_candidat(rsdb);
        //remplir_mode_ajout();
        
       

        // TODO add your handling code here:
    }//GEN-LAST:event_ajoutActionPerformed

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

    private void nouvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nouvActionPerformed

              remplir_mode_ajout();
        

        
        
    }                                          

    private void remplir_mode_ajout(){
            reference_candidat.setText(candidat.get_reference_candidat()+""+Calendar.getInstance().get(Calendar.YEAR));    
            nom_candidat.setText("");
            cin_candidat.setText("");
            adresse_candidat.setText("");
            gsm_candidat.setText("");
            observation_candidat.setText("");
            dn_candidat.setDate(null);
            date_inscription_candidat.setDate(null);
            email_candidat.setText("");
            montant_candidat.setText("0");
            candidat.mode_amodif=false;
            candidat.num_amodif=0;
        
        
        
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
    private javax.swing.JTextField adresse_candidat;
    private komponenMakeOver.buttonMakeOver ajout;
    private komponenMakeOver.buttonMakeOver ajout1;
    private komponenMakeOver.buttonMakeOver ajout2;
    private komponenMakeOver.buttonMakeOver ajout3;
    private javax.swing.JButton btnRecherche;
    private javax.swing.JComboBox categorie_permis_candidat;
    private javax.swing.JComboBox champRecherche;
    private javax.swing.JTextField cin_candidat;
    private com.toedter.calendar.JDateChooser date_inscription_candidat;
    private com.toedter.calendar.JDateChooser dn_candidat;
    private javax.swing.JTextField email_candidat;
    private javax.swing.JTextField gsm_candidat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableClient;
    private javax.swing.JTable jTablePaiement;
    private javax.swing.JTable jTableSeance;
    private javax.swing.JTextField montant_candidat;
    private javax.swing.JTextField nom_candidat;
    private komponenMakeOver.buttonMakeOver nouv;
    private javax.swing.JTextField observation_candidat;
    private javax.swing.JTextField reference_candidat;
    private komponenMakeOver.buttonMakeOver supp;
    private javax.swing.JTextField txtRecherche;
    private javax.swing.JComboBox typecontrat;
    private javax.swing.JComboBox ville_candidat;
    // End of variables declaration//GEN-END:variables
}
