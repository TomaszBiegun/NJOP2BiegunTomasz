/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucieczka;

import java.util.Random;

/**
 *
 * @author Tomasz
 */
public class Okno extends javax.swing.JFrame {

    Random r = new Random();
    int x = 0;
    int y = 0;

    /**
     * Creates new form Okno
     */
    public Okno() {
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

        jLabel1 = new javax.swing.JLabel();
        klik = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 300));
        setMinimumSize(new java.awt.Dimension(500, 300));
        setResizable(false);

        jLabel1.setText("Kliknij przycisk");

        klik.setText("Kliknij mnie");
        klik.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                klikFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                klikFocusLost(evt);
            }
        });
        klik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                klikMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                klikMouseEntered(evt);
            }
        });
        klik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klikActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(klik)
                    .addComponent(jLabel1))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(113, 113, 113)
                .addComponent(klik)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void klikFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_klikFocusGained

    }//GEN-LAST:event_klikFocusGained

    private void klikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klikActionPerformed

    }//GEN-LAST:event_klikActionPerformed

    private void klikFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_klikFocusLost

    }//GEN-LAST:event_klikFocusLost

    private void klikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_klikMouseClicked

    }//GEN-LAST:event_klikMouseClicked

    private void klikMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_klikMouseEntered

        x = r.nextInt(400);
        y = r.nextInt(250);
        klik.setLocation(x, y);
    }//GEN-LAST:event_klikMouseEntered

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
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Okno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton klik;
    // End of variables declaration//GEN-END:variables
}
