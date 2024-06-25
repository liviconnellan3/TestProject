/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package matricproject;

import events.EventItem;
import java.awt.Component;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    public MainPage() {

        initComponents();
        panelBets.setVisible(false);
        updateBalance();
    }

    private ArrayList<Event> eventss = new ArrayList<>();

    public void execute(String sport) {
        clearPanels();
        DataHandler dh = new DataHandler();
        eventss = dh.getAllEventsSportSpecified(sport);

        for (int i = 0; i < eventss.size(); i++) {
            EventItem e = new EventItem(eventss.get(i), this);
            addEvent(e, sport);
        }
        refreshPanels();

    }

    public void setLabelVisible() {
        panelBets.setVisible(true);
        lblEventBet.setVisible(true);
    }

    public void updateBalance() {
        User cu = CurrentUser.getInstance().getCurrentUser();
        lblBalance.setText("" +  (Math.round(cu.getBalance()* 100.0) / 100.0) );
        lblBalance.repaint();

    }

    public void setPanelBetsVisible() {
        panelBets.setVisible(true);
        lblEventBet.setVisible(true);
        //rbtnTA.setVisible(true);
        //  rbtnTB.setVisible(true);
    }

    public void setrbtnText(String TA, String TB) {
        panelBets.setVisible(true);
        rbtnTA.setText(TA);
        rbtnTB.setText(TB);
    }

    public void setSelectedTeamA() {
        rbtnTA.setSelected(true);
        rbtnDraw.setSelected(false);
        rbtnTB.setSelected(false);

    }

    public void setSelectedTeamB() {
        rbtnTB.setSelected(true);
        rbtnTA.setSelected(false);
        rbtnDraw.setSelected(false);

    }

    public void setSelectedDraw() {
        rbtnDraw.setSelected(true);
        rbtnTA.setSelected(false);
        rbtnTB.setSelected(false);

    }

    public void setlblEventText(String txt, String date, String sport) {
        panelBets.setVisible(true);
        lblEventBet.setText(txt);
        lblDateEvent.setText(date);
        lblSport.setText(sport);
    }

    private void refreshPanels() {
        panelhockey.revalidate();
        panelhockey.repaint();
        panelRugby.revalidate();
        panelRugby.repaint();
        panelWaterpolo.revalidate();
        panelWaterpolo.repaint();
        panelNetball.revalidate();
        panelSquash.revalidate();
        panelTennis.revalidate();
        panelCricket.revalidate();
        panelBasketball.revalidate();

        panelNetball.repaint();
        panelSquash.repaint();
        panelTennis.repaint();
        panelCricket.repaint();
        panelBasketball.repaint();
    }

    private void addEvent(EventItem event, String inSport) {
        switch (inSport) {
            case "hockey":
                event.setAlignmentX(Component.LEFT_ALIGNMENT);
                panelhockey.add(event);
                break;
            case "rugby":
                event.setAlignmentX(Component.LEFT_ALIGNMENT);
                panelRugby.add(event);
                break;
            case "waterpolo":
                event.setAlignmentX(Component.LEFT_ALIGNMENT);
                panelWaterpolo.add(event);
                break;
            case "netball":
                event.setAlignmentX(Component.LEFT_ALIGNMENT);
                panelNetball.add(event);
                break;
            case "squash":
                event.setAlignmentX(Component.LEFT_ALIGNMENT);
                panelSquash.add(event);
                break;

            case "tennis":
                event.setAlignmentX(Component.LEFT_ALIGNMENT);
                panelTennis.add(event);
                break;

            case "cricket":
                event.setAlignmentX(Component.LEFT_ALIGNMENT);
                panelCricket.add(event);
                break;

            case "basketball":
                event.setAlignmentX(Component.LEFT_ALIGNMENT);
                panelBasketball.add(event);
                break;
            default:
                throw new AssertionError();
        }

    }

    private void clearPanels() {
        panelhockey.removeAll();
        panelRugby.removeAll();
        panelWaterpolo.removeAll();
        panelNetball.removeAll();
        panelSquash.removeAll();
        panelTennis.removeAll();
        panelCricket.removeAll();
        panelBasketball.removeAll();

        // You may need to call revalidate and repaint to update the UI after removing components
        panelhockey.revalidate();
        panelhockey.repaint();
        panelRugby.revalidate();
        panelRugby.repaint();
        panelWaterpolo.revalidate();
        panelWaterpolo.repaint();

        panelNetball.revalidate();
        panelSquash.revalidate();
        panelTennis.revalidate();
        panelCricket.revalidate();
        panelBasketball.revalidate();

        panelNetball.repaint();
        panelSquash.repaint();
        panelTennis.repaint();
        panelCricket.repaint();
        panelBasketball.repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblHockey = new javax.swing.JLabel();
        lblRugby = new javax.swing.JLabel();
        lblWaterpolo = new javax.swing.JLabel();
        lblNetball = new javax.swing.JLabel();
        lblsquash = new javax.swing.JLabel();
        lbltennis = new javax.swing.JLabel();
        lblcricket = new javax.swing.JLabel();
        lblbasketball = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTabbedPaneSport = new javax.swing.JTabbedPane();
        panelHock = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelhockey = new javax.swing.JPanel();
        panelrugby = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelRugby = new javax.swing.JPanel();
        panelwaterpolo = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        panelWaterpolo = new javax.swing.JPanel();
        panelnetball = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        panelNetball = new javax.swing.JPanel();
        panelsquash = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        panelSquash = new javax.swing.JPanel();
        paneltennis = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        panelTennis = new javax.swing.JPanel();
        panelcricket = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        panelCricket = new javax.swing.JPanel();
        panelbasketball = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        panelBasketball = new javax.swing.JPanel();
        panelBets = new javax.swing.JPanel();
        lblEventBet = new javax.swing.JLabel();
        lblSport = new javax.swing.JLabel();
        lblDateEvent = new javax.swing.JLabel();
        rbtnTA = new javax.swing.JRadioButton();
        rbtnDraw = new javax.swing.JRadioButton();
        rbtnTB = new javax.swing.JRadioButton();
        txtAmount = new javax.swing.JTextField();
        btnConfirmBet = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 204, 204));
        jPanel7.setPreferredSize(new java.awt.Dimension(930, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matricproject/menu.png"))); // NOI18N
        jLabel1.setText("MENU");
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jLabel4.setText("Balance:");
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblBalance.setText(".");
        lblBalance.setBackground(new java.awt.Color(255, 255, 255));
        lblBalance.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBalance.setOpaque(true);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 533, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addComponent(lblBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(930, 45));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHockey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matricproject/iconHockey.png"))); // NOI18N
        lblHockey.setBackground(new java.awt.Color(255, 255, 255));
        lblHockey.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblHockeyMousePressed(evt);
            }
        });
        jPanel5.add(lblHockey, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 36, 36));

        lblRugby.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matricproject/iconRugby.png"))); // NOI18N
        lblRugby.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRugbyMousePressed(evt);
            }
        });
        jPanel5.add(lblRugby, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 0, -1, -1));

        lblWaterpolo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matricproject/iconWaterPolo.png"))); // NOI18N
        lblWaterpolo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblWaterpoloMousePressed(evt);
            }
        });
        jPanel5.add(lblWaterpolo, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 0, -1, -1));

        lblNetball.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matricproject/icons8-netball-36.png"))); // NOI18N
        lblNetball.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblNetballMousePressed(evt);
            }
        });
        jPanel5.add(lblNetball, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 0, -1, -1));

        lblsquash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matricproject/icons8-squash-36.png"))); // NOI18N
        lblsquash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblsquashMousePressed(evt);
            }
        });
        jPanel5.add(lblsquash, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 0, -1, -1));

        lbltennis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matricproject/icons8-tennis-36.png"))); // NOI18N
        lbltennis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbltennisMousePressed(evt);
            }
        });
        jPanel5.add(lbltennis, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, -1));

        lblcricket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matricproject/icons8-cricket-36.png"))); // NOI18N
        lblcricket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblcricketMousePressed(evt);
            }
        });
        jPanel5.add(lblcricket, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 0, -1, -1));

        lblbasketball.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matricproject/icons8-basketball-36 (2).png"))); // NOI18N
        lblbasketball.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblbasketballMousePressed(evt);
            }
        });
        jPanel5.add(lblbasketball, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 0, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel10.setText("Rugby");
        jLabel10.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel10AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 34, 60, 15));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel11.setText("Waterpolo");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 34, 60, 15));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel12.setText("Basketball");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 34, 60, 15));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel13.setText("Hockey");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 34, 60, 15));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel14.setText("Netball");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 34, 60, 15));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel15.setText("Squash");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 34, 60, 15));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel16.setText("Tennis");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 34, 60, 15));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel17.setText("Cricket");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 34, 60, 15));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 930, 50));

        jTabbedPaneSport.setPreferredSize(new java.awt.Dimension(605, 459));

        panelhockey.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                panelhockeyKeyTyped(evt);
            }
        });
        panelhockey.setLayout(new javax.swing.BoxLayout(panelhockey, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane2.setViewportView(panelhockey);

        javax.swing.GroupLayout panelHockLayout = new javax.swing.GroupLayout(panelHock);
        panelHock.setLayout(panelHockLayout);
        panelHockLayout.setHorizontalGroup(
            panelHockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );
        panelHockLayout.setVerticalGroup(
            panelHockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneSport.addTab("tab1", panelHock);

        panelRugby.setAlignmentX(0.0F);
        panelRugby.setLayout(new javax.swing.BoxLayout(panelRugby, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(panelRugby);

        javax.swing.GroupLayout panelrugbyLayout = new javax.swing.GroupLayout(panelrugby);
        panelrugby.setLayout(panelrugbyLayout);
        panelrugbyLayout.setHorizontalGroup(
            panelrugbyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        panelrugbyLayout.setVerticalGroup(
            panelrugbyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelrugbyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))
        );

        jTabbedPaneSport.addTab("tab2", panelrugby);

        panelWaterpolo.setLayout(new javax.swing.BoxLayout(panelWaterpolo, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane3.setViewportView(panelWaterpolo);

        javax.swing.GroupLayout panelwaterpoloLayout = new javax.swing.GroupLayout(panelwaterpolo);
        panelwaterpolo.setLayout(panelwaterpoloLayout);
        panelwaterpoloLayout.setHorizontalGroup(
            panelwaterpoloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );
        panelwaterpoloLayout.setVerticalGroup(
            panelwaterpoloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelwaterpoloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))
        );

        jTabbedPaneSport.addTab("tab3", panelwaterpolo);

        panelNetball.setLayout(new javax.swing.BoxLayout(panelNetball, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane4.setViewportView(panelNetball);

        javax.swing.GroupLayout panelnetballLayout = new javax.swing.GroupLayout(panelnetball);
        panelnetball.setLayout(panelnetballLayout);
        panelnetballLayout.setHorizontalGroup(
            panelnetballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );
        panelnetballLayout.setVerticalGroup(
            panelnetballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelnetballLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))
        );

        jTabbedPaneSport.addTab("tab4", panelnetball);

        panelSquash.setLayout(new javax.swing.BoxLayout(panelSquash, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane5.setViewportView(panelSquash);

        javax.swing.GroupLayout panelsquashLayout = new javax.swing.GroupLayout(panelsquash);
        panelsquash.setLayout(panelsquashLayout);
        panelsquashLayout.setHorizontalGroup(
            panelsquashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );
        panelsquashLayout.setVerticalGroup(
            panelsquashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelsquashLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))
        );

        jTabbedPaneSport.addTab("tab5", panelsquash);

        panelTennis.setLayout(new javax.swing.BoxLayout(panelTennis, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane6.setViewportView(panelTennis);

        javax.swing.GroupLayout paneltennisLayout = new javax.swing.GroupLayout(paneltennis);
        paneltennis.setLayout(paneltennisLayout);
        paneltennisLayout.setHorizontalGroup(
            paneltennisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );
        paneltennisLayout.setVerticalGroup(
            paneltennisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneltennisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))
        );

        jTabbedPaneSport.addTab("tab6", paneltennis);

        panelCricket.setLayout(new javax.swing.BoxLayout(panelCricket, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane7.setViewportView(panelCricket);

        javax.swing.GroupLayout panelcricketLayout = new javax.swing.GroupLayout(panelcricket);
        panelcricket.setLayout(panelcricketLayout);
        panelcricketLayout.setHorizontalGroup(
            panelcricketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );
        panelcricketLayout.setVerticalGroup(
            panelcricketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelcricketLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))
        );

        jTabbedPaneSport.addTab("tab7", panelcricket);

        panelBasketball.setLayout(new javax.swing.BoxLayout(panelBasketball, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane8.setViewportView(panelBasketball);

        javax.swing.GroupLayout panelbasketballLayout = new javax.swing.GroupLayout(panelbasketball);
        panelbasketball.setLayout(panelbasketballLayout);
        panelbasketballLayout.setHorizontalGroup(
            panelbasketballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );
        panelbasketballLayout.setVerticalGroup(
            panelbasketballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelbasketballLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))
        );

        jTabbedPaneSport.addTab("tab8", panelbasketball);

        getContentPane().add(jTabbedPaneSport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 605, 500));

        panelBets.setBackground(new java.awt.Color(255, 204, 204));

        lblEventBet.setText("TA vs TB");
        lblEventBet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblSport.setText("jLabel5");

        lblDateEvent.setText("jLabel5");

        rbtnTA.setText("jRadioButton1");
        rbtnTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTAActionPerformed(evt);
            }
        });

        rbtnDraw.setText("Draw");
        rbtnDraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDrawActionPerformed(evt);
            }
        });

        rbtnTB.setText("jRadioButton1");
        rbtnTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTBActionPerformed(evt);
            }
        });

        btnConfirmBet.setText("CONFIRM BET");
        btnConfirmBet.setBackground(new java.awt.Color(153, 255, 153));
        btnConfirmBet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmBetActionPerformed(evt);
            }
        });

        jLabel5.setText("PLACE BET");

        jLabel3.setText("Bet Amount:");

        javax.swing.GroupLayout panelBetsLayout = new javax.swing.GroupLayout(panelBets);
        panelBets.setLayout(panelBetsLayout);
        panelBetsLayout.setHorizontalGroup(
            panelBetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBetsLayout.createSequentialGroup()
                .addGroup(panelBetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBetsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBetsLayout.createSequentialGroup()
                        .addGroup(panelBetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBetsLayout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addGroup(panelBetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDateEvent)
                                    .addComponent(lblSport)))
                            .addGroup(panelBetsLayout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(btnConfirmBet, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelBetsLayout.createSequentialGroup()
                .addComponent(rbtnTA, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBetsLayout.createSequentialGroup()
                        .addComponent(lblEventBet, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBetsLayout.createSequentialGroup()
                        .addComponent(rbtnDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(rbtnTB)
                        .addGap(16, 16, 16))))
        );
        panelBetsLayout.setVerticalGroup(
            panelBetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBetsLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEventBet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDateEvent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnTA)
                    .addComponent(rbtnDraw)
                    .addComponent(rbtnTB))
                .addGap(26, 26, 26)
                .addGroup(panelBetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(btnConfirmBet)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        getContentPane().add(panelBets, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 300, 370));

        setSize(new java.awt.Dimension(946, 558));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblHockeyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHockeyMousePressed
        txtAmount.setText("");
        panelBets.setVisible(false);
        panelBets.repaint();
        panelBets.revalidate();
        execute("hockey");
//        jTabbedPane2.removeAll();
        jTabbedPaneSport.setSelectedIndex(0);
    }//GEN-LAST:event_lblHockeyMousePressed

    private void lblRugbyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRugbyMousePressed
        txtAmount.setText("");
        panelBets.setVisible(false);
        panelBets.repaint();
        panelBets.revalidate();
        
        execute("rugby");
//        jTabbedPane2.removeAll();
        jTabbedPaneSport.setSelectedIndex(1);
    }//GEN-LAST:event_lblRugbyMousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MousePressed

    private void rbtnTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTAActionPerformed
        if (rbtnTB.isSelected() || rbtnDraw.isSelected()) {
            rbtnTB.setSelected(false);
            rbtnDraw.setSelected(false);
        } else {
            rbtnTA.setSelected(true);
        }
    }//GEN-LAST:event_rbtnTAActionPerformed

    private void rbtnDrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDrawActionPerformed
        if (rbtnTB.isSelected() || rbtnTA.isSelected()) {
            rbtnTB.setSelected(false);
            rbtnTA.setSelected(false);
        } else {
            rbtnDraw.setSelected(true);
        }
    }//GEN-LAST:event_rbtnDrawActionPerformed

    private void rbtnTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTBActionPerformed
        if (rbtnDraw.isSelected() || rbtnTA.isSelected()) {
            rbtnDraw.setSelected(false);
            rbtnTA.setSelected(false);
        } else {
            rbtnTB.setSelected(true);
        }
    }//GEN-LAST:event_rbtnTBActionPerformed

    private void btnConfirmBetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmBetActionPerformed

        DataHandler dh = new DataHandler();

        String dateString = lblDateEvent.getText();
        String teamSelected = "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate date = LocalDate.parse(dateString, formatter);
        Event e = dh.searchEvent(lblSport.getText(), rbtnTA.getText(), rbtnTB.getText(), date);
        User cu = CurrentUser.getInstance().getCurrentUser();
        String input = txtAmount.getText() + "";

// code from previous validation task
        boolean check = true;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                check = true;
            } else {
                check = false;
            }
        }

        if (check == false) {
            JOptionPane.showMessageDialog(panelBets, "Bet ammount can only be numbers", "Connot place bet", JOptionPane.ERROR_MESSAGE);


        } else {
            if (dh.checkIfPreviousBetMade(cu, e) != true) {

                if (rbtnTA.isSelected()) {
                    teamSelected = rbtnTA.getText();
                }
                if (rbtnTB.isSelected()) {
                    teamSelected = rbtnTB.getText();
                }
                if (rbtnDraw.isSelected()) {
                    teamSelected = rbtnDraw.getText();
                }
                if (cu != null && cu.getBalance() >= Double.parseDouble(txtAmount.getText())) {
                    dh.placeBetFinal(cu, e, Double.parseDouble(txtAmount.getText()), teamSelected);
                    User updatedUser = dh.searchUserID(cu.getUserid());
                    CurrentUser.getInstance().setCurrentUser(updatedUser);

                    updateBalance();
                    JOptionPane.showMessageDialog(panelBets, "success");
                    txtAmount.setText("");
                } else {
                    JOptionPane.showMessageDialog(panelBets, "unsuccessful");
                }

            } else {
                JOptionPane.showMessageDialog(panelBets, "Cannot place multiple bets\n on one event");
            }
        }


    }//GEN-LAST:event_btnConfirmBetActionPerformed

    private void panelhockeyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelhockeyKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_panelhockeyKeyTyped

    private void lblWaterpoloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblWaterpoloMousePressed
        txtAmount.setText("");
        panelBets.setVisible(false);
        panelBets.repaint();
        panelBets.revalidate();
        execute("waterpolo");
//        jTabbedPane2.removeAll();
        jTabbedPaneSport.setSelectedIndex(2);
    }//GEN-LAST:event_lblWaterpoloMousePressed

    private void lblNetballMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNetballMousePressed
        panelBets.setVisible(false);
        panelBets.repaint();
        panelBets.revalidate();
        txtAmount.setText("");
        execute("netball");
//        jTabbedPane2.removeAll();
        jTabbedPaneSport.setSelectedIndex(3);
    }//GEN-LAST:event_lblNetballMousePressed

    private void lblsquashMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsquashMousePressed
        txtAmount.setText("");
        panelBets.setVisible(false);
        panelBets.repaint();
        panelBets.revalidate();
        execute("squash");
        jTabbedPaneSport.setSelectedIndex(4);
    }//GEN-LAST:event_lblsquashMousePressed

    private void lbltennisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltennisMousePressed
        txtAmount.setText("");
        panelBets.setVisible(false);
        panelBets.repaint();
        panelBets.revalidate();
        execute("tennis");
        jTabbedPaneSport.setSelectedIndex(5);
    }//GEN-LAST:event_lbltennisMousePressed

    private void lblcricketMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcricketMousePressed
        txtAmount.setText("");
        panelBets.setVisible(false);
        panelBets.repaint();
        panelBets.revalidate();
        execute("cricket");
        jTabbedPaneSport.setSelectedIndex(6);
    }//GEN-LAST:event_lblcricketMousePressed

    private void lblbasketballMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbasketballMousePressed
       txtAmount.setText("");
        panelBets.setVisible(false);
        panelBets.repaint();
        panelBets.revalidate();
        execute("basketball");
        jTabbedPaneSport.setSelectedIndex(7);
    }//GEN-LAST:event_lblbasketballMousePressed

    private void jLabel10AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel10AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10AncestorAdded

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
            java.util.logging.Logger.getLogger(MainPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmBet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPaneSport;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblDateEvent;
    private javax.swing.JLabel lblEventBet;
    private javax.swing.JLabel lblHockey;
    private javax.swing.JLabel lblNetball;
    private javax.swing.JLabel lblRugby;
    private javax.swing.JLabel lblSport;
    private javax.swing.JLabel lblWaterpolo;
    private javax.swing.JLabel lblbasketball;
    private javax.swing.JLabel lblcricket;
    private javax.swing.JLabel lblsquash;
    private javax.swing.JLabel lbltennis;
    private javax.swing.JPanel panelBasketball;
    private javax.swing.JPanel panelBets;
    private javax.swing.JPanel panelCricket;
    private javax.swing.JPanel panelHock;
    private javax.swing.JPanel panelNetball;
    private javax.swing.JPanel panelRugby;
    private javax.swing.JPanel panelSquash;
    private javax.swing.JPanel panelTennis;
    private javax.swing.JPanel panelWaterpolo;
    private javax.swing.JPanel panelbasketball;
    private javax.swing.JPanel panelcricket;
    private javax.swing.JPanel panelhockey;
    private javax.swing.JPanel panelnetball;
    private javax.swing.JPanel panelrugby;
    private javax.swing.JPanel panelsquash;
    private javax.swing.JPanel paneltennis;
    private javax.swing.JPanel panelwaterpolo;
    private javax.swing.JRadioButton rbtnDraw;
    private javax.swing.JRadioButton rbtnTA;
    private javax.swing.JRadioButton rbtnTB;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
