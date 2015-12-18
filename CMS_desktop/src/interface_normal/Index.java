package interface_normal;


import all_classes.FileReadWrite;
import all_classes.fileOpen;
import interface_input.BUpdate;
import interface_input.Bills_m;
import interface_input.Cadd;
import interface_input.ChangePass;
import interface_input.Client_add_manual;
import interface_input.Login;
import interface_input.MessageB;
import interface_input.Register;
import interface_input.solution;
import interface_output.Admin;
import interface_output.Bhistory;
import interface_output.Bills_history;
import interface_output.Calculations;
import interface_output.Client_info;
import interface_output.Pending_bills;
import interface_output.Problems_Area;
import interface_output.Problems_history;
import interface_output.profile;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author user
 */
public class Index extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    int mX,mY;
    String Email=null;
    public Index() {
        initComponents();    
        ImageIcon img=new ImageIcon("img\\cms.png");
        this.setIconImage(img.getImage());
//        background_pic p=new background_pic();
//        p.start();
        userAccept.setEnabled(false);
        billsC.setEnabled(false);
        try {
            Email=FileReadWrite.FileOutput("files//name");
            //System.out.print(Email);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(Email.equalsIgnoreCase("admin"))
        {
            //System.out.print("admin");
            userAccept.setEnabled(true);
            billsC.setEnabled(true);
        }else{
           // System.out.print("not admin");
            userAccept.setEnabled(false);
            billsC.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                desktop = new javax.swing.JDesktopPane();
                jLabel2 = new javax.swing.JLabel();
                logo = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                gp = new javax.swing.JLabel();
                bg_lab = new javax.swing.JLabel();
                menuBar = new javax.swing.JMenuBar();
                fileMenu = new javax.swing.JMenu();
                min = new javax.swing.JMenuItem();
                restart = new javax.swing.JMenuItem();
                exitMenuItem = new javax.swing.JMenuItem();
                fileMenu1 = new javax.swing.JMenu();
                profile = new javax.swing.JMenuItem();
                Cadd = new javax.swing.JMenuItem();
                userAccept = new javax.swing.JMenuItem();
                changepass = new javax.swing.JMenuItem();
                logout = new javax.swing.JMenuItem();
                editMenu1 = new javax.swing.JMenu();
                billadd = new javax.swing.JMenuItem();
                pbill = new javax.swing.JMenuItem();
                billhistory = new javax.swing.JMenuItem();
                billsC = new javax.swing.JMenuItem();
                editMenu = new javax.swing.JMenu();
                c_add = new javax.swing.JMenuItem();
                c_info1 = new javax.swing.JMenuItem();
                c_info = new javax.swing.JMenuItem();
                helpMenu1 = new javax.swing.JMenu();
                update = new javax.swing.JMenuItem();
                Ban_history = new javax.swing.JMenuItem();
                helpMenu2 = new javax.swing.JMenu();
                contentMenuItem2 = new javax.swing.JMenuItem();
                solution = new javax.swing.JMenuItem();
                Problems_history = new javax.swing.JMenuItem();
                contentMenuItem4 = new javax.swing.JMenuItem();
                helpMenu = new javax.swing.JMenu();
                contentMenuItem = new javax.swing.JMenuItem();
                aboutMenuItem = new javax.swing.JMenuItem();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Client management system");
                setUndecorated(true);

                jLabel2.setFont(new java.awt.Font("Elephant", 1, 36)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(51, 255, 51));
                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setText("Client Management System of \"FutureNet\"");
                desktop.add(jLabel2);
                jLabel2.setBounds(0, 80, 870, 50);

                logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
                desktop.add(logo);
                logo.setBounds(0, 0, 450, 100);

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CMSB.png"))); // NOI18N
                desktop.add(jLabel1);
                jLabel1.setBounds(200, 130, 530, 380);

                gp.setBackground(new java.awt.Color(204, 204, 204));
                gp.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
                gp.setForeground(new java.awt.Color(153, 153, 153));
                gp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                gp.setText("Powered by nullPointerException");
                desktop.add(gp);
                gp.setBounds(420, 510, 440, 40);

                bg_lab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mainbody.png"))); // NOI18N
                bg_lab.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                        public void mouseDragged(java.awt.event.MouseEvent evt) {
                                bg_labMouseDragged(evt);
                        }
                });
                bg_lab.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mousePressed(java.awt.event.MouseEvent evt) {
                                bg_labMousePressed(evt);
                        }
                });
                desktop.add(bg_lab);
                bg_lab.setBounds(0, 0, 870, 550);

                menuBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                        public void mouseDragged(java.awt.event.MouseEvent evt) {
                                menuBarMouseDragged(evt);
                        }
                });
                menuBar.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mousePressed(java.awt.event.MouseEvent evt) {
                                menuBarMousePressed(evt);
                        }
                });

                fileMenu.setMnemonic('f');
                fileMenu.setText("File");

                min.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
                min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minus.png"))); // NOI18N
                min.setMnemonic('x');
                min.setText("Minimize");
                min.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                minActionPerformed(evt);
                        }
                });
                fileMenu.add(min);

                restart.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
                restart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reload.png"))); // NOI18N
                restart.setMnemonic('a');
                restart.setText("Restart");
                restart.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                restartActionPerformed(evt);
                        }
                });
                fileMenu.add(restart);

                exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
                exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
                exitMenuItem.setMnemonic('x');
                exitMenuItem.setText("Exit");
                exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                exitMenuItemActionPerformed(evt);
                        }
                });
                fileMenu.add(exitMenuItem);

                menuBar.add(fileMenu);

                fileMenu1.setMnemonic('f');
                fileMenu1.setText("User");

                profile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, 0));
                profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/author.png"))); // NOI18N
                profile.setMnemonic('a');
                profile.setText("Profile");
                profile.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                profileActionPerformed(evt);
                        }
                });
                fileMenu1.add(profile);

                Cadd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, 0));
                Cadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signup.png"))); // NOI18N
                Cadd.setMnemonic('x');
                Cadd.setText("Add");
                Cadd.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                CaddActionPerformed(evt);
                        }
                });
                fileMenu1.add(Cadd);

                userAccept.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
                userAccept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
                userAccept.setMnemonic('a');
                userAccept.setText("Accept request");
                userAccept.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                userAcceptActionPerformed(evt);
                        }
                });
                fileMenu1.add(userAccept);

                changepass.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, 0));
                changepass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pass.png"))); // NOI18N
                changepass.setMnemonic('x');
                changepass.setText("Change password");
                changepass.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                changepassActionPerformed(evt);
                        }
                });
                fileMenu1.add(changepass);

                logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
                logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signout.png"))); // NOI18N
                logout.setMnemonic('a');
                logout.setText("Log out");
                logout.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                logoutActionPerformed(evt);
                        }
                });
                fileMenu1.add(logout);

                menuBar.add(fileMenu1);

                editMenu1.setMnemonic('e');
                editMenu1.setText("Bills");

                billadd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, 0));
                billadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus.gif"))); // NOI18N
                billadd.setMnemonic('t');
                billadd.setText("Add manual");
                billadd.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                billaddActionPerformed(evt);
                        }
                });
                editMenu1.add(billadd);

                pbill.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK));
                pbill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pending.png"))); // NOI18N
                pbill.setMnemonic('y');
                pbill.setText("Pending bills");
                pbill.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                pbillActionPerformed(evt);
                        }
                });
                editMenu1.add(pbill);

                billhistory.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
                billhistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/h.png"))); // NOI18N
                billhistory.setMnemonic('p');
                billhistory.setText("History");
                billhistory.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                billhistoryActionPerformed(evt);
                        }
                });
                editMenu1.add(billhistory);

                billsC.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
                billsC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calculator.png"))); // NOI18N
                billsC.setMnemonic('p');
                billsC.setText("Bill Calculation");
                billsC.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                billsCActionPerformed(evt);
                        }
                });
                editMenu1.add(billsC);

                menuBar.add(editMenu1);

                editMenu.setMnemonic('e');
                editMenu.setText("Client");

                c_add.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
                c_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signup.png"))); // NOI18N
                c_add.setMnemonic('t');
                c_add.setText("Add manual");
                c_add.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                c_addActionPerformed(evt);
                        }
                });
                editMenu.add(c_add);

                c_info1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
                c_info1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pending.png"))); // NOI18N
                c_info1.setMnemonic('p');
                c_info1.setText("Pending request");
                c_info1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                c_info1ActionPerformed(evt);
                        }
                });
                editMenu.add(c_info1);

                c_info.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
                c_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
                c_info.setMnemonic('p');
                c_info.setText("Client Details");
                c_info.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                c_infoActionPerformed(evt);
                        }
                });
                editMenu.add(c_info);

                menuBar.add(editMenu);

                helpMenu1.setMnemonic('h');
                helpMenu1.setText("Bandwidth");

                update.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
                update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.gif"))); // NOI18N
                update.setMnemonic('c');
                update.setText("Update");
                update.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                updateActionPerformed(evt);
                        }
                });
                helpMenu1.add(update);

                Ban_history.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK));
                Ban_history.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/h.png"))); // NOI18N
                Ban_history.setMnemonic('a');
                Ban_history.setText("History");
                Ban_history.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Ban_historyActionPerformed(evt);
                        }
                });
                helpMenu1.add(Ban_history);

                menuBar.add(helpMenu1);

                helpMenu2.setMnemonic('h');
                helpMenu2.setText("Message");

                contentMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
                contentMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/problems.png"))); // NOI18N
                contentMenuItem2.setMnemonic('c');
                contentMenuItem2.setText("Problems");
                contentMenuItem2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                contentMenuItem2ActionPerformed(evt);
                        }
                });
                helpMenu2.add(contentMenuItem2);

                solution.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
                solution.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coment.png"))); // NOI18N
                solution.setMnemonic('c');
                solution.setText("Solutions");
                solution.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                solutionActionPerformed(evt);
                        }
                });
                helpMenu2.add(solution);

                Problems_history.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
                Problems_history.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/h.png"))); // NOI18N
                Problems_history.setMnemonic('a');
                Problems_history.setText("History");
                Problems_history.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Problems_historyActionPerformed(evt);
                        }
                });
                helpMenu2.add(Problems_history);

                contentMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
                contentMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mail_16.png"))); // NOI18N
                contentMenuItem4.setMnemonic('c');
                contentMenuItem4.setText("Message Broadcast");
                contentMenuItem4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                contentMenuItem4ActionPerformed(evt);
                        }
                });
                helpMenu2.add(contentMenuItem4);

                menuBar.add(helpMenu2);

                helpMenu.setMnemonic('h');
                helpMenu.setText("Help");

                contentMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
                contentMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/file.png"))); // NOI18N
                contentMenuItem.setMnemonic('c');
                contentMenuItem.setText("Read me");
                contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                contentMenuItemActionPerformed(evt);
                        }
                });
                helpMenu.add(contentMenuItem);

                aboutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
                aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info.gif"))); // NOI18N
                aboutMenuItem.setMnemonic('a');
                aboutMenuItem.setText("About");
                aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                aboutMenuItemActionPerformed(evt);
                        }
                });
                helpMenu.add(aboutMenuItem);

                menuBar.add(helpMenu);

                setJMenuBar(menuBar);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void bg_labMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bg_labMouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-mX, y-mY);
    }//GEN-LAST:event_bg_labMouseDragged

    private void bg_labMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bg_labMousePressed
        // TODO add your handling code here:
        mX=evt.getX();
        mY=evt.getY();
    }//GEN-LAST:event_bg_labMousePressed

    private void minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minActionPerformed
        // TODO add your handling code here:
        this.setExtendedState(Index.ICONIFIED);
    }//GEN-LAST:event_minActionPerformed

    private void menuBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarMouseDragged
     int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-mX, y-mY);
    }//GEN-LAST:event_menuBarMouseDragged

    private void menuBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarMousePressed
        // TODO add your handling code here:
         mX=evt.getX();
        mY=evt.getY();
    }//GEN-LAST:event_menuBarMousePressed

    private void CaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaddActionPerformed
        // TODO add your handling code here:
        new Register().setVisible(true);
    }//GEN-LAST:event_CaddActionPerformed

    private void changepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepassActionPerformed
        // TODO add your handling code here:
       new ChangePass().setVisible(true);
    }//GEN-LAST:event_changepassActionPerformed

    private void contentMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItem2ActionPerformed
        Problems_Area ar=new Problems_Area();
        ar.setVisible(true);
    }//GEN-LAST:event_contentMenuItem2ActionPerformed

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
     this.dispose();
     Index n=new Index();
     n.setVisible(true);
    }//GEN-LAST:event_restartActionPerformed

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed
        // TODO add your handling code here:
        new profile().setVisible(true);
    }//GEN-LAST:event_profileActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        // TODO add your handling code here:
        new about_us().setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
        fileOpen.checker("files//Read me.pdf");
    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void solutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solutionActionPerformed
        // TODO add your handling code here:
        new solution().setVisible(true);
    }//GEN-LAST:event_solutionActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        new BUpdate().setVisible(true);
    }//GEN-LAST:event_updateActionPerformed

    private void userAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAcceptActionPerformed
        // TODO add your handling code here:
        new Admin().setVisible(true);
    }//GEN-LAST:event_userAcceptActionPerformed

    private void c_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_addActionPerformed
        // TODO add your handling code here:
        new Client_add_manual().setVisible(true);
    }//GEN-LAST:event_c_addActionPerformed

    private void c_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_infoActionPerformed
        // TODO add your handling code here:
        new Client_info().setVisible(true);
    }//GEN-LAST:event_c_infoActionPerformed

    private void billaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billaddActionPerformed
        // TODO add your handling code here:
        new Bills_m().setVisible(true);
    }//GEN-LAST:event_billaddActionPerformed

    private void pbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbillActionPerformed
        // TODO add your handling code here:
        new Pending_bills().setVisible(true);
    }//GEN-LAST:event_pbillActionPerformed

    private void billhistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billhistoryActionPerformed
        // TODO add your handling code here:
        new Bills_history().setVisible(true);
    }//GEN-LAST:event_billhistoryActionPerformed

    private void Ban_historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ban_historyActionPerformed
        // TODO add your handling code here:
        new Bhistory().setVisible(true);
    }//GEN-LAST:event_Ban_historyActionPerformed

    private void Problems_historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Problems_historyActionPerformed
        // TODO add your handling code here:
         new Problems_history().setVisible(true);
    }//GEN-LAST:event_Problems_historyActionPerformed

    private void c_info1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_info1ActionPerformed
    new Cadd().setVisible(true);
    }//GEN-LAST:event_c_info1ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
     this.dispose();
     new Login().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void billsCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billsCActionPerformed
     Calculations n=new Calculations();
     n.setVisible(true);
    }//GEN-LAST:event_billsCActionPerformed

    private void contentMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItem4ActionPerformed
        MessageB n=new MessageB();
        n.setVisible(true);
    }//GEN-LAST:event_contentMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                Index n=new Index();
                n.setVisible(true);

            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JMenuItem Ban_history;
        private javax.swing.JMenuItem Cadd;
        private javax.swing.JMenuItem Problems_history;
        private javax.swing.JMenuItem aboutMenuItem;
        private javax.swing.JLabel bg_lab;
        private javax.swing.JMenuItem billadd;
        private javax.swing.JMenuItem billhistory;
        private javax.swing.JMenuItem billsC;
        private javax.swing.JMenuItem c_add;
        private javax.swing.JMenuItem c_info;
        private javax.swing.JMenuItem c_info1;
        private javax.swing.JMenuItem changepass;
        private javax.swing.JMenuItem contentMenuItem;
        private javax.swing.JMenuItem contentMenuItem2;
        private javax.swing.JMenuItem contentMenuItem4;
        private javax.swing.JDesktopPane desktop;
        private javax.swing.JMenu editMenu;
        private javax.swing.JMenu editMenu1;
        private javax.swing.JMenuItem exitMenuItem;
        private javax.swing.JMenu fileMenu;
        private javax.swing.JMenu fileMenu1;
        private javax.swing.JLabel gp;
        private javax.swing.JMenu helpMenu;
        private javax.swing.JMenu helpMenu1;
        private javax.swing.JMenu helpMenu2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel logo;
        private javax.swing.JMenuItem logout;
        private javax.swing.JMenuBar menuBar;
        private javax.swing.JMenuItem min;
        private javax.swing.JMenuItem pbill;
        private javax.swing.JMenuItem profile;
        private javax.swing.JMenuItem restart;
        private javax.swing.JMenuItem solution;
        private javax.swing.JMenuItem update;
        private javax.swing.JMenuItem userAccept;
        // End of variables declaration//GEN-END:variables
int flag_max=1;
    class background_pic extends Thread{
      
      public void run(){
        while(true)
        {
           bg_lab.setBounds(0, 0, desktop.getWidth(), desktop.getHeight());
        }
    }  
    }
}