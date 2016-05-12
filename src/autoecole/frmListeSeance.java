
package autoecole;


import classes.candidat;
import classes.connections;
import classes.moniteur;
import classes.seance;
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


public class frmListeSeance extends javax.swing.JInternalFrame {

    public static int selectedMoniteur=0;
    public static String selectedMoniteur_NOM="";
    public static String selectedMoniteur_TYPE="";
    DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
    
    ResultSet rsdb=null;
    ResultSet rsdbcandidat=null;
    ResultSet rsdbmoniteur=null;
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
        
        
        
        if (rsdb.next())
        {
            
            rsdb.first();
            do
            {
                Object arr[]={rsdb.getInt("id_seance"),
                    rsdb.getDate("date_seance"),
                    rsdb.getTime("heure_seance"),
                    rsdb.getInt("duree_seance"),
                    rsdb.getInt("id_moniteur"),
                    rsdb.getString("type_seance"),
                    rsdb.getBoolean("presence_seance")
                };
                dtm.addRow(arr);
                
            }while(rsdb.next());
            rsdb.first();
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
    
    public frmListeSeance() {
        initComponents();
        rsdbcandidat=candidat.liste_candidat();
        remplir_table_candidat(rsdbcandidat);
        remplir_mode_ajout();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCandidat = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        nom_candidat = new javax.swing.JTextField();
        cin_candidat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        date_seance = new com.toedter.calendar.JDateChooser();
        reference_candidat = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        type_seance = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        note_seance = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableSeance = new javax.swing.JTable();
        heure_seance = new javax.swing.JFormattedTextField();
        duree_seance = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        type_moniteur = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        nom_moniteur = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        id_moniteur = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnRecherche2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        presence_seance = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        txtRecherche = new javax.swing.JTextField();
        btnRecherche = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ajout = new komponenMakeOver.buttonMakeOver();
        supp = new komponenMakeOver.buttonMakeOver();
        nouv = new komponenMakeOver.buttonMakeOver();
        ajout1 = new komponenMakeOver.buttonMakeOver();
        ajout3 = new komponenMakeOver.buttonMakeOver();
        ajout2 = new komponenMakeOver.buttonMakeOver();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setMaximizable(true);
        setTitle("Liste des seances");
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jTableCandidat.setBackground(new java.awt.Color(0, 204, 204));
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

        jTabbedPane1.setBackground(new java.awt.Color(0, 204, 204));
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
        jLabel5.setText("Date Séance :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Note :");

        date_seance.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        date_seance.setDateFormatString("yyyy-MM-dd");
        date_seance.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

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

        type_seance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        type_seance.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Théorique", "Pratique" }));
        type_seance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_seanceActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Type séance :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Heure :");

        note_seance.setColumns(20);
        note_seance.setRows(5);
        jScrollPane2.setViewportView(note_seance);

        jTableSeance.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableSeance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSeanceMouseClicked(evt);
            }
        });
        jTableSeance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableSeanceKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTableSeance);

        try {
            heure_seance.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        heure_seance.setText("08:00:00");
        heure_seance.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        duree_seance.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        duree_seance.setText("2");
        duree_seance.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                duree_seanceCaretUpdate(evt);
            }
        });
        duree_seance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duree_seanceActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Durée :");

        jLabel7.setBackground(new java.awt.Color(0, 204, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Candidat ________________________________________________________________");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 51, 0));
        jLabel8.setText("Moniteur ________________________________________________________________");

        type_moniteur.setEditable(false);
        type_moniteur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        type_moniteur.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                type_moniteurCaretUpdate(evt);
            }
        });
        type_moniteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_moniteurActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Type :");

        nom_moniteur.setEditable(false);
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

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Nom :");

        id_moniteur.setEditable(false);
        id_moniteur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        id_moniteur.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                id_moniteurCaretUpdate(evt);
            }
        });
        id_moniteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_moniteurActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("ID");

        btnRecherche2.setText("...");
        btnRecherche2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecherche2ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 153, 0));
        jLabel16.setText("Date & heure _____________________________________________________________");

        presence_seance.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        presence_seance.setText("Présence (marquer la présence du candidat et du moniteur  )");
        presence_seance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presence_seanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(id_moniteur, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nom_moniteur, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(type_moniteur, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnRecherche2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel8)))
                        .addGap(1, 1, 1))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(presence_seance)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(type_seance, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(date_seance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(heure_seance, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(duree_seance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reference_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nom_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(cin_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 49, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cin_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(reference_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel1)
                        .addComponent(nom_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(type_moniteur, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(btnRecherche2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id_moniteur, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel11)
                        .addComponent(nom_moniteur, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(date_seance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(heure_seance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(duree_seance, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type_seance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(presence_seance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("    Fiche Séance    ", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/player-time-2.png"))); // NOI18N

        jLabel3.setText("Recherche Candidat:");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRecherche)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(supp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nouv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ajout1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ajout3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ajout2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ajout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
            
            seance.id_candidat_modif=rsdbCandidat.getInt("id_candidat");
            rsdb=seance.liste_seance_candidat(seance.id_candidat_modif);
            remplir_table_seance(rsdb);
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

    private void type_seanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_seanceActionPerformed

        
        
        

// TODO add your handling code here:
    }//GEN-LAST:event_type_seanceActionPerformed

    private void jTableSeanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSeanceMouseClicked
        ResultSet rsdbSeance=null;
        
        int sa =jTableSeance.getSelectedRow();
        int a_modifier=Integer.parseInt(jTableSeance.getValueAt(sa, 0).toString());
        try {

            rsdbSeance=seance.select_seance(a_modifier);
            rsdbSeance.first();
            
            type_seance.setSelectedItem(rsdbSeance.getString("type_seance"));
            date_seance.setDate(Date.valueOf(rsdbSeance.getString("date_seance")));
            note_seance.setText(String.valueOf(rsdbSeance.getString("note_seance")));
            duree_seance.setText( String.valueOf(rsdbSeance.getInt("duree_seance")));
            heure_seance.setText( String.valueOf(rsdbSeance.getTime("heure_seance")));
            presence_seance.setSelected(rsdbSeance.getBoolean("presence_seance"));
            
            // ------>
            rsdbmoniteur=moniteur.select_moniteur(rsdbSeance.getInt("id_moniteur"));
            rsdbmoniteur.first();
            id_moniteur.setText( String.valueOf( rsdbmoniteur.getInt("id_moniteur")));
            nom_moniteur.setText(rsdbmoniteur.getString("nom_moniteur"));
            type_moniteur.setText(rsdbmoniteur.getString("type_moniteur"));
            //  <-------
            
            seance.num_amodif=rsdbSeance.getInt("id_seance");
            seance.id_candidat_modif=rsdbSeance.getInt("id_candidat");
            seance.mode_amodif=true;

        } catch (Exception exxx) {
            JOptionPane.showMessageDialog (null , exxx.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jTableSeanceMouseClicked

    private void jTableSeanceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableSeanceKeyPressed

        if(evt.getKeyCode()==10){
          ajoutActionPerformed(null);
        }
        if(evt.getKeyCode()==107){
          nouvActionPerformed(null);
        }
        if(evt.getKeyCode()==109){
          suppActionPerformed(null);
        }
    }//GEN-LAST:event_jTableSeanceKeyPressed

    private void duree_seanceCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_duree_seanceCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_duree_seanceCaretUpdate

    private void duree_seanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duree_seanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duree_seanceActionPerformed

    private void type_moniteurCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_type_moniteurCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_type_moniteurCaretUpdate

    private void type_moniteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_moniteurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_type_moniteurActionPerformed

    private void nom_moniteurCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_nom_moniteurCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_moniteurCaretUpdate

    private void nom_moniteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_moniteurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_moniteurActionPerformed

    private void id_moniteurCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_id_moniteurCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_id_moniteurCaretUpdate

    private void id_moniteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_moniteurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_moniteurActionPerformed

    private void btnRecherche2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecherche2ActionPerformed

        
        frmSelectMoniteur cl=new frmSelectMoniteur(null, true) ;
        cl.setLocationRelativeTo(this);
        cl.setResizable(false);
        cl.setVisible(true);
        id_moniteur.setText(String.valueOf(selectedMoniteur)) ;// TODO add your handling code here:
        nom_moniteur.setText(selectedMoniteur_NOM);
        type_moniteur.setText(selectedMoniteur_TYPE);
    }//GEN-LAST:event_btnRecherche2ActionPerformed

    private void presence_seanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presence_seanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_presence_seanceActionPerformed

    private void ajoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutActionPerformed
        Date date_seance_=Date.valueOf(df.format(date_seance.getDate()));
        
        
       
        seance cnd = new seance( seance.num_amodif,date_seance_, Time.valueOf(heure_seance.getText()), Integer.parseInt( duree_seance.getText().toString()),seance.id_candidat_modif,Integer.parseInt(id_moniteur.getText().toString()),note_seance.getText().toString(),presence_seance.isSelected(),type_seance.getSelectedItem().toString());
        if(seance.mode_amodif==false){
            
            try {  
                
                Boolean cFe = seance.ajouterSeance(cnd);
                    if (cFe==true){
                    JOptionPane.showMessageDialog(null, "Ajout seance effectué avec succès...");
                    remplir_mode_ajout();
                    }else{
                    JOptionPane.showMessageDialog(null, "Erreur Ajout...");
                    }
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
        }else{
            
            
            try {  
                
                Boolean cFe = seance.modifierSeance(cnd);
                    if (cFe==true){
                    JOptionPane.showMessageDialog(null, "Modification seance effectué avec succès...");
                    remplir_mode_ajout();
                    }else{
                    JOptionPane.showMessageDialog(null, "Erreur Modification...");
                    }
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
           
        }
        
                  
        rsdb=seance.liste_seance_candidat(seance.id_candidat_modif);
        remplir_table_seance(rsdb);
        //remplir_mode_ajout();

        // TODO add your handling code here:
    }//GEN-LAST:event_ajoutActionPerformed

    private void suppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppActionPerformed
         
        try {
        int sa =jTableSeance.getSelectedRow();
        int a_supp=Integer.parseInt(jTableSeance.getValueAt(sa, 0).toString());
        
        int n = JOptionPane.showConfirmDialog(null, "Voulez Vraimenet supprimer cet enregistrement?","Suppression",JOptionPane.YES_NO_OPTION);
        
        if(n==JOptionPane.YES_OPTION){
        
        Boolean tfasse5=seance.supprimerSeance(a_supp);
        if (tfasse5==true){
        JOptionPane.showMessageDialog(null,"Enregistrement supprimé avec succes");
        rsdb=seance.liste_seance();
        remplir_table_seance(rsdb);
        }else{
        JOptionPane.showMessageDialog(null,"Erreur de suppression");
        }
        }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vous devez sélectionner un seance à supprimer !!! \nerr :"+e.getMessage());
        }
        
        
    }//GEN-LAST:event_suppActionPerformed

    private void nouvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nouvActionPerformed

        remplir_mode_ajout();

        }

       private void remplir_mode_ajout(){
            type_seance.setSelectedItem("Théorique");
            date_seance.setDate(null);
            note_seance.setText("");
            duree_seance.setText("2");
            heure_seance.setText("08:00:00");
            presence_seance.setSelected(false);
            id_moniteur.setText("");
            nom_moniteur.setText("");
            type_moniteur.setText("");
            seance.mode_amodif=false;
            seance.num_amodif=0;

            // TODO add your handling code here:
    }//GEN-LAST:event_nouvActionPerformed

    private void ajout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajout1ActionPerformed
        rsdb=seance.liste_seance();
        remplir_table_seance(rsdb);  // TODO add your handling code here:
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
    private javax.swing.JButton btnRecherche2;
    private javax.swing.JTextField cin_candidat;
    private com.toedter.calendar.JDateChooser date_seance;
    private javax.swing.JTextField duree_seance;
    private javax.swing.JFormattedTextField heure_seance;
    private javax.swing.JTextField id_moniteur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableCandidat;
    private javax.swing.JTable jTableSeance;
    private javax.swing.JTextField nom_candidat;
    private javax.swing.JTextField nom_moniteur;
    private javax.swing.JTextArea note_seance;
    private komponenMakeOver.buttonMakeOver nouv;
    private javax.swing.JCheckBox presence_seance;
    private javax.swing.JTextField reference_candidat;
    private komponenMakeOver.buttonMakeOver supp;
    private javax.swing.JTextField txtRecherche;
    private javax.swing.JTextField type_moniteur;
    private javax.swing.JComboBox type_seance;
    // End of variables declaration//GEN-END:variables
}
