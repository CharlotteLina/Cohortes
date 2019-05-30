/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cohortes;


import static cohortes.Connexion.cnx;
import static cohortes.Connexion.rst;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultButtonModel;
import javax.swing.ImageIcon;



/**
 *
 * @author Chachou
 */
public class Rechercher extends javax.swing.JFrame {

    private final DefaultButtonModel modelBtnEtudiant;

    /**
     * Creates new form Connexion
     */
         private static Connection  connecterDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/PTUT?zeroDateTimeBehavior=convertToNull";
            String user="root";
            String password="";
            Connection cnx=DriverManager.getConnection(url,user,password);
            System.out.println("Connexion bien établié");
            return cnx;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
     }
    public Rechercher() {
        modelBtnEtudiant=new DefaultButtonModel();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pann_cohortes = new javax.swing.JPanel();
        lbl_titre = new javax.swing.JLabel();
        ImageIcon image=new ImageIcon("src/gif/Logo.jpg");
        lbl_logo = new javax.swing.JLabel(image);
        lbl_nompage = new javax.swing.JLabel();
        pann_menu = new javax.swing.JPanel();
        bt_rechercher = new javax.swing.JButton();
        bt_afficher = new javax.swing.JButton();
        bt_lister = new javax.swing.JButton();
        pann_rechecher = new javax.swing.JPanel();
        tf_choixEtu = new javax.swing.JTextField();
        lbl_saisieEtu = new javax.swing.JLabel();
        ImageIcon home= new ImageIcon("src/gif/recherche.jpg");
        bt_chercher = new javax.swing.JButton(home);
        lbl_erreur = new javax.swing.JLabel();
        pann_reponse = new javax.swing.JPanel();
        bt_reponse = new javax.swing.JButton();
        bt_reponse1 = new javax.swing.JButton();
        bt_reponse2 = new javax.swing.JButton();
        bt_reponse3 = new javax.swing.JButton();
        bt_reponse4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        pann_cohortes.setBackground(new java.awt.Color(0, 0, 0));
        pann_cohortes.setForeground(new java.awt.Color(0, 0, 0));

        lbl_titre.setBackground(new java.awt.Color(102, 255, 51));
        lbl_titre.setFont(new java.awt.Font("Elephant", 1, 48)); // NOI18N
        lbl_titre.setForeground(new java.awt.Color(102, 255, 204));
        lbl_titre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titre.setText("COHORTES");

        lbl_logo.setText("");

        javax.swing.GroupLayout pann_cohortesLayout = new javax.swing.GroupLayout(pann_cohortes);
        pann_cohortes.setLayout(pann_cohortesLayout);
        pann_cohortesLayout.setHorizontalGroup(
            pann_cohortesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pann_cohortesLayout.createSequentialGroup()
                .addComponent(lbl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_titre, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        pann_cohortesLayout.setVerticalGroup(
            pann_cohortesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_titre, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );

        lbl_nompage.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        lbl_nompage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nompage.setText("Rechercher");

        pann_menu.setBackground(new java.awt.Color(153, 153, 153));

        bt_rechercher.setBackground(new java.awt.Color(102, 255, 204));
        bt_rechercher.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        bt_rechercher.setForeground(new java.awt.Color(0, 0, 0));
        bt_rechercher.setText("Rechercher");
        bt_rechercher.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_rechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_rechercherActionPerformed(evt);
            }
        });
        bt_rechercher.addMouseListener( new btMouseListener());

        bt_afficher.setBackground(new java.awt.Color(102, 255, 204));
        bt_afficher.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        bt_afficher.setForeground(new java.awt.Color(0, 0, 0));
        bt_afficher.setText("Afficher");
        bt_afficher.addMouseListener( new btMouseListener());

        bt_lister.setBackground(new java.awt.Color(102, 255, 204));
        bt_lister.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        bt_lister.setForeground(new java.awt.Color(0, 0, 0));
        bt_lister.setText("Lister");
        bt_lister.addMouseListener( new btMouseListener());

        javax.swing.GroupLayout pann_menuLayout = new javax.swing.GroupLayout(pann_menu);
        pann_menu.setLayout(pann_menuLayout);
        pann_menuLayout.setHorizontalGroup(
            pann_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pann_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pann_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_afficher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_rechercher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_lister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pann_menuLayout.setVerticalGroup(
            pann_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pann_menuLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(bt_rechercher)
                .addGap(48, 48, 48)
                .addComponent(bt_afficher, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(bt_lister, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        pann_rechecher.setBackground(new java.awt.Color(153, 153, 153));

        tf_choixEtu.setBackground(new java.awt.Color(255, 255, 255));
        tf_choixEtu.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        tf_choixEtu.setForeground(new java.awt.Color(0, 0, 0));
        tf_choixEtu.setToolTipText("Saisir un numéro étudiant ou Nom");
        tf_choixEtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_choixEtuActionPerformed(evt);
            }
        });
        tf_choixEtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_choixEtuActionPerformed(evt);
            }
        });
        tf_choixEtu.addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent e) {

            }

            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER)

                bt_chercher.doClick(0);

            }

            public void keyReleased(KeyEvent e) {

            }

        });

        lbl_saisieEtu.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        lbl_saisieEtu.setForeground(new java.awt.Color(0, 0, 0));
        lbl_saisieEtu.setText("Saisir un numéro étudiant ou nom : ");

        bt_chercher.setText("");
        bt_chercher.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_chercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_chercherActionPerformed(evt);
            }
        });

        lbl_erreur.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        lbl_erreur.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pann_rechecherLayout = new javax.swing.GroupLayout(pann_rechecher);
        pann_rechecher.setLayout(pann_rechecherLayout);
        pann_rechecherLayout.setHorizontalGroup(
            pann_rechecherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pann_rechecherLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pann_rechecherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_saisieEtu, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pann_rechecherLayout.createSequentialGroup()
                        .addComponent(tf_choixEtu, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_chercher, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(lbl_erreur, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pann_rechecherLayout.setVerticalGroup(
            pann_rechecherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pann_rechecherLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl_saisieEtu, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pann_rechecherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_erreur, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(bt_chercher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_choixEtu, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pann_reponse.setBackground(new java.awt.Color(255, 255, 255));
        pann_reponse.setVisible(false);

        bt_reponse.setVisible(false);
        bt_reponse.setBackground(new java.awt.Color(51, 255, 204));
        bt_reponse.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt_reponse.setForeground(new java.awt.Color(0, 0, 0));
        bt_reponse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_reponseActionPerformed(evt);
            }
        });

        bt_reponse1.setVisible(false);
        bt_reponse1.setBackground(new java.awt.Color(102, 255, 204));
        bt_reponse1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt_reponse1.setForeground(new java.awt.Color(0, 0, 0));
        bt_reponse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_reponse1ActionPerformed(evt);
            }
        });

        bt_reponse2.setVisible(false);
        bt_reponse2.setBackground(new java.awt.Color(102, 255, 204));
        bt_reponse2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt_reponse2.setForeground(new java.awt.Color(0, 0, 0));
        bt_reponse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_reponse2ActionPerformed(evt);
            }
        });

        bt_reponse3.setVisible(false);
        bt_reponse3.setBackground(new java.awt.Color(102, 255, 204));
        bt_reponse3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt_reponse3.setForeground(new java.awt.Color(0, 0, 0));
        bt_reponse3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_reponse3ActionPerformed(evt);
            }
        });

        bt_reponse4.setVisible(false);
        bt_reponse4.setBackground(new java.awt.Color(102, 255, 204));
        bt_reponse4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt_reponse4.setForeground(new java.awt.Color(0, 0, 0));
        bt_reponse4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_reponse4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pann_reponseLayout = new javax.swing.GroupLayout(pann_reponse);
        pann_reponse.setLayout(pann_reponseLayout);
        pann_reponseLayout.setHorizontalGroup(
            pann_reponseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pann_reponseLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pann_reponseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_reponse3, javax.swing.GroupLayout.PREFERRED_SIZE, 1047, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_reponse1, javax.swing.GroupLayout.PREFERRED_SIZE, 1047, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_reponse4, javax.swing.GroupLayout.PREFERRED_SIZE, 1047, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_reponse2, javax.swing.GroupLayout.PREFERRED_SIZE, 1047, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_reponse, javax.swing.GroupLayout.PREFERRED_SIZE, 1047, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        pann_reponseLayout.setVerticalGroup(
            pann_reponseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pann_reponseLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(bt_reponse, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_reponse1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_reponse2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_reponse3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_reponse4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nompage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pann_cohortes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(pann_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pann_rechecher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pann_reponse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pann_cohortes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_nompage)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pann_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pann_rechecher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pann_reponse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1418, 766));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_rechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_rechercherActionPerformed
        // TODO add your handling code here:
        
 
    }//GEN-LAST:event_bt_rechercherActionPerformed

    private void bt_reponseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_reponseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Rechercher_Etudiant(bt_reponse.getText()).setVisible(true);
    }//GEN-LAST:event_bt_reponseActionPerformed

    private void bt_reponse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_reponse1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Rechercher_Etudiant(bt_reponse1.getText()).setVisible(true);
    }//GEN-LAST:event_bt_reponse1ActionPerformed

    private void bt_reponse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_reponse2ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        new Rechercher_Etudiant(bt_reponse2.getText()).setVisible(true);
    }//GEN-LAST:event_bt_reponse2ActionPerformed

    private void bt_reponse3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_reponse3ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        new Rechercher_Etudiant(bt_reponse3.getText()).setVisible(true);
    }//GEN-LAST:event_bt_reponse3ActionPerformed

    private void bt_reponse4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_reponse4ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        new Rechercher_Etudiant(bt_reponse4.getText()).setVisible(true);
    }//GEN-LAST:event_bt_reponse4ActionPerformed

    private void bt_chercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_chercherActionPerformed
        bt_reponse.setVisible(false);
        bt_reponse1.setVisible(false);
        bt_reponse2.setVisible(false);
        bt_reponse3.setVisible(false);
        bt_reponse4.setVisible(false);
        try
        {

            cnx=connecterDB();
            st=cnx.createStatement();
            String recherche=tf_choixEtu.getText();
            rst=st.executeQuery("Select * from etudiants where Nom1 like '"+recherche+"%' or NE like'%"+recherche+"%'");
            int i=0;
            while(rst.next())
            {
                lbl_erreur.setVisible(false);
                i++;
                if(i==1)
                {
                    bt_reponse.setText(rst.getString("Nom1"));
                    pann_reponse.setVisible(true);
                    bt_reponse.setVisible(true);
                 
                }
                if(i==2)
                {
                    bt_reponse1.setText(rst.getString("Nom1"));
                    pann_reponse.setVisible(true);
                    bt_reponse1.setVisible(true);
                }
                if(i==3)
                {
                    bt_reponse2.setText(rst.getString("Nom1"));
                    pann_reponse.setVisible(true);
                    bt_reponse2.setVisible(true);
                }
                if(i==4)
                {
                    bt_reponse3.setText(rst.getString("Nom1"));
                    pann_reponse.setVisible(true);
                    bt_reponse3.setVisible(true);
                }
                if(i==5)
                {
                    bt_reponse4.setText(rst.getString("Nom1"));
                    pann_reponse.setVisible(true);
                    bt_reponse4.setVisible(true);
                }
            }
            if(i==0)
            {
                lbl_erreur.setText("Aucun résultat trouvé ");
                lbl_erreur.setVisible(true);
                pann_reponse.setVisible(false);
            }
            if(i>5)
            {
                lbl_erreur.setText("Plus de 5 résultats. Affiner votre recherche");
                lbl_erreur.setVisible(true);
            }

        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_bt_chercherActionPerformed

    private void tf_choixEtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_choixEtuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_choixEtuActionPerformed
    class btMouseListener implements MouseListener 
        {

        int a=0,l=0,r=0;
        @Override
        public void mouseClicked(MouseEvent e) 
            {
            }
        @Override
        public void mousePressed(MouseEvent e)
            {
                if(e.getSource()==bt_rechercher)
                {
                    setVisible(false);
                    new Accueil().setVisible(true);
                }
                if(e.getSource()==bt_afficher)
                {
                    setVisible(false);
                    new Afficher().setVisible(true);
                }
                 if(e.getSource()==bt_lister)
                {
                    setVisible(false);
                    new Lister().setVisible(true);
                }
            }
                

        @Override
        public void mouseReleased(MouseEvent e) 
        {
           
        }

        @Override
        public void mouseEntered(MouseEvent e) 
        {
       
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
          
        }
            }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Rechercher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rechercher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rechercher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rechercher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Rechercher maFenetre = new Rechercher();
                maFenetre.setVisible(true);
                maFenetre.setSize(1400,800);
                

            }
        });
    }
        static Connection cnx;
        static Statement st;
        static ResultSet rst;
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_afficher;
    private javax.swing.JButton bt_chercher;
    private javax.swing.JButton bt_lister;
    private javax.swing.JButton bt_rechercher;
    private javax.swing.JButton bt_reponse;
    private javax.swing.JButton bt_reponse1;
    private javax.swing.JButton bt_reponse2;
    private javax.swing.JButton bt_reponse3;
    private javax.swing.JButton bt_reponse4;
    private javax.swing.JLabel lbl_erreur;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_nompage;
    private javax.swing.JLabel lbl_saisieEtu;
    private javax.swing.JLabel lbl_titre;
    private javax.swing.JPanel pann_cohortes;
    private javax.swing.JPanel pann_menu;
    private javax.swing.JPanel pann_rechecher;
    private javax.swing.JPanel pann_reponse;
    private javax.swing.JTextField tf_choixEtu;
    // End of variables declaration//GEN-END:variables
}
