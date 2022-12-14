package GUI;

/*
* File: AccountPage.java
* Assignment: ENSF480 Final Project
* Section: L02
* Due Date: Dec. 4, 2022
* Authors: Andrew Howe (30113096), James Platt (30130627), 
* Jenna Vlaar (30113774) and Sadman Shahriar (30121460)
*/

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Ticket;
import model.User;

/**
 *
 * @author Jenna Vlaar
 */
public class AccountPage extends javax.swing.JFrame {
    private String[] ticketArray;
    private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    /**
     * Creates new form AccountPage
     */
    public AccountPage() {
        fillComboBoxes();
        initComponents();
        addInformation();
    }

    private void addInformation()
    {
        //GET INFO FROM DATABASE
        emailText.setText(LoginForm.registeredUser.getEmail());
        passwordText.setText(LoginForm.registeredUser.getPassword());

        String tickets = "";
        for(int i = 1; i < ticketArray.length; i++)
        {
            tickets += ticketArray[i] + "\n";
        }
        
        ticketListLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 20));
        ticketListLabel.setForeground(new java.awt.Color(0, 0, 0));
        ticketListLabel.setText(tickets);
        
    }

    private void fillComboBoxes()
    {
        tickets = LoginForm.registeredUser.getTickets(); //get tickets from database
        if(tickets == null)
            tickets = new ArrayList<Ticket>(0); 
        ticketArray = new String[tickets.size() + 1];

        if(tickets.isEmpty())
        {
            ticketArray[0] = "No Booked Tickets";
        }
        else
        {
            ticketArray[0] = "Select Ticket";
            for(int i = 1; i < tickets.size() + 1; i++)
            {
                ticketArray[i] = tickets.get(i - 1).getMovieName();
            }
        }
    }
                      
    private void initComponents() { //GUI decorator

        accountPagePanel = new javax.swing.JPanel();
        moviesTitle = new javax.swing.JLabel();
        accountDetailsPanel = new javax.swing.JPanel();
        ticketsLabel = new javax.swing.JLabel();
        accountInfoPanel = new javax.swing.JPanel();
        passwordText = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailText = new javax.swing.JLabel();
        accountDetailsLabel = new javax.swing.JLabel();
        ticketPanel = new javax.swing.JPanel();
        yourTicketsLabel = new javax.swing.JLabel();
        ticketListLabel = new javax.swing.JLabel();
        selectTicketLabel = new javax.swing.JLabel();
        ticketComboBox = new javax.swing.JComboBox<>();
        cancelTicketLabel = new javax.swing.JLabel();
        cancelTicketButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMaximumSize(new java.awt.Dimension(1000, 620));
        setMinimumSize(new java.awt.Dimension(1000, 620));
        setPreferredSize(new java.awt.Dimension(1000, 620));

        accountPagePanel.setBackground(new java.awt.Color(41, 44, 142));
        accountPagePanel.setMaximumSize(new java.awt.Dimension(1000, 620));
        accountPagePanel.setMinimumSize(new java.awt.Dimension(1000, 620));

        moviesTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); 
        moviesTitle.setForeground(new java.awt.Color(243, 224, 52));
        moviesTitle.setText("MOVIES");

        accountDetailsPanel.setBackground(new java.awt.Color(87, 79, 198));
        accountDetailsPanel.setForeground(new java.awt.Color(87, 79, 198));

        ticketsLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); 
        ticketsLabel.setForeground(new java.awt.Color(243, 224, 52));
        ticketsLabel.setText("Tickets");

        accountInfoPanel.setBackground(new java.awt.Color(158, 155, 255));

        passwordText.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); 

        passwordLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); 
        passwordLabel.setText("Password:");

        emailLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); 
        emailLabel.setText("Email:");

        emailText.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); 

        javax.swing.GroupLayout accountInfoPanelLayout = new javax.swing.GroupLayout(accountInfoPanel);
        accountInfoPanel.setLayout(accountInfoPanelLayout);
        accountInfoPanelLayout.setHorizontalGroup(
            accountInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountInfoPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(accountInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordLabel)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        accountInfoPanelLayout.setVerticalGroup(
            accountInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountInfoPanelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(accountInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLabel)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(accountInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordLabel)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        accountDetailsLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); 
        accountDetailsLabel.setForeground(new java.awt.Color(243, 224, 52));
        accountDetailsLabel.setText("Account Details");

        ticketPanel.setBackground(new java.awt.Color(158, 155, 255));

        yourTicketsLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); 
        yourTicketsLabel.setText("Your Tickets:");

        javax.swing.GroupLayout ticketPanelLayout = new javax.swing.GroupLayout(ticketPanel);
        ticketPanel.setLayout(ticketPanelLayout);
        ticketPanelLayout.setHorizontalGroup(
            ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yourTicketsLabel)
                    .addComponent(ticketListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        ticketPanelLayout.setVerticalGroup(
            ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketPanelLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(yourTicketsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ticketListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        selectTicketLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
        selectTicketLabel.setForeground(new java.awt.Color(243, 224, 52));
        selectTicketLabel.setText("Select a Ticket");

        ticketComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(ticketArray));
        ticketComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketComboBoxActionPerformed(evt);
            }
        });

        cancelTicketLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); 
        cancelTicketLabel.setForeground(new java.awt.Color(243, 224, 52));
        cancelTicketLabel.setText("Want to Cancel a Ticket?");

        cancelTicketButton.setBackground(new java.awt.Color(158, 155, 255));
        cancelTicketButton.setFont(new java.awt.Font("Nirmala UI", 1, 14)); 
        cancelTicketButton.setText("Cancel Ticket");
        cancelTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelTicketButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout accountDetailsPanelLayout = new javax.swing.GroupLayout(accountDetailsPanel);
        accountDetailsPanel.setLayout(accountDetailsPanelLayout);
        accountDetailsPanelLayout.setHorizontalGroup(
            accountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountDetailsPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(accountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(accountDetailsPanelLayout.createSequentialGroup()
                            .addComponent(ticketComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(cancelTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(accountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelTicketLabel)
                            .addComponent(accountInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(selectTicketLabel)
                    .addComponent(accountDetailsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(accountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ticketPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ticketsLabel))
                .addGap(16, 16, 16))
        );
        accountDetailsPanelLayout.setVerticalGroup(
            accountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountDetailsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(accountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(accountDetailsPanelLayout.createSequentialGroup()
                        .addComponent(ticketsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ticketPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(accountDetailsPanelLayout.createSequentialGroup()
                        .addComponent(accountDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(accountInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(cancelTicketLabel)
                        .addGap(18, 18, 18)
                        .addComponent(selectTicketLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(accountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ticketComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        homeButton.setBackground(new java.awt.Color(158, 155, 255));
        homeButton.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); 
        homeButton.setText("Back to Home");
        homeButton.setActionCommand("");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout accountPagePanelLayout = new javax.swing.GroupLayout(accountPagePanel);
        accountPagePanel.setLayout(accountPagePanelLayout);
        accountPagePanelLayout.setHorizontalGroup(
            accountPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountPagePanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(accountPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(accountPagePanelLayout.createSequentialGroup()
                        .addComponent(moviesTitle)
                        .addGap(627, 627, 627)
                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(accountDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        accountPagePanelLayout.setVerticalGroup(
            accountPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountPagePanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(accountPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moviesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(accountDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accountPagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accountPagePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void cancelTicketButtonActionPerformed(java.awt.event.ActionEvent evt) //user pressed cancel ticket
    {                                                   
        if(ticketComboBox.getItemCount() == 1) //if they do not have any booked tickets
        {
            JOptionPane.showMessageDialog(null, "You have no booked tickets!", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
        if(ticketComboBox.getSelectedIndex() == 0) //they have not selected a ticket
        {
            JOptionPane.showMessageDialog(null, "Please select a ticket to cancel.", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
        else //they have selected a ticket to cancel
        {
            int index = ticketComboBox.getSelectedIndex();
            User user = LoginForm.registeredUser; //initialize user object
            Ticket ticket = tickets.get(index - 1); //get ticket to cancel
            LoginForm.theatre.removeTicket(user, ticket); //remove ticket from database

            fillComboBoxes(); //update info
            JOptionPane.showMessageDialog(null, "Ticket Canceled!", //ticket canceled confirmation
                            "MOVIES", JOptionPane.CLOSED_OPTION);

        }
    }                                                  

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) { //user pressed home button                            
        this.setVisible(false);
        if(LoginForm.registeredUser != null) //they're registered, open main page
        {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new MainPage().setVisible(true);
                }
            });

        }
        else //they are unregistered, open guest page
        {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new GuestPage().setVisible(true);
                }
            });
        }
        
    }                                          

    private void ticketComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                               
    }                                              
    
    
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
            java.util.logging.Logger.getLogger(AccountPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountPage().setVisible(true);
            }
        });
    }

    // Variables declaration                    
    private javax.swing.JLabel accountDetailsLabel;
    private javax.swing.JPanel accountDetailsPanel;
    private javax.swing.JPanel accountInfoPanel;
    private javax.swing.JPanel accountPagePanel;
    private javax.swing.JButton cancelTicketButton;
    private javax.swing.JLabel cancelTicketLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailText;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel moviesTitle;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordText;
    private javax.swing.JLabel selectTicketLabel;
    private javax.swing.JComboBox<String> ticketComboBox;
    private javax.swing.JLabel ticketListLabel;
    private javax.swing.JPanel ticketPanel;
    private javax.swing.JLabel ticketsLabel;
    private javax.swing.JLabel yourTicketsLabel;
    // End of variables declaration                   
}