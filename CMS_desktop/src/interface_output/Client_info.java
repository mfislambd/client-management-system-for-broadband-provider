/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_output;

import all_classes.FileReadWrite;
import interface_input.*;
import java.awt.Cursor;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Client_info extends javax.swing.JFrame {

    /**
     * Creates new form Cadd
     */
    int mX,mY;
    DefaultTableModel model = new DefaultTableModel();
    public Client_info() {
        initComponents();
        ImageIcon img=new ImageIcon("img\\cms.png");
        this.setIconImage(img.getImage());
        move.setCursor(new Cursor(Cursor.MOVE_CURSOR));
        exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        min.setCursor(new Cursor(Cursor.HAND_CURSOR));
        print.setCursor(new Cursor(Cursor.HAND_CURSOR));
        delete.setCursor(new Cursor(Cursor.HAND_CURSOR));
        update.setCursor(new Cursor(Cursor.HAND_CURSOR));
        history.setCursor(new Cursor(Cursor.HAND_CURSOR));
        view.setCursor(new Cursor(Cursor.HAND_CURSOR));
        msg.setCursor(new Cursor(Cursor.HAND_CURSOR));
        print2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        work2();
        tb_update();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                buttonGroup1 = new javax.swing.ButtonGroup();
                move = new javax.swing.JLabel();
                min = new javax.swing.JLabel();
                exit = new javax.swing.JLabel();
                lb_pic = new javax.swing.JLabel();
                view = new javax.swing.JLabel();
                print = new javax.swing.JLabel();
                mac = new javax.swing.JTextField();
                cid = new javax.swing.JTextField();
                dob = new javax.swing.JTextField();
                name = new javax.swing.JTextField();
                band = new javax.swing.JTextField();
                mob = new javax.swing.JTextField();
                email = new javax.swing.JTextField();
                ip = new javax.swing.JTextField();
                status = new javax.swing.JComboBox();
                type = new javax.swing.JComboBox();
                fname = new javax.swing.JTextField();
                jScrollPane1 = new javax.swing.JScrollPane();
                clientTable = new javax.swing.JTable();
                search = new javax.swing.JTextField();
                jScrollPane2 = new javax.swing.JScrollPane();
                address = new javax.swing.JTextArea();
                history = new javax.swing.JLabel();
                msg = new javax.swing.JLabel();
                update = new javax.swing.JLabel();
                print2 = new javax.swing.JLabel();
                delete = new javax.swing.JLabel();
                active = new javax.swing.JCheckBox();
                deactive = new javax.swing.JCheckBox();
                bg = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setUndecorated(true);
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                getContentPane().add(move, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 810, 30));

                min.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                minMouseClicked(evt);
                        }
                });
                getContentPane().add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 30, 30));

                exit.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                exitMouseClicked(evt);
                        }
                });
                getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 40, 30));
                getContentPane().add(lb_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 140, 130));

                view.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                viewMouseClicked(evt);
                        }
                });
                getContentPane().add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 140, 30));

                print.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                printMouseClicked(evt);
                        }
                });
                getContentPane().add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, 130, 40));

                mac.setBackground(new java.awt.Color(38, 32, 132));
                mac.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                mac.setForeground(new java.awt.Color(255, 255, 255));
                mac.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                getContentPane().add(mac, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 425, 30));

                cid.setEditable(false);
                cid.setBackground(new java.awt.Color(38, 32, 132));
                cid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                cid.setForeground(new java.awt.Color(255, 255, 255));
                cid.setToolTipText("You can't edit it");
                cid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                getContentPane().add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 75, 264, 30));

                dob.setEditable(false);
                dob.setBackground(new java.awt.Color(38, 32, 132));
                dob.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                dob.setForeground(new java.awt.Color(255, 255, 255));
                dob.setToolTipText("You can't edit it");
                dob.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                getContentPane().add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 487, 210, 30));

                name.setEditable(false);
                name.setBackground(new java.awt.Color(38, 32, 132));
                name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                name.setForeground(new java.awt.Color(255, 255, 255));
                name.setToolTipText("You can't edit it");
                name.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 284, 30));

                band.setBackground(new java.awt.Color(38, 32, 132));
                band.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                band.setForeground(new java.awt.Color(255, 255, 255));
                band.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                getContentPane().add(band, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 285, 30));

                mob.setEditable(false);
                mob.setBackground(new java.awt.Color(38, 32, 132));
                mob.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                mob.setForeground(new java.awt.Color(255, 255, 255));
                mob.setToolTipText("You can't edit it");
                mob.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                getContentPane().add(mob, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 211, 275, 30));

                email.setEditable(false);
                email.setBackground(new java.awt.Color(38, 32, 132));
                email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                email.setForeground(new java.awt.Color(255, 255, 255));
                email.setToolTipText("You can't edit it");
                email.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 257, 405, 30));

                ip.setBackground(new java.awt.Color(38, 32, 132));
                ip.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                ip.setForeground(new java.awt.Color(255, 255, 255));
                ip.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                getContentPane().add(ip, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 303, 445, 30));

                status.setBackground(new java.awt.Color(38, 32, 132));
                status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Active", "Deactive" }));
                status.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 250, 30));

                type.setBackground(new java.awt.Color(38, 32, 132));
                type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Shared", "Dedicated" }));
                type.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 396, 310, 30));

                fname.setEditable(false);
                fname.setBackground(new java.awt.Color(38, 32, 132));
                fname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                fname.setForeground(new java.awt.Color(255, 255, 255));
                fname.setToolTipText("You can't edit it");
                fname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 166, 210, 30));

                jScrollPane1.setBackground(new java.awt.Color(94, 74, 118));
                jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

                clientTable.setBackground(new java.awt.Color(38, 32, 132));
                clientTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "CID", "Name", "Email", "Mobile"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                clientTable.setSelectionBackground(new java.awt.Color(94, 74, 118));
                clientTable.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                clientTableMouseClicked(evt);
                        }
                });
                clientTable.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                clientTableKeyReleased(evt);
                        }
                });
                jScrollPane1.setViewportView(clientTable);

                getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 80, 350, 260));

                search.setBackground(new java.awt.Color(59, 62, 136));
                search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                search.setToolTipText("Search by Client ID or Name");
                search.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                search.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                searchKeyReleased(evt);
                        }
                });
                getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 290, 40));

                address.setEditable(false);
                address.setBackground(new java.awt.Color(38, 32, 132));
                address.setColumns(20);
                address.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                address.setForeground(new java.awt.Color(255, 255, 255));
                address.setRows(3);
                address.setTabSize(4);
                address.setToolTipText("You can't edit it");
                address.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jScrollPane2.setViewportView(address);

                getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 250, 90));

                history.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                historyMouseClicked(evt);
                        }
                });
                getContentPane().add(history, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 480, 125, 35));

                msg.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                msgMouseClicked(evt);
                        }
                });
                getContentPane().add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 435, 130, 40));

                update.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                updateMouseClicked(evt);
                        }
                });
                getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 343, 130, 40));

                print2.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                print2MouseClicked(evt);
                        }
                });
                getContentPane().add(print2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 130, 30));

                delete.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                deleteMouseClicked(evt);
                        }
                });
                getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, 130, 40));

                buttonGroup1.add(active);
                active.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                active.setForeground(new java.awt.Color(51, 255, 51));
                active.setText("Active");
                active.setOpaque(false);
                active.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                activeActionPerformed(evt);
                        }
                });
                getContentPane().add(active, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, -1));

                buttonGroup1.add(deactive);
                deactive.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                deactive.setForeground(new java.awt.Color(255, 102, 102));
                deactive.setText("Deactive");
                deactive.setOpaque(false);
                deactive.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                deactiveActionPerformed(evt);
                        }
                });
                getContentPane().add(deactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, -1, -1));

                bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/client_trace_new.png"))); // NOI18N
                getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void moveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveMouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-mX, y-mY);
    }//GEN-LAST:event_moveMouseDragged

    private void moveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveMousePressed
        // TODO add your handling code here:
        mX=evt.getX();
        mY=evt.getY();
    }//GEN-LAST:event_moveMousePressed

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(Client_info.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void clientTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clientTableKeyReleased
    onclick();
    }//GEN-LAST:event_clientTableKeyReleased

    private void clientTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientTableMouseClicked
    onclick();
    }//GEN-LAST:event_clientTableMouseClicked

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
    work2();
    search();
    }//GEN-LAST:event_searchKeyReleased

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
    if(allValid()){
        String sql="Update clientinfo set bandwidth='"+BANDWIDTH+"', ip='"+IP+"', mac='"+MAC+
            "', status='"+(status.getSelectedItem()).toString()
                +"' where cid='"+CID+"'";
    
        try{
            
                connection();
                Statement st=null;
                st=con.createStatement();
                st.executeUpdate(sql);

            JOptionPane.showConfirmDialog(this,"Information is successfuly updated.","Confer message",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,new ImageIcon("thik_mark.png"));
            nill();
            work2();
            tb_update();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Errors : "+e);
        }
    }
    }//GEN-LAST:event_updateMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
    if(!(cid.getText().equalsIgnoreCase(""))){
        int conferm = JOptionPane.showConfirmDialog(this, "Are you sure Delete this Entry!");
        if (conferm == 0) {
            connection();
            String sql = "DELETE from clientinfo where cid= '" + cid.getText() + "'";
            try {
                PreparedStatement st = null;
                st = con.prepareStatement(sql);
                st.executeUpdate();
                nill();
                /* JOptionPane.showMessageDialog(null,"Network is connected...\n Press to go Recovery Password.",,new ImageIcon("thik_mark.png"));*/
                JOptionPane.showConfirmDialog(this, "Information is successfuly Deleted.", "Confermation message", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon("del.jpg"));
                work2();
                tb_update();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Errors: "+e);
            }
        }
    }
    else{
        JOptionPane.showMessageDialog(null, "Not found");
    }
    }//GEN-LAST:event_deleteMouseClicked

    private void msgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_msgMouseClicked
    if(EMAIL.equalsIgnoreCase("")){
        JOptionPane.showMessageDialog(null, "Email not found!!!");
    }
    else{
        SendMAIL_Client dialog = new SendMAIL_Client(new javax.swing.JFrame(), true,EMAIL);
        dialog.setVisible(true);
    }
    }//GEN-LAST:event_msgMouseClicked

    private void historyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyMouseClicked
    if(!(cid.getText().equalsIgnoreCase("")))
    {
        try {
            FileReadWrite.FileInput(CID, "files\\CID");
            history_client n=new history_client();
            n.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Client_info.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }else{
         JOptionPane.showMessageDialog(null, "Not found");
    }
    }//GEN-LAST:event_historyMouseClicked

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
    MessageFormat head=new MessageFormat(
            "**** LIST of Client information****"
    );
     MessageFormat foot=new MessageFormat("Page{0, number,integer}");
     try{
         clientTable.print(JTable.PrintMode.NORMAL, head, foot);
     }catch(java.awt.print.PrinterException e)
     {
         JOptionPane.showMessageDialog(null, "Errors:"+e);
     }
    }//GEN-LAST:event_printMouseClicked

    private void print2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_print2MouseClicked
//    String CID,
//            String NAME,String EMAIL,String MOBILE,String IP,String MAC,
//            String FNAME,String ADDRESS,String BAND,String TYPE,
//            String DOB,String Status,String IMG)
            if(cid.getText().trim().equalsIgnoreCase("")){
                    JOptionPane.showMessageDialog(null, "Not Found");
            }else{
                ClientDetailsView dialog = new ClientDetailsView(new javax.swing.JFrame(), true,cid.getText(),
            name.getText(),email.getText(),mob.getText(),ip.getText(),mac.getText(),
            fname.getText(),address.getText(),band.getText(),type.getSelectedItem().toString(),
            dob.getText(),status.getSelectedItem().toString(),"C:\\xampp\\htdocs\\cms_web\\image_uploads\\"+P_LOC);       
            dialog.setVisible(true);
            }
    }//GEN-LAST:event_print2MouseClicked

    private void viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseClicked
    if(P_LOC.equalsIgnoreCase("")){
        JOptionPane.showMessageDialog(null, "Not found");
    }
    else
    {
        ImageView dialog = new ImageView(new javax.swing.JFrame(), true,"C:\\xampp\\htdocs\\cms_web\\image_uploads\\"+P_LOC);
        dialog.setVisible(true);
    }
    }//GEN-LAST:event_viewMouseClicked

        private void deactiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deactiveActionPerformed
        work2();
        search();
        }//GEN-LAST:event_deactiveActionPerformed

        private void activeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activeActionPerformed
        work2();
        search();
        }//GEN-LAST:event_activeActionPerformed

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
            java.util.logging.Logger.getLogger(Client_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client_info().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JCheckBox active;
        private javax.swing.JTextArea address;
        private javax.swing.JTextField band;
        private javax.swing.JLabel bg;
        private javax.swing.ButtonGroup buttonGroup1;
        private javax.swing.JTextField cid;
        private javax.swing.JTable clientTable;
        private javax.swing.JCheckBox deactive;
        private javax.swing.JLabel delete;
        private javax.swing.JTextField dob;
        private javax.swing.JTextField email;
        private javax.swing.JLabel exit;
        private javax.swing.JTextField fname;
        private javax.swing.JLabel history;
        private javax.swing.JTextField ip;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JLabel lb_pic;
        private javax.swing.JTextField mac;
        private javax.swing.JLabel min;
        private javax.swing.JTextField mob;
        private javax.swing.JLabel move;
        private javax.swing.JLabel msg;
        private javax.swing.JTextField name;
        private javax.swing.JLabel print;
        private javax.swing.JLabel print2;
        private javax.swing.JTextField search;
        private javax.swing.JComboBox status;
        private javax.swing.JComboBox type;
        private javax.swing.JLabel update;
        private javax.swing.JLabel view;
        // End of variables declaration//GEN-END:variables
Connection con = null;
String NAME="",FNAME="",EMAIL="",MOBILE="",ADDRESS="",IP="",
        MAC="",DOB="",BANDWIDTH="",TYPE="",P_LOC="",CID="",STATUS;
    private void connection() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cms", "root", "");
        } catch (Exception ex) {

        }
    }
 private boolean allValid() {
        NAME=name.getText();
        FNAME=fname.getText();
        EMAIL=email.getText();
        MOBILE=mob.getText();
        ADDRESS=address.getText();
        IP=ip.getText();
        MAC=mac.getText();
        DOB=dob.getText();
        BANDWIDTH=band.getText();
        TYPE=type.getSelectedItem().toString();
        CID=cid.getText();
        STATUS=status.getSelectedItem().toString();
        if(CID.equalsIgnoreCase(""))
        {
            //alert.setText("* Email not Bandwidth !");
            JOptionPane.showMessageDialog(null, "Not fount");
            return false;
        }
        else if(BANDWIDTH.equalsIgnoreCase(""))
        {
            //alert.setText("* Email not Bandwidth !");
            JOptionPane.showMessageDialog(null, "Enter valid Bandwidth!");
            return false;
        }
        else if(IP.equalsIgnoreCase(""))
        {
            //alert.setText("* Mobile not valid!");
            JOptionPane.showMessageDialog(null, "Enter valid IP!");
            return false;
        }
        else if(MAC.equalsIgnoreCase(""))
        {
            //alert.setText("* Mobile not valid!");
            JOptionPane.showMessageDialog(null, "Enter valid MAC!");
            return false;
        }
        else{
          //  alert.setText("");
            return true;
        }
    }
    private void tb_update() {

        try {
            connection();
            model = (DefaultTableModel) clientTable.getModel();
            PreparedStatement st = null;
            String sql= "Select * from clientinfo" ;
            if(active.isSelected()){
                   sql= "Select * from clientinfo where status='Active'"; 
            }else if(deactive.isSelected()){
                    sql= "Select * from clientinfo where status='Deactive'";
            }
            st = con.prepareStatement(sql);
            ResultSet res = null;
            res = st.executeQuery();
            while (res.next()) {
                String a[] = {res.getString(1), res.getString(2), res.getString(5), res.getString(4)};
                model.insertRow(model.getRowCount(), a);
            }
        } catch (SQLException e) {
            System.out.print(e);
        }
    }

    private void search() {
        if (search.getText().trim().length() != 0) {
            try {
                connection();
                model = (DefaultTableModel) clientTable.getModel();
                PreparedStatement st = null;
                String sql = "Select * from clientinfo where name LIKE '%" +
                        search.getText() + "%' OR cid LIKE '%"+search.getText()+"%' ";
                if(active.isSelected()){
                   sql= "Select * from clientinfo where (name LIKE '%" +
                        search.getText() + "%' OR cid LIKE '%"+search.getText()+
                           "%') AND (status='Active')"; 
            }else if(deactive.isSelected()){
                    sql= "Select * from clientinfo where (name LIKE '%" +
                        search.getText() + "%' OR cid LIKE '%"+search.getText()+
                           "%') AND (status='Deactive')"; 
            }
                st = con.prepareStatement(sql);
                ResultSet res = null;
                res = st.executeQuery();
                while (res.next()) {
                    String a[] = {res.getString(1), res.getString(2), res.getString(5), res.getString(4)};
                model.insertRow(model.getRowCount(), a);
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Errors : "+e);
            }
        } else if (search.getText().equalsIgnoreCase("")) {
            work2();
            tb_update();
        }
    }

    public void work2() {
        model.setRowCount(0);
    }

    private void nill() {
        name.setText(null);
        email.setText(null);
        mob.setText(null);
        fname.setText(null);
        address.setText(null);
        ip.setText(null);
        mac.setText(null);
        cid.setText(null);
        type.setSelectedIndex(0);
        band.setText(null);
        dob.setText(null);
        status.setSelectedIndex(0);
        P_LOC="";
        CID="";
        lb_pic.setIcon(new javax.swing.ImageIcon(""));
    }
private void onclick() {
        try {
            int row=clientTable.getSelectedRow();
            CID=clientTable.getModel().getValueAt(row, 0).toString();
            
            String sql="Select * from clientinfo where cid='"+CID+"'";
            PreparedStatement st=null;
            ResultSet rs=null;
            connection();
            st=con.prepareStatement(sql);
            rs=st.executeQuery();
            if(rs.next())
            {
                //getData form table
                CID=rs.getString(1);
                NAME=rs.getString(2);
                FNAME=rs.getString(3);
                MOBILE=rs.getString(4);
                EMAIL=rs.getString(5);
                DOB=rs.getDate(6).toString();
                ADDRESS=rs.getString(7);
                TYPE=rs.getString(8);
                BANDWIDTH=rs.getString(9);
                IP=rs.getString(10);
                MAC=rs.getString(11);
                P_LOC=rs.getString(12);
                STATUS=rs.getString(13);
                
                //set data in jframe
                lb_pic.setIcon(new javax.swing.ImageIcon("C:\\xampp\\htdocs\\cms_web\\image_uploads\\"+P_LOC));
             //   cid.setToolTipText("Suggest Client ID: "+SL);
                cid.setText(CID);
                name.setText(NAME);
                email.setText(EMAIL);
                mob.setText(MOBILE);
                fname.setText(FNAME);
                address.setText(ADDRESS);
                band.setText(BANDWIDTH);
                ip.setText(IP);
                mac.setText(MAC);
                dob.setText(DOB);
                if(TYPE.equalsIgnoreCase("Dedicated")){
                    type.setSelectedIndex(1);
                }
                else{
                    type.setSelectedIndex(0);
                }
                if(STATUS.equalsIgnoreCase("Deactive")){
                    status.setSelectedIndex(1);
                }
                else{
                    status.setSelectedIndex(0);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cadd.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Errors : "+ex);
        }
               

    }
//end tag
}
