/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TechQuizApp.gui;

import TechQuizApp.Pojo.UserPojo;
import TechQuizApp.Pojo.UserProfile;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import techquizapp.dao.UserDAO;

/**
 *
 * @author PC
 */
public class RegisterStudentFrame extends javax.swing.JFrame {

    private String userid;
    private String password;
    
    public RegisterStudentFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Tech Quiz App");
        lblUserName.setText("Hello "+UserProfile.getUsername());
         lblRegisterStudent.setOpaque(true);
        lblRegisterStudent.setBackground(new Color(0,0,51));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblSetPaper = new javax.swing.JLabel();
        lblViewScore = new javax.swing.JLabel();
        lblEditPaper = new javax.swing.JLabel();
        lblRegisterStudent = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtRepassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        txtUserid = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        lblUserName.setBackground(new java.awt.Color(255, 255, 255));
        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserName.setText("Hello User");

        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        lblSetPaper.setBackground(new java.awt.Color(0, 0, 0));
        lblSetPaper.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSetPaper.setForeground(new java.awt.Color(255, 255, 255));
        lblSetPaper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSetPaper.setText("Set paper");
        lblSetPaper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSetPaperMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSetPaperMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSetPaperMouseExited(evt);
            }
        });

        lblViewScore.setBackground(new java.awt.Color(0, 0, 0));
        lblViewScore.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblViewScore.setForeground(new java.awt.Color(255, 255, 255));
        lblViewScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewScore.setText("View Score");
        lblViewScore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewScoreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblViewScoreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblViewScoreMouseExited(evt);
            }
        });

        lblEditPaper.setBackground(new java.awt.Color(0, 0, 0));
        lblEditPaper.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEditPaper.setForeground(new java.awt.Color(255, 255, 255));
        lblEditPaper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditPaper.setText("Edit Paper");
        lblEditPaper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditPaperMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEditPaperMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEditPaperMouseExited(evt);
            }
        });

        lblRegisterStudent.setBackground(new java.awt.Color(0, 0, 0));
        lblRegisterStudent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRegisterStudent.setForeground(new java.awt.Color(255, 255, 255));
        lblRegisterStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegisterStudent.setText("Register Student");
        lblRegisterStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterStudentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegisterStudentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegisterStudentMouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TechQuizApp/images/download (1).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblSetPaper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblViewScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblEditPaper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblRegisterStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSetPaper, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEditPaper, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lblRegisterStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblViewScore, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Register New Student");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("UserID");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Password");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Retype password");

        txtRepassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtUserid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnRegister.setBackground(new java.awt.Color(255, 255, 255));
        btnRegister.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 0, 153));
        btnRegister.setText("Register");
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegisterMouseExited(evt);
            }
        });
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(txtUserid, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                                    .addComponent(txtPassword)
                                    .addComponent(txtRepassword)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserid, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(txtRepassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        this.dispose();
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        lblLogout.setForeground(Color.white);
        Font f = new Font("Tahoma",Font.ITALIC,14);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        // TODO add your handling code here:
        lblLogout.setForeground(new Color(255,255,255));
        Font f = new Font("Tahoma",Font.BOLD,14);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void lblSetPaperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSetPaperMouseClicked
        SetPaperFrame spf = new SetPaperFrame();
        this.dispose();
        spf.setVisible(true);
    }//GEN-LAST:event_lblSetPaperMouseClicked

    private void lblSetPaperMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSetPaperMouseEntered
        lblSetPaper.setOpaque(true);
        lblSetPaper.setBackground(new Color(0,0,51));
    }//GEN-LAST:event_lblSetPaperMouseEntered

    private void lblSetPaperMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSetPaperMouseExited
        lblSetPaper.setOpaque(true);
        lblSetPaper.setBackground(new Color(0,0,102));
    }//GEN-LAST:event_lblSetPaperMouseExited

    private void lblViewScoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewScoreMouseClicked
        ViewScoresFrame vsf = new ViewScoresFrame();
        this.dispose();
        vsf.setVisible(true);
    }//GEN-LAST:event_lblViewScoreMouseClicked

    private void lblViewScoreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewScoreMouseEntered
        lblViewScore.setOpaque(true);
        lblViewScore.setBackground(new Color(0,0,51));
    }//GEN-LAST:event_lblViewScoreMouseEntered

    private void lblViewScoreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewScoreMouseExited
        lblViewScore.setOpaque(true);
        lblViewScore.setBackground(new Color(0,0,102));
    }//GEN-LAST:event_lblViewScoreMouseExited

    private void lblEditPaperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditPaperMouseClicked
        EditPaperFrame epf = new EditPaperFrame();
        this.dispose();
        epf.setVisible(true);
    }//GEN-LAST:event_lblEditPaperMouseClicked

    private void lblEditPaperMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditPaperMouseEntered
        lblEditPaper.setOpaque(true);
        lblEditPaper.setBackground(new Color(0,0,51));
    }//GEN-LAST:event_lblEditPaperMouseEntered

    private void lblEditPaperMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditPaperMouseExited
        lblEditPaper.setOpaque(true);
        lblEditPaper.setBackground(new Color(0,0,102));
    }//GEN-LAST:event_lblEditPaperMouseExited

    private void lblRegisterStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterStudentMouseClicked
        RegisterStudentFrame rsf = new RegisterStudentFrame();
        this.dispose();
        rsf.setVisible(true);
    }//GEN-LAST:event_lblRegisterStudentMouseClicked

    private void lblRegisterStudentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterStudentMouseEntered
       
    }//GEN-LAST:event_lblRegisterStudentMouseEntered

    private void lblRegisterStudentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterStudentMouseExited
       
    }//GEN-LAST:event_lblRegisterStudentMouseExited

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        int x = validateInputs();
        if(x == 0)
        JOptionPane.showMessageDialog(null,"UserNamer or password cannot be left blank","Error !",JOptionPane.ERROR_MESSAGE);
        else if (x == -1)
        JOptionPane.showMessageDialog(null,"UserID or Password Must be 4 Character Long","Information",JOptionPane.INFORMATION_MESSAGE);
        else if (x == -2)
        JOptionPane.showMessageDialog(null,"Password and retype Password not match","Error",JOptionPane.ERROR_MESSAGE);
        else if(x == 1)
        {
            try{
                UserPojo obj = new UserPojo(userid,password,"student");
                boolean status = UserDAO.addUser(obj);
                if(status == true){
                    JOptionPane.showMessageDialog(null, "Registration Successfully Done");
                    clearAll();
                }
                else
                JOptionPane.showMessageDialog(null,"UserID already present","Registration Denied!",JOptionPane.ERROR_MESSAGE);
            }
            catch(SQLException sq)
            {
                JOptionPane.showMessageDialog(null, "Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE);
                sq.printStackTrace();
            }

        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseEntered
        btnRegister.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_btnRegisterMouseEntered

    private void btnRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseExited
        btnRegister.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnRegisterMouseExited

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
            java.util.logging.Logger.getLogger(RegisterStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterStudentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblEditPaper;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblRegisterStudent;
    private javax.swing.JLabel lblSetPaper;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblViewScore;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRepassword;
    private javax.swing.JTextField txtUserid;
    // End of variables declaration//GEN-END:variables
     private int validateInputs()
    {
        userid = txtUserid.getText().trim();
        char []pass =  txtPassword.getPassword();
        char []repass = txtRepassword.getPassword();
        
        if(userid.isEmpty() || pass.length == 0 || repass.length == 0)
            return 0;
        else
        {
            password = String.valueOf(pass);
            String reTypePassword = String.valueOf(repass);
            if(password.length()<4 || userid.length()<4)
                return -1;
            if(password.equals(reTypePassword)==false)
                return -2;
            return 1;
        }
        
    }
    public void clearAll()
    {
        txtUserid.setText("");
        txtPassword.setText("");
        txtRepassword.setText("");
    }
}