/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package matricproject;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public SignUp() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnSignUp = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtsurname = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        lblPass = new javax.swing.JTextField();
        lblPass2 = new javax.swing.JTextField();
        comboBoxGrade = new javax.swing.JComboBox<>();
        comboBoxHouse = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rbtnFemale = new javax.swing.JRadioButton();
        rbtnMale = new javax.swing.JRadioButton();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(930, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Grade:");
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 110, 20));

        jLabel2.setText("SIGN UP");
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 270, 100));

        jLabel3.setText("Name:");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 140, 20));

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 180, 27));

        btnSignUp.setText("SIGN UP");
        btnSignUp.setBackground(new java.awt.Color(255, 255, 254));
        btnSignUp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 160, -1));

        btnExit.setText("Back");
        btnExit.setBackground(new java.awt.Color(255, 255, 254));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 520, 100, -1));

        jLabel4.setText("Surname:");
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 150, 20));

        jLabel5.setText("Kingswood email:");
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 160, 20));

        jLabel6.setText("Password:");
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 110, 20));

        jLabel7.setText("Gender:");
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 130, 20));

        jLabel8.setText("Sport house:");
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 110, 20));

        txtsurname.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        getContentPane().add(txtsurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 180, 27));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 180, 27));

        lblPass.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblPass.setToolTipText("Password must contain at least 8 characters");
        getContentPane().add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 180, 27));

        lblPass2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        getContentPane().add(lblPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 180, 27));

        comboBoxGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "9", "10", "11", "12", "BY", "STAFF" }));
        comboBoxGrade.setBackground(new java.awt.Color(255, 255, 254));
        getContentPane().add(comboBoxGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 140, 22));

        comboBoxHouse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "wood", "chubb", "gane", "jagger" }));
        comboBoxHouse.setBackground(new java.awt.Color(255, 255, 254));
        getContentPane().add(comboBoxHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 140, 22));

        jLabel9.setText("Re-enter password:");
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 140, 20));

        jLabel10.setText("Date of birth:");
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 130, 20));

        rbtnFemale.setText("Female");
        rbtnFemale.setBackground(new java.awt.Color(255, 255, 254));
        rbtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFemaleActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 80, -1));

        rbtnMale.setText("Male");
        rbtnMale.setBackground(new java.awt.Color(255, 255, 254));
        rbtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMaleActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, -1, -1));

        datePicker1.setBackground(new java.awt.Color(255, 255, 254));
        datePicker1.setMaximumSize(new java.awt.Dimension(140, 21));
        getContentPane().add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, 20));

        jButton1.setText("Login");
        jButton1.setBackground(new java.awt.Color(255, 255, 254));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 465, 90, 20));

        jLabel13.setText("Already have an account?");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 140, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 530, 450));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matricproject/sport.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -10, 980, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        LandingPage br = new LandingPage();
        br.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void rbtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFemaleActionPerformed

        if (rbtnMale.isSelected()) {
            rbtnMale.setSelected(false);

        } else {
            rbtnFemale.setSelected(true);
        }
    }//GEN-LAST:event_rbtnFemaleActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        DataHandler dh = new DataHandler();

        String errorMessage = "";
        String error = "";
        if (txtName.getText().equalsIgnoreCase("")) {
            error += "Fill out name" + "\n";

        }if (txtsurname.getText().equalsIgnoreCase("")) {
            error += "Fill out surname" + "\n";

        } if (jTextField4.getText().equalsIgnoreCase("")) {
            error += "Fill out email" + "\n";

        } 
        if (lblPass.getText().equalsIgnoreCase("")) {
            error += "Fill out password" + "\n";

        } if (rbtnFemale.isSelected() == false && rbtnMale.isSelected() ==false) {
            error += "Select gender" + "\n";

        } if (datePicker1.getDate() == null) {
            error += "Select your date of birth" + "\n";

        }  if (comboBoxGrade.getSelectedItem() == null ) {
            error += "Select your grade" + "\n";

        } if (comboBoxHouse.getSelectedItem() == null ) {
            error += "Select your house" + "\n";

        } 
        
        
        if (error.isBlank() ==false) {
               JOptionPane.showMessageDialog(this, error, "Fill in all information", JOptionPane.ERROR_MESSAGE);

        }
        else {

            String username = txtName.getText();
            String surname = txtsurname.getText();
            String kcemail = jTextField4.getText();
            String password = lblPass.getText();
            boolean isfemale = true;
            if (rbtnFemale.isSelected()) {
                isfemale = true;
            } else {
                isfemale = false;
            }

            LocalDate dob = datePicker1.getDate();

            int grade = Integer.parseInt(comboBoxGrade.getSelectedItem().toString());
            String house = (String) comboBoxHouse.getSelectedItem();
            int balance = 100;
            boolean isadmin = false;
            User uu = new User(username, surname, kcemail, password, isfemale, dob, grade, house, balance, isadmin);

            if (dh.emailPresent(kcemail)) {
                errorMessage += "Email is already taken" + "\n";
            }
            if (dob.isAfter(LocalDate.now())) {
                errorMessage += "Date of birth is incorrect" + "\n";

            }
            if (lblPass.getText().equalsIgnoreCase(lblPass2.getText()) == false) {
                errorMessage += "Passwords do not match" + "\n";
            }
            if (lblPass.getText().length() < 8) {
                errorMessage += "Password must contain at least 8 characters" + "\n";
            }
            if (errorMessage.isEmpty()) {
                dh.insertNewUser(uu);

                Login log = new Login();
                log.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, errorMessage, "Connot sign you up", JOptionPane.ERROR_MESSAGE);

            }
        }


    }//GEN-LAST:event_btnSignUpActionPerformed

    private void rbtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMaleActionPerformed
        if (rbtnFemale.isSelected()) {
            rbtnFemale.setSelected(false);

        } else {
            rbtnMale.setSelected(true);
        }
    }//GEN-LAST:event_rbtnMaleActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JComboBox<String> comboBoxGrade;
    private javax.swing.JComboBox<String> comboBoxHouse;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField lblPass;
    private javax.swing.JTextField lblPass2;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtsurname;
    // End of variables declaration//GEN-END:variables
}
