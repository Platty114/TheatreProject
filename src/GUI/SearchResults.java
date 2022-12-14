package GUI;

/*
* File: SearchResults.java
* Assignment: ENSF480 Final Project
* Section: L02
* Due Date: Dec. 4, 2022
* Authors: Andrew Howe (30113096), James Platt (30130627), 
* Jenna Vlaar (30113774) and Sadman Shahriar (30121460)
*/

import javax.swing.ImageIcon;

public class SearchResults extends javax.swing.JFrame {
    public static boolean registered;
    static String movie;
    private static String search;

    public SearchResults(String movie, boolean registered, String search) {
        SearchResults.registered = registered;
        SearchResults.movie = movie;
        SearchResults.search = search;
        initComponents();
        displayResults();
    }

    private void displayResults() //display search results
    {    //select most relevant movie poster image
        if(movie.equals("stackOverflow"))
        {
            ImageIcon stackOverflow = new ImageIcon(getClass().getResource("Images/stackoverflow.png"));
            imageLabel.setIcon(stackOverflow);
        }
        else if(movie.equals("drSoftware"))
        {
            ImageIcon drSoftware = new ImageIcon(getClass().getResource("Images/drsoftware.png"));
            imageLabel.setIcon(drSoftware);
        }
        else
        {
            ImageIcon noDecimalsLand = new ImageIcon(getClass().getResource("Images/nodecimal.png"));
            imageLabel.setIcon(noDecimalsLand);
        }
    }
                      
    private void initComponents() { //GUI decorator

        searchResultsPanel = new javax.swing.JPanel();
        moviesTitle = new javax.swing.JLabel();
        searchPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        searchBoxText = new javax.swing.JLabel();
        searchLabel1 = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        searchText = new javax.swing.JLabel();
        buyTicketsButton = new javax.swing.JButton();
        alsoLikePanel = new javax.swing.JPanel();
        searchBoxText1 = new javax.swing.JLabel();
        alsoLikeLabel = new javax.swing.JLabel();
        subject480Label = new javax.swing.JLabel();
        comingSoonLabel = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 620));
        setMinimumSize(new java.awt.Dimension(1000, 620));
        setPreferredSize(new java.awt.Dimension(1000, 620));

        searchResultsPanel.setBackground(new java.awt.Color(41, 44, 142));

        moviesTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 48));
        moviesTitle.setForeground(new java.awt.Color(243, 224, 52));
        moviesTitle.setText("MOVIES");

        searchPanel.setBackground(new java.awt.Color(87, 79, 198));

        titleLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        titleLabel.setForeground(new java.awt.Color(243, 224, 52));
        titleLabel.setText("Most Relevant Title:");

        searchBoxText.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
        searchBoxText.setForeground(new java.awt.Color(242, 242, 242));

        searchLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        searchLabel1.setForeground(new java.awt.Color(243, 224, 52));

        searchText.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
        searchText.setForeground(new java.awt.Color(255, 255, 255));
        searchLabel1.setText("You Searched: ");
        searchText.setText(search);

        buyTicketsButton.setBackground(new java.awt.Color(158, 155, 255));
        buyTicketsButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        buyTicketsButton.setText("Buy Tickets!");
        buyTicketsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyTicketsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(searchBoxText, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel)
                            .addGroup(searchPanelLayout.createSequentialGroup()
                                .addComponent(searchLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(buyTicketsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(searchBoxText)
                .addGap(12, 12, 12)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(buyTicketsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        alsoLikePanel.setBackground(new java.awt.Color(87, 79, 198));

        searchBoxText1.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
        searchBoxText1.setForeground(new java.awt.Color(242, 242, 242));

        alsoLikeLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        alsoLikeLabel.setForeground(new java.awt.Color(243, 224, 52));
        alsoLikeLabel.setText("You May Also Like..");

        ImageIcon subject480 = new ImageIcon(getClass().getResource("Images/subject480.png"));
        subject480Label.setIcon(subject480);

        comingSoonLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        comingSoonLabel.setForeground(new java.awt.Color(255, 255, 255));
        comingSoonLabel.setText("Coming to theatres soon . . .");

        javax.swing.GroupLayout alsoLikePanelLayout = new javax.swing.GroupLayout(alsoLikePanel);
        alsoLikePanel.setLayout(alsoLikePanelLayout);
        alsoLikePanelLayout.setHorizontalGroup(
            alsoLikePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alsoLikePanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(alsoLikePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comingSoonLabel)
                    .addGroup(alsoLikePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(subject480Label, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchBoxText1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(alsoLikePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(alsoLikePanelLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(alsoLikeLabel)
                    .addContainerGap(259, Short.MAX_VALUE)))
        );
        alsoLikePanelLayout.setVerticalGroup(
            alsoLikePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alsoLikePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(searchBoxText1)
                .addGap(43, 43, 43)
                .addComponent(subject480Label, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comingSoonLabel)
                .addGap(46, 46, 46))
            .addGroup(alsoLikePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(alsoLikePanelLayout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(alsoLikeLabel)
                    .addContainerGap(343, Short.MAX_VALUE)))
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

        javax.swing.GroupLayout searchResultsPanelLayout = new javax.swing.GroupLayout(searchResultsPanel);
        searchResultsPanel.setLayout(searchResultsPanelLayout);
        searchResultsPanelLayout.setHorizontalGroup(
            searchResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchResultsPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(searchResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(searchResultsPanelLayout.createSequentialGroup()
                        .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(alsoLikePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchResultsPanelLayout.createSequentialGroup()
                        .addComponent(moviesTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        searchResultsPanelLayout.setVerticalGroup(
            searchResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchResultsPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(searchResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moviesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(searchResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(alsoLikePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(213, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchResultsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchResultsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }                    

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {  //user pressed home button           
        
        this.setVisible(false); //close SearchResults
        
        if(registered == true) //if user is registered
        {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true); //open MainPage
            }
            }); 
        }
        else //user is unregistered
        {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuestPage().setVisible(true); //open GuestPage
            }
            });
        }
        
    }                                          

    private void buyTicketsButtonActionPerformed(java.awt.event.ActionEvent evt) { //user pressed buy tickets button    
        this.setVisible(false); //close SearchResults
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowtimeForm(movie).setVisible(true); //open ShowtimeForm
            }
        });
    }                                                

    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchResults(movie, registered, search).setVisible(true);
            }
        });
    }

    // Variables declaration                    
    private javax.swing.JLabel alsoLikeLabel;
    private javax.swing.JPanel alsoLikePanel;
    private javax.swing.JButton buyTicketsButton;
    private javax.swing.JLabel comingSoonLabel;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel moviesTitle;
    private javax.swing.JLabel searchBoxText;
    private javax.swing.JLabel searchBoxText1;
    private javax.swing.JLabel searchLabel1;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JPanel searchResultsPanel;
    private javax.swing.JLabel searchText;
    private javax.swing.JLabel subject480Label;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration                   
}
