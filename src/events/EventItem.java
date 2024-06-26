/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package events;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import matricproject.CurrentUser;
import matricproject.DataHandler;
import matricproject.Event;
import matricproject.User;
import matricproject.MainPage;


/**
 *
 * @author User
 */
public class EventItem extends javax.swing.JPanel {

   private MainPage mainPage;
    /**
     * Creates new form EventItem
     */
    //  private final ArrayList<EventItem> event = new ArrayList<>();
    private ActionListener act;

    public EventItem(Event e, MainPage mainPage) {

        initComponents();
       this.mainPage = mainPage;

        
        DataHandler dh = new DataHandler();
        
        lblTeams.setText(e.getTeamA() + " vs " + e.getTeamB());
        lblDate.setText(e.getDate() + "");
        lblTeamA.setText(e.getTeamA());
        lblTeamB.setText(e.getTeamB());
//        e.setOddsA(dh.calculatingOddsA(e));
//        e.setOddsB(dh.calculatingOddsB(e));
//        e.setOddsDraw(dh.calculatingDraw(e));
        lblOddsA.setText(e.getOddsA() + "");
        lblOddsB.setText(e.getOddsB() + "");
        lblSport.setText(e.getSport());
        lblDraw.setText(e.getOddsDraw() + "");

        setColourA(lblTeamA.getText());
        setColourB(lblTeamB.getText());
        
        this.setSize(new Dimension(590, 100));
        this.setMaximumSize(new Dimension(590, 100));
        this.setMinimumSize(new Dimension(590, 100));
//     
//chatgpt
 teamApanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                handlePanelClick();
                  mainPage.setSelectedTeamA();
                
            }
        });
        drawPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                handlePanelClick();
                 mainPage.setSelectedDraw();
            }
        });
        teamBpanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                handlePanelClick();
                 mainPage.setSelectedTeamB();
            }
        });
        
        

//panelCheck.setVisible(true);
//panelCheck.setEnabled(true);
    }
    
    private void handlePanelClick(){
        if (mainPage != null) {
            mainPage.setPanelBetsVisible();
            mainPage.setlblEventText(lblTeams.getText(), lblDate.getText(), lblSport.getText());
            mainPage.setrbtnText(lblTeamA.getText(), lblTeamB.getText());
            mainPage.repaint();
            mainPage.revalidate();
        }
    
    }
    
    public void setColourA(String inTeamName){
        if (inTeamName.equalsIgnoreCase("chubb")) {
            teamApanel.setBackground(Color.yellow);
        }
        if (inTeamName.equalsIgnoreCase("wood")) {
            teamApanel.setBackground(Color.red);
        }
        if (inTeamName.equalsIgnoreCase("gane")) {
            teamApanel.setBackground(Color.green);
        }
        if (inTeamName.equalsIgnoreCase("jagger")) {
            teamApanel.setBackground(Color.gray);
        }
    }
    
     public void setColourB(String inTeamName){
        if (inTeamName.equalsIgnoreCase("chubb")) {
            teamBpanel.setBackground(Color.yellow);
        }
        if (inTeamName.equalsIgnoreCase("wood")) {
            teamBpanel.setBackground(Color.red);
        }
        if (inTeamName.equalsIgnoreCase("gane")) {
            teamBpanel.setBackground(Color.green);
        }
        if (inTeamName.equalsIgnoreCase("jagger")) {
            teamBpanel.setBackground(Color.gray);
        }
    }
//  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        teamApanel = new javax.swing.JPanel();
        lblTeamA = new javax.swing.JLabel();
        lblOddsA = new javax.swing.JLabel();
        lblTeams = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        teamBpanel = new javax.swing.JPanel();
        lblTeamB = new javax.swing.JLabel();
        lblOddsB = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblSport = new javax.swing.JLabel();
        drawPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblDraw = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(590, 85));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        teamApanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        teamApanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                teamApanelMousePressed(evt);
            }
        });

        lblTeamA.setText("TeamA");

        lblOddsA.setText("Odds A");

        javax.swing.GroupLayout teamApanelLayout = new javax.swing.GroupLayout(teamApanel);
        teamApanel.setLayout(teamApanelLayout);
        teamApanelLayout.setHorizontalGroup(
            teamApanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teamApanelLayout.createSequentialGroup()
                .addGroup(teamApanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblOddsA, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTeamA, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        teamApanelLayout.setVerticalGroup(
            teamApanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teamApanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTeamA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblOddsA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTeams.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTeams.setText("TeamA vs TeamB");

        lblDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDate.setText("date and time of game");

        teamBpanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        teamBpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                teamBpanelMousePressed(evt);
            }
        });

        lblTeamB.setText("TeamB");

        lblOddsB.setText("Odds B");

        javax.swing.GroupLayout teamBpanelLayout = new javax.swing.GroupLayout(teamBpanel);
        teamBpanel.setLayout(teamBpanelLayout);
        teamBpanelLayout.setHorizontalGroup(
            teamBpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teamBpanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(teamBpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTeamB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOddsB, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        teamBpanelLayout.setVerticalGroup(
            teamBpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teamBpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTeamB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOddsB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblSport.setText("jLabel1");

        drawPanel.setBackground(new java.awt.Color(255, 255, 255));
        drawPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        drawPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                drawPanelMousePressed(evt);
            }
        });

        jLabel1.setText("Draw");

        lblDraw.setText("draw odds");

        javax.swing.GroupLayout drawPanelLayout = new javax.swing.GroupLayout(drawPanel);
        drawPanel.setLayout(drawPanelLayout);
        drawPanelLayout.setHorizontalGroup(
            drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drawPanelLayout.createSequentialGroup()
                .addGroup(drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(drawPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addGroup(drawPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblDraw)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        drawPanelLayout.setVerticalGroup(
            drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drawPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDraw, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

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
                        .addGap(15, 15, 15)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblTeams, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblSport, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teamApanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drawPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teamBpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
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
                        .addComponent(lblDate))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(drawPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(teamApanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(teamBpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

    }//GEN-LAST:event_formMousePressed

    private void teamApanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teamApanelMousePressed

    }//GEN-LAST:event_teamApanelMousePressed

    private void drawPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawPanelMousePressed

    }//GEN-LAST:event_drawPanelMousePressed

    private void teamBpanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teamBpanelMousePressed
//  
    }//GEN-LAST:event_teamBpanelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel drawPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDraw;
    private javax.swing.JLabel lblOddsA;
    private javax.swing.JLabel lblOddsB;
    private javax.swing.JLabel lblSport;
    private javax.swing.JLabel lblTeamA;
    private javax.swing.JLabel lblTeamB;
    private javax.swing.JLabel lblTeams;
    private javax.swing.JPanel teamApanel;
    private javax.swing.JPanel teamBpanel;
    // End of variables declaration//GEN-END:variables
}
