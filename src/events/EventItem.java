/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package events;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import matricproject.CurrentUser;
import matricproject.DataHandler;
import matricproject.Event;
import matricproject.User;

/**
 *
 * @author User
 */
public class EventItem extends javax.swing.JPanel {

    /**
     * @return the event
     */
    public boolean isShowing() {
        return showing;
    }

    /**
     * indicates is the menu is currently showing or not
     */
    public void setShowing(boolean showing) {
        this.showing = showing;
    }

    /**
     * Creates new form EventItem
     */
    //  private final ArrayList<EventItem> event = new ArrayList<>();
    private ActionListener act;

    public EventItem(Event e) {

        initComponents();
        
 panelCheck.setVisible(true);
        panelCheck.setEnabled(true);
        
        DataHandler dh = new DataHandler();
//        rbtn1.setText(e.getTeamA());
//        rbtn2.setText(e.getTeamB());
//
//        txtAmount.setEnabled(true);
//        txtAmount.setFocusable(true);
//        rbtn1.setEnabled(true);
//        rbtn1.setFocusable(true);
//        rbtn2.setEnabled(true);
//        rbtn2.setFocusable(true);
        lblTeams.setText(e.getTeamA() + " vs " + e.getTeamB());
        lblDate.setText(e.getDate() + "");
        lblTeamA.setText(e.getTeamA());
        lblTeamB.setText(e.getTeamB());
        e.setOddsA(dh.calculatingOddsA(e));
        e.setOddsB(dh.calculatingOddsB(e));
        e.setOddsDraw(dh.calculatingDraw(e));
        lblOddsA.setText(e.getOddsA() + "");
        lblOddsB.setText(e.getOddsB() + "");
        lblSport.setText(e.getSport());
        lblDraw.setText(e.getOddsDraw() + "");

//        this.setSize(new Dimension(Integer.MAX_VALUE, 100));
//        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));
//        this.setMinimumSize(new Dimension(Integer.MAX_VALUE, 100));
//        panelCheck.setVisible(false);
//        for (int i = 0; i < event.length; i++) {
//            this.event.add(event[i]);
//        }
//panelCheck.setVisible(true);
//panelCheck.setEnabled(true);
    }
//     private void customizeComboBox(String item) {
//        // Add custom items to the JComboBox
//        jComboBox1.addItem(item);
//        
//    }
//       public EventItem(String e,String u,  EventItem... event  ) {
//           
//        initComponents();
//        lblTeams.setText(e);
//        lblDate.setText(u);
//        
//       
//         this.setSize(new Dimension(Integer.MAX_VALUE, 85));
//        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 85));
//        this.setMinimumSize(new Dimension(Integer.MAX_VALUE, 85));
//        
//        for (int i = 0; i < event.length; i++) {
//            this.event.add(event[i]);
//        }
//    }
//        public EventItem(String e,String u,  ArrayList<EventItem> event  ) {
//           
//        initComponents();
//        lblTeams.setText(e);
//        lblDate.setText(u);
//        
//       
//         this.setSize(new Dimension(Integer.MAX_VALUE, 85));
//        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 85));
//        this.setMinimumSize(new Dimension(Integer.MAX_VALUE, 85));
//        
//        for (int i = 0; i < event.size(); i++) {
//            this.event.add(event.get(i));
//        }
//    }
//      public EventItem(String e,String u,  EventItem... event  ) {
//        initComponents();
//        lblTeams.setText(e);
//        lblDate.setText(u);
//        
//        
//        
//        
//         this.setSize(new Dimension(Integer.MAX_VALUE, 85));
//        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 85));
//        this.setMinimumSize(new Dimension(Integer.MAX_VALUE, 85));
//        
//         for (int i = 0; i < event.length; i++) {
//            this.event.add(event[i]);
//            event[i].setVisible(true);
//
//        }
//        
//    }
//    public EventItem(Event e, ActionListener act, EventItem... event ) {
//        initComponents();
//        lblTeams.setText(e.getTeamA() + "vs" + e.getTeamB());
//        lblDate.setText(""+e.getDate());
//        
//         DataHandler dh = new DataHandler();
//        lblTeamA.setText(e.getTeamA());
//        lblTeamB.setText(e.getTeamB());
//        
//        lblOddsA.setText(""+dh.calculatingOddsA(e));
//        lblOddsB.setText(""+dh.calculatingOddsB(e));
//        
//         if (act != null) {
//            this.act = act;
//        }
//        
//         this.setSize(new Dimension(Integer.MAX_VALUE, 85));
//        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 85));
//        this.setMinimumSize(new Dimension(Integer.MAX_VALUE, 85));
//        
//         for (int i = 0; i < event.length; i++) {
//            this.event.add(event[i]);
//            event[i].setVisible(false);
//
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        lblTeamA = new javax.swing.JLabel();
        lblOddsA = new javax.swing.JLabel();
        lblTeams = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTeamB = new javax.swing.JLabel();
        lblOddsB = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lblSport = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblDraw = new javax.swing.JLabel();
        panelCheck = new javax.swing.JPanel();
        btnYes = new javax.swing.JButton();
        btnNo = new javax.swing.JButton();
        txtAmount = new javax.swing.JTextField();
        rbtn1 = new javax.swing.JRadioButton();
        rbtn2 = new javax.swing.JRadioButton();
        comboAmount = new javax.swing.JComboBox<>();
        lblBet = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(925, 85));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        lblTeamA.setText("TeamA");

        lblOddsA.setText("Odds A");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblOddsA, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTeamA, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTeamA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblOddsA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTeams.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTeams.setText("TeamA vs TeamB");

        lblDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDate.setText("date and time of game");

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        lblTeamB.setText("TeamB");

        lblOddsB.setText("Odds B");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTeamB, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOddsB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTeamB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOddsB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblSport.setText("jLabel1");

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jLabel1.setText("Draw");

        lblDraw.setText("draw odds");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblDraw)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDraw, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelCheck.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelCheck.setFocusCycleRoot(true);
        panelCheck.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                panelCheckHierarchyChanged(evt);
            }
        });

        btnYes.setBackground(new java.awt.Color(153, 255, 153));
        btnYes.setText("Yes");
        btnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesActionPerformed(evt);
            }
        });

        btnNo.setBackground(new java.awt.Color(255, 102, 102));
        btnNo.setText("No");

        txtAmount.setText("amount");
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });

        rbtn1.setText("Team A");
        rbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn1ActionPerformed(evt);
            }
        });

        rbtn2.setText("Team B");
        rbtn2.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                rbtn2HierarchyChanged(evt);
            }
        });
        rbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn2ActionPerformed(evt);
            }
        });

        comboAmount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50" }));

        javax.swing.GroupLayout panelCheckLayout = new javax.swing.GroupLayout(panelCheck);
        panelCheck.setLayout(panelCheckLayout);
        panelCheckLayout.setHorizontalGroup(
            panelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCheckLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(btnYes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNo)
                .addGap(39, 39, 39))
            .addGroup(panelCheckLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCheckLayout.createSequentialGroup()
                        .addComponent(rbtn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtn2)
                        .addGap(63, 63, 63))
                    .addGroup(panelCheckLayout.createSequentialGroup()
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelCheckLayout.setVerticalGroup(
            panelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCheckLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn1)
                    .addComponent(rbtn2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCheckLayout.createSequentialGroup()
                        .addComponent(btnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCheckLayout.createSequentialGroup()
                        .addComponent(btnYes, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );

        lblBet.setText("jLabel2");

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addGap(175, 175, 175))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTeams, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSport, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(lblBet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addComponent(panelCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSport)
                        .addGap(0, 0, 0)
                        .addComponent(lblTeams)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblBet)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
private boolean showing = false;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
//        panelCheck.setVisible(false);
//        panelCheck.setEnabled(true);
//        rbtn1.setEnabled(true);
//        rbtn1.setFocusable(true);
//
//        getParent().repaint();
//        getParent().revalidate();
    }//GEN-LAST:event_formMousePressed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
//        panelCheck.setVisible(false);
//        panelCheck.setEnabled(true);
//        rbtn1.setEnabled(true);
//        rbtn1.setFocusable(true);
//        lblBet.setText("Place bet on " + lblTeamA.getText());
//        panelCheck.setVisible(true);
//        getParent().repaint();
//        getParent().revalidate();

    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
//        panelCheck.setVisible(false);
//        panelCheck.setEnabled(true);
//        rbtn1.setEnabled(true);
//        rbtn1.setFocusable(true);
//        lblBet.setText("Place bet on Draw");
//        panelCheck.setVisible(true);
//        getParent().repaint();
//        getParent().revalidate();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
//        lblBet.setText("Place bet on " + lblTeamB.getText());
//        panelCheck.setVisible(true);
//        panelCheck.setVisible(false);
//        panelCheck.setEnabled(true);
//        rbtn1.setEnabled(true);
//        rbtn1.setFocusable(true);
//        getParent().repaint();
//        getParent().revalidate();
    }//GEN-LAST:event_jPanel2MousePressed

    private void panelCheckHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_panelCheckHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_panelCheckHierarchyChanged

    private void btnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesActionPerformed
        DataHandler dh = new DataHandler();
        String dateString = lblDate.getText(); // Format: yyyy-MM-dd
        String teamSelected = "";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate date = LocalDate.parse(dateString, formatter);
        Event e = dh.searchEvent(lblTeamA.getText(), lblTeamA.getText(), lblTeamB.getText(), date);
        User cu = CurrentUser.getInstance().getCurrentUser(); //got code from chat gpt
        if (rbtn1.isSelected()) {
            teamSelected = rbtn1.getText();
        }
        if (rbtn2.isSelected()) {
            teamSelected = rbtn2.getText();
        }
        if (cu != null) {
            dh.placeBetFinal(cu, e, Double.parseDouble(txtAmount.getText()), teamSelected + ""
            );
        } else {
            JOptionPane.showMessageDialog(panelCheck, "not working");
        }

    }//GEN-LAST:event_btnYesActionPerformed

    private void rbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn2ActionPerformed
        if (rbtn1.isSelected()) {
            rbtn1.setSelected(false);
        }
        
        getParent().repaint();
        getParent().revalidate();
    }//GEN-LAST:event_rbtn2ActionPerformed

    private void rbtn2HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_rbtn2HierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn2HierarchyChanged

    private void rbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn1ActionPerformed
        if (rbtn2.isSelected()) {
            rbtn2.setSelected(false);
        }
//        rbtn1.setVisible(true);
        getParent().repaint();
        getParent().revalidate();
    }//GEN-LAST:event_rbtn1ActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        txtAmount.setEnabled(true);
txtAmount.setFocusable(true);
//jScrollPane1.repaint();
//jScrollPane1.revalidate();
        getParent().repaint();
        getParent().revalidate();
    }//GEN-LAST:event_txtAmountActionPerformed

//    private void showMenu() {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < event.size(); i++) {
//                    sleep();
//                    event.get(i).setVisible(true);
//                }
////                showing = true;
////                getParent().repaint();
////                getParent().revalidate();
//            }
//        }).start();
//    }
//
//    private void hideMenu() {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < event.size(); i++) {
//                    sleep();
//                    event.get(i).setVisible(true);
//                }
////                showing = true;
////                getParent().repaint();
////                getParent().revalidate();
//            }
//        }).start();
//    }
//
//    private void sleep() {
//        try {
//            Thread.sleep(20);
//        } catch (Exception e) {
//        }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnYes;
    private javax.swing.JComboBox<String> comboAmount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblBet;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDraw;
    private javax.swing.JLabel lblOddsA;
    private javax.swing.JLabel lblOddsB;
    private javax.swing.JLabel lblSport;
    private javax.swing.JLabel lblTeamA;
    private javax.swing.JLabel lblTeamB;
    private javax.swing.JLabel lblTeams;
    private javax.swing.JPanel panelCheck;
    private javax.swing.JRadioButton rbtn1;
    private javax.swing.JRadioButton rbtn2;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
