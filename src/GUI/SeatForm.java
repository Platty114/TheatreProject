package GUI;

/*
* File: SeatForm.java
* Assignment: ENSF480 Final Project
* Section: L02
* Due Date: Dec. 4, 2022
* Authors: Andrew Howe (30113096), James Platt (30130627), 
* Jenna Vlaar (30113774) and Sadman Shahriar (30121460)
*/

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.*;

public class SeatForm extends javax.swing.JFrame {
    private ImageIcon seatIcon = new ImageIcon(getClass().getResource("Images/seat.png"));
    private JToggleButton[] allSeats;
    private static String movie;
    private static String showTime;
    private static boolean registered;
    private String seats;
    private String[] seatNames = { "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8","A9", "A0", "B1", "B2", "B3", "B4", "B5", "B6", "B7",
    "B8", "B9", "B0", "C1", "C2", "C3", "C4", "C5", "C6"," C7", "C8", "C9", "C0" };
    
    public SeatForm(String movie, String showTime, boolean registered) {
        SeatForm.movie = movie;
        SeatForm.registered = registered;
        SeatForm.showTime = showTime;
        initComponents();
        this.allSeats = new JToggleButton[]{A1, A2, A3, A4, A5, A6, A7, A8, A9, A0,
            B1, B2, B3, B4, B5, B6, B7, B8, B9, B0, C1, C2, C3, C4, C5,
            C6, C7, C8, C9, C0};
        disableTakenSeats();
    }

    private void disableTakenSeats() //grey out already purchased seats
    {
        ArrayList<String> takenSeats = LoginForm.theatre.takenSeats(movie, showTime); //get taken seats from database
        if(takenSeats == null) //if there are no taken seats, leave function
        {
            return;
        }

        Vector<JToggleButton> seatButtons = new Vector<>(); //initialize vector of buttons
        for(int i = 0; i < takenSeats.size(); i++) //for each taken seat
        {
            for(int j = 0; j < seatNames.length; j++) //find its associated index
            {
                if(takenSeats.get(i).equals(seatNames[j]))
                {
                    seatButtons.add(allSeats[j]); //add it to buttons to grey out vector
                    break;
                }
            }
        }

        for(JToggleButton button : seatButtons) //for each button to be greyed out
        {
            ImageIcon takenSeatIcon = new ImageIcon(getClass().getResource("Images/takenseat.png")); //get takenseat icon
            button.setDisabledIcon(takenSeatIcon); //set disabled icon to takenseat icon
            button.setEnabled(false); //disable seat button
        }
    }
               
    private void initComponents() { //GUI decorator

        seatFormPanel = new javax.swing.JPanel();
        seatTitle = new javax.swing.JLabel();
        seatPanel = new javax.swing.JPanel();
        screenPanel = new javax.swing.JPanel();
        screenLabel = new javax.swing.JLabel();
        A1 = new javax.swing.JToggleButton();
        A2 = new javax.swing.JToggleButton();
        A3 = new javax.swing.JToggleButton();
        A4 = new javax.swing.JToggleButton();
        A5 = new javax.swing.JToggleButton();
        A6 = new javax.swing.JToggleButton();
        A7 = new javax.swing.JToggleButton();
        A8 = new javax.swing.JToggleButton();
        A9 = new javax.swing.JToggleButton();
        A0 = new javax.swing.JToggleButton();
        B1 = new javax.swing.JToggleButton();
        B2 = new javax.swing.JToggleButton();
        B3 = new javax.swing.JToggleButton();
        B4 = new javax.swing.JToggleButton();
        B5 = new javax.swing.JToggleButton();
        B6 = new javax.swing.JToggleButton();
        B7 = new javax.swing.JToggleButton();
        B8 = new javax.swing.JToggleButton();
        B9 = new javax.swing.JToggleButton();
        B0 = new javax.swing.JToggleButton();
        C1 = new javax.swing.JToggleButton();
        C2 = new javax.swing.JToggleButton();
        C3 = new javax.swing.JToggleButton();
        C4 = new javax.swing.JToggleButton();
        C5 = new javax.swing.JToggleButton();
        C6 = new javax.swing.JToggleButton();
        C7 = new javax.swing.JToggleButton();
        C8 = new javax.swing.JToggleButton();
        C9 = new javax.swing.JToggleButton();
        C0 = new javax.swing.JToggleButton();
        confirmButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 620));
        setMinimumSize(new java.awt.Dimension(1000, 620));
        setPreferredSize(new java.awt.Dimension(1000, 620));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 620));

        seatFormPanel.setBackground(new java.awt.Color(41, 44, 142));

        seatTitle.setBackground(new java.awt.Color(243, 224, 52));
        seatTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 40)); 
        seatTitle.setForeground(new java.awt.Color(243, 224, 52));
        seatTitle.setText("SELECT SEAT(S)");

        seatPanel.setBackground(new java.awt.Color(87, 79, 198));
        seatPanel.setForeground(new java.awt.Color(87, 79, 198));

        screenPanel.setBackground(new java.awt.Color(147, 155, 255));

        screenLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); 
        screenLabel.setForeground(new java.awt.Color(69, 69, 69));
        screenLabel.setText("S C R E E N");

        javax.swing.GroupLayout screenPanelLayout = new javax.swing.GroupLayout(screenPanel);
        screenPanel.setLayout(screenPanelLayout);
        screenPanelLayout.setHorizontalGroup(
            screenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, screenPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(screenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263))
        );
        screenPanelLayout.setVerticalGroup(
            screenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(screenLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        A1.setBackground(new java.awt.Color(87, 79, 198));
        A1.setIcon(seatIcon); 
        A1.setBorder(null);
        A1.setBorderPainted(false);
        A1.setContentAreaFilled(false);
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        A2.setBackground(new java.awt.Color(87, 79, 198));
        A2.setIcon(seatIcon); 
        A2.setBorder(null);
        A2.setBorderPainted(false);
        A2.setContentAreaFilled(false);
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        A3.setBackground(new java.awt.Color(87, 79, 198));
        A3.setIcon(seatIcon); 
        A3.setBorder(null);
        A3.setBorderPainted(false);
        A3.setContentAreaFilled(false);
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        A4.setBackground(new java.awt.Color(87, 79, 198));
        A4.setIcon(seatIcon); 
        A4.setBorder(null);
        A4.setBorderPainted(false);
        A4.setContentAreaFilled(false);
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        A5.setBackground(new java.awt.Color(87, 79, 198));
        A5.setIcon(seatIcon); 
        A5.setBorder(null);
        A5.setBorderPainted(false);
        A5.setContentAreaFilled(false);
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });

        A6.setBackground(new java.awt.Color(87, 79, 198));
        A6.setIcon(seatIcon); 
        A6.setBorder(null);
        A6.setBorderPainted(false);
        A6.setContentAreaFilled(false);
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });

        A7.setBackground(new java.awt.Color(87, 79, 198));
        A7.setIcon(seatIcon); 
        A7.setBorder(null);
        A7.setBorderPainted(false);
        A7.setContentAreaFilled(false);
        A7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A7ActionPerformed(evt);
            }
        });

        A8.setBackground(new java.awt.Color(87, 79, 198));
        A8.setIcon(seatIcon); 
        A8.setBorder(null);
        A8.setBorderPainted(false);
        A8.setContentAreaFilled(false);
        A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A8ActionPerformed(evt);
            }
        });

        A9.setBackground(new java.awt.Color(87, 79, 198));
        A9.setIcon(seatIcon); 
        A9.setBorder(null);
        A9.setBorderPainted(false);
        A9.setContentAreaFilled(false);
        A9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A9ActionPerformed(evt);
            }
        });

        A0.setBackground(new java.awt.Color(87, 79, 198));
        A0.setIcon(seatIcon); 
        A0.setBorder(null);
        A0.setBorderPainted(false);
        A0.setContentAreaFilled(false);
        A0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A0ActionPerformed(evt);
            }
        });

        B1.setBackground(new java.awt.Color(87, 79, 198));
        B1.setIcon(seatIcon); 
        B1.setBorder(null);
        B1.setBorderPainted(false);
        B1.setContentAreaFilled(false);
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setBackground(new java.awt.Color(87, 79, 198));
        B2.setIcon(seatIcon); 
        B2.setBorder(null);
        B2.setBorderPainted(false);
        B2.setContentAreaFilled(false);
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setBackground(new java.awt.Color(87, 79, 198));
        B3.setIcon(seatIcon); 
        B3.setBorder(null);
        B3.setBorderPainted(false);
        B3.setContentAreaFilled(false);
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setBackground(new java.awt.Color(87, 79, 198));
        B4.setIcon(seatIcon); 
        B4.setBorder(null);
        B4.setBorderPainted(false);
        B4.setContentAreaFilled(false);
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setBackground(new java.awt.Color(87, 79, 198));
        B5.setIcon(seatIcon); 
        B5.setBorder(null);
        B5.setBorderPainted(false);
        B5.setContentAreaFilled(false);
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B6.setBackground(new java.awt.Color(87, 79, 198));
        B6.setIcon(seatIcon); 
        B6.setBorder(null);
        B6.setBorderPainted(false);
        B6.setContentAreaFilled(false);
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B7.setBackground(new java.awt.Color(87, 79, 198));
        B7.setIcon(seatIcon); 
        B7.setBorder(null);
        B7.setBorderPainted(false);
        B7.setContentAreaFilled(false);
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setBackground(new java.awt.Color(87, 79, 198));
        B8.setIcon(seatIcon); 
        B8.setBorder(null);
        B8.setBorderPainted(false);
        B8.setContentAreaFilled(false);
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.setBackground(new java.awt.Color(87, 79, 198));
        B9.setIcon(seatIcon); 
        B9.setBorder(null);
        B9.setBorderPainted(false);
        B9.setContentAreaFilled(false);
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        B0.setBackground(new java.awt.Color(87, 79, 198));
        B0.setIcon(seatIcon); 
        B0.setBorder(null);
        B0.setBorderPainted(false);
        B0.setContentAreaFilled(false);
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });

        C1.setBackground(new java.awt.Color(87, 79, 198));
        C1.setIcon(seatIcon); 
        C1.setBorder(null);
        C1.setBorderPainted(false);
        C1.setContentAreaFilled(false);
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C2.setBackground(new java.awt.Color(87, 79, 198));
        C2.setIcon(seatIcon); 
        C2.setBorder(null);
        C2.setBorderPainted(false);
        C2.setContentAreaFilled(false);
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        C3.setBackground(new java.awt.Color(87, 79, 198));
        C3.setIcon(seatIcon); 
        C3.setBorder(null);
        C3.setBorderPainted(false);
        C3.setContentAreaFilled(false);
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        C4.setBackground(new java.awt.Color(87, 79, 198));
        C4.setIcon(seatIcon); 
        C4.setBorder(null);
        C4.setBorderPainted(false);
        C4.setContentAreaFilled(false);
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        C5.setBackground(new java.awt.Color(87, 79, 198));
        C5.setIcon(seatIcon); 
        C5.setBorder(null);
        C5.setBorderPainted(false);
        C5.setContentAreaFilled(false);
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });

        C6.setBackground(new java.awt.Color(87, 79, 198));
        C6.setIcon(seatIcon); 
        C6.setBorder(null);
        C6.setBorderPainted(false);
        C6.setContentAreaFilled(false);
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });

        C7.setBackground(new java.awt.Color(87, 79, 198));
        C7.setIcon(seatIcon); 
        C7.setBorder(null);
        C7.setBorderPainted(false);
        C7.setContentAreaFilled(false);
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });

        C8.setBackground(new java.awt.Color(87, 79, 198));
        C8.setIcon(seatIcon); 
        C8.setBorder(null);
        C8.setBorderPainted(false);
        C8.setContentAreaFilled(false);
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });

        C9.setBackground(new java.awt.Color(87, 79, 198));
        C9.setIcon(seatIcon); 
        C9.setBorder(null);
        C9.setBorderPainted(false);
        C9.setContentAreaFilled(false);
        C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C9ActionPerformed(evt);
            }
        });

        C0.setBackground(new java.awt.Color(87, 79, 198));
        C0.setIcon(seatIcon); 
        C0.setBorder(null);
        C0.setBorderPainted(false);
        C0.setContentAreaFilled(false);
        C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout seatPanelLayout = new javax.swing.GroupLayout(seatPanel);
        seatPanel.setLayout(seatPanelLayout);
        seatPanelLayout.setHorizontalGroup(
            seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seatPanelLayout.createSequentialGroup()
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(seatPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(screenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(seatPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(seatPanelLayout.createSequentialGroup()
                                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(seatPanelLayout.createSequentialGroup()
                                        .addComponent(A1)
                                        .addGap(18, 18, 18)
                                        .addComponent(A2)
                                        .addGap(18, 18, 18)
                                        .addComponent(A3)
                                        .addGap(18, 18, 18)
                                        .addComponent(A4)
                                        .addGap(18, 18, 18)
                                        .addComponent(A5))
                                    .addGroup(seatPanelLayout.createSequentialGroup()
                                        .addComponent(C1)
                                        .addGap(18, 18, 18)
                                        .addComponent(C2)
                                        .addGap(18, 18, 18)
                                        .addComponent(C3)
                                        .addGap(18, 18, 18)
                                        .addComponent(C4)
                                        .addGap(18, 18, 18)
                                        .addComponent(C5)))
                                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(seatPanelLayout.createSequentialGroup()
                                        .addGap(109, 109, 109)
                                        .addComponent(A6)
                                        .addGap(18, 18, 18)
                                        .addComponent(A7)
                                        .addGap(18, 18, 18)
                                        .addComponent(A8)
                                        .addGap(18, 18, 18)
                                        .addComponent(A9)
                                        .addGap(18, 18, 18)
                                        .addComponent(A0))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seatPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(C6)
                                        .addGap(18, 18, 18)
                                        .addComponent(C7)
                                        .addGap(18, 18, 18)
                                        .addComponent(C8)
                                        .addGap(18, 18, 18)
                                        .addComponent(C9)
                                        .addGap(18, 18, 18)
                                        .addComponent(C0))))
                            .addGroup(seatPanelLayout.createSequentialGroup()
                                .addComponent(B1)
                                .addGap(18, 18, 18)
                                .addComponent(B2)
                                .addGap(18, 18, 18)
                                .addComponent(B3)
                                .addGap(18, 18, 18)
                                .addComponent(B4)
                                .addGap(18, 18, 18)
                                .addComponent(B5)
                                .addGap(109, 109, 109)
                                .addComponent(B6)
                                .addGap(18, 18, 18)
                                .addComponent(B7)
                                .addGap(18, 18, 18)
                                .addComponent(B8)
                                .addGap(18, 18, 18)
                                .addComponent(B9)
                                .addGap(18, 18, 18)
                                .addComponent(B0)))
                        .addGap(6, 6, 6)))
                .addGap(36, 36, 36))
        );
        seatPanelLayout.setVerticalGroup(
            seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seatPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(screenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A1)
                    .addComponent(A2)
                    .addComponent(A3)
                    .addComponent(A4)
                    .addComponent(A5)
                    .addComponent(A6)
                    .addComponent(A7)
                    .addComponent(A8)
                    .addComponent(A9)
                    .addComponent(A0))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B1)
                    .addComponent(B2)
                    .addComponent(B3)
                    .addComponent(B4)
                    .addComponent(B5)
                    .addComponent(B6)
                    .addComponent(B7)
                    .addComponent(B8)
                    .addComponent(B9)
                    .addComponent(B0))
                .addGap(36, 36, 36)
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(C1)
                    .addComponent(C2)
                    .addComponent(C3)
                    .addComponent(C4)
                    .addComponent(C5)
                    .addComponent(C6)
                    .addComponent(C7)
                    .addComponent(C8)
                    .addComponent(C9)
                    .addComponent(C0))
                .addGap(53, 53, 53))
        );

        confirmButton.setBackground(new java.awt.Color(158, 155, 255));
        confirmButton.setFont(new java.awt.Font("Nirmala UI", 1, 14)); 
        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout seatFormPanelLayout = new javax.swing.GroupLayout(seatFormPanel);
        seatFormPanel.setLayout(seatFormPanelLayout);
        seatFormPanelLayout.setHorizontalGroup(
            seatFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seatFormPanelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(seatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seatFormPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(seatFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seatFormPanelLayout.createSequentialGroup()
                        .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seatFormPanelLayout.createSequentialGroup()
                        .addComponent(seatTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(274, 274, 274))))
        );
        seatFormPanelLayout.setVerticalGroup(
            seatFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seatFormPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(seatTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(seatFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(seatFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1105, Short.MAX_VALUE))
        );

        pack();
    }                      

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) { // user pressed confirm button
        seats = "";
        
        for(int i = 0; i < allSeats.length; i++) //get selected seats as a string i.e. A1B2C3
        {
            if(allSeats[i].isSelected())
            {
                seats += seatNames[i];
            }
        }
        
        if(!seats.isEmpty()) //if there are seats selected
        {
            this.setVisible(false); //close SeatForm
            java.awt.EventQueue.invokeLater(new Runnable() {
              public void run() {
                new PaymentForm(seats, movie, showTime, registered).setVisible(true); //open PaymentForm
              }
           });
        }
        else //no seats selected
        {
            JOptionPane.showMessageDialog(null, "Please select your seats!", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
        }
    }                                             

    private void selectSeat(JToggleButton button) //if user has pressed a seat button
    {
        if(button.isSelected()) //if it is selected
        {
            ImageIcon selectedSeat = new ImageIcon(getClass().getResource("Images/selectedseat.png"));
            button.setIcon(selectedSeat); //set icon to selected
        }
        else
        {  
            button.setIcon(seatIcon); //set icon to de-selected
        }
    }
    
    
    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(A1);
    }                                      

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(A2);
    }                                      

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(A3);
    }                                      

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(A4);
    }                                      

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(A5);
    }                                      

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(A6);
    }                                      

    private void A7ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(A7);
    }                                      

    private void A8ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(A8);
    }                                      

    private void A9ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(A9);
    }                                      

    private void A0ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        selectSeat(A0);
    }                                       

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(B1);
    }                                      

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(B2);
    }                                      

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(B3);
    }                                      

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(B4);
    }                                      

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(B5);
    }                                      

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(B6);
    }                                      

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(B7);
    }                                      

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(B8);
    }                                      

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(B9);
    }                                      

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        selectSeat(B0);
    }                                       

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(C1);
    }                                      

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(C2);
    }                                      

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(C3);
    }                                      

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(C4);
    }                                      

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(C5);
    }                                      

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(C6);
    }                                      

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(C7);
    }                                      

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(C8);
    }                                      

    private void C9ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        selectSeat(C9);
    }                                      

    private void C0ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        selectSeat(C0);
    }                                       

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SeatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeatForm(movie, showTime, registered).setVisible(true);
            }
        });
    }

    // Variables declaration               
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel screenLabel;
    private javax.swing.JPanel screenPanel;
    private javax.swing.JToggleButton A1;
    private javax.swing.JToggleButton A0;
    private javax.swing.JToggleButton A2;
    private javax.swing.JToggleButton A3;
    private javax.swing.JToggleButton A4;
    private javax.swing.JToggleButton A5;
    private javax.swing.JToggleButton A6;
    private javax.swing.JToggleButton A7;
    private javax.swing.JToggleButton A8;
    private javax.swing.JToggleButton A9;
    private javax.swing.JToggleButton B1;
    private javax.swing.JToggleButton B0;
    private javax.swing.JToggleButton B2;
    private javax.swing.JToggleButton B3;
    private javax.swing.JToggleButton B4;
    private javax.swing.JToggleButton B5;
    private javax.swing.JToggleButton B6;
    private javax.swing.JToggleButton B7;
    private javax.swing.JToggleButton B8;
    private javax.swing.JToggleButton B9;
    private javax.swing.JToggleButton C1;
    private javax.swing.JToggleButton C0;
    private javax.swing.JToggleButton C2;
    private javax.swing.JToggleButton C3;
    private javax.swing.JToggleButton C4;
    private javax.swing.JToggleButton C5;
    private javax.swing.JToggleButton C6;
    private javax.swing.JToggleButton C7;
    private javax.swing.JToggleButton C8;
    private javax.swing.JToggleButton C9;
    private javax.swing.JPanel seatFormPanel;
    private javax.swing.JPanel seatPanel;
    private javax.swing.JLabel seatTitle;
    // End of variables declaration                   
}