package GUI;

/*
* File: MainPage.java
* Assignment: ENSF480 Final Project
* Section: L02
* Due Date: Dec. 4, 2022
* Authors: Andrew Howe (30113096), James Platt (30130627), 
* Jenna Vlaar (30113774) and Sadman Shahriar (30121460)
*/

import javax.swing.*;

public class MainPage extends javax.swing.JFrame {
    private String[] theatreArray = {"Select Theatre", "Software Theatre"};

    public MainPage() {
        initComponents();
    }
            
    private void initComponents() { //GUI decorator

        mainPagePanel = new javax.swing.JPanel();
        moviesTitle = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        stackOverflowLabel = new javax.swing.JLabel();
        wordsLabel = new javax.swing.JLabel();
        drSoftwarePoster = new javax.swing.JLabel();
        stackOverflowPoster = new javax.swing.JLabel();
        wowLabel1 = new javax.swing.JLabel();
        drSoftwareLabel = new javax.swing.JLabel();
        searchText = new javax.swing.JTextField();
        accountButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        theatreComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(41, 44, 142));
        setMaximumSize(new java.awt.Dimension(1000, 620));
        setMinimumSize(new java.awt.Dimension(1000, 620));
        setPreferredSize(new java.awt.Dimension(1000, 620));

        mainPagePanel.setBackground(new java.awt.Color(41, 44, 142));

        moviesTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); 
        moviesTitle.setForeground(new java.awt.Color(243, 224, 52));
        moviesTitle.setText("MOVIES");

        mainPanel.setBackground(new java.awt.Color(87, 79, 198));
        mainPanel.setForeground(new java.awt.Color(87, 79, 198));

        stackOverflowLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
        stackOverflowLabel.setForeground(new java.awt.Color(243, 224, 52));
        stackOverflowLabel.setText("Stack Overflow - Rated R");

        wordsLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
        wordsLabel.setForeground(new java.awt.Color(255, 255, 255));
        wordsLabel.setText("Subscribe to MOVIE NEWS to get updates on upcoming movies!");

        ImageIcon drSoftware = new ImageIcon(getClass().getResource("Images/drsoftware.png"));
        drSoftwarePoster.setIcon(drSoftware); 

        ImageIcon stackOverflow = new ImageIcon(getClass().getResource("Images/stackoverflow.png"));
        stackOverflowPoster.setIcon(stackOverflow); 

        wowLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        wowLabel1.setForeground(new java.awt.Color(243, 224, 52));
        wowLabel1.setText("WOW! Check out this week's MOVIE news!");

        drSoftwareLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
        drSoftwareLabel.setForeground(new java.awt.Color(243, 224, 52));
        drSoftwareLabel.setText("The Incredible Dr. Software - Rated E");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wordsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wowLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drSoftwarePoster, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(drSoftwareLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stackOverflowLabel)
                            .addComponent(stackOverflowPoster))
                        .addGap(55, 55, 55))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(wowLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(drSoftwarePoster)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drSoftwareLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(stackOverflowPoster)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stackOverflowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(wordsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        searchText.setBackground(new java.awt.Color(218, 215, 245));
        searchText.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); 
        searchText.setForeground(new java.awt.Color(146, 146, 159));
        searchText.setText("Search movie...");
        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });

        accountButton.setBackground(new java.awt.Color(158, 155, 255));
        accountButton.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); 
        accountButton.setText("Account");
        accountButton.setActionCommand("");
        accountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountButtonActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(158, 155, 255));
        logoutButton.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); 
        logoutButton.setText("Logout");
        logoutButton.setActionCommand("");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        theatreComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(theatreArray));
        theatreComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theatreComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPagePanelLayout = new javax.swing.GroupLayout(mainPagePanel);
        mainPagePanel.setLayout(mainPagePanelLayout);
        mainPagePanelLayout.setHorizontalGroup(
            mainPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPagePanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(mainPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPagePanelLayout.createSequentialGroup()
                        .addComponent(moviesTitle)
                        .addGap(18, 18, 18)
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(theatreComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(accountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        mainPagePanelLayout.setVerticalGroup(
            mainPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPagePanelLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(mainPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(theatreComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(accountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(moviesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 339, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void theatreComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                
    }                                               

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) { //user pressed logout                                         
        LoginForm.registeredUser = null; //wipe current user
        LoginForm.unregisteredUser = null; //wipe current user
       
        this.setVisible(false); //close MainPage
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true); //open LoginForm
            }
        });
    }                                            

    private void accountButtonActionPerformed(java.awt.event.ActionEvent evt) { // user pressed account button                                   
        this.setVisible(false); //close MainPage

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountPage().setVisible(true); //open AccountPage (registered users ONLY)
            }
        });
    }                                             

    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {  //user hit enter on search bar                                  
       
        if(theatreComboBox.getSelectedIndex() == 0) //user has not selected a theatre
        {
            JOptionPane.showMessageDialog(null, "Please select a theatre!", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;

        }
        if(searchText.getText().equals("Search movie...") || searchText.getText().isEmpty()) //if user has not searched anything
        {
            JOptionPane.showMessageDialog(null, "Please search for a movie!", 
                        "MOVIES", JOptionPane.CLOSED_OPTION);
            return;
        }
        else
        {
            String search = searchText.getText(); //get searched text
            String movie = LoginForm.theatre.searchMovie(search); //get most relevant movie
            this.setVisible(false); //close MainPage
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new SearchResults(movie, true, search).setVisible(true); //open SearchResults
                }
            });
        }
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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration              
    private javax.swing.JButton accountButton;
    private javax.swing.JLabel drSoftwareLabel;
    private javax.swing.JLabel drSoftwarePoster;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel mainPagePanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel moviesTitle;
    private javax.swing.JTextField searchText;
    private javax.swing.JLabel stackOverflowLabel;
    private javax.swing.JLabel stackOverflowPoster;
    private javax.swing.JComboBox<String> theatreComboBox;
    private javax.swing.JLabel wordsLabel;
    private javax.swing.JLabel wowLabel1;
    // End of variables declaration                   
}