/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package menuBody;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import matricproject.Betslip;
import matricproject.CurrentUser;
import matricproject.DataHandler;
import matricproject.Event;
import matricproject.User;

/**
 *
 * @author User
 */
public class History extends javax.swing.JPanel {
 private ArrayList<Betslip> bets;
  private int selected;
    /**
     * Creates new form History
     */
    public History() {
        initComponents();
        refreshUI();
    }

    public void populateTable(){
        User cu = CurrentUser.getInstance().getCurrentUser();
    DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        DataHandler dh = new DataHandler();
        bets = dh.getUserBetslip(cu);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        for (Betslip bets : dh.searchAllBetsForEventID(9)) {
        tableModel.addRow(new Object[]{bets.getBetid(), 
                dh.searchEventID(bets.getEventid()).getTeamA() + " vs " + dh.searchEventID(bets.getEventid()).getTeamB()
, dh.searchEventID(bets.getEventid()).getSport(),
                (dh.searchEventID(bets.getEventid()).getDate()).format(formatter),
                bets.getChosenteam() + " " +dh.getOddsOfBet(dh.searchEventID(bets.getEventid()), bets),bets.getAmount(),
                dh.returnAmount(dh.searchEventID(bets.getEventid()), bets),
                   betWon(bets)
            });
        }
//        for (Betslip bets : dh.getUserBetslip(cu)) {
//            tableModel.addRow(new Object[]{bets.getBetid(), 
//                dh.searchEventID(bets.getEventid()).getTeamA() + " vs " + dh.searchEventID(bets.getEventid()).getTeamB()
//, dh.searchEventID(bets.getEventid()).getSport(),
//                (dh.searchEventID(bets.getEventid()).getDate()).format(formatter),
//                bets.getChosenteam() + " " +dh.getOddsOfBet(dh.searchEventID(bets.getEventid()), bets),bets.getAmount(),
//                dh.returnAmount(dh.searchEventID(bets.getEventid()), bets),
//                   betWon(bets)
//            });
  //  }
    }
    private String betWon(Betslip b){
         
        if (b.isWon() == null) {
            return null;
        } if (b.isWon() == false) {
            return "LOST";
        }else{
        return "WON";
        }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event ID", "Event", "Sport", "Date", "Betted On", "Bet Amount", "Return", "Won"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 204));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
