/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmMenu.java
 *
 * Created on 11 févr. 2012, 13:14:58
 */
package autoecole;


import classes.candidat;

import classes.societe;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import com.toedter.calendar.JCalendar;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
//import javax.swing.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;




/**
 *
 * @author khalilo
 */
public class frmMenu extends javax.swing.JFrame {
       
    //private Timer objTimer;
    //private int speedTimer=80;
    JCalendar jc = new JCalendar() ;
    
    /** Creates new form frmMenu */
    public frmMenu() {
        
        
        initComponents();
        
               
        
       // objTimer=new  Timer(speedTimer, new classTimer());
       // objTimer.start();
    }
    //public class  classTimer implements ActionListener{

        //@Override
       // public void actionPerformed(ActionEvent e) {
            //dateNow();
        //}
        
    //}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        desktopPane = new javax.swing.JDesktopPane();
        BienvLBL = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnBackReg8 = new komponenMakeOver.buttonMakeOver();
        btnBackReg14 = new komponenMakeOver.buttonMakeOver();
        btnBackReg13 = new komponenMakeOver.buttonMakeOver();
        btnBackReg12 = new komponenMakeOver.buttonMakeOver();
        btnBackReg11 = new komponenMakeOver.buttonMakeOver();
        btnBackReg16 = new komponenMakeOver.buttonMakeOver();
        jLabel4 = new javax.swing.JLabel();
        SatisBT = new komponenMakeOver.buttonMakeOver();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        jMenu5 = new javax.swing.JMenu();
        jMenuVille = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuMoniteur = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuEtablissement = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jMenuUtilisateurs = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Auto ECOLE");

        jToolBar1.setBackground(new java.awt.Color(51, 51, 255));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("_____________________________AUTO_Ecole_____________________________________________________________");
        jToolBar1.add(jLabel1);

        desktopPane.setBackground(new java.awt.Color(51, 51, 255));
        desktopPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 51, 51), null, null));

        BienvLBL.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        BienvLBL.setForeground(new java.awt.Color(0, 204, 255));
        BienvLBL.setText("Bienvenue");
        desktopPane.add(BienvLBL);
        BienvLBL.setBounds(240, 90, 510, 100);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel3);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBackReg8.setForeground(new java.awt.Color(255, 255, 255));
        btnBackReg8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/view-media-artist.png"))); // NOI18N
        btnBackReg8.setText("Candidats");
        btnBackReg8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnBackReg8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackReg8ActionPerformed(evt);
            }
        });
        jPanel2.add(btnBackReg8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, -1));

        btnBackReg14.setForeground(new java.awt.Color(255, 255, 255));
        btnBackReg14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/document-edit.png"))); // NOI18N
        btnBackReg14.setText("Examen");
        btnBackReg14.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnBackReg14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackReg14ActionPerformed(evt);
            }
        });
        jPanel2.add(btnBackReg14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, -1));

        btnBackReg13.setForeground(new java.awt.Color(255, 255, 255));
        btnBackReg13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/contact-new.png"))); // NOI18N
        btnBackReg13.setText("Séances ");
        btnBackReg13.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnBackReg13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackReg13ActionPerformed(evt);
            }
        });
        jPanel2.add(btnBackReg13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, -1));

        btnBackReg12.setForeground(new java.awt.Color(255, 255, 255));
        btnBackReg12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/contact-new.png"))); // NOI18N
        btnBackReg12.setText("Emplois");
        btnBackReg12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnBackReg12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackReg12ActionPerformed(evt);
            }
        });
        jPanel2.add(btnBackReg12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 140, -1));

        btnBackReg11.setBackground(new java.awt.Color(204, 204, 0));
        btnBackReg11.setForeground(new java.awt.Color(255, 255, 255));
        btnBackReg11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Imen\\Desktop\\money.png")); // NOI18N
        btnBackReg11.setText("Paiements");
        btnBackReg11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnBackReg11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackReg11ActionPerformed(evt);
            }
        });
        jPanel2.add(btnBackReg11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, -1));

        btnBackReg16.setBackground(new java.awt.Color(204, 204, 0));
        btnBackReg16.setForeground(new java.awt.Color(255, 255, 255));
        btnBackReg16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Imen\\Desktop\\money.png")); // NOI18N
        btnBackReg16.setText("Paiements1");
        btnBackReg16.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnBackReg16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackReg16ActionPerformed(evt);
            }
        });
        jPanel2.add(btnBackReg16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 140, -1));

        jLabel4.setBackground(new java.awt.Color(51, 51, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LEFT_.png"))); // NOI18N

        SatisBT.setBackground(new java.awt.Color(204, 204, 0));
        SatisBT.setForeground(new java.awt.Color(255, 255, 255));
        SatisBT.setIcon(new javax.swing.ImageIcon("C:\\Users\\Imen\\Desktop\\money.png")); // NOI18N
        SatisBT.setText("Satistique");
        SatisBT.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        SatisBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SatisBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SatisBT, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SatisBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        menuBar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        fileMenu.setForeground(new java.awt.Color(51, 0, 255));
        fileMenu.setMnemonic('f');
        fileMenu.setText("Fichier");
        fileMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/application-exit-3.png"))); // NOI18N
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Quitter");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);
        fileMenu.add(jSeparator12);

        menuBar.add(fileMenu);

        jMenu5.setForeground(new java.awt.Color(51, 51, 255));
        jMenu5.setText("Etablissement");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuVille.setBackground(new java.awt.Color(0, 0, 153));
        jMenuVille.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/webpres.png"))); // NOI18N
        jMenuVille.setText("Ville");
        jMenuVille.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVilleActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuVille);
        jMenu5.add(jSeparator9);

        jMenuMoniteur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/edit-group.png"))); // NOI18N
        jMenuMoniteur.setText("Moniteurs & Formateurs");
        jMenuMoniteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMoniteurActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuMoniteur);
        jMenu5.add(jSeparator10);

        jMenuEtablissement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/go-home-3.png"))); // NOI18N
        jMenuEtablissement.setText("Etablissement");
        jMenuEtablissement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEtablissementActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuEtablissement);
        jMenu5.add(jSeparator11);

        jMenuUtilisateurs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/document-decrypt-2.png"))); // NOI18N
        jMenuUtilisateurs.setText("Utilisateurs");
        jMenuUtilisateurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUtilisateursActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuUtilisateurs);
        jMenu5.add(jSeparator13);

        menuBar.add(jMenu5);

        jMenu1.setForeground(new java.awt.Color(51, 51, 255));
        jMenu1.setText("Candidats");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/view-media-artist.png"))); // NOI18N
        jMenuItem5.setText("Liste des Candidats");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        menuBar.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(51, 51, 255));
        jMenu2.setText("Paiements");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Imen\\Desktop\\money.png")); // NOI18N
        jMenuItem1.setText("paiements");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        menuBar.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(51, 51, 255));
        jMenu3.setText("Examen");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/document-edit.png"))); // NOI18N
        jMenuItem2.setText("Examen");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        menuBar.add(jMenu3);

        jMenu6.setForeground(new java.awt.Color(51, 51, 255));
        jMenu6.setText("Séances");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/contact-new-2.png"))); // NOI18N
        jMenuItem3.setText("Séances");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem3);

        menuBar.add(jMenu6);

        jMenu4.setForeground(new java.awt.Color(51, 51, 255));
        jMenu4.setText("Emplois");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/contact-new-2.png"))); // NOI18N
        jMenuItem4.setText("Emplois");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        menuBar.add(jMenu4);

        jMenu8.setBackground(new java.awt.Color(0, 51, 255));
        jMenu8.setForeground(new java.awt.Color(0, 0, 255));
        jMenu8.setText("Help");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22x22/help-3.png"))); // NOI18N
        jMenu8.add(jMenuItem6);

        menuBar.add(jMenu8);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSplitPane1)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed

        System.exit(0);
        
    }//GEN-LAST:event_exitMenuItemActionPerformed

     //private void dateNow(){
       // Date d = new Date();
        //SimpleDateFormat sdf = new SimpleDateFormat("H:mm:ss");
	//sdf.setLenient(true);
        //String myDate=sdf.format(d);
        //lblTime.setText(myDate.toString());
   // }
     
     
    private void jMenuEtablissementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEtablissementActionPerformed

        

        ResultSet rsdb=null;
        rsdb=societe.select_societe(1);
        try{
            if (rsdb.next())
            {
                societe.mode_amodif=true;
                societe.num_amodif=1;
                frmFicheSociete ffs = new frmFicheSociete(null, true);
                ffs.setResizable(false);
                ffs.setLocationRelativeTo(null);
                ffs.setVisible(true);  
            }else{
                JOptionPane.showMessageDialog(null, "Veuillez paramétrer les informations de votre société");
                societe.mode_amodif=false;
                societe.num_amodif=0;
                frmFicheSociete ffs = new frmFicheSociete(null, true);
                ffs.setResizable(false);
                ffs.setLocationRelativeTo(null);
                ffs.setVisible(true); 
            }
            
        }catch (Exception exx){

        JOptionPane.showMessageDialog(null, exx.getMessage());
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuEtablissementActionPerformed

    private void jMenuVilleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVilleActionPerformed

        
        frmListeVille fpf = new frmListeVille(null, true);
        fpf.setResizable(false);
        fpf.setLocationRelativeTo(null);
        fpf.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuVilleActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        
        frmListeCandidat flc = new frmListeCandidat();
       desktopPane.add(flc);
        try {
            flc.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
       flc.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuMoniteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMoniteurActionPerformed

        
        frmListeMoniteur flm = new frmListeMoniteur();
       desktopPane.add(flm);
        try {
            flm.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
       flm.setVisible(true);
                // TODO add your handling code here:
    }//GEN-LAST:event_jMenuMoniteurActionPerformed

    private void jMenuUtilisateursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUtilisateursActionPerformed
       frmListeAdmin flm = new   frmListeAdmin();
       desktopPane.add(flm);
        try {
            flm.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
       flm.setVisible(true);    
        
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuUtilisateursActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void btnBackReg11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackReg11ActionPerformed
        frmListePaiement_1 flc = new frmListePaiement_1();
        desktopPane.add(flc);
        try {
            flc.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        flc.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackReg11ActionPerformed

    private void btnBackReg8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackReg8ActionPerformed
        frmListeCandidat flc = new frmListeCandidat();
        desktopPane.add(flc);
        try {
            flc.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        flc.setVisible(true);
    }//GEN-LAST:event_btnBackReg8ActionPerformed

    private void btnBackReg12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackReg12ActionPerformed
       Listeemploi fls = new   Listeemploi ();
        desktopPane.add(fls);
        try {
            fls.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        fls.setVisible(true);
    }//GEN-LAST:event_btnBackReg12ActionPerformed

    private void btnBackReg14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackReg14ActionPerformed
     frmListeExamen flm = new frmListeExamen();
        desktopPane.add(flm);
        try {
            flm.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        flm.setVisible(true);
    }//GEN-LAST:event_btnBackReg14ActionPerformed

    private void btnBackReg13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackReg13ActionPerformed
       frmListeSeance fls = new frmListeSeance();
        desktopPane.add(fls);
        try {
            fls.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        fls.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_btnBackReg13ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       frmListePaiement flc = new frmListePaiement();
        desktopPane.add(flc);
        try {
            flc.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        flc.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       frmListeExamen flm = new frmListeExamen();
        desktopPane.add(flm);
        try {
            flm.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        flm.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      frmListeSeance fls = new frmListeSeance();
        desktopPane.add(fls);
        try {
            fls.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        fls.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void SatisBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SatisBTActionPerformed
    //TODO
    DoStaist();
    }//GEN-LAST:event_SatisBTActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
     Listeemploi flc = new  Listeemploi();
        desktopPane.add(flc);
        try {
            flc.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        flc.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btnBackReg16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackReg16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackReg16ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new frmMenu().setVisible(true);
                
                
            }
        });
    }
    /**
     * 
     */
    private void DoStaist(){
        satistiPanel satispanel=new satistiPanel();
        desktopPane.removeAll();
        desktopPane.revalidate();
        desktopPane.setLayout(new BorderLayout());
        desktopPane.add(satispanel,BorderLayout.CENTER);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BienvLBL;
    private komponenMakeOver.buttonMakeOver SatisBT;
    private komponenMakeOver.buttonMakeOver btnBackReg11;
    private komponenMakeOver.buttonMakeOver btnBackReg12;
    private komponenMakeOver.buttonMakeOver btnBackReg13;
    private komponenMakeOver.buttonMakeOver btnBackReg14;
    private komponenMakeOver.buttonMakeOver btnBackReg16;
    private komponenMakeOver.buttonMakeOver btnBackReg8;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuItem jMenuEtablissement;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuMoniteur;
    private javax.swing.JMenuItem jMenuUtilisateurs;
    private javax.swing.JMenuItem jMenuVille;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
}
