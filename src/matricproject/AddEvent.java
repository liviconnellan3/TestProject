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
public class AddEvent extends javax.swing.JFrame {
private DataHandler dh;
    /**
     * Creates new form AddEvent
     */
    public AddEvent() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblSport = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboTeamA = new javax.swing.JComboBox<>();
        comboTeamB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        datePicker = new com.github.lgooddatepicker.components.DatePicker();
        comboSport = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSport.setText("Select Sport");
        lblSport.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jPanel1.add(lblSport, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 130, -1));

        jLabel1.setText("Team A");
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 130, -1));

        comboTeamA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chubb", "Gane", "Jagger", "Wood" }));
        comboTeamA.setBackground(new java.awt.Color(255, 255, 254));
        comboTeamA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(comboTeamA, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 90, -1));

        comboTeamB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chubb", "Gane", "Jagger", "Wood" }));
        comboTeamB.setBackground(new java.awt.Color(255, 255, 254));
        comboTeamB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(comboTeamB, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 90, -1));

        jLabel2.setText("Team B");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 140, -1));

        jButton1.setText("Add Event");
        jButton1.setBackground(new java.awt.Color(255, 255, 254));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 120, -1));
        jPanel1.add(datePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        comboSport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "hockey", "rugby", "netball", "waterpolo", "squash", "tennis", "cricket", "basketball" }));
        comboSport.setBackground(new java.awt.Color(255, 255, 254));
        comboSport.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(comboSport, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 90, -1));

        jLabel5.setText("Date Of Event");
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 150, 20));

        jButton2.setText("Back");
        jButton2.setBackground(new java.awt.Color(255, 255, 254));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 510, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        jLabel3.setText("Add Event");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 290, 70));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 470, 400));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matricproject/sport.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 980, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 550));

        setSize(new java.awt.Dimension(946, 558));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      DataHandler dh = new DataHandler();
      String error = "";
        if (comboTeamA.getSelectedItem() == comboTeamB.getSelectedItem()) {
            error += "Must select two different teams"+"\n";        
        }
        if (datePicker.getDate() == null) {
            error += "Must select date"+"\n";        
        }else{
         if (datePicker.getDate().isBefore(LocalDate.now())) {
            error += "Date must be in the future"+"\n";        
        }}
         
         if (error.isBlank() == false) {
             JOptionPane.showMessageDialog(this, error, "Connot add new event", JOptionPane.ERROR_MESSAGE);

        }else{
            String sport = comboSport.getSelectedItem() + "";
        String date1 = datePicker.getDateStringOrEmptyString();
        LocalDate date = LocalDate.parse(date1);
        String teamA = comboTeamA.getSelectedItem() + "";
        String teamB = comboTeamB.getSelectedItem() + "";
       
        Event e = new Event(sport, date, teamA, teamB);
        
        dh.insertEvent(e);
        JOptionPane.showMessageDialog(AddEvent.this, "New event has been sucessfully added");
       
               
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Admin br = new Admin();
        br.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AddEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboSport;
    private javax.swing.JComboBox<String> comboTeamA;
    private javax.swing.JComboBox<String> comboTeamB;
    private com.github.lgooddatepicker.components.DatePicker datePicker;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSport;
    // End of variables declaration//GEN-END:variables
}
