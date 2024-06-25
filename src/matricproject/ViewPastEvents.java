/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package matricproject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class ViewPastEvents extends javax.swing.JFrame {

    /**
     * Creates new form ViewPastEvents
     */
    public ViewPastEvents() {
        initComponents();
        refreshUI();
    }

    public void populateTable() {
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        DataHandler dh = new DataHandler();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (Event event : dh.getAllPastEvents()) {
          
            tableModel.addRow(new Object[]{event.getEventid(), event.getSport(), event.getDate().format(formatter), event.getTeamA(), event.getTeamB(),
                event.getOddsA(), event.getOddsB(), event.getOddsDraw(), dh.getWinnerEvent(event.getEventid())});
        }

//code from ChatGPT
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = jTable1.getSelectedRow();
                    if (selectedRow != -1) { // If a row is actually selected
                        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();

                        // Assuming your label is lblSelectedInfo
                        String TA = tableModel.getValueAt(selectedRow, 3) + "";

                        rbtnTeamA.setText(TA);
                        String TB = tableModel.getValueAt(selectedRow, 4) + "";

                        rbtnTeamB.setText(TB);
                    }
                }
            }
        });
    }

    private void refreshUI() {
//      jTable1.removeAll();

        this.populateTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        rbtnTeamA = new javax.swing.JRadioButton();
        rbtnTeamB = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        rbtnDraw = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event ID", "Sport", "Date", "Team A", "Team B", "Odds Team A", "Odds Team B", "Odds Draw", "Winner"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 730, 300));

        rbtnTeamA.setText("Team A");
        rbtnTeamA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTeamAActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnTeamA, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 70, -1));

        rbtnTeamB.setText("Team B");
        rbtnTeamB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTeamBActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnTeamB, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 80, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 254));
        jButton1.setText("Update Winner");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 458, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 254));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(844, 521, 80, -1));

        rbtnDraw.setText("Draw");
        rbtnDraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDrawActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnDraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 65, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        jLabel3.setText("Past Events");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 320, 60));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 800, 460));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matricproject/sport.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 980, 550));

        setSize(new java.awt.Dimension(946, 558));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        DataHandler dh = new DataHandler();
        int selectedRow = jTable1.getSelectedRow();

        String error = "";
        if (rbtnTeamA.isSelected() == false && rbtnTeamB.isSelected() == false && rbtnDraw.isSelected() == false) {
            error += "Must select a winner" + "\n";
        }
        if (selectedRow == -1) {
            error += "Must select an event";
        }

        if (error.isBlank() == false) {
            JOptionPane.showMessageDialog(this, error, "Connot update winner", JOptionPane.ERROR_MESSAGE);

        } else {
            int eventID = (int) tableModel.getValueAt(selectedRow, 0);
            String sport = "" + tableModel.getValueAt(selectedRow, 1);
            String date1 = tableModel.getValueAt(selectedRow, 2) + "";
            LocalDate date = LocalDate.parse(date1);
            String TA = "" + tableModel.getValueAt(selectedRow, 3);
            String TB = "" + tableModel.getValueAt(selectedRow, 4);
            Event ee = new Event(eventID, sport, date, TA, TB);

             
           String win = dh.getWinnerEvent(ee.getEventid());
            if (win != null) {
                JOptionPane.showMessageDialog(this, "Winner has already been selected", "Connot update winner", JOptionPane.ERROR_MESSAGE);

            } else {
                if (rbtnTeamA.isSelected()) {
                    dh.updateBetslips(ee, TA);
                   dh.updateAllBalances(ee, TA);
                    dh.updateWinsLossesDraws(ee, TA);

                }
                if (rbtnTeamB.isSelected()) {
                    dh.updateBetslips(ee, TB);

                    dh.updateAllBalances(ee, TB);
                    dh.updateWinsLossesDraws(ee, TB);
                }
                if (rbtnDraw.isSelected()) {
                    dh.updateBetslips(ee, "draw");

                    dh.updateAllBalances(ee, "draw");
                    dh.updateWinsLossesDraws(ee, "draw");
                }
//         tableModel.setValueAt(ee.getWinner(), selectedRow, 8);
                refreshUI();
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void rbtnTeamAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTeamAActionPerformed
        if (rbtnTeamB.isSelected() || rbtnDraw.isSelected()) {
            rbtnTeamB.setSelected(false);
            rbtnDraw.setSelected(false);
        }
//        rbtn1.setVisible(true);

    }//GEN-LAST:event_rbtnTeamAActionPerformed

    private void rbtnTeamBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTeamBActionPerformed
        if (rbtnTeamA.isSelected() || rbtnDraw.isSelected()) {
            rbtnTeamA.setSelected(false);
            rbtnDraw.setSelected(false);
        }
//        rbtn1.setVisible(true);

    }//GEN-LAST:event_rbtnTeamBActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Admin br = new Admin();
        br.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rbtnDrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDrawActionPerformed
        if (rbtnTeamA.isSelected() || rbtnTeamB.isSelected()) {
            rbtnTeamB.setSelected(false);
            rbtnTeamA.setSelected(false);
        }
    }//GEN-LAST:event_rbtnDrawActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPastEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPastEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPastEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPastEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPastEvents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbtnDraw;
    private javax.swing.JRadioButton rbtnTeamA;
    private javax.swing.JRadioButton rbtnTeamB;
    // End of variables declaration//GEN-END:variables
}
