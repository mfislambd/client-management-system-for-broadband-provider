/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_normal;

import all_classes.openURL;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author user
 */
public class about_us extends javax.swing.JFrame {

        /**
         * Creates new form Admin
         */
        int mX, mY;

        public about_us() {
                initComponents();
                ImageIcon img = new ImageIcon("img\\cms.png");
                this.setIconImage(img.getImage());
        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                exit1 = new javax.swing.JLabel();
                exit = new javax.swing.JLabel();
                move = new javax.swing.JLabel();
                link = new javax.swing.JLabel();
                furkan = new javax.swing.JLabel();
                shahariar = new javax.swing.JLabel();
                tanjid = new javax.swing.JLabel();
                rajib = new javax.swing.JLabel();
                sir = new javax.swing.JLabel();
                bg = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setUndecorated(true);
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                exit1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                exit1MouseClicked(evt);
                        }
                });
                getContentPane().add(exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 30, 30));

                exit.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                exitMouseClicked(evt);
                        }
                });
                getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 20, 30));

                move.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                        public void mouseDragged(java.awt.event.MouseEvent evt) {
                                moveMouseDragged(evt);
                        }
                });
                move.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mousePressed(java.awt.event.MouseEvent evt) {
                                moveMousePressed(evt);
                        }
                });
                getContentPane().add(move, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 20));

                link.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                linkMouseClicked(evt);
                        }
                });
                getContentPane().add(link, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 140, 20));

                furkan.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                furkanMouseClicked(evt);
                        }
                });
                getContentPane().add(furkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 160, 190));

                shahariar.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                shahariarMouseClicked(evt);
                        }
                });
                getContentPane().add(shahariar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 150, 170));

                tanjid.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tanjidMouseClicked(evt);
                        }
                });
                getContentPane().add(tanjid, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 160, 170));

                rajib.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                rajibMouseClicked(evt);
                        }
                });
                getContentPane().add(rajib, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 150, 170));

                sir.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                sirMouseClicked(evt);
                        }
                });
                getContentPane().add(sir, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 180, 190));

                bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/about_new.png"))); // NOI18N
                getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, -1));

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
            // TODO add your handling code here:
            this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void moveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveMousePressed
            // TODO add your handling code here:
            mX = evt.getX();
            mY = evt.getY();
    }//GEN-LAST:event_moveMousePressed

    private void moveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveMouseDragged
            // TODO add your handling code here:
            int x = evt.getXOnScreen();
            int y = evt.getYOnScreen();
            this.setLocation(x - mX, y - mY);
    }//GEN-LAST:event_moveMouseDragged

    private void exit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MouseClicked
            // TODO add your handling code here:
            this.setExtendedState(about_us.ICONIFIED);
    }//GEN-LAST:event_exit1MouseClicked

    private void linkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkMouseClicked
            try {
                    // TODO add your handling code here:
                    openURL.go();
            } catch (URISyntaxException ex) {
                    Logger.getLogger(about_us.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_linkMouseClicked

    private void furkanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_furkanMouseClicked
            try {
                    // TODO add your handling code here:
                    openURL.go_set("https://plus.google.com/+MDFurkanulIslam/");
            } catch (URISyntaxException ex) {
                    Logger.getLogger(about_us.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_furkanMouseClicked

    private void shahariarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shahariarMouseClicked
            // TODO add your handling code here:
            try {
                    // TODO add your handling code here:
                    openURL.go_set("https://www.facebook.com/shahariaralam.sajib");
            } catch (URISyntaxException ex) {
                    Logger.getLogger(about_us.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_shahariarMouseClicked

    private void tanjidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tanjidMouseClicked
            // TODO add your handling code here:
            try {
                    // TODO add your handling code here:
                    openURL.go_set("https://www.facebook.com/tanjid.hossain.96");
            } catch (URISyntaxException ex) {
                    Logger.getLogger(about_us.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_tanjidMouseClicked

    private void rajibMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rajibMouseClicked
            // TODO add your handling code here:
            try {
                    // TODO add your handling code here:
                    openURL.go_set("https://www.facebook.com/saha.rajib.35");
            } catch (URISyntaxException ex) {
                    Logger.getLogger(about_us.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_rajibMouseClicked

        private void sirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sirMouseClicked
        try {
                    // TODO add your handling code here:
                    openURL.go_set("https://www.facebook.com/probhat");
            } catch (URISyntaxException ex) {
                    Logger.getLogger(about_us.class.getName()).log(Level.SEVERE, null, ex);
            }
        }//GEN-LAST:event_sirMouseClicked

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
                        java.util.logging.Logger.getLogger(about_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(about_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(about_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(about_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
        //</editor-fold>
                //</editor-fold>
                //</editor-fold>
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new about_us().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel bg;
        private javax.swing.JLabel exit;
        private javax.swing.JLabel exit1;
        private javax.swing.JLabel furkan;
        private javax.swing.JLabel link;
        private javax.swing.JLabel move;
        private javax.swing.JLabel rajib;
        private javax.swing.JLabel shahariar;
        private javax.swing.JLabel sir;
        private javax.swing.JLabel tanjid;
        // End of variables declaration//GEN-END:variables
}
