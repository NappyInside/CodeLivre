/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priseEnMain;

import javax.swing.JOptionPane;

/**
 *
 * @author aminiscloux
 */
public class PremiereFenetre extends javax.swing.JFrame {

    /**
     * Creates new form PremiereFenetre
     */
    public PremiereFenetre() {
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

        jLabel_Titre = new javax.swing.JLabel();
        jTextField_Saisie = new javax.swing.JTextField();
        jButton_OK = new javax.swing.JButton();
        jLabel_Fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titre.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel_Titre.setText("Saisissez votre prénom");
        getContentPane().add(jLabel_Titre, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 90, -1, -1));

        jTextField_Saisie.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField_Saisie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Saisie.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTextField_Saisie, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 123, 135, -1));

        jButton_OK.setText("Valider");
        jButton_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OKActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_OK, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 176, 92, -1));

        jLabel_Fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fond.png"))); // NOI18N
        getContentPane().add(jLabel_Fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(466, 389));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OKActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Bienvenue " + jTextField_Saisie.getText());
    }//GEN-LAST:event_jButton_OKActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PremiereFenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PremiereFenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PremiereFenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PremiereFenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PremiereFenetre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_OK;
    private javax.swing.JLabel jLabel_Fond;
    private javax.swing.JLabel jLabel_Titre;
    private javax.swing.JTextField jTextField_Saisie;
    // End of variables declaration//GEN-END:variables
}