/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cohortes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;




/**
 *
 * @author Chachou
 */


public class Connexion extends javax.swing.JFrame {

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
    public Connexion() {
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
        pann_id = new javax.swing.JPanel();
        lbl_identifiant = new javax.swing.JLabel();
        lbl_mdp = new javax.swing.JLabel();
        tf_identifiant = new javax.swing.JTextField();
        pf_mdp = new javax.swing.JPasswordField();
        pann_bouton = new javax.swing.JPanel();
        bt_connexion = new javax.swing.JButton();
        ImageIcon image=new ImageIcon("src/gif/Logo.jpg");
        lbl_logo = new javax.swing.JLabel(image);
        lbl_erreur = new javax.swing.JLabel();

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

        javax.swing.GroupLayout pann_cohortesLayout = new javax.swing.GroupLayout(pann_cohortes);
        pann_cohortes.setLayout(pann_cohortesLayout);
        pann_cohortesLayout.setHorizontalGroup(
            pann_cohortesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_titre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pann_cohortesLayout.setVerticalGroup(
            pann_cohortesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_titre, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );

        pann_id.setBackground(new java.awt.Color(153, 153, 153));

        lbl_identifiant.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_identifiant.setForeground(new java.awt.Color(0, 0, 0));
        lbl_identifiant.setText("Identifiant");

        lbl_mdp.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_mdp.setForeground(new java.awt.Color(0, 0, 0));
        lbl_mdp.setText("Mot de passe");

        tf_identifiant.setBackground(new java.awt.Color(153, 255, 204));
        tf_identifiant.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tf_identifiant.setForeground(new java.awt.Color(0, 0, 0));
        tf_identifiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_identifiantActionPerformed(evt);
            }
        });

        pf_mdp.setBackground(new java.awt.Color(153, 255, 204));
        pf_mdp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pf_mdp.setForeground(new java.awt.Color(0, 0, 0));
        pf_mdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pf_mdpActionPerformed(evt);
            }
        });
        pf_mdp.addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent e) {

            }

            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER)

                bt_connexion.doClick(0);

            }

            public void keyReleased(KeyEvent e) {

            }

        });

        javax.swing.GroupLayout pann_idLayout = new javax.swing.GroupLayout(pann_id);
        pann_id.setLayout(pann_idLayout);
        pann_idLayout.setHorizontalGroup(
            pann_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pann_idLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addGroup(pann_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_mdp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_identifiant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pann_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pf_mdp, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(tf_identifiant))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        pann_idLayout.setVerticalGroup(
            pann_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pann_idLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(pann_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_identifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_identifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(pann_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_mdp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pf_mdp))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        bt_connexion.setBackground(new java.awt.Color(102, 255, 204));
        bt_connexion.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        bt_connexion.setForeground(new java.awt.Color(0, 0, 0));
        bt_connexion.setText("Connexion");
        bt_connexion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_connexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_connexionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pann_boutonLayout = new javax.swing.GroupLayout(pann_bouton);
        pann_bouton.setLayout(pann_boutonLayout);
        pann_boutonLayout.setHorizontalGroup(
            pann_boutonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pann_boutonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_connexion, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(517, 517, 517))
        );
        pann_boutonLayout.setVerticalGroup(
            pann_boutonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pann_boutonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_connexion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        lbl_logo.setText("");

        lbl_erreur.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_erreur.setForeground(new java.awt.Color(255, 0, 0));
        lbl_erreur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(315, 315, 315)
                .addComponent(lbl_erreur, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pann_cohortes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(pann_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 354, Short.MAX_VALUE))
                    .addComponent(pann_bouton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pann_cohortes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(pann_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(pann_bouton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_erreur, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        setSize(new java.awt.Dimension(1458, 772));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_identifiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_identifiantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_identifiantActionPerformed

    private void pf_mdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pf_mdpActionPerformed
            if(evt.getSource() == pf_mdp) 
            {
            }        // TODO add your handling code here:
    }//GEN-LAST:event_pf_mdpActionPerformed


    private void bt_connexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_connexionActionPerformed
        // TODO add your handling code here:
        try{
              cnx=connecterDB(); 
              st=cnx.createStatement();
              String identifiant=tf_identifiant.getText();
              String motDePasse=pf_mdp.getText();
              rst=st.executeQuery("select * from UTILISATEURS");
              while(rst.next())
              {
                  if(rst.getString("nom_user").equals(identifiant) &&rst.getString("mdp_user").equals(motDePasse))
                  {
                           this.setVisible(false);
                            new Accueil().setVisible(true);
                  }
              }
              lbl_erreur.setText("Login ou mot de passe incorrect");
          }catch(Exception ex){
              ex.printStackTrace();
          } 
        
        /*if(tf_identifiant.getText().equals("Admin")&& pf_mdp.getText().equals("1234"))
        {
         this.setVisible(false);
         new Accueil().setVisible(true);
        }
        */
        
    }//GEN-LAST:event_bt_connexionActionPerformed

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
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
      
                Connexion maFenetre = new Connexion();
                maFenetre.setVisible(true);
                maFenetre.setSize(1400,800);
                
     

            }
        });
    }
    //
     static Connection cnx;
    static Statement st;
    static ResultSet rst;
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_connexion;
    private javax.swing.JLabel lbl_erreur;
    private javax.swing.JLabel lbl_identifiant;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_mdp;
    private javax.swing.JLabel lbl_titre;
    private javax.swing.JPanel pann_bouton;
    private javax.swing.JPanel pann_cohortes;
    private javax.swing.JPanel pann_id;
    private javax.swing.JPasswordField pf_mdp;
    private javax.swing.JTextField tf_identifiant;
    // End of variables declaration//GEN-END:variables

}
