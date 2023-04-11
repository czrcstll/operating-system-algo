package oscase2;

import MainMenu.MainMenuOS;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class node
{
        int distance = 0;
        boolean accessed = false;
}

public class MainFrameCase2 extends JFrame implements ActionListener
{
    int[] x;
    int[] y, y1, y2;
    int[] tempX;
    int[] temp1X;
    int[] temp2X;

    private javax.swing.JTable FCFSTable10;
    private javax.swing.JTable FCFSTable5;
    private javax.swing.JTable FCFSTable6;
    private javax.swing.JTable FCFSTable7;
    private javax.swing.JTable FCFSTable8;
    private javax.swing.JTable FCFSTable9;
    private javax.swing.JLabel fcfshead;
    private javax.swing.JScrollPane FCFSTableScrollPane;
    private javax.swing.JScrollPane FCFSTableScrollPane1;
    private javax.swing.JScrollPane FCFSTableScrollPane2;
    private javax.swing.JScrollPane FCFSTableScrollPane3;
    private javax.swing.JScrollPane FCFSTableScrollPane4;
    private javax.swing.JScrollPane FCFSTableScrollPane5;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton calculateButton1;
    private javax.swing.JButton calculateButton2;
    private javax.swing.JButton calculateButton3;
    private javax.swing.JButton calculateButton4;
    private javax.swing.JButton calculateButton5;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton clearButton1;
    private javax.swing.JButton clearButton2;
    private javax.swing.JButton clearButton3;
    private javax.swing.JButton clearButton4;
    private javax.swing.JButton clearButton5;
    private javax.swing.JButton clearDiskButton;
    private javax.swing.JButton clearDiskButton1;
    private javax.swing.JButton clearDiskButton2;
    private javax.swing.JButton clearDiskButton3;
    private javax.swing.JButton clearDiskButton4;
    private javax.swing.JButton clearDiskButton5;
    private javax.swing.JButton clookButton;
    private javax.swing.JPanel clookPanel;
    private javax.swing.JLabel clookbg;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton cscanButton;
    private javax.swing.JPanel cscanPanel;
    private javax.swing.JLabel cscanbg;
    private javax.swing.JButton diskButton;
    private javax.swing.JButton diskButton1;
    private javax.swing.JButton diskButton2;
    private javax.swing.JButton diskButton3;
    private javax.swing.JButton diskButton4;
    private javax.swing.JButton diskButton5;
    private javax.swing.JTextField diskTextField;
    private javax.swing.JTextField diskTextField1;
    private javax.swing.JTextField diskTextField2;
    private javax.swing.JTextField diskTextField3;
    private javax.swing.JTextField diskTextField4;
    private javax.swing.JTextField diskTextField5;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton fcfsButton;
    private javax.swing.JPanel fcfsPanel;
    private javax.swing.JLabel fcfsbg;
    private javax.swing.JPanel graphPanel10;
    private javax.swing.JPanel graphPanel5;
    private javax.swing.JPanel graphPanel6;
    private javax.swing.JPanel graphPanel7;
    private javax.swing.JPanel graphPanel8;
    private javax.swing.JPanel graphPanel9;
    private javax.swing.JScrollPane graphScrollPane;
    private javax.swing.JScrollPane graphScrollPane1;
    private javax.swing.JScrollPane graphScrollPane2;
    private javax.swing.JScrollPane graphScrollPane3;
    private javax.swing.JScrollPane graphScrollPane4;
    private javax.swing.JScrollPane graphScrollPane5;
    private javax.swing.JButton headButton;
    private javax.swing.JButton headButton1;
    private javax.swing.JButton headButton2;
    private javax.swing.JButton headButton3;
    private javax.swing.JButton headButton4;
    private javax.swing.JButton headButton5;
    private javax.swing.JTextField headTextField;
    private javax.swing.JTextField headTextField1;
    private javax.swing.JTextField headTextField2;
    private javax.swing.JTextField headTextField3;
    private javax.swing.JTextField headTextField4;
    private javax.swing.JTextField headTextField5;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel homebg;
    private javax.swing.JButton ioRequestsButton;
    private javax.swing.JButton ioRequestsButton1;
    private javax.swing.JButton ioRequestsButton2;
    private javax.swing.JButton ioRequestsButton3;
    private javax.swing.JButton ioRequestsButton4;
    private javax.swing.JButton ioRequestsButton5;
    private javax.swing.JButton lookButton;
    private javax.swing.JPanel lookPanel;
    private javax.swing.JLabel lookbg;
    private javax.swing.JLabel mainbg;
    private javax.swing.JTextField requestsTextField;
    private javax.swing.JTextField requestsTextField1;
    private javax.swing.JTextField requestsTextField2;
    private javax.swing.JTextField requestsTextField3;
    private javax.swing.JTextField requestsTextField4;
    private javax.swing.JTextField requestsTextField5;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton resetButton1;
    private javax.swing.JButton resetButton2;
    private javax.swing.JButton resetButton3;
    private javax.swing.JButton resetButton4;
    private javax.swing.JButton resetButton5;
    private javax.swing.JTextArea resultsTextArea10;
    private javax.swing.JTextArea resultsTextArea5;
    private javax.swing.JTextArea resultsTextArea6;
    private javax.swing.JTextArea resultsTextArea7;
    private javax.swing.JTextArea resultsTextArea8;
    private javax.swing.JTextArea resultsTextArea9;
    private javax.swing.JScrollPane resultsTextAreaScrollPane;
    private javax.swing.JScrollPane resultsTextAreaScrollPane1;
    private javax.swing.JScrollPane resultsTextAreaScrollPane2;
    private javax.swing.JScrollPane resultsTextAreaScrollPane3;
    private javax.swing.JScrollPane resultsTextAreaScrollPane4;
    private javax.swing.JScrollPane resultsTextAreaScrollPane5;
    private javax.swing.JButton scanButton;
    private javax.swing.JPanel scanPanel;
    private javax.swing.JLabel scanbg;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JButton sstfButton;
    private javax.swing.JPanel sstfPanel;
    private javax.swing.JLabel sstfbg;
    private javax.swing.JLabel tracksLabel;
    private javax.swing.JLabel tracksLabel1;
    private javax.swing.JLabel tracksLabel2;
    private javax.swing.JLabel tracksLabel3;
    private javax.swing.JLabel tracksLabel4;
    private javax.swing.JLabel tracksLabel5;
    public MainFrameCase2()
    {
        MainPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        fcfsButton = new javax.swing.JButton();
        sstfButton = new javax.swing.JButton();
        scanButton = new javax.swing.JButton();
        cscanButton = new javax.swing.JButton();
        lookButton = new javax.swing.JButton();
        clookButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        homebg = new javax.swing.JLabel();
        fcfsPanel = new javax.swing.JPanel();
        diskTextField = new javax.swing.JTextField();
        diskButton = new javax.swing.JButton();
        clearDiskButton = new javax.swing.JButton();
        requestsTextField = new javax.swing.JTextField();
        headButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        headTextField = new javax.swing.JTextField();
        ioRequestsButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        calculateButton = new javax.swing.JButton();
        tracksLabel = new javax.swing.JLabel();
        graphScrollPane = new javax.swing.JScrollPane();
        graphPanel10 = new javax.swing.JPanel();
        FCFSTableScrollPane = new javax.swing.JScrollPane();
        FCFSTable10 = new javax.swing.JTable();
        resultsTextAreaScrollPane = new javax.swing.JScrollPane();
        resultsTextArea10 = new javax.swing.JTextArea();
        fcfsbg = new javax.swing.JLabel();
        sstfPanel = new javax.swing.JPanel();
        diskTextField1 = new javax.swing.JTextField();
        diskButton1 = new javax.swing.JButton();
        clearDiskButton1 = new javax.swing.JButton();
        requestsTextField1 = new javax.swing.JTextField();
        headButton1 = new javax.swing.JButton();
        clearButton1 = new javax.swing.JButton();
        headTextField1 = new javax.swing.JTextField();
        ioRequestsButton1 = new javax.swing.JButton();
        resetButton1 = new javax.swing.JButton();
        calculateButton1 = new javax.swing.JButton();
        tracksLabel1 = new javax.swing.JLabel();
        fcfshead = new javax.swing.JLabel();
        graphScrollPane1 = new javax.swing.JScrollPane();
        graphPanel9 = new javax.swing.JPanel();
        FCFSTableScrollPane1 = new javax.swing.JScrollPane();
        FCFSTable9 = new javax.swing.JTable();
        resultsTextAreaScrollPane1 = new javax.swing.JScrollPane();
        resultsTextArea9 = new javax.swing.JTextArea();
        sstfbg = new javax.swing.JLabel();
        scanPanel = new javax.swing.JPanel();
        diskTextField2 = new javax.swing.JTextField();
        diskButton2 = new javax.swing.JButton();
        clearDiskButton2 = new javax.swing.JButton();
        requestsTextField2 = new javax.swing.JTextField();
        headButton2 = new javax.swing.JButton();
        clearButton2 = new javax.swing.JButton();
        headTextField2 = new javax.swing.JTextField();
        ioRequestsButton2 = new javax.swing.JButton();
        resetButton2 = new javax.swing.JButton();
        calculateButton2 = new javax.swing.JButton();
        tracksLabel2 = new javax.swing.JLabel();
        graphScrollPane2 = new javax.swing.JScrollPane();
        graphPanel8 = new javax.swing.JPanel();
        FCFSTableScrollPane2 = new javax.swing.JScrollPane();
        FCFSTable8 = new javax.swing.JTable();
        resultsTextAreaScrollPane2 = new javax.swing.JScrollPane();
        resultsTextArea8 = new javax.swing.JTextArea();
        scanbg = new javax.swing.JLabel();
        cscanPanel = new javax.swing.JPanel();
        diskTextField3 = new javax.swing.JTextField();
        diskButton3 = new javax.swing.JButton();
        clearDiskButton3 = new javax.swing.JButton();
        requestsTextField3 = new javax.swing.JTextField();
        headButton3 = new javax.swing.JButton();
        clearButton3 = new javax.swing.JButton();
        headTextField3 = new javax.swing.JTextField();
        ioRequestsButton3 = new javax.swing.JButton();
        resetButton3 = new javax.swing.JButton();
        calculateButton3 = new javax.swing.JButton();
        tracksLabel3 = new javax.swing.JLabel();
        graphScrollPane3 = new javax.swing.JScrollPane();
        graphPanel7 = new javax.swing.JPanel();
        FCFSTableScrollPane3 = new javax.swing.JScrollPane();
        FCFSTable7 = new javax.swing.JTable();
        resultsTextAreaScrollPane3 = new javax.swing.JScrollPane();
        resultsTextArea7 = new javax.swing.JTextArea();
        cscanbg = new javax.swing.JLabel();
        lookPanel = new javax.swing.JPanel();
        diskTextField4 = new javax.swing.JTextField();
        diskButton4 = new javax.swing.JButton();
        clearDiskButton4 = new javax.swing.JButton();
        requestsTextField4 = new javax.swing.JTextField();
        headButton4 = new javax.swing.JButton();
        clearButton4 = new javax.swing.JButton();
        headTextField4 = new javax.swing.JTextField();
        ioRequestsButton4 = new javax.swing.JButton();
        resetButton4 = new javax.swing.JButton();
        calculateButton4 = new javax.swing.JButton();
        tracksLabel4 = new javax.swing.JLabel();
        graphScrollPane4 = new javax.swing.JScrollPane();
        graphPanel6 = new javax.swing.JPanel();
        FCFSTableScrollPane4 = new javax.swing.JScrollPane();
        FCFSTable6 = new javax.swing.JTable();
        resultsTextAreaScrollPane4 = new javax.swing.JScrollPane();
        resultsTextArea6 = new javax.swing.JTextArea();
        lookbg = new javax.swing.JLabel();
        clookPanel = new javax.swing.JPanel();
        diskTextField5 = new javax.swing.JTextField();
        diskButton5 = new javax.swing.JButton();
        clearDiskButton5 = new javax.swing.JButton();
        requestsTextField5 = new javax.swing.JTextField();
        headButton5 = new javax.swing.JButton();
        clearButton5 = new javax.swing.JButton();
        headTextField5 = new javax.swing.JTextField();
        ioRequestsButton5 = new javax.swing.JButton();
        resetButton5 = new javax.swing.JButton();
        calculateButton5 = new javax.swing.JButton();
        tracksLabel5 = new javax.swing.JLabel();
        graphScrollPane5 = new javax.swing.JScrollPane();
        graphPanel5 = new javax.swing.JPanel();
        FCFSTableScrollPane5 = new javax.swing.JScrollPane();
        FCFSTable5 = new javax.swing.JTable();
        resultsTextAreaScrollPane5 = new javax.swing.JScrollPane();
        resultsTextArea5 = new javax.swing.JTextArea();
        clookbg = new javax.swing.JLabel();
        mainbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(950, 600));

        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setOpaque(false);
        sidePanel.setLayout(new java.awt.GridLayout(8, 0, 2, 2));

        homeButton.setBackground(new java.awt.Color(43, 137, 253));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscase2/homeicon.png"))); // NOI18N
        homeButton.setBorder(null);
        homeButton.setContentAreaFilled(false);
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeButtonMouseExited(evt);
            }
        });
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        sidePanel.add(homeButton);

        fcfsButton.setBackground(new java.awt.Color(43, 137, 253));
        fcfsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscase2/fcfsicon.png"))); // NOI18N
        fcfsButton.setBorder(null);
        fcfsButton.setContentAreaFilled(false);
        fcfsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fcfsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fcfsButtonMouseExited(evt);
            }
        });
        fcfsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcfsButtonActionPerformed(evt);
            }
        });
        sidePanel.add(fcfsButton);

        sstfButton.setBackground(new java.awt.Color(43, 137, 253));
        sstfButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscase2/sstficon.png"))); // NOI18N
        sstfButton.setBorder(null);
        sstfButton.setContentAreaFilled(false);
        sstfButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sstfButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sstfButtonMouseExited(evt);
            }
        });
        sstfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sstfButtonActionPerformed(evt);
            }
        });
        sidePanel.add(sstfButton);

        scanButton.setBackground(new java.awt.Color(43, 137, 253));
        scanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscase2/scanicon.png"))); // NOI18N
        scanButton.setBorder(null);
        scanButton.setContentAreaFilled(false);
        scanButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                scanButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                scanButtonMouseExited(evt);
            }
        });
        scanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanButtonActionPerformed(evt);
            }
        });
        sidePanel.add(scanButton);

        cscanButton.setBackground(new java.awt.Color(43, 137, 253));
        cscanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscase2/cscanicon.png"))); // NOI18N
        cscanButton.setBorder(null);
        cscanButton.setContentAreaFilled(false);
        cscanButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cscanButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cscanButtonMouseExited(evt);
            }
        });
        cscanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cscanButtonActionPerformed(evt);
            }
        });
        sidePanel.add(cscanButton);

        lookButton.setBackground(new java.awt.Color(43, 137, 253));
        lookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscase2/lookicon.png"))); // NOI18N
        lookButton.setBorder(null);
        lookButton.setContentAreaFilled(false);
        lookButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lookButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lookButtonMouseExited(evt);
            }
        });
        lookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lookButtonActionPerformed(evt);
            }
        });
        sidePanel.add(lookButton);

        clookButton.setBackground(new java.awt.Color(43, 137, 253));
        clookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscase2/clookicon.png"))); // NOI18N
        clookButton.setBorder(null);
        clookButton.setContentAreaFilled(false);
        clookButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clookButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clookButtonMouseExited(evt);
            }
        });
        clookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clookButtonActionPerformed(evt);
            }
        });
        sidePanel.add(clookButton);

        exitButton.setBackground(new java.awt.Color(43, 137, 253));
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscase2/exiticon.png"))); // NOI18N
        exitButton.setBorder(null);
        exitButton.setContentAreaFilled(false);
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
        });
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        sidePanel.add(exitButton);

        MainPanel.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 600));

        contentPanel.setLayout(new java.awt.CardLayout());

        homePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homebg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscase2/homePanel-2.png"))); // NOI18N
        homePanel.add(homebg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        contentPanel.add(homePanel, "card2");

        fcfsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        diskTextField.setBorder(null);
        diskTextField.setOpaque(false);
        diskTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diskTextFieldActionPerformed(evt);
            }
        });
        fcfsPanel.add(diskTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 186, 130, 20));

        diskButton.setBorderPainted(false);
        diskButton.setContentAreaFilled(false);
        fcfsPanel.add(diskButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 180, 30, 30));

        clearDiskButton.setBorderPainted(false);
        clearDiskButton.setContentAreaFilled(false);
        fcfsPanel.add(clearDiskButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 30, 30));

        requestsTextField.setBorder(null);
        requestsTextField.setOpaque(false);
        requestsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestsTextFieldActionPerformed(evt);
            }
        });
        fcfsPanel.add(requestsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 130, 30));

        headButton.setBorderPainted(false);
        headButton.setContentAreaFilled(false);
        fcfsPanel.add(headButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 30, 30));

        clearButton.setBorderPainted(false);
        clearButton.setContentAreaFilled(false);
        fcfsPanel.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 30, 30));

        headTextField.setBorder(null);
        headTextField.setOpaque(false);
        headTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headTextFieldActionPerformed(evt);
            }
        });
        fcfsPanel.add(headTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 130, 20));

        ioRequestsButton.setBorderPainted(false);
        ioRequestsButton.setContentAreaFilled(false);
        fcfsPanel.add(ioRequestsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 290, 30, 30));

        resetButton.setBorderPainted(false);
        resetButton.setContentAreaFilled(false);
        fcfsPanel.add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 30, 30));

        calculateButton.setBorderPainted(false);
        calculateButton.setContentAreaFilled(false);
        fcfsPanel.add(calculateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 110, 30));

        tracksLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tracksLabel.setText("[tracks]");
        fcfsPanel.add(tracksLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, -1, 30));

        graphScrollPane.setBorder(null);

        javax.swing.GroupLayout graphPanel10Layout = new javax.swing.GroupLayout(graphPanel10);
        graphPanel10.setLayout(graphPanel10Layout);
        graphPanel10Layout.setHorizontalGroup(
            graphPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        graphPanel10Layout.setVerticalGroup(
            graphPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        graphScrollPane.setViewportView(graphPanel10);

        fcfsPanel.add(graphScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 440, 330));

        FCFSTableScrollPane.setOpaque(false);

        FCFSTable10.setBackground(new java.awt.Color(236, 240, 243));
        FCFSTable10.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        FCFSTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "    PROCESS", "IO/REQUESTS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FCFSTable10.setOpaque(false);
        FCFSTable10.getTableHeader().setReorderingAllowed(false);
        FCFSTableScrollPane.setViewportView(FCFSTable10);
        if (FCFSTable10.getColumnModel().getColumnCount() > 0) {
            FCFSTable10.getColumnModel().getColumn(1).setResizable(false);
        }

        fcfsPanel.add(FCFSTableScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 240, 150));

        resultsTextAreaScrollPane.setBorder(null);
        resultsTextAreaScrollPane.setOpaque(false);
        resultsTextAreaScrollPane.setViewport(null);

        resultsTextArea10.setBackground(new java.awt.Color(236, 240, 243));
        resultsTextArea10.setColumns(20);
        resultsTextArea10.setRows(5);
        resultsTextArea10.setBorder(null);
        resultsTextArea10.setOpaque(false);
        resultsTextAreaScrollPane.setViewportView(resultsTextArea10);

        fcfsPanel.add(resultsTextAreaScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 430, 130));

        fcfsbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscase2/fcfspanel.png"))); // NOI18N
        fcfsPanel.add(fcfsbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        contentPanel.add(fcfsPanel, "card2");

        sstfPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        diskTextField1.setBorder(null);
        diskTextField1.setOpaque(false);
        diskTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diskTextField1ActionPerformed(evt);
            }
        });
        sstfPanel.add(diskTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 186, 130, 20));

        diskButton1.setBorderPainted(false);
        diskButton1.setContentAreaFilled(false);
        sstfPanel.add(diskButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 180, 30, 30));

        clearDiskButton1.setBorderPainted(false);
        clearDiskButton1.setContentAreaFilled(false);
        sstfPanel.add(clearDiskButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 30, 30));

        requestsTextField1.setBorder(null);
        requestsTextField1.setOpaque(false);
        requestsTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestsTextField1ActionPerformed(evt);
            }
        });
        sstfPanel.add(requestsTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 130, 30));

        headButton1.setBorderPainted(false);
        headButton1.setContentAreaFilled(false);
        sstfPanel.add(headButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 30, 30));

        clearButton1.setBorderPainted(false);
        clearButton1.setContentAreaFilled(false);
        sstfPanel.add(clearButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 30, 30));

        headTextField1.setBorder(null);
        headTextField1.setOpaque(false);
        headTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headTextField1ActionPerformed(evt);
            }
        });
        sstfPanel.add(headTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 130, 20));

        ioRequestsButton1.setBorderPainted(false);
        ioRequestsButton1.setContentAreaFilled(false);
        sstfPanel.add(ioRequestsButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 290, 30, 30));

        resetButton1.setBorderPainted(false);
        resetButton1.setContentAreaFilled(false);
        sstfPanel.add(resetButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 30, 30));

        calculateButton1.setBorderPainted(false);
        calculateButton1.setContentAreaFilled(false);
        sstfPanel.add(calculateButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 110, 30));

        tracksLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tracksLabel1.setText("[tracks]");
        sstfPanel.add(tracksLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, -1, 30));

        graphScrollPane1.setBorder(null);

        javax.swing.GroupLayout graphPanel9Layout = new javax.swing.GroupLayout(graphPanel9);
        graphPanel9.setLayout(graphPanel9Layout);
        graphPanel9Layout.setHorizontalGroup(
            graphPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        graphPanel9Layout.setVerticalGroup(
            graphPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        graphScrollPane1.setViewportView(graphPanel9);

        sstfPanel.add(graphScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 440, 330));

        FCFSTableScrollPane1.setOpaque(false);

        FCFSTable9.setBackground(new java.awt.Color(236, 240, 243));
        FCFSTable9.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        FCFSTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "    PROCESS", "IO/REQUESTS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FCFSTable9.setOpaque(false);
        FCFSTable9.getTableHeader().setReorderingAllowed(false);
        FCFSTableScrollPane1.setViewportView(FCFSTable9);
        if (FCFSTable9.getColumnModel().getColumnCount() > 0) {
            FCFSTable9.getColumnModel().getColumn(1).setResizable(false);
        }

        sstfPanel.add(FCFSTableScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 240, 150));

        resultsTextAreaScrollPane1.setBorder(null);
        resultsTextAreaScrollPane1.setOpaque(false);
        resultsTextAreaScrollPane1.setViewport(null);

        resultsTextArea9.setBackground(new java.awt.Color(236, 240, 243));
        resultsTextArea9.setColumns(20);
        resultsTextArea9.setRows(5);
        resultsTextArea9.setBorder(null);
        resultsTextArea9.setOpaque(false);
        resultsTextAreaScrollPane1.setViewportView(resultsTextArea9);

        sstfPanel.add(resultsTextAreaScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 430, 130));

        sstfbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscase2/sstfpanel.png"))); // NOI18N
        sstfPanel.add(sstfbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        contentPanel.add(sstfPanel, "card2");

        scanPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        diskTextField2.setBorder(null);
        diskTextField2.setOpaque(false);
        diskTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diskTextField2ActionPerformed(evt);
            }
        });
        scanPanel.add(diskTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 186, 130, 20));

        diskButton2.setBorderPainted(false);
        diskButton2.setContentAreaFilled(false);
        scanPanel.add(diskButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 180, 30, 30));

        clearDiskButton2.setBorderPainted(false);
        clearDiskButton2.setContentAreaFilled(false);
        scanPanel.add(clearDiskButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 30, 30));

        requestsTextField2.setBorder(null);
        requestsTextField2.setOpaque(false);
        requestsTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestsTextField2ActionPerformed(evt);
            }
        });
        scanPanel.add(requestsTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 130, 30));

        headButton2.setBorderPainted(false);
        headButton2.setContentAreaFilled(false);
        scanPanel.add(headButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 30, 30));

        clearButton2.setBorderPainted(false);
        clearButton2.setContentAreaFilled(false);
        scanPanel.add(clearButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 30, 30));

        headTextField2.setBorder(null);
        headTextField2.setOpaque(false);
        headTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headTextField2ActionPerformed(evt);
            }
        });
        scanPanel.add(headTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 130, 20));

        ioRequestsButton2.setBorderPainted(false);
        ioRequestsButton2.setContentAreaFilled(false);
        scanPanel.add(ioRequestsButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 290, 30, 30));

        resetButton2.setBorderPainted(false);
        resetButton2.setContentAreaFilled(false);
        scanPanel.add(resetButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 30, 30));

        calculateButton2.setBorderPainted(false);
        calculateButton2.setContentAreaFilled(false);
        scanPanel.add(calculateButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 110, 30));

        tracksLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tracksLabel2.setText("[tracks]");
        scanPanel.add(tracksLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, -1, 30));

        graphScrollPane2.setBorder(null);

        javax.swing.GroupLayout graphPanel8Layout = new javax.swing.GroupLayout(graphPanel8);
        graphPanel8.setLayout(graphPanel8Layout);
        graphPanel8Layout.setHorizontalGroup(
            graphPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        graphPanel8Layout.setVerticalGroup(
            graphPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        graphScrollPane2.setViewportView(graphPanel8);

        scanPanel.add(graphScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 440, 330));

        FCFSTableScrollPane2.setOpaque(false);

        FCFSTable8.setBackground(new java.awt.Color(236, 240, 243));
        FCFSTable8.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        FCFSTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "    PROCESS", "IO/REQUESTS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FCFSTable8.setOpaque(false);
        FCFSTable8.getTableHeader().setReorderingAllowed(false);
        FCFSTableScrollPane2.setViewportView(FCFSTable8);
        if (FCFSTable8.getColumnModel().getColumnCount() > 0) {
            FCFSTable8.getColumnModel().getColumn(1).setResizable(false);
        }

        scanPanel.add(FCFSTableScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 240, 150));

        resultsTextAreaScrollPane2.setBorder(null);
        resultsTextAreaScrollPane2.setOpaque(false);
        resultsTextAreaScrollPane2.setViewport(null);

        resultsTextArea8.setBackground(new java.awt.Color(236, 240, 243));
        resultsTextArea8.setColumns(20);
        resultsTextArea8.setRows(5);
        resultsTextArea8.setBorder(null);
        resultsTextArea8.setOpaque(false);
        resultsTextAreaScrollPane2.setViewportView(resultsTextArea8);

        scanPanel.add(resultsTextAreaScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 430, 130));

        scanbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscase2/scanpanel.png"))); // NOI18N
        scanPanel.add(scanbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        contentPanel.add(scanPanel, "card2");

        cscanPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        diskTextField3.setBorder(null);
        diskTextField3.setOpaque(false);
        diskTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diskTextField3ActionPerformed(evt);
            }
        });
        cscanPanel.add(diskTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 186, 130, 20));

        diskButton3.setBorderPainted(false);
        diskButton3.setContentAreaFilled(false);
        cscanPanel.add(diskButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 180, 30, 30));

        clearDiskButton3.setBorderPainted(false);
        clearDiskButton3.setContentAreaFilled(false);
        cscanPanel.add(clearDiskButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 30, 30));

        requestsTextField3.setBorder(null);
        requestsTextField3.setOpaque(false);
        requestsTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestsTextField3ActionPerformed(evt);
            }
        });
        cscanPanel.add(requestsTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 130, 30));

        headButton3.setBorderPainted(false);
        headButton3.setContentAreaFilled(false);
        cscanPanel.add(headButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 30, 30));

        clearButton3.setBorderPainted(false);
        clearButton3.setContentAreaFilled(false);
        cscanPanel.add(clearButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 30, 30));

        headTextField3.setBorder(null);
        headTextField3.setOpaque(false);
        headTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headTextField3ActionPerformed(evt);
            }
        });
        cscanPanel.add(headTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 130, 20));

        ioRequestsButton3.setBorderPainted(false);
        ioRequestsButton3.setContentAreaFilled(false);
        cscanPanel.add(ioRequestsButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 290, 30, 30));

        resetButton3.setBorderPainted(false);
        resetButton3.setContentAreaFilled(false);
        cscanPanel.add(resetButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 30, 30));

        calculateButton3.setBorderPainted(false);
        calculateButton3.setContentAreaFilled(false);
        cscanPanel.add(calculateButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 110, 30));

        tracksLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tracksLabel3.setText("[tracks]");
        cscanPanel.add(tracksLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, -1, 30));

        graphScrollPane3.setBorder(null);

        javax.swing.GroupLayout graphPanel7Layout = new javax.swing.GroupLayout(graphPanel7);
        graphPanel7.setLayout(graphPanel7Layout);
        graphPanel7Layout.setHorizontalGroup(
            graphPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        graphPanel7Layout.setVerticalGroup(
            graphPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        graphScrollPane3.setViewportView(graphPanel7);

        cscanPanel.add(graphScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 440, 330));

        FCFSTableScrollPane3.setOpaque(false);

        FCFSTable7.setBackground(new java.awt.Color(236, 240, 243));
        FCFSTable7.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        FCFSTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "    PROCESS", "IO/REQUESTS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FCFSTable7.setOpaque(false);
        FCFSTable7.getTableHeader().setReorderingAllowed(false);
        FCFSTableScrollPane3.setViewportView(FCFSTable7);
        if (FCFSTable7.getColumnModel().getColumnCount() > 0) {
            FCFSTable7.getColumnModel().getColumn(1).setResizable(false);
        }

        cscanPanel.add(FCFSTableScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 240, 150));

        resultsTextAreaScrollPane3.setBorder(null);
        resultsTextAreaScrollPane3.setOpaque(false);
        resultsTextAreaScrollPane3.setViewport(null);

        resultsTextArea7.setBackground(new java.awt.Color(236, 240, 243));
        resultsTextArea7.setColumns(20);
        resultsTextArea7.setRows(5);
        resultsTextArea7.setBorder(null);
        resultsTextArea7.setOpaque(false);
        resultsTextAreaScrollPane3.setViewportView(resultsTextArea7);

        cscanPanel.add(resultsTextAreaScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 430, 130));

        cscanbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscase2/cscanpanel.png"))); // NOI18N
        cscanPanel.add(cscanbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        contentPanel.add(cscanPanel, "card2");

        lookPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        diskTextField4.setBorder(null);
        diskTextField4.setOpaque(false);
        diskTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diskTextField4ActionPerformed(evt);
            }
        });
        lookPanel.add(diskTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 186, 130, 20));

        diskButton4.setBorderPainted(false);
        diskButton4.setContentAreaFilled(false);
        lookPanel.add(diskButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 180, 30, 30));

        clearDiskButton4.setBorderPainted(false);
        clearDiskButton4.setContentAreaFilled(false);
        lookPanel.add(clearDiskButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 30, 30));

        requestsTextField4.setBorder(null);
        requestsTextField4.setOpaque(false);
        requestsTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestsTextField4ActionPerformed(evt);
            }
        });
        lookPanel.add(requestsTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 130, 30));

        headButton4.setBorderPainted(false);
        headButton4.setContentAreaFilled(false);
        lookPanel.add(headButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 30, 30));

        clearButton4.setBorderPainted(false);
        clearButton4.setContentAreaFilled(false);
        lookPanel.add(clearButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 30, 30));

        headTextField4.setBorder(null);
        headTextField4.setOpaque(false);
        headTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headTextField4ActionPerformed(evt);
            }
        });
        lookPanel.add(headTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 130, 20));

        ioRequestsButton4.setBorderPainted(false);
        ioRequestsButton4.setContentAreaFilled(false);
        lookPanel.add(ioRequestsButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 290, 30, 30));

        resetButton4.setBorderPainted(false);
        resetButton4.setContentAreaFilled(false);
        lookPanel.add(resetButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 30, 30));

        calculateButton4.setBorderPainted(false);
        calculateButton4.setContentAreaFilled(false);
        lookPanel.add(calculateButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 110, 30));

        tracksLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tracksLabel4.setText("[tracks]");
        lookPanel.add(tracksLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, -1, 30));

        graphScrollPane4.setBorder(null);

        javax.swing.GroupLayout graphPanel6Layout = new javax.swing.GroupLayout(graphPanel6);
        graphPanel6.setLayout(graphPanel6Layout);
        graphPanel6Layout.setHorizontalGroup(
            graphPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        graphPanel6Layout.setVerticalGroup(
            graphPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        graphScrollPane4.setViewportView(graphPanel6);

        lookPanel.add(graphScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 440, 330));

        FCFSTableScrollPane4.setOpaque(false);

        FCFSTable6.setBackground(new java.awt.Color(236, 240, 243));
        FCFSTable6.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        FCFSTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "    PROCESS", "IO/REQUESTS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FCFSTable6.setOpaque(false);
        FCFSTable6.getTableHeader().setReorderingAllowed(false);
        FCFSTableScrollPane4.setViewportView(FCFSTable6);
        if (FCFSTable6.getColumnModel().getColumnCount() > 0) {
            FCFSTable6.getColumnModel().getColumn(1).setResizable(false);
        }

        lookPanel.add(FCFSTableScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 240, 150));

        resultsTextAreaScrollPane4.setBorder(null);
        resultsTextAreaScrollPane4.setOpaque(false);
        resultsTextAreaScrollPane4.setViewport(null);

        resultsTextArea6.setBackground(new java.awt.Color(236, 240, 243));
        resultsTextArea6.setColumns(20);
        resultsTextArea6.setRows(5);
        resultsTextArea6.setBorder(null);
        resultsTextArea6.setOpaque(false);
        resultsTextAreaScrollPane4.setViewportView(resultsTextArea6);

        lookPanel.add(resultsTextAreaScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 430, 130));

        lookbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscase2/lookpanel.png"))); // NOI18N
        lookPanel.add(lookbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        contentPanel.add(lookPanel, "card2");

        clookPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        diskTextField5.setBorder(null);
        diskTextField5.setOpaque(false);
        diskTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diskTextField5ActionPerformed(evt);
            }
        });
        clookPanel.add(diskTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 186, 130, 20));

        diskButton5.setBorderPainted(false);
        diskButton5.setContentAreaFilled(false);
        clookPanel.add(diskButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 180, 30, 30));

        clearDiskButton5.setBorderPainted(false);
        clearDiskButton5.setContentAreaFilled(false);
        clookPanel.add(clearDiskButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 30, 30));

        requestsTextField5.setBorder(null);
        requestsTextField5.setOpaque(false);
        requestsTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestsTextField5ActionPerformed(evt);
            }
        });
        clookPanel.add(requestsTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 130, 30));

        headButton5.setBorderPainted(false);
        headButton5.setContentAreaFilled(false);
        clookPanel.add(headButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 30, 30));

        clearButton5.setBorderPainted(false);
        clearButton5.setContentAreaFilled(false);
        clookPanel.add(clearButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 30, 30));

        headTextField5.setBorder(null);
        headTextField5.setOpaque(false);
        headTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headTextField5ActionPerformed(evt);
            }
        });
        clookPanel.add(headTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 130, 20));

        ioRequestsButton5.setBorderPainted(false);
        ioRequestsButton5.setContentAreaFilled(false);
        clookPanel.add(ioRequestsButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 290, 30, 30));

        resetButton5.setBorderPainted(false);
        resetButton5.setContentAreaFilled(false);
        clookPanel.add(resetButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 30, 30));

        calculateButton5.setBorderPainted(false);
        calculateButton5.setContentAreaFilled(false);
        clookPanel.add(calculateButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 110, 30));

        tracksLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tracksLabel5.setText("[tracks]");
        clookPanel.add(tracksLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, -1, 30));

        graphScrollPane5.setBorder(null);

        javax.swing.GroupLayout graphPanel5Layout = new javax.swing.GroupLayout(graphPanel5);
        graphPanel5.setLayout(graphPanel5Layout);
        graphPanel5Layout.setHorizontalGroup(
            graphPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        graphPanel5Layout.setVerticalGroup(
            graphPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        graphScrollPane5.setViewportView(graphPanel5);

        clookPanel.add(graphScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 440, 330));

        FCFSTableScrollPane5.setOpaque(false);

        FCFSTable5.setBackground(new java.awt.Color(236, 240, 243));
        FCFSTable5.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        FCFSTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "    PROCESS", "IO/REQUESTS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FCFSTable5.setOpaque(false);
        FCFSTable5.getTableHeader().setReorderingAllowed(false);
        FCFSTableScrollPane5.setViewportView(FCFSTable5);
        if (FCFSTable5.getColumnModel().getColumnCount() > 0) {
            FCFSTable5.getColumnModel().getColumn(1).setResizable(false);
        }

        clookPanel.add(FCFSTableScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 240, 150));

        resultsTextAreaScrollPane5.setBorder(null);
        resultsTextAreaScrollPane5.setOpaque(false);
        resultsTextAreaScrollPane5.setViewport(null);

        resultsTextArea5.setBackground(new java.awt.Color(236, 240, 243));
        resultsTextArea5.setColumns(20);
        resultsTextArea5.setRows(5);
        resultsTextArea5.setBorder(null);
        resultsTextArea5.setOpaque(false);
        resultsTextAreaScrollPane5.setViewportView(resultsTextArea5);

        clookPanel.add(resultsTextAreaScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 430, 130));

        clookbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscase2/clookpanel.png"))); // NOI18N
        clookPanel.add(clookbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        contentPanel.add(clookPanel, "card2");

        MainPanel.add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 800, 600));

        mainbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscase2/case2frame.png"))); // NOI18N
        MainPanel.add(mainbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        
        headButton.addActionListener(this);
        ioRequestsButton.addActionListener(this);
        calculateButton.addActionListener(this);
        clearButton.addActionListener(this);
        resetButton.addActionListener(this);
        diskButton.addActionListener(this);
        clearDiskButton.addActionListener(this);
        
        headButton1.addActionListener(this);
        ioRequestsButton1.addActionListener(this);
        calculateButton1.addActionListener(this);
        clearButton1.addActionListener(this);
        resetButton1.addActionListener(this);
        diskButton1.addActionListener(this);
        clearDiskButton1.addActionListener(this);
        
        headButton2.addActionListener(this);
        ioRequestsButton2.addActionListener(this);
        calculateButton2.addActionListener(this);
        clearButton2.addActionListener(this);
        resetButton2.addActionListener(this);
        diskButton2.addActionListener(this);
        clearDiskButton2.addActionListener(this);
        
        headButton3.addActionListener(this);
        ioRequestsButton3.addActionListener(this);
        calculateButton3.addActionListener(this);
        clearButton3.addActionListener(this);
        resetButton3.addActionListener(this);
        diskButton3.addActionListener(this);
        clearDiskButton3.addActionListener(this);
        
        headButton4.addActionListener(this);
        ioRequestsButton4.addActionListener(this);
        calculateButton4.addActionListener(this);
        clearButton4.addActionListener(this);
        resetButton4.addActionListener(this);
        diskButton4.addActionListener(this);
        clearDiskButton4.addActionListener(this);
        
        headButton5.addActionListener(this);
        ioRequestsButton5.addActionListener(this);
        calculateButton5.addActionListener(this);
        clearButton5.addActionListener(this);
        resetButton5.addActionListener(this);
        diskButton5.addActionListener(this);
        clearDiskButton5.addActionListener(this);
        
        tableModel = (DefaultTableModel) FCFSTable10.getModel();
        tableModel1 = (DefaultTableModel) FCFSTable9.getModel();
        tableModel2 = (DefaultTableModel) FCFSTable8.getModel();
        tableModel3 = (DefaultTableModel) FCFSTable7.getModel();
        tableModel4 = (DefaultTableModel) FCFSTable6.getModel();
        tableModel5 = (DefaultTableModel) FCFSTable5.getModel();

        pack();
    }// </editor-fold>                        

    private void diskTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void requestsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void headTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void diskTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void requestsTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void headTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void diskTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void requestsTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void headTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void diskTextField3ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void requestsTextField3ActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void headTextField3ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void diskTextField4ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void requestsTextField4ActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void headTextField4ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void diskTextField5ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void requestsTextField5ActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void headTextField5ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        //clearing panel
        contentPanel.removeAll();
        contentPanel.repaint();
        contentPanel. revalidate();
        
        //adding panels
        contentPanel.add(homePanel);
        contentPanel.repaint();
        contentPanel. revalidate();
    }                                          

    private void fcfsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        //clearing panel
        contentPanel.removeAll();
        contentPanel.repaint();
        contentPanel. revalidate();
        
        //adding panels
        contentPanel.add(fcfsPanel);
        contentPanel.repaint();
        contentPanel. revalidate();
    }                                          

    private void sstfButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        //clearing panel
        contentPanel.removeAll();
        contentPanel.repaint();
        contentPanel. revalidate();
        
        //adding panels
        contentPanel.add(sstfPanel);
        contentPanel.repaint();
        contentPanel. revalidate();
    }                                          

    private void scanButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        //clearing panel
        contentPanel.removeAll();
        contentPanel.repaint();
        contentPanel. revalidate();
        
        //adding panels
        contentPanel.add(scanPanel);
        contentPanel.repaint();
        contentPanel. revalidate();
    }                                          

    private void cscanButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        //clearing panel
        contentPanel.removeAll();
        contentPanel.repaint();
        contentPanel. revalidate();
        
        //adding panels
        contentPanel.add(cscanPanel);
        contentPanel.repaint();
        contentPanel. revalidate();
    }                                           

    private void lookButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        //clearing panel
        contentPanel.removeAll();
        contentPanel.repaint();
        contentPanel. revalidate();
        
        //adding panels
        contentPanel.add(lookPanel);
        contentPanel.repaint();
        contentPanel. revalidate();
    }                                          

    private void clookButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        //clearing panel
        contentPanel.removeAll();
        contentPanel.repaint();
        contentPanel. revalidate();
        
        //adding panels
        contentPanel.add(clookPanel);
        contentPanel.repaint();
        contentPanel. revalidate();
    }                                           

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {   
        this.dispose();
        MainMenuOS mmos = new MainMenuOS();
        mmos.setVisible(true);
        mmos.setResizable(false);
        mmos.setLocationRelativeTo(null); 
        mmos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }                                          

    private void homeButtonMouseEntered(java.awt.event.MouseEvent evt) {                                        
        homeButton.setOpaque(true);
    }                                       

    private void fcfsButtonMouseEntered(java.awt.event.MouseEvent evt) {                                        
        fcfsButton.setOpaque(true);
    }                                       

    private void sstfButtonMouseEntered(java.awt.event.MouseEvent evt) {                                        
        sstfButton.setOpaque(true);
    }                                       

    private void scanButtonMouseEntered(java.awt.event.MouseEvent evt) {                                        
        scanButton.setOpaque(true);
    }                                       

    private void cscanButtonMouseEntered(java.awt.event.MouseEvent evt) {                                         
        cscanButton.setOpaque(true);
    }                                        

    private void lookButtonMouseEntered(java.awt.event.MouseEvent evt) {                                        
        lookButton.setOpaque(true);
    }                                       

    private void clookButtonMouseEntered(java.awt.event.MouseEvent evt) {                                         
        clookButton.setOpaque(true);
    }                                        

    private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {                                        
        exitButton.setOpaque(true);
    }                                       

    private void fcfsButtonMouseExited(java.awt.event.MouseEvent evt) {                                       
        fcfsButton.setOpaque(false);
    }                                      

    private void homeButtonMouseExited(java.awt.event.MouseEvent evt) {                                       
        homeButton.setOpaque(false);
    }                                      

    private void sstfButtonMouseExited(java.awt.event.MouseEvent evt) {                                       
        sstfButton.setOpaque(false);
    }                                      

    private void scanButtonMouseExited(java.awt.event.MouseEvent evt) {                                       
        scanButton.setOpaque(false);
    }                                      

    private void cscanButtonMouseExited(java.awt.event.MouseEvent evt) {                                        
        cscanButton.setOpaque(false);
    }                                       

    private void lookButtonMouseExited(java.awt.event.MouseEvent evt) {                                       
       lookButton.setOpaque(false);
    }                                      

    private void clookButtonMouseExited(java.awt.event.MouseEvent evt) {                                        
        clookButton.setOpaque(false);
    }                                       

    private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {                                       
       exitButton.setOpaque(false);
    }                                      
    
    
    String head, requests, disk;
    int requestsInt, headInt, totalTracks = 0, track, distance[], sort[], temp, sstffirst, diskInt;
    
    DefaultTableModel tableModel;
    
    String head1, requests1, disk1;
    int requestsInt1, headInt1, totalTracks1 = 0, track1, distance1[], sort1[], temp1, first1, diskInt1;
    
    DefaultTableModel tableModel1;
    
    String head2, requests2, disk2;
    int requestsInt2, headInt2, totalTracks2 = 0, track2, distance2[], sort2[], temp2, first2, diskInt2;
    
    DefaultTableModel tableModel2;
    
    String head3, requests3, disk3;
    int requestsInt3, headInt3, totalTracks3 = 0, track3, distance3[], sort3[], temp3, first3, diskInt3;
    
    DefaultTableModel tableModel3;
    
    String head4, requests4, disk4;
    int requestsInt4, headInt4, totalTracks4 = 0, track4, distance4[], sort4[], temp4, first4, diskInt4;
    
    DefaultTableModel tableModel4;
    
    String head5, requests5, disk5;
    int requestsInt5, headInt5, totalTracks5 = 0, track5, distance5[], sort5[], temp5, first5, diskInt5;
    
    DefaultTableModel tableModel5;

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == headButton)
        {
            try
            {
                head = headTextField.getText();
                if(head.equals(""))
                    throw new NullPointerException();
                else
                {
                    headInt = Integer.parseInt(head);
                    headTextField.setEditable(false);

                    JOptionPane.showMessageDialog(
                                null, 
                                "The initial head start has been successfully set!", 
                                "Success!", 
                                JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch(NullPointerException ex)
            {
                JOptionPane.showMessageDialog(
                            null, 
                            "Set the value for the head start first! Please try again", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE);
            }
            catch(NumberFormatException ex)
            {
               JOptionPane.showMessageDialog(
                            null, 
                            "Incorrect value, please input numbers only! Please try again", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE); 
            }
        }
        
        if(e.getSource() == clearButton)
        {
            headTextField.setText("");
            headTextField.setEditable(true);
        }
        
        if(e.getSource() == ioRequestsButton)
        {   
            requests = requestsTextField.getText();
            requestsInt = Integer.parseInt(requests);
            
            tableModel.addRow(new Object[]{tableModel.getRowCount()+1, requests});
            requestsTextField.setText("");
        }
        
        if(e.getSource() == resetButton)
        {
            tableModel.setRowCount(0);
            requestsTextField.setText("");
            resultsTextArea10.selectAll();
            resultsTextArea10.replaceSelection("");
            tracksLabel.setText("");
        }
        
        if(e.getSource() == diskButton)
        {
            try
            {
                disk = diskTextField.getText();
                if(disk.equals(""))
                    throw new NullPointerException();
                else
                {
                    diskInt = Integer.parseInt(disk);
                    diskTextField.setEditable(false);
                    JOptionPane.showMessageDialog(
                            null, 
                            "The disk size has been successfully set!", 
                            "Success!", 
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch(NullPointerException ex)
            {
                JOptionPane.showMessageDialog(
                            null, 
                            "Set the value for the head start first! Please try again", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE);
            }
            catch(NumberFormatException ex)
            {
               JOptionPane.showMessageDialog(
                            null, 
                            "Incorrect value, please input numbers only! Please try again", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE); 
            }
        }
        
        if(e.getSource() == clearDiskButton)
        {
            diskTextField.setText("");
            diskTextField.setEditable(true);
            graphPanel10.removeAll();
        }
        
        if(e.getSource() == calculateButton)
        {
            if(diskTextField.isEditable() || headTextField.isEditable())
            {
                JOptionPane.showMessageDialog(
                        null, 
                        "Set the disk size and head start first! Please try again", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int[] req = new int[tableModel.getRowCount()];
                headInt = Integer.parseInt(head);

                for (int i = 0; i < tableModel.getRowCount(); i++)
                {
                    req[i] = Integer.parseInt(tableModel.getValueAt(i, 1).toString());
                }

                FCFS(req, headInt);

            }
        }
        
        if(e.getSource() == headButton1)
        {
            try
            {
                head1 = headTextField1.getText();
                if(head1.equals(""))
                    throw new NullPointerException();
                else
                {
                    headInt1 = Integer.parseInt(head1);
                    headTextField1.setEditable(false);

                    JOptionPane.showMessageDialog(
                                null, 
                                "The initial head start has been successfully set!", 
                                "Success!", 
                                JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch(NullPointerException ex)
            {
                JOptionPane.showMessageDialog(
                            null, 
                            "Set the value for the head start first! Please try again", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE);
            }
            catch(NumberFormatException ex)
            {
               JOptionPane.showMessageDialog(
                            null, 
                            "Incorrect value, please input numbers only! Please try again", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE); 
            }
        }
        
        if(e.getSource() == clearButton1)
        {
            headTextField1.setText("");
            headTextField1.setEditable(true);
        }
        
        if(e.getSource() == ioRequestsButton1)
        {   
            requests1 = requestsTextField1.getText();
            requestsInt1 = Integer.parseInt(requests1);
            
            tableModel1.addRow(new Object[]{tableModel1.getRowCount()+1, requests1});
            requestsTextField1.setText("");
        }
        
        if(e.getSource() == resetButton1)
        {
            tableModel1.setRowCount(0);
            requestsTextField1.setText("");
            resultsTextArea9.selectAll();
            resultsTextArea9.replaceSelection("");
            tracksLabel1.setText("");
        }
        
        if(e.getSource() == diskButton1)
        {
            try
            {
                disk1 = diskTextField1.getText();
                if(disk1.equals(""))
                    throw new NullPointerException();
                else
                {
                    diskInt1 = Integer.parseInt(disk1);
                    diskTextField1.setEditable(false);
                    JOptionPane.showMessageDialog(
                            null, 
                            "The disk size has been successfully set!", 
                            "Success!", 
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch(NullPointerException ex)
            {
                JOptionPane.showMessageDialog(
                            null, 
                            "Set the value for the head start first! Please try again", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE);
            }
            catch(NumberFormatException ex)
            {
               JOptionPane.showMessageDialog(
                            null, 
                            "Incorrect value, please input numbers only! Please try again", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE); 
            }
        }
        
        if(e.getSource() == clearDiskButton1)
        {
            diskTextField1.setText("");
            diskTextField1.setEditable(true);
        }
        
        if(e.getSource() == calculateButton1)
        {
            int req[] = new int[tableModel1.getRowCount()];
            headInt1 = Integer.parseInt(head1);
            
            for (int i = 0; i < tableModel1.getRowCount(); i++)
            {
                req[i] = Integer.parseInt(tableModel1.getValueAt(i, 1).toString());
            }
            
            shortestSeekTimeFirst(req, headInt1);
            //98, 183, 37, 122, 14, 124, 65, and 67
        }
        
        if(e.getSource() == headButton2)
        {
            try
            {
                head2 = headTextField2.getText();
                if(head2.equals(""))
                    throw new NullPointerException();
                else
                {
                    headInt2 = Integer.parseInt(head2);
                    headTextField2.setEditable(false);

                    JOptionPane.showMessageDialog(
                                null, 
                                "The initial head start has been successfully set!", 
                                "Success!", 
                                JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch(NullPointerException ex)
            {
                JOptionPane.showMessageDialog(
                            null, 
                            "Set the value for the head start first! Please try again", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE);
            }
            catch(NumberFormatException ex)
            {
               JOptionPane.showMessageDialog(
                            null, 
                            "Incorrect value, please input numbers only! Please try again", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE); 
            }
        }
        
        if(e.getSource() == clearButton2)
        {
            headTextField2.setText("");
            headTextField2.setEditable(true);
        }
        
        if(e.getSource() == ioRequestsButton2)
        {   
            requests2 = requestsTextField2.getText();
            requestsInt2 = Integer.parseInt(requests2);
            
            tableModel2.addRow(new Object[]{tableModel2.getRowCount()+1, requests2});
            requestsTextField2.setText("");
        }
        
        if(e.getSource() == resetButton2)
        {
            tableModel2.setRowCount(0);
            requestsTextField2.setText("");
            resultsTextArea8.selectAll();
            resultsTextArea8.replaceSelection("");
            tracksLabel.setText("");
        }
        
        if(e.getSource() == diskButton2)
        {
            try
            {
                disk2 = diskTextField2.getText();
                if(disk2.equals(""))
                    throw new NullPointerException();
                else
                {
                    diskInt2 = Integer.parseInt(disk2);
                    diskTextField2.setEditable(false);
                    JOptionPane.showMessageDialog(
                            null, 
                            "The disk size has been successfully set!", 
                            "Success!", 
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch(NullPointerException ex)
            {
                JOptionPane.showMessageDialog(
                            null, 
                            "Set the value for the head start first! Please try again", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE);
            }
            catch(NumberFormatException ex)
            {
               JOptionPane.showMessageDialog(
                            null, 
                            "Incorrect value, please input numbers only! Please try again", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE); 
            }
        }
        
        if(e.getSource() == clearDiskButton2)
        {
            diskTextField2.setText("");
            diskTextField2.setEditable(true);
        }
        
        if(e.getSource() == calculateButton2)
        {
            int[] req = new int[tableModel2.getRowCount()];
            headInt2 = Integer.parseInt(head2);
            
            for (int i = 0; i < tableModel2.getRowCount(); i++)
            {
                req[i] = Integer.parseInt(tableModel2.getValueAt(i, 1).toString());
            }
            
            String direction = "left";
            
            SCAN(req, headInt2, direction);
            //98, 183, 37, 122, 14, 124, 65, and 67
        }
        
        if(e.getSource() == headButton3)
        {
            try
            {
                head3 = headTextField3.getText();
                if(head3.equals(""))
                    throw new NullPointerException();
                else
                {
                    headInt3 = Integer.parseInt(head3);
                    headTextField3.setEditable(false);

                    JOptionPane.showMessageDialog(
                                null, 
                                "The initial head start has been successfully set!", 
                                "Success!", 
                                JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch(NullPointerException ex)
            {
                JOptionPane.showMessageDialog(
                            null, 
                            "Set the value for the head start first! Please try again", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE);
            }
            catch(NumberFormatException ex)
            {
               JOptionPane.showMessageDialog(
                            null, 
                            "Incorrect value, please input numbers only! Please try again", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE); 
            }
        }
        
        if(e.getSource() == clearButton3)
        {
            headTextField3.setText("");
            headTextField3.setEditable(true);
        }
        
        if(e.getSource() == ioRequestsButton3)
        {   
            requests3 = requestsTextField3.getText();
            requestsInt3 = Integer.parseInt(requests3);
            
            tableModel3.addRow(new Object[]{tableModel3.getRowCount()+1, requests3});
            requestsTextField3.setText("");
        }
        
        if(e.getSource() == resetButton3)
        {
            tableModel3.setRowCount(0);
            requestsTextField3.setText("");
            resultsTextArea8.selectAll();
            resultsTextArea8.replaceSelection("");
            tracksLabel3.setText("");
        }
        
        if(e.getSource() == diskButton3)
        {
            try
            {
                disk3 = diskTextField3.getText();
                if(disk3.equals(""))
                    throw new NullPointerException();
                else
                {
                    diskInt3 = Integer.parseInt(disk3);
                    diskTextField3.setEditable(false);
                    JOptionPane.showMessageDialog(
                            null, 
                            "The disk size has been successfully set!", 
                            "Success!", 
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch(NullPointerException ex)
            {
                JOptionPane.showMessageDialog(
                            null, 
                            "Set the value for the head start first! Please try again", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE);
            }
            catch(NumberFormatException ex)
            {
               JOptionPane.showMessageDialog(
                            null, 
                            "Incorrect value, please input numbers only! Please try again", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE); 
            }
        }
        
        if(e.getSource() == clearDiskButton3)
        {
            diskTextField3.setText("");
            diskTextField3.setEditable(true);
        }
        
        if(e.getSource() == calculateButton3)
        {
            int req[] = new int[tableModel3.getRowCount()];
            headInt3 = Integer.parseInt(head3);
            diskInt3 = Integer.parseInt(disk3);
            
            for (int i = 0; i < tableModel3.getRowCount(); i++)
            {
                req[i] = Integer.parseInt(tableModel3.getValueAt(i, 1).toString());
            }
            
            CSCAN(req, headInt3, diskInt3);
            
            //98, 183, 37, 122, 14, 124, 65, and 67
        }
        
        if(e.getSource() == headButton4)
        {
            try
            {
                head4 = headTextField4.getText();
                if(head4.equals(""))
                    throw new NullPointerException();
                else
                {
                    headInt4 = Integer.parseInt(head4);
                    headTextField4.setEditable(false);

                    JOptionPane.showMessageDialog(
                                null, 
                                "The initial head start has been successfully set!", 
                                "Success!", 
                                JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch(NullPointerException ex)
            {
                JOptionPane.showMessageDialog(
                            null, 
                            "Set the value for the head start first! Please try again", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE);
            }
            catch(NumberFormatException ex)
            {
               JOptionPane.showMessageDialog(
                            null, 
                            "Incorrect value, please input numbers only! Please try again", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE); 
            }
        }
        
        if(e.getSource() == clearButton4)
        {
            headTextField4.setText("");
            headTextField4.setEditable(true);
        }
        
        if(e.getSource() == ioRequestsButton4)
        {   
            requests4 = requestsTextField4.getText();
            requestsInt4 = Integer.parseInt(requests4);
            
            tableModel4.addRow(new Object[]{tableModel4.getRowCount()+1, requests4});
            requestsTextField4.setText("");
        }
        
        if(e.getSource() == resetButton4)
        {
            tableModel4.setRowCount(0);
            requestsTextField4.setText("");
            resultsTextArea6.selectAll();
            resultsTextArea6.replaceSelection("");
            tracksLabel4.setText("");
        }
        
        if(e.getSource() == diskButton4)
        {
            try
            {
                disk4 = diskTextField4.getText();
                if(disk4.equals(""))
                    throw new NullPointerException();
                else
                {
                    diskInt4 = Integer.parseInt(disk4);
                    diskTextField4.setEditable(false);
                    JOptionPane.showMessageDialog(
                            null, 
                            "The disk size has been successfully set!", 
                            "Success!", 
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch(NullPointerException ex)
            {
                JOptionPane.showMessageDialog(
                            null, 
                            "Set the value for the head start first! Please try again", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE);
            }
            catch(NumberFormatException ex)
            {
               JOptionPane.showMessageDialog(
                            null, 
                            "Incorrect value, please input numbers only! Please try again", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE); 
            }
        }
        
        if(e.getSource() == clearDiskButton4)
        {
            diskTextField4.setText("");
            diskTextField4.setEditable(true);
        }
        
        if(e.getSource() == calculateButton4)
        {
            int req[] = new int[tableModel4.getRowCount()];
            String direction = "right";
            headInt4 = Integer.parseInt(head4);
            diskInt4 = Integer.parseInt(disk4);


            for (int i = 0; i < tableModel4.getRowCount(); i++)
            {
                req[i] = Integer.parseInt(tableModel4.getValueAt(i, 1).toString());
            }

            LOOK(req, headInt4, direction, diskInt4);
            
            //98, 183, 37, 122, 14, 124, 65, and 67
        }
        
        if(e.getSource() == headButton5)
        {
            try
            {
                head5 = headTextField5.getText();
                if(head5.equals(""))
                    throw new NullPointerException();
                else
                {
                    headInt5 = Integer.parseInt(head5);
                    headTextField5.setEditable(false);

                    JOptionPane.showMessageDialog(
                                null, 
                                "The initial head start has been successfully set!", 
                                "Success!", 
                                JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch(NullPointerException ex)
            {
                JOptionPane.showMessageDialog(
                            null, 
                            "Set the value for the head start first! Please try again", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE);
            }
            catch(NumberFormatException ex)
            {
               JOptionPane.showMessageDialog(
                            null, 
                            "Incorrect value, please input numbers only! Please try again", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE); 
            }
        }
        
        if(e.getSource() == clearButton5)
        {
            headTextField5.setText("");
            headTextField5.setEditable(true);
        }
        
        if(e.getSource() == ioRequestsButton5)
        {   
            requests5 = requestsTextField5.getText();
            requestsInt5 = Integer.parseInt(requests5);
            
            tableModel5.addRow(new Object[]{tableModel5.getRowCount()+1, requests5});
            requestsTextField5.setText("");
        }
        
        if(e.getSource() == resetButton5)
        {
            tableModel5.setRowCount(0);
            requestsTextField5.setText("");
            resultsTextArea5.selectAll();
            resultsTextArea5.replaceSelection("");
            tracksLabel5.setText("");
        }
        
        if(e.getSource() == diskButton5)
        {
            try
            {
                disk5 = diskTextField5.getText();
                if(disk5.equals(""))
                    throw new NullPointerException();
                else
                {
                    diskInt5 = Integer.parseInt(disk5);
                    diskTextField5.setEditable(false);
                    JOptionPane.showMessageDialog(
                            null, 
                            "The disk size has been successfully set!", 
                            "Success!", 
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch(NullPointerException ex)
            {
                JOptionPane.showMessageDialog(
                            null, 
                            "Set the value for the head start first! Please try again", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE);
            }
            catch(NumberFormatException ex)
            {
               JOptionPane.showMessageDialog(
                            null, 
                            "Incorrect value, please input numbers only! Please try again", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE); 
            }
        }
        
        if(e.getSource() == clearDiskButton5)
        {
            diskTextField5.setText("");
            diskTextField5.setEditable(true);
        }
        
        if(e.getSource() == calculateButton5)
        {
            int req[] = new int[tableModel5.getRowCount()];
            headInt5 = Integer.parseInt(head5);
            diskInt5 = Integer.parseInt(disk5);
            
            for (int i = 0; i < tableModel5.getRowCount(); i++)
            {
                req[i] = Integer.parseInt(tableModel5.getValueAt(i, 1).toString());
            }
            
            CLOOK(req, headInt5, diskInt5);
            
            //98, 183, 37, 122, 14, 124, 65, and 67
        }
    }   
    
    private void CLOOK(int[] arr, int head, int disk_size)
    {
        first5 = head;
	int seek_count = 0;
	int distance[] = new int[arr.length];
	int cur_track;
	ArrayList<Integer> left = new ArrayList<Integer>();
	ArrayList<Integer> right = new ArrayList<Integer>();
	ArrayList<Integer> seek_sequence = new ArrayList<Integer>();

	// Tracks on the left of the 
	// head will be serviced when 
	// once the head comes back 
	// to the beggining (left end) 
	for (int i = 0; i < arr.length; i++)
	{
		if (arr[i] < head)
		{
			left.add(arr[i]);
		}
		if (arr[i] > head)
		{
			right.add(arr[i]);
		}
	}

	// Sorting left and right vectors 
	Collections.sort(left);
	Collections.sort(right);

	// First service the requests 
	// on the right side of the 
	// head 
	for (int i = 0; i < right.size(); i++)
	{
		cur_track = right.get(i);

		// Appending current track to seek sequence 
		seek_sequence.add(cur_track);

		// Calculate absolute distance 
		distance[i] = Math.abs(cur_track - head);
                if(distance[i] == 0)
                {
                    distance[i] = arr[arr.length-1] - arr[0]; 
                }
		// Increase the total count 
		seek_count += distance[i];

		// Accessed track is now new head 
		head = cur_track;
	}

	// Once reached the right end 
	// jump to the last track that 
	// is needed to be serviced in 
	// left direction 
	seek_count += Math.abs(head - left.get(0));
	head = left.get(0);

	// Now service the requests again 
	// which are left 
	for (int i = 0; i < left.size(); i++)
	{
		cur_track = left.get(i);

		// Appending current track to seek sequence 
		seek_sequence.add(cur_track);

		// Calculate absolute distance 
		distance[i] = Math.abs(cur_track - head);
                if(distance[i] == 0)
                {
                    distance[i] = arr[arr.length-1] - arr[0]; 
                }
                
		// Increase the total count 
		seek_count += distance[i];

		// Accessed track is now the new head 
		head = cur_track;
	}
        
        sort5 = new int[tableModel5.getRowCount()];

        //sort the tracks for output
        if (tableModel5.getRowCount() >= 0) System.arraycopy(arr, 0, sort5, 0, tableModel5.getRowCount());
        
        for (int i = 0; i < tableModel5.getRowCount(); i++) 
        {
            for (int j = i + 1; j < tableModel5.getRowCount(); j++) 
            {
                if(sort5[i] > sort5[j])
                {
                    temp5 = sort5[i];
                    sort5[i] = sort5[j];
                    sort5[j] = temp5;
                }
            }
        }
        
        int []dis = new int[seek_sequence.size()];
        
        resultsTextArea5.append("SCAN Disk Scheduling\n\n");
        for (int i = 0; i < tableModel5.getRowCount(); i++)
            resultsTextArea5.append(sort5[i] + " ");
        resultsTextArea5.append("\n\nComputing for the total head movement: \n");
        
        int first_dis = Math.abs(first5 - seek_sequence.get(0));
        int sum = first_dis;
        resultsTextArea5.append("     from " + first5 + " to " + seek_sequence.get(0) + " = " + first_dis + "\n");
        
        try
        {
            for (int i = 0; i < seek_sequence.size(); i++) 
            {
                dis[i] = Math.abs(seek_sequence.get(i+1) - seek_sequence.get(i));
                sum += dis[i];
                resultsTextArea5.append("     from " + seek_sequence.get(i) + " to " + seek_sequence.get(i+1) + " = " + dis[i] + "\n");
                tracksLabel5.setText(sum + " tracks");
            }
        } catch(IndexOutOfBoundsException ex) { System.out.println(" "); }
        int[] tempArr = new int[seek_sequence.size() + 1];
        tempArr[0] = first5;

        for(int i = 0; i < seek_sequence.size(); i++){
            tempArr[i+1] = seek_sequence.get(i);
        }
        setGraphPanel5(new DrawGraph(tempArr));
}
    
    public void LOOK(int[] arr, int head, String direction, int totalDisk) {
	int seek_count = 0;
        first4 = head;
	int distance[] = new int[arr.length];
	int cur_track;
	int diskTail = totalDisk;

	ArrayList<Integer> left = new ArrayList<Integer>();
	ArrayList<Integer> right = new ArrayList<Integer>();
	ArrayList<Integer> seek_sequence = new ArrayList<Integer>();

	// appending values which are 
	// currently at left and right 
	// direction from the head. 
	for (int i = 0; i < arr.length; i++)
	{
		if (arr[i] < head)
		{
			left.add(arr[i]);
		}
		if (arr[i] > head)
		{
			right.add(arr[i]);
		}
	}

	// sorting left and right vectors 
	// for servicing tracks in the 
	// correct sequence. 
	Collections.sort(left);
	Collections.sort(right);

	// run the while loop two times. 
	// one by one scanning right 
	// and left side of the head 
	int run = 2;
	while ((run--) != 0)
	{
		if (direction.equals("left"))
		{
			for (int i = left.size() - 1; i >= 0; i--)
			{
				cur_track = left.get(i);

				// appending current track to seek sequence 
				seek_sequence.add(cur_track);

				// calculate absolute distance 
				distance[i] = Math.abs(cur_track - head);
                                System.out.println(distance[i]);

				// increase the total count 
				seek_count += distance[i];

				// accessed track is now the new head 
				head = cur_track;
			}
			// reversing the direction 
			direction = "right";
		}
		else if (direction.equals("right"))
		{
			for (int i = 0; i < right.size(); i++)
			{
				cur_track = right.get(i);
				// appending current track to seek sequence 
				seek_sequence.add(cur_track);

				// calculate absolute distance 
				distance[i] = Math.abs(cur_track - head);
                                System.out.println(distance[i]);

				// increase the total count 
				seek_count += distance[i];

				// accessed track is now new head 
				head = cur_track;
			}
			// reversing the direction 
			direction = "left";
		}
	}

	sort4 = new int[tableModel4.getRowCount() + 2];
        sort4[0] = 0;

        //sort the tracks for output
        if (tableModel4.getRowCount() >= 0) System.arraycopy(arr, 0, sort4, 1, tableModel4.getRowCount());

        sort4[tableModel4.getRowCount() + 1] = diskTail;

        for (int i = 0; i < tableModel4.getRowCount() + 2; i++)
        {
            for (int j = i + 1; j < tableModel4.getRowCount() + 2; j++)
            {
                if(sort4[i] > sort4[j])
                {
                    temp4 = sort4[i];
                    sort4[i] = sort4[j];
                    sort4[j] = temp4;
                }
            }
        }
        
        int []dis = new int[seek_sequence.size()];
        
        resultsTextArea6.append("SCAN Disk Scheduling\n\n");
        for (int i = 0; i < sort4.length; i++)
            resultsTextArea6.append(sort4[i] + " ");
        resultsTextArea6.append("\n\nComputing for the total head movement: \n");
        
        int first_dis = Math.abs(first4 - seek_sequence.get(0));
        resultsTextArea6.append("     from " + first4 + " to " + seek_sequence.get(0) + " = " + first_dis + "\n");
        
        tracksLabel4.setText(seek_count + " tracks");
        
        try
        {
            for (int i = 0; i < seek_sequence.size() + 1; i++)
            {
                dis[i] = Math.abs(seek_sequence.get(i+1) - seek_sequence.get(i));
                resultsTextArea6.append("     from " + seek_sequence.get(i) + " to " + seek_sequence.get(i+1) + " = " + dis[i] + "\n");
            }
        } catch(IndexOutOfBoundsException ex) { System.out.println(" "); }

        int[] tempArr = new int[seek_sequence.size()];

        for(int i = 0; i < seek_sequence.size(); i++){
            tempArr[i] = seek_sequence.get(i);
        }

        setGraphPanel6(new DrawGraph(tempArr));
    }
    
    public void CSCAN(int[] arr, int head, int disk_size)
    {
	int seek_count = 0;
        first3 = head;
	int distance[] = new int[arr.length];
	int cur_track;
	ArrayList<Integer> left = new ArrayList<Integer>();
	ArrayList<Integer> right = new ArrayList<Integer>();
	ArrayList<Integer> seek_sequence = new ArrayList<Integer>();

	// appending end values 
	// which has to be visited 
	// before reversing the direction 
	left.add(0);
	right.add(disk_size);

	// tracks on the left of the 
	// head will be serviced when 
	// once the head comes back 
	// to the beggining (left end). 
	for (int i = 0; i < arr.length; i++)
	{
		if (arr[i] < head)
		{
			left.add(arr[i]);
		}
		if (arr[i] > head)
		{
			right.add(arr[i]);
		}
	}

	// sorting left and right vectors 
	Collections.sort(left);
	Collections.sort(right);

	// first service the requests 
	// on the right side of the 
	// head. 
	for (int i = 0; i < right.size(); i++)
	{
		cur_track = right.get(i);
		// appending current track to seek sequence 
		seek_sequence.add(cur_track);

		// calculate absolute distance 
		distance[i] = Math.abs(cur_track - head);
                if(distance[i] == 0)
                {
                    distance[i] = disk_size;
                }
                System.out.println(distance[i]);

		// increase the total count 
		seek_count += distance[i];

		// accessed track is now new head 
		head = cur_track;
	}

	// once reached the right end 
	// jump to the beggining. 
	head = 0;

	// Now service the requests again 
	// which are left. 
	for (int i = 0; i < left.size(); i++)
	{
		cur_track = left.get(i);

		// appending current track to seek sequence 
		seek_sequence.add(cur_track);

		// calculate absolute distance 
		distance[i] = Math.abs(cur_track - head);
                if(distance[i] == 0)
                {
                    distance[i] = disk_size;
                }
                System.out.println(distance[i]);

		// increase the total count 
		seek_count += distance[i];

		// accessed track is now the new head 
		head = cur_track;
	}

	sort3 = new int[tableModel3.getRowCount()];
          
        for (int i = 0; i < tableModel3.getRowCount(); i++) 
            sort3[i] = arr[i]; //sort the tracks for output
        
        for (int i = 0; i < tableModel3.getRowCount(); i++) 
        {
            for (int j = i + 1; j < tableModel3.getRowCount(); j++) 
            {
                if(sort3[i] > sort3[j])
                {
                    temp3 = sort3[i];
                    sort3[i] = sort3[j];
                    sort3[j] = temp3;
                }
            }
        }
        
        int []dis = new int[seek_sequence.size()];
        
        resultsTextArea7.append("SCAN Disk Scheduling\n\n");
        for (int i = 0; i < tableModel3.getRowCount(); i++)
            resultsTextArea7.append(sort3[i] + " ");
        resultsTextArea7.append("\n\nComputing for the total head movement: \n");
        
        int first_dis = Math.abs(first3 - seek_sequence.get(0));
        resultsTextArea7.append("     from " + first3 + " to " + seek_sequence.get(0) + " = " + first_dis + "\n");
        
        tracksLabel3.setText(seek_count + " tracks");
        
        try
        {
            for (int i = 0; i < seek_sequence.size(); i++) 
            {
                dis[i] = Math.abs(seek_sequence.get(i+1) - seek_sequence.get(i));
                resultsTextArea7.append("     from " + seek_sequence.get(i) + " to " + seek_sequence.get(i+1) + " = " + dis[i] + "\n");
            }
        } catch(IndexOutOfBoundsException ex) { System.out.println(" "); }

        int[] tempArr = new int[seek_sequence.size() + 1];
        tempArr[0] = first3;

        for(int i = 0; i < seek_sequence.size(); i++){
            tempArr[i+1] = seek_sequence.get(i);
        }

        setGraphPanel7(new DrawGraph(tempArr));
    }
    
    int disk_size = 200;

    public void SCAN(int arr[], int head, String direction)
    {
        first2 = head;
        int seek_count = 0, cur_track;
        distance = new int[tableModel2.getRowCount()];
        Vector<Integer> left = new Vector<Integer>(),
                right = new Vector<Integer>();
        Vector<Integer> seek_sequence = new Vector<Integer>();

        // appending end values
        // which has to be visited
        // before reversing the direction
        if (direction == "left")
            left.add(0);
        else if (direction == "right")
            right.add(disk_size - 1);

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < head)
                left.add(arr[i]);
            if (arr[i] > head)
                right.add(arr[i]);
        }

        // sorting left and right vectors
        Collections.sort(left);
        Collections.sort(right);

        // run the while loop two times.
        // one by one scanning right
        // and left of the head
        int run = 2;
        while (run-- >0)
        {
            if (direction == "left")
            {
                for (int i = left.size() - 1; i >= 0; i--)
                {
                    cur_track = left.get(i);

                    // appending current track to seek sequence
                    seek_sequence.add(cur_track);

                    // calculate absolute distance
                    distance[i] = Math.abs(cur_track - head);

                    // increase the total count
                    seek_count += distance[i];

                    // accessed track is now the new head
                    head = cur_track;
                }
                direction = "right";
            }
            else if (direction == "right")
            {
                for (int i = 0; i < right.size(); i++)
                {
                    cur_track = right.get(i);

                    // appending current track to seek sequence
                    seek_sequence.add(cur_track);

                    // calculate absolute distance
                    distance[i] = Math.abs(cur_track - head);

                    // increase the total count
                    seek_count += distance[i];

                    // accessed track is now new head
                    head = cur_track;
                }
                direction = "left";
            }
        }

        sort2 = new int[tableModel2.getRowCount()];

        for (int i = 0; i < tableModel2.getRowCount(); i++)
            sort2[i] = arr[i]; //sort the tracks for output

        for (int i = 0; i < tableModel2.getRowCount(); i++)
        {
            for (int j = i + 1; j < tableModel2.getRowCount(); j++)
            {
                if(sort2[i] > sort2[j])
                {
                    temp2 = sort2[i];
                    sort2[i] = sort2[j];
                    sort2[j] = temp2;
                }
            }
        }

        int []dis = new int[tableModel2.getRowCount()];

        resultsTextArea8.append("SCAN Disk Scheduling\n\n");
        for (int i = 0; i < tableModel2.getRowCount(); i++)
            resultsTextArea8.append(sort2[i] + " ");
        resultsTextArea8.append("\n\nComputing for the total head movement: \n");

        int first_dis = Math.abs(first2 - seek_sequence.get(0));
        resultsTextArea8.append("     from " + first2 + " to " + seek_sequence.get(0) + " = " + first_dis + "\n");

        for (int i = 0; i < tableModel2.getRowCount(); i++)
        {
            dis[i] = Math.abs(seek_sequence.get(i+1) - seek_sequence.get(i));
            resultsTextArea8.append("     from " + seek_sequence.get(i) + " to " + seek_sequence.get(i+1) + " = " + dis[i] + "\n");
        }
        
        tracksLabel2.setText(seek_count + " tracks");
        int[] tempArr = new int[seek_sequence.size() + 1];
        tempArr[0] = first2;

        for(int i = 0; i < seek_sequence.size(); i++){
            tempArr[i+1] = seek_sequence.get(i);
        }
        setGraphPanel8(new DrawGraph(tempArr));
    }
    
    private void calculateDifference(int queue[], int head, node diff[])
    { 
        for (int i = 0; i < diff.length; i++) 
            diff[i].distance = Math.abs(queue[i] - head); 
    } 
  
    // find unaccessed track  
    // which is at minimum distance from head 
    public static int findMin(node diff[]) 
    { 
        int index = -1, minimum = Integer.MAX_VALUE; 
  
        for (int i = 0; i < diff.length; i++) { 
            if (!diff[i].accessed && minimum > diff[i].distance) { 
                  
                minimum = diff[i].distance; 
                index = i; 
            } 
        } 
        return index; 
    } 

    public void shortestSeekTimeFirst(int request[], int head)                                  
    { 
        sstffirst = head;
        if (request.length == 0) 
            return; 
              
        // create array of objects of class node     
        node diff[] = new node[request.length];  
        distance = new int[diff.length];
          
        // initialize array 
        for (int i = 0; i < diff.length; i++)  
          
            diff[i] = new node(); 
          
        // count total number of seek operation     
        int seek_count = 0;  
          
        // stores sequence in which disk access is done 
        int[] seek_sequence = new int[request.length + 1];  
          
        for (int i = 0; i < request.length; i++) { 
              
            seek_sequence[i] = head; 
            calculateDifference(request, head, diff); 
              
            int index = findMin(diff); 
              
            diff[index].accessed = true; 
            distance[i] = diff[index].distance;
//            System.out.println(diff[index].distance + " distance");
//            System.out.println(index + "INDEX");
              
            // increase the total count 
            seek_count += diff[index].distance;  
              
            // accessed track is now new head 
            head = request[index];  
        } 
          
        // for last accessed track 
        seek_sequence[seek_sequence.length - 1] = head;  
        
        sort = new int[tableModel1.getRowCount()];

        //sort the tracks for output
        if (tableModel1.getRowCount() >= 0) System.arraycopy(request, 0, sort, 0, tableModel1.getRowCount());
        
        for (int i = 0; i < tableModel1.getRowCount(); i++) 
        {
            for (int j = i + 1; j < tableModel1.getRowCount(); j++) 
            {
                if(sort[i] > sort[j])
                {
                    temp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = temp;
                }
            }
        }

        int[] tempArr = new int[seek_sequence.length];

        System.arraycopy(seek_sequence, 0, tempArr, 0, tempArr.length);

        resultsTextArea9.append("SSTF Disk Scheduling\n\n");
        for (int i = 0; i < tableModel1.getRowCount(); i++)
            resultsTextArea9.append(sort[i] + " ");
                                                       
        resultsTextArea9.append("\n\nComputing for the total head movement: \n");
        for (int i = 0; i < tableModel1.getRowCount(); i++) 
        {
                resultsTextArea9.append("     from " + seek_sequence[i] + " to " + seek_sequence[i+1] + " = " + distance[i] + "\n");
        }

        setGraphPanel9(new DrawGraph(tempArr));
        tracksLabel1.setText(seek_count + " tracks");
    }
    
    private void FCFS(int[] req, int head)
    {
        first1 = head;
        distance = new int[tableModel.getRowCount()];
        sort = new int[tableModel.getRowCount()];
        
        for (int i = 0; i < tableModel.getRowCount(); i++) 
        {
            track = req[i];
            
            distance[i] = Math.abs(track - head); //geting the distance
            totalTracks += distance[i]; //getting the total tracks
            
            head = track; //move to the next tracks
        }

        //sort the tracks for output
        if (tableModel.getRowCount() >= 0) System.arraycopy(req, 0, sort, 0, tableModel.getRowCount());
        
        for (int i = 0; i < tableModel.getRowCount(); i++) 
        {
            for (int j = i + 1; j < tableModel.getRowCount(); j++) 
            {
                if(sort[i] > sort[j])
                {
                    temp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = temp;
                }
            }
        }

        int[] tempArr = new int[tableModel.getRowCount() + 1];
        tempArr[0] = first1;

        if (tableModel.getRowCount() >= 0) System.arraycopy(req, 0, tempArr, 1, tableModel.getRowCount());

        resultsTextArea10.append("FCFS Disk Scheduling\n\n");
        for (int i = 0; i < tableModel.getRowCount(); i++)
            resultsTextArea10.append(sort[i] + " ");
        
        resultsTextArea10.append("\n\nComputing for the total head movement: ");
        resultsTextArea10.append("\n     from " + first1 + " to " + req[0] + " = " + distance[0] + "\n");
        
        for (int i = 0; i < tableModel.getRowCount(); i++) 
        {
            if(i == tableModel.getRowCount()-1)
                break;
            else
                resultsTextArea10.append("     from " + req[i] + " to " + req[i+1] + " = " + distance[i+1] + "\n");
        }

        tracksLabel.setText(totalTracks + " tracks");
        setGraphPanel10(new DrawGraph(tempArr));
    }

    private void setGraphPanel10(JPanel panel){ // FCFS graph
        graphPanel10.setLayout(new FlowLayout());
        graphPanel10.removeAll();
        graphPanel10.add(panel);
        graphPanel10.repaint();
        graphPanel10.revalidate();
    }

    private void setGraphPanel9(JPanel panel){ // SSTF
        graphPanel9.setLayout(new FlowLayout());
        graphPanel9.removeAll();
        graphPanel9.add(panel);
        graphPanel9.repaint();
        graphPanel9.revalidate();
    }

    private void setGraphPanel8(JPanel panel){ //SCAN
        graphPanel8.setLayout(new FlowLayout());
        graphPanel8.removeAll();
        graphPanel8.add(panel);
        graphPanel8.repaint();
        graphPanel8.revalidate();
    }

    private void setGraphPanel7(JPanel panel){
        graphPanel7.setLayout(new FlowLayout());
        graphPanel7.removeAll();
        graphPanel7.add(panel);
        graphPanel7.repaint();
        graphPanel7.revalidate();
    }

    private void setGraphPanel6(JPanel panel){ 
        graphPanel6.setLayout(new FlowLayout());
        graphPanel6.removeAll();
        graphPanel6.add(panel);
        graphPanel6.repaint();
        graphPanel6.revalidate();
    }

    private void setGraphPanel5(JPanel panel){ // CLOOK
        graphPanel5.setLayout(new FlowLayout());
        graphPanel5.removeAll();
        graphPanel5.add(panel);
        graphPanel5.repaint();
        graphPanel5.revalidate();
    }

    public static void main(String[] args) {
        MainFrameCase2 run = new MainFrameCase2();
        run.setVisible(true);
        run.setSize(950,600);
        run.setResizable(false);
        run.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        run.setLocationRelativeTo(null);
    }
}
