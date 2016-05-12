
package autoecole;


import classes.candidat;
import classes.connections;
import classes.paiement;
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


public class frmListePaiement_1 extends javax.swing.JInternalFrame {

    DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
    Object[] itemVille;
    ResultSet rsdb=null;
    ResultSet rsdbcandidat=null;
    
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
        
        
        
        if (rsdb.next())
        {
            
            rsdb.first();
            do
            {
                Object arr[]={rsdb.getInt("id_paiement"),
                    rsdb.getDate("date_paiement"),
                    rsdb.getString("type_paiement"),
                    rsdb.getString("numero_cheque"),
                    rsdb.getDate("date_cheque"),
                    rsdb.getDouble("montant_paiement")};
                dtm.addRow(arr);
                
            }while(rsdb.next());
            rsdb.first();
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
  
    private void remplir_table_candidat(ResultSet aRemplir){
    
    
        try{
        
        DefaultTableModel dtm=new DefaultTableModel();
/* 	id_candidat, nom_candidat, cin_candidat, dn_candidat, adresse_candidat, ville_candidat, gsm_candidat, email_candidat, observation_candidat, date_inscription_candidat */ 
        jTableCandidat.setModel(dtm);
        dtm.addColumn("ID");
        dtm.addColumn("CIN");
        dtm.addColumn("Nom");
         dtm.addColumn("typecontrat");
        
        
        if (rsdbcandidat.next())
        {
            
            rsdbcandidat.first();
            do
            {
                Object arr[]={rsdbcandidat.getInt("id_candidat"),
                    rsdbcandidat.getString("cin_candidat"),
                    rsdbcandidat.getString("nom_candidat"),
                rsdbcandidat.getString("type_contrat")};
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
    
    public frmListePaiement_1() {
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
        lblDateCheque = new javax.swing.JLabel();
        date_cheque = new com.toedter.calendar.JDateChooser();
        date_paiement = new com.toedter.calendar.JDateChooser();
        reference_candidat = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        type_paiement = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        montant_paiement = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        note_paiement = new javax.swing.JTextArea();
        numero_cheque = new javax.swing.JTextField();
        lblNumeroCheque = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        reste_candidat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        montant_candidat = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePaiement = new javax.swing.JTable();
        total_paye = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        typecontrat = new javax.swing.JTextField();
        btnEnregistrer = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        btnAjouter = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtRecherche = new javax.swing.JTextField();
        btnRecherche = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setMaximizable(true);
        setTitle("Liste des paiements");
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

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

        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
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
        jLabel5.setText("Date paiement :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Note :");

        lblDateCheque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDateCheque.setText("Date cheque :");

        date_cheque.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        date_cheque.setDateFormatString("yyyy-MM-dd");
        date_cheque.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        date_paiement.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        date_paiement.setDateFormatString("yyyy-MM-dd");
        date_paiement.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

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

        type_paiement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        type_paiement.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Espèce", "Chèque" }));
        type_paiement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_paiementActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Type:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("A payer :");

        montant_paiement.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        montant_paiement.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                montant_paiementCaretUpdate(evt);
            }
        });
        montant_paiement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montant_paiementActionPerformed(evt);
            }
        });

        note_paiement.setColumns(20);
        note_paiement.setRows(5);
        jScrollPane2.setViewportView(note_paiement);

        numero_cheque.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        numero_cheque.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                numero_chequeCaretUpdate(evt);
            }
        });
        numero_cheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_chequeActionPerformed(evt);
            }
        });

        lblNumeroCheque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNumeroCheque.setText("N° Chèque :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Montant total :");

        reste_candidat.setEditable(false);
        reste_candidat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reste_candidat.setForeground(new java.awt.Color(51, 255, 0));
        reste_candidat.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                reste_candidatCaretUpdate(evt);
            }
        });
        reste_candidat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reste_candidatActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Reste :");

        montant_candidat.setEditable(false);
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

        jTablePaiement.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablePaiement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePaiementMouseClicked(evt);
            }
        });
        jTablePaiement.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTablePaiementKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTablePaiement);

        total_paye.setEditable(false);
        total_paye.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        total_paye.setForeground(new java.awt.Color(0, 0, 255));
        total_paye.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                total_payeCaretUpdate(evt);
            }
        });
        total_paye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_payeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Total payé :");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Type contrat :");

        typecontrat.setEditable(false);
        typecontrat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        typecontrat.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                typecontratCaretUpdate(evt);
            }
        });
        typecontrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typecontratActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(lblDateCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(date_cheque, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(type_paiement, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblNumeroCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(montant_paiement, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(date_paiement, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(numero_cheque, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 147, Short.MAX_VALUE))
                            .addComponent(jScrollPane2))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(typecontrat, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(montant_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(reste_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(15, 15, 15))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(reference_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nom_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(total_paye))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cin_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cin_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(reference_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel1))
                    .addComponent(nom_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(typecontrat, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reste_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(montant_candidat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total_paye, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(montant_paiement, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(date_paiement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type_paiement, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(lblNumeroCheque)
                    .addComponent(numero_cheque, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_cheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDateCheque))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("    Fiche Paiement     ", jPanel3);

        btnEnregistrer.setText("Enregistrer");
        btnEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregistrerActionPerformed(evt);
            }
        });

        btnSupprimer.setText("Supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        btnAjouter.setText("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSupprimer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEnregistrer))
                .addGap(317, 317, 317))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/application-exit-3.png"))); // NOI18N
        jButton1.setText("Fermer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/system-file-manager-2.png"))); // NOI18N

        jLabel3.setText("Recherche Candidat:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
                     
        
    }//GEN-LAST:event_jButton1ActionPerformed
   
    private void btnRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercheActionPerformed
        connections con =new connections();
        con.connect();
        rsdbcandidat=con.exec("select * from candidat where `cin_candidat` LIKE '%"+txtRecherche.getText()+"%' or `nom_candidat` LIKE '%"+txtRecherche.getText()+"%'");
        remplir_table_candidat(rsdbcandidat);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRechercheActionPerformed

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed

        
        remplir_mode_ajout();
        

        
        
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void remplir_mode_ajout(){
            note_paiement.setText("");    
            numero_cheque.setText("");
            montant_paiement.setText("");
            
            type_paiement.setSelectedItem("Espèce");
            numero_cheque.setVisible(false);
            lblNumeroCheque.setVisible(false);
            date_cheque.setVisible(false);
            lblDateCheque.setVisible(false);
            
            date_paiement.setDate(null);
            date_cheque.setDate(null);
            paiement.mode_amodif=false;
            paiement.num_amodif=0;
    }
    
    private void txtRechercheCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtRechercheCaretUpdate
        connections con =new connections();
        con.connect();
        rsdbcandidat=con.exec("select * from candidat where `cin_candidat` LIKE '%"+txtRecherche.getText()+"%' or `nom_candidat` LIKE '%"+txtRecherche.getText()+"%'");
        remplir_table_candidat(rsdbcandidat);
        
    }//GEN-LAST:event_txtRechercheCaretUpdate

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed

        
        try {
        int sa =jTablePaiement.getSelectedRow();
        int a_supp=Integer.parseInt(jTablePaiement.getValueAt(sa, 0).toString());
        
        int n = JOptionPane.showConfirmDialog(null, "Voulez Vraimenet supprimer cet enregistrement?","Suppression",JOptionPane.YES_NO_OPTION);
        
        if(n==JOptionPane.YES_OPTION){
        
        Boolean tfasse5=paiement.supprimerpaiement(a_supp);
        if (tfasse5==true){
        JOptionPane.showMessageDialog(null,"Enregistrement supprimé avec succes");
        rsdb=paiement.liste_paiement();
        remplir_table_paiement(rsdb);
        }else{
        JOptionPane.showMessageDialog(null,"Erreur de suppression");
        }
        }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vous devez sélectionner un paiement à supprimer !!! \nerr :"+e.getMessage());
        }
        
        
        
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void btnEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerActionPerformed

        Date date_paiement_=Date.valueOf(df.format(date_paiement.getDate()));
        Date date_cheque_=null;
        
        
        
        if(type_paiement.getSelectedItem()=="Espèce"){
           
            date_cheque_=date_paiement_;
            
        }else{
            
            date_cheque_=Date.valueOf(df.format(date_cheque.getDate()));
        }
        paiement cnd = new paiement(paiement.num_amodif, paiement.id_candidat_modif, date_paiement_,type_paiement.getSelectedItem().toString(),numero_cheque.getText(),date_cheque_,Double.parseDouble(montant_paiement.getText().toString()),note_paiement.getText().toString(),typecontrat.getText().toString());
        if(paiement.mode_amodif==false){
            
            try {  
                
                Boolean cFe = paiement.ajouterPaiement(cnd);
                    if (cFe==true){
                    JOptionPane.showMessageDialog(null, "Ajout paiement effectué avec succès...");
                    remplir_mode_ajout();
                    }else{
                    JOptionPane.showMessageDialog(null, "Erreur Ajout...");
                    }
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
        }else{
            
            
            try {  
                
                Boolean cFe = paiement.modifierPaiement(cnd);
                    if (cFe==true){
                    JOptionPane.showMessageDialog(null, "Modification paiement effectué avec succès...");
                    remplir_mode_ajout();
                    }else{
                    JOptionPane.showMessageDialog(null, "Erreur Modification...");
                    }
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
           
        }
        
                  
        rsdb=paiement.liste_paiement_candidat(paiement.id_candidat_modif);
        remplir_table_paiement(rsdb);
        //remplir_mode_ajout();
        
       
    }//GEN-LAST:event_btnEnregistrerActionPerformed

    private void jTableCandidatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableCandidatKeyPressed
                
                if(evt.getKeyCode()==10){
                    btnEnregistrerActionPerformed(null);
                }
                if(evt.getKeyCode()==107){
                    btnAjouterActionPerformed(null);
                }
                if(evt.getKeyCode()==109){
                    btnSupprimerActionPerformed(null);
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
            typecontrat.setText(rsdbCandidat.getString("type_contrat"));
            
            
            
            //date_paiement.setDate(Date.valueOf( rsdbCandidat.getString("dn_paiement")));
            //date_cheque.setDate(Date.valueOf( rsdbCandidat.getString("date_inscription_paiement")));
            //email_paiement.setText(rsdbCandidat.getString("email_paiement"));
            //categorie_permis_paiement.setSelectedItem(rsdbCandidat.getString("categorie_permis_paiement"));
            montant_candidat.setText( String.valueOf(rsdbCandidat.getDouble("montant_candidat")));
            total_paye.setText( String.valueOf(paiement.total_paiement_candidat(rsdbCandidat.getInt("id_candidat"))));
            reste_= rsdbCandidat.getDouble("montant_candidat")-paiement.total_paiement_candidat(rsdbCandidat.getInt("id_candidat"));
            reste_candidat.setText(String.valueOf(reste_));
            paiement.id_candidat_modif=rsdbCandidat.getInt("id_candidat");
            rsdb=paiement.liste_paiement_candidat(paiement.id_candidat_modif);
            remplir_table_paiement(rsdb);
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

    private void type_paiementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_paiementActionPerformed

        
        if(type_paiement.getSelectedItem()=="Chèque"){
                numero_cheque.setVisible(true);
                lblNumeroCheque.setVisible(true);
                date_cheque.setVisible(true);
                lblDateCheque.setVisible(true);
            }else{
                numero_cheque.setVisible(false);
                lblNumeroCheque.setVisible(false);
                date_cheque.setVisible(false);
                lblDateCheque.setVisible(false);
            }
        

// TODO add your handling code here:
    }//GEN-LAST:event_type_paiementActionPerformed

    private void montant_paiementCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_montant_paiementCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_montant_paiementCaretUpdate

    private void montant_paiementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montant_paiementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montant_paiementActionPerformed

    private void numero_chequeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_numero_chequeCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_numero_chequeCaretUpdate

    private void numero_chequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_chequeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero_chequeActionPerformed

    private void reste_candidatCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_reste_candidatCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_reste_candidatCaretUpdate

    private void reste_candidatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reste_candidatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reste_candidatActionPerformed

    private void montant_candidatCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_montant_candidatCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_montant_candidatCaretUpdate

    private void montant_candidatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montant_candidatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montant_candidatActionPerformed

    private void jTablePaiementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePaiementMouseClicked
        ResultSet rsdbPaiement=null;
        
        int sa =jTablePaiement.getSelectedRow();
        int a_modifier=Integer.parseInt(jTablePaiement.getValueAt(sa, 0).toString());
        try {

            rsdbPaiement=paiement.select_paiement(a_modifier);
            rsdbPaiement.first();
            
            type_paiement.setSelectedItem(rsdbPaiement.getString("type_paiement"));
            
            if(type_paiement.getSelectedItem()=="Chèque"){
                numero_cheque.setVisible(true);
                lblNumeroCheque.setVisible(true);
                date_cheque.setVisible(true);
                lblDateCheque.setVisible(true);
            }else{
                numero_cheque.setVisible(false);
                lblNumeroCheque.setVisible(false);
                date_cheque.setVisible(false);
                lblDateCheque.setVisible(false);
            }
            
            montant_paiement.setText(String.valueOf(rsdbPaiement.getDouble("montant_paiement")));
            date_paiement.setDate(Date.valueOf( rsdbPaiement.getString("date_paiement")));
            date_cheque.setDate(Date.valueOf( rsdbPaiement.getString("date_cheque")));
            note_paiement.setText(String.valueOf(rsdbPaiement.getString("note_paiement")));
            numero_cheque.setText(String.valueOf(rsdbPaiement.getString("numero_cheque")));
            paiement.num_amodif=rsdbPaiement.getInt("id_paiement");
            paiement.id_candidat_modif=rsdbPaiement.getInt("id_candidat");
            paiement.mode_amodif=true;

        } catch (Exception exxx) {
            JOptionPane.showMessageDialog (null , exxx.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jTablePaiementMouseClicked

    private void jTablePaiementKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTablePaiementKeyPressed

        if(evt.getKeyCode()==10){
            btnEnregistrerActionPerformed(null);
        }
        if(evt.getKeyCode()==107){
            btnAjouterActionPerformed(null);
        }
        if(evt.getKeyCode()==109){
            btnSupprimerActionPerformed(null);
        }
    }//GEN-LAST:event_jTablePaiementKeyPressed

    private void total_payeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_total_payeCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_total_payeCaretUpdate

    private void total_payeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_payeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_payeActionPerformed

    private void typecontratCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_typecontratCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_typecontratCaretUpdate

    private void typecontratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typecontratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typecontratActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnEnregistrer;
    private javax.swing.JButton btnRecherche;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JTextField cin_candidat;
    private com.toedter.calendar.JDateChooser date_cheque;
    private com.toedter.calendar.JDateChooser date_paiement;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableCandidat;
    private javax.swing.JTable jTablePaiement;
    private javax.swing.JLabel lblDateCheque;
    private javax.swing.JLabel lblNumeroCheque;
    private javax.swing.JTextField montant_candidat;
    private javax.swing.JTextField montant_paiement;
    private javax.swing.JTextField nom_candidat;
    private javax.swing.JTextArea note_paiement;
    private javax.swing.JTextField numero_cheque;
    private javax.swing.JTextField reference_candidat;
    private javax.swing.JTextField reste_candidat;
    private javax.swing.JTextField total_paye;
    private javax.swing.JTextField txtRecherche;
    private javax.swing.JComboBox type_paiement;
    private javax.swing.JTextField typecontrat;
    // End of variables declaration//GEN-END:variables
}
