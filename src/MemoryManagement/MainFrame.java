package memorymanagement;

import MainMenu.MainMenuOS;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends JFrame implements ActionListener, MouseListener 
{
    private int unpartitioned;
    private int osSizevar;
    private int unpartitioned2;
    private int osSizevar2;
    private int unpartitioned3;
    private int osSizevar3;
    private ArrayList<Custom.Process> processAlloc = new ArrayList();
    private ArrayList<Custom.Process> processAlloc2 = new ArrayList();
    private ArrayList<Custom.Process> processAlloc3 = new ArrayList();
    int copyOfPartitions2[];
    int copyOfPartitions3[];
    String os;
    String os2;
    String os3;
    int newMemory;
    int newMemory2;
    int newMemory3;
    //Jframe main components
    JLabel bg;
    JPanel jPanel1;
    
    //menu buttons
    JButton worstFitButton;
    JButton bestFitButton;  
    JButton exitButton;
    JButton firstFitButton;
    JButton homeButton;
    
    //panels for the buttons
     JPanel homePanel;
     JPanel contentPanel;
     JPanel firstFitPanel;
     JPanel bestFitPanel;
     JPanel worstFitPanel;
     
     //contents of home panel
     JLabel bgcontent1;
     
     //contents for first fit panel
    JButton addPartition;
    JButton addProcess; 
    JLabel bgcontent;
    JButton calculate;
    JButton clearPartition;
    JButton clearProcess;
    JScrollPane ganttPane;
    JTextField memorySize;
    JScrollPane partitionPane;
    JScrollPane processPane;
    JTextField partitionSize;
    JTable partitionTable;
    JTextField processSize;
    JTable processTable;
    JLabel usedMemory;
    JButton setMemorySize;
    JScrollPane statisticsPane;
    JTextArea statisticsOutput;
    JLabel remainingMemory;
    JTextField osInput;
    JLabel osSize;
    JButton setOsSize; 
    JPanel ganttPanel;
    
    //contents of bestfit panel
    JButton addPartition2;
    JButton addProcess2;
    JLabel bgcontent2;
    JButton calculate2;
    JButton clearPartition2;
    JButton clearProcess2;
    JScrollPane ganttPane2;
    JScrollPane statisticsPane2;
    JTextArea statisticsOutput2;
    JTextField memorySize2;
    JScrollPane partitionPane2;
    JTextField partitionSize2;
    JTable partitionTable2;  
    JScrollPane processPane2;   
    JTextField processSize2;
    JTable processTable2;
    JLabel remainingMemory2;
    JButton setMemorySize2;
    JLabel usedMemory2;
    JTextField osInput2;
    JLabel osSize2;
    JButton setOsSize2; 
    JPanel ganttPanel2;
    
    
    //contents of worst fit panel
    JButton addPartition3;
    JButton addProcess3;
    JLabel bgcontent3;
    JButton calculate3;
    JButton clearPartition3;
    JButton clearProcess3;
    JScrollPane ganttPane3;
    JTextField memorySize3;
    JScrollPane partitionPane3;
    JScrollPane processPane3;
    JTextField processSize3;
    JScrollPane statisticsPane3;
    JTextField partitionSize3;
    JTable processTable3; 
    JTextArea statisticsOutput3;
    JTable partitionTable3;
    JLabel remainingMemory3;
    JButton setMemorySize3; 
    JLabel usedMemory3;
    JTextField osInput3;
    JLabel osSize3;
    JButton setOsSize3; 
    JPanel ganttPanel3;
    
    //Tables
    DefaultTableModel tableModelPartition;
    DefaultTableModel tableModelProcess;
    DefaultTableModel tableModelPartition2;
    DefaultTableModel tableModelProcess2;
    DefaultTableModel tableModelPartition3;
    DefaultTableModel tableModelProcess3;
    
    //memory status
    String memory;
    String memory2;
    String memory3;
    
    //for computation first fit
        int[] processSizes;
        int[] partitionSizes;
        
        //for computation best fit

        int[] processSizes2;
        int[] partitionSizes2;
        
        //for computation worst fit

        int[] processSizes3;
        int[] partitionSizes3;
        
    
    public MainFrame() {
    
    // INITIALIZATION
        //Jframe main components
        bg = new JLabel();
        jPanel1 = new JPanel();

        //menu buttons
        worstFitButton = new JButton();
        bestFitButton = new JButton();
        exitButton = new JButton();
        firstFitButton = new JButton();
        homeButton = new JButton();

        //panels for the buttons
        homePanel = new JPanel();
        contentPanel = new JPanel();
        firstFitPanel = new JPanel();
        bestFitPanel = new JPanel();
        worstFitPanel = new JPanel();

        //contents of home panel
        bgcontent1 = new JLabel();

        //contents for first fit panel
        addPartition = new JButton();
        addProcess = new JButton();
        bgcontent = new JLabel();
        calculate = new JButton();
        clearPartition = new JButton();
        clearProcess = new JButton();
        ganttPane = new JScrollPane();
        memorySize = new JTextField();
        partitionPane = new JScrollPane();
        processPane = new JScrollPane();
        partitionSize = new JTextField();
        partitionTable = new JTable();
        processSize = new JTextField();
        processTable = new JTable();
        usedMemory = new JLabel();
        setMemorySize = new JButton();
        statisticsPane = new JScrollPane();
        statisticsOutput = new JTextArea();
        remainingMemory = new JLabel();
        osInput = new JTextField();
        osSize = new JLabel();
        setOsSize = new JButton();
        ganttPanel = new JPanel();

        //contents of bestfit panel
        addPartition2 = new JButton();
        addProcess2 = new JButton();
        bgcontent2 = new JLabel();
        calculate2 = new JButton();
        clearPartition2 = new JButton();
        clearProcess2 = new JButton();
        ganttPane2 = new JScrollPane();
        memorySize2 = new JTextField();
        partitionPane2 = new JScrollPane();
        processPane2 = new JScrollPane();
        partitionSize2 = new JTextField();
        partitionTable2 = new JTable();
        processSize2 = new JTextField();
        processTable2 = new JTable();
        usedMemory2 = new JLabel();
        setMemorySize2 = new JButton();
        statisticsPane2 = new JScrollPane();
        statisticsOutput2 = new JTextArea();
        remainingMemory2 = new JLabel();
        osInput2 = new JTextField();
        osSize2 = new JLabel();
        setOsSize2 = new JButton();
        ganttPanel2 = new JPanel();

        //contents of worst fit panel
        addPartition3 = new JButton();
        addProcess3 = new JButton();
        bgcontent3 = new JLabel();
        calculate3 = new JButton();
        clearPartition3 = new JButton();
        clearProcess3 = new JButton();
        ganttPane3 = new JScrollPane();
        memorySize3 = new JTextField();
        partitionPane3 = new JScrollPane();
        processPane3 = new JScrollPane();
        partitionSize3 = new JTextField();
        partitionTable3 = new JTable();
        processSize3 = new JTextField();
        processTable3 = new JTable();
        usedMemory3 = new JLabel();
        setMemorySize3 = new JButton();
        statisticsPane3 = new JScrollPane();
        statisticsOutput3 = new JTextArea();
        remainingMemory3 = new JLabel();
        osInput3 = new JTextField();
        osSize3 = new JLabel();
        setOsSize3 = new JButton();
        ganttPanel3 = new JPanel();
        
        //JFrame Properties
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        //Exit Button Properties
        exitButton.setBackground(new Color(43, 137, 253));
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymanagement/exitbutton.png"))); 
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
        });
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 140, 90));
        
        //Home Button Properties
        homeButton.setBackground(new Color(43, 137, 253));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymanagement/homebutton.png"))); // NOI18N
        homeButton.setBorderPainted(false);
        homeButton.setContentAreaFilled(false);
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                homeButtonMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                homeButtonMouseExited(evt);
            }
        });
        homeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 140, 90));
        
        //First Fit Button Properties
        firstFitButton.setBackground(new Color(43, 137, 253));
        firstFitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymanagement/firstfitbutton.png"))); // NOI18N
        firstFitButton.setBorderPainted(false);
        firstFitButton.setContentAreaFilled(false);
        firstFitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                firstFitButtonMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                firstFitButtonMouseExited(evt);
            }
        });
        firstFitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                firstFitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(firstFitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 140, 90));
        
        //Best Fit Button Properties
        bestFitButton.setBackground(new Color(43, 137, 253));
        bestFitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymanagement/bestfitbutton.png"))); // NOI18N
        bestFitButton.setBorderPainted(false);
        bestFitButton.setContentAreaFilled(false);
        bestFitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                bestFitButtonMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                bestFitButtonMouseExited(evt);
            }
        });
        bestFitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bestFitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(bestFitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 140, 90));
        
        //Worst Fit Button Properties
        worstFitButton.setBackground(new Color(43, 137, 253));
        worstFitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymanagement/worstfitbutton.png"))); // NOI18N
        worstFitButton.setBorderPainted(false);
        worstFitButton.setContentAreaFilled(false);
        worstFitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                worstFitButtonMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                worstFitButtonMouseExited(evt);
            }
        });
        worstFitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                worstFitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(worstFitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 140, 90));
        
        //Content Panel Properties
        contentPanel.setMaximumSize(new Dimension(800, 600));
        contentPanel.setLayout(new java.awt.CardLayout());
        
        //Home Panel Properties
        homePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bgcontent1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymanagement/homePanel.png"))); // NOI18N
        homePanel.add(bgcontent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));
        contentPanel.add(homePanel, "card3");

        //WorstFit Panel Properties
        worstFitPanel.setMaximumSize(new Dimension(800, 600));
        worstFitPanel.setMinimumSize(new Dimension(800, 600));
        worstFitPanel.setPreferredSize(new Dimension(800, 600));
        worstFitPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ganttPane3.setBackground(new Color(236, 240, 243));
        ganttPane3.setBorder(null);
        ganttPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        ganttPane3.setOpaque(false);
        worstFitPanel.add(ganttPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 350, 60));

        calculate3.setBorderPainted(false);
        calculate3.setContentAreaFilled(false);
        worstFitPanel.add(calculate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 80, 70));

        clearPartition3.setBorderPainted(false);
        clearPartition3.setContentAreaFilled(false);
        worstFitPanel.add(clearPartition3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 40, 30));

        clearProcess3.setBorderPainted(false);
        clearProcess3.setContentAreaFilled(false);
        worstFitPanel.add(clearProcess3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 40, 30));

        addPartition3.setBorderPainted(false);
        addPartition3.setContentAreaFilled(false);
        worstFitPanel.add(addPartition3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 40, 30));

        setMemorySize3.setBorderPainted(false);
        setMemorySize3.setContentAreaFilled(false);
        worstFitPanel.add(setMemorySize3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 30, 30));

        usedMemory3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        worstFitPanel.add(usedMemory3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 80, 20));

        remainingMemory3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        worstFitPanel.add(remainingMemory3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 80, 20));
        
        partitionTable3.setBackground(new Color(236, 240, 243));
        partitionTable3.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Partition", "Size"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        partitionTable3.setOpaque(false);
        partitionTable3.getTableHeader().setResizingAllowed(false);
        partitionTable3.getTableHeader().setReorderingAllowed(false);
        partitionPane3.setViewportView(partitionTable3);

        worstFitPanel.add(partitionPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 220, 230));

        processTable3.setBackground(new Color(236, 240, 243));
        processTable3.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process", "Size"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        processTable3.setOpaque(false);
        processTable3.getTableHeader().setResizingAllowed(false);
        processTable3.getTableHeader().setReorderingAllowed(false);
        processPane3.setViewportView(processTable3);

        worstFitPanel.add(processPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 220, 230));

        statisticsPane3.setBackground(new Color(236, 240, 243));
        statisticsPane3.setBorder(null);
        statisticsPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        statisticsOutput3.setEditable(false);
        statisticsOutput3.setBackground(new Color(236, 240, 243));
        statisticsOutput3.setColumns(15);
        statisticsOutput3.setLineWrap(true);
        statisticsOutput3.setForeground(new Color(102, 102, 102));
        statisticsOutput3.setRows(5);
        statisticsPane3.setViewportView(statisticsOutput3);

        worstFitPanel.add(statisticsPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 190, 130));

        partitionSize3.setBorder(null);
        partitionSize3.setOpaque(false);

        worstFitPanel.add(partitionSize3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 180, 40));

        memorySize3.setBorder(null);
        memorySize3.setOpaque(false);

        worstFitPanel.add(memorySize3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 140, 30));

        addProcess3.setBorderPainted(false);
        addProcess3.setContentAreaFilled(false);
        worstFitPanel.add(addProcess3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 40, 30));

        processSize3.setBorder(null);
        processSize3.setOpaque(false);

        worstFitPanel.add(processSize3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 180, 40));
        
        osSize3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        worstFitPanel.add(osSize3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 80, 20));
        
        osInput3.setBorder(null);
        osInput3.setOpaque(false);
        worstFitPanel.add(osInput3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 140, 30));
        
        setOsSize3.setBorderPainted(false);
        setOsSize3.setContentAreaFilled(false);
        worstFitPanel.add(setOsSize3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 30, 30));

        bgcontent3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymanagement/worstfitpanel.png"))); // NOI18N
        bgcontent3.setMaximumSize(new Dimension(800, 600));
        bgcontent3.setMinimumSize(new Dimension(800, 600));
        bgcontent3.setPreferredSize(new Dimension(800, 600));
        worstFitPanel.add(bgcontent3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        contentPanel.add(worstFitPanel, "card3");

        //BEST FIT PANEL
        bestFitPanel.setMaximumSize(new Dimension(800, 600));
        bestFitPanel.setMinimumSize(new Dimension(800, 600));
        bestFitPanel.setPreferredSize(new Dimension(800, 600));
        bestFitPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ganttPane2.setBackground(new Color(236, 240, 243));
        ganttPane2.setBorder(null);
        ganttPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        ganttPane2.setOpaque(false);
        bestFitPanel.add(ganttPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 350, 60));

        calculate2.setBorderPainted(false);
        calculate2.setContentAreaFilled(false);
        bestFitPanel.add(calculate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 80, 70));

        clearPartition2.setBorderPainted(false);
        clearPartition2.setContentAreaFilled(false);
        bestFitPanel.add(clearPartition2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 40, 30));

        clearProcess2.setBorderPainted(false);
        clearProcess2.setContentAreaFilled(false);
        bestFitPanel.add(clearProcess2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 40, 30));
        
        osInput2.setBorder(null);
        osInput2.setOpaque(false);
        bestFitPanel.add(osInput2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 140, 30));
        
        setOsSize2.setBorderPainted(false);
        setOsSize2.setContentAreaFilled(false);
        bestFitPanel.add(setOsSize2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 30, 30));
        
        osSize2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bestFitPanel.add(osSize2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 80, 20));

        addPartition2.setBorderPainted(false);
        addPartition2.setContentAreaFilled(false);
        bestFitPanel.add(addPartition2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 40, 30));

        setMemorySize2.setBorderPainted(false);
        setMemorySize2.setContentAreaFilled(false);
        bestFitPanel.add(setMemorySize2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 30, 30));

        usedMemory2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bestFitPanel.add(usedMemory2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 80, 20));

        remainingMemory2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bestFitPanel.add(remainingMemory2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 80, 20));

        partitionTable2.setBackground(new Color(236, 240, 243));
        partitionTable2.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Partition", "Size"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        partitionTable2.setOpaque(false);
        partitionTable2.getTableHeader().setResizingAllowed(false);
        partitionTable2.getTableHeader().setReorderingAllowed(false);
        partitionPane2.setViewportView(partitionTable2);

        bestFitPanel.add(partitionPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 220, 230));

        processTable2.setBackground(new Color(236, 240, 243));
        processTable2.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process", "Size"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        processTable2.setOpaque(false);
        processTable2.getTableHeader().setResizingAllowed(false);
        processTable2.getTableHeader().setReorderingAllowed(false);
        processPane2.setViewportView(processTable2);

        bestFitPanel.add(processPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 220, 230));

     
        partitionSize.setBorder(null);
        partitionSize.setOpaque(false);
        firstFitPanel.add(partitionSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 180, 40));

        statisticsPane.setBackground(new Color(236, 240, 243));
        statisticsPane.setBorder(null);
        statisticsPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        statisticsOutput.setEditable(false);
        statisticsOutput.setBackground(new Color(236, 240, 243));
        statisticsOutput.setColumns(15);
        statisticsOutput.setLineWrap(true);
        statisticsOutput.setForeground(new Color(102, 102, 102));
        statisticsOutput.setRows(5);
        statisticsPane.setViewportView(statisticsOutput);

        firstFitPanel.add(statisticsPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 190, 130));

        statisticsPane2.setBackground(new Color(236, 240, 243));
        statisticsPane2.setBorder(null);
        statisticsPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        statisticsOutput2.setEditable(false);
        statisticsOutput2.setBackground(new Color(236, 240, 243));
        statisticsOutput2.setColumns(15);
        statisticsOutput2.setLineWrap(true);
        statisticsOutput2.setForeground(new Color(102, 102, 102));
        statisticsOutput2.setRows(5);
        statisticsPane2.setViewportView(statisticsOutput2);

        bestFitPanel.add(statisticsPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 190, 130));

        partitionSize2.setBorder(null);
        partitionSize2.setOpaque(false);

        bestFitPanel.add(partitionSize2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 180, 40));

        memorySize2.setBorder(null);
        memorySize2.setOpaque(false);
        bestFitPanel.add(memorySize2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 140, 30));

        addProcess2.setBorderPainted(false);
        addProcess2.setContentAreaFilled(false);
        bestFitPanel.add(addProcess2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 40, 30));

        processSize2.setBorder(null);
        processSize2.setOpaque(false);

        bestFitPanel.add(processSize2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 180, 40));

        bgcontent2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymanagement/bestfitpanel.png"))); // NOI18N
        bgcontent2.setMaximumSize(new Dimension(800, 600));
        bgcontent2.setMinimumSize(new Dimension(800, 600));
        bgcontent2.setPreferredSize(new Dimension(800, 600));
        bestFitPanel.add(bgcontent2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));
        contentPanel.add(bestFitPanel, "card4");
        
        //FIRST FIT PANEL
        firstFitPanel.setMaximumSize(new Dimension(800, 600));
        firstFitPanel.setMinimumSize(new Dimension(800, 600));
        firstFitPanel.setPreferredSize(new Dimension(800, 600));
        firstFitPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ganttPane.setBackground(new Color(236, 240, 243));
        ganttPane.setBorder(null);
        ganttPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        ganttPane.setOpaque(false);
        firstFitPanel.add(ganttPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 350, 60));

        calculate.setBorderPainted(false);
        calculate.setContentAreaFilled(false);
        firstFitPanel.add(calculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 80, 70));

        clearPartition.setBorderPainted(false);
        clearPartition.setContentAreaFilled(false);
        firstFitPanel.add(clearPartition, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 40, 30));

        clearProcess.setBorderPainted(false);
        clearProcess.setContentAreaFilled(false);
        firstFitPanel.add(clearProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 40, 30));

        addPartition.setBorderPainted(false);
        addPartition.setContentAreaFilled(false);
        firstFitPanel.add(addPartition, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 40, 30));

        setMemorySize.setBorderPainted(false);
        setMemorySize.setContentAreaFilled(false);
        firstFitPanel.add(setMemorySize, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 30, 30));
        
        osInput.setBorder(null);
        osInput.setOpaque(false);
        firstFitPanel.add(osInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 140, 30));
        
        setOsSize.setBorderPainted(false);
        setOsSize.setContentAreaFilled(false);
        firstFitPanel.add(setOsSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 30, 30));
        
        osSize.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        firstFitPanel.add(osSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 80, 20));


        usedMemory.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        firstFitPanel.add(usedMemory, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 80, 20));

        remainingMemory.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        firstFitPanel.add(remainingMemory, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 80, 20));

        partitionTable.setBackground(new Color(236, 240, 243));
        partitionTable.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Partition", "Size"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        partitionTable.setOpaque(false);
        partitionTable.getTableHeader().setResizingAllowed(false);
        partitionTable.getTableHeader().setReorderingAllowed(false);
        partitionPane.setViewportView(partitionTable);

        firstFitPanel.add(partitionPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 220, 230));

        processTable.setBackground(new Color(236, 240, 243));
        processTable.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process", "Size"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        processTable.setOpaque(false);
        processTable.getTableHeader().setResizingAllowed(false);
        processTable.getTableHeader().setReorderingAllowed(false);
        processPane.setViewportView(processTable);

        firstFitPanel.add(processPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 220, 230));

     
        partitionSize.setBorder(null);
        partitionSize.setOpaque(false);
        firstFitPanel.add(partitionSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 180, 40));

        statisticsPane.setBackground(new Color(236, 240, 243));
        statisticsPane.setBorder(null);
        statisticsPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        statisticsOutput.setEditable(false);
        statisticsOutput.setBackground(new Color(236, 240, 243));
        statisticsOutput.setColumns(15);
        statisticsOutput.setLineWrap(true);
        statisticsOutput.setForeground(new Color(102, 102, 102));
        statisticsOutput.setRows(5);
        statisticsPane.setViewportView(statisticsOutput);

        firstFitPanel.add(statisticsPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 190, 130));

        partitionSize.setBorder(null);
        partitionSize.setOpaque(false);

        firstFitPanel.add(partitionSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 180, 40));

        memorySize.setBorder(null);
        memorySize.setOpaque(false);

        firstFitPanel.add(memorySize, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 140, 30));

        addProcess.setBorderPainted(false);
        addProcess.setContentAreaFilled(false);
        firstFitPanel.add(addProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 40, 30));

        processSize.setBorder(null);
        processSize.setOpaque(false);

        firstFitPanel.add(processSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 180, 40));

        bgcontent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymanagement/firstfitpanel.png"))); // NOI18N
        bgcontent.setMaximumSize(new Dimension(800, 600));
        bgcontent.setMinimumSize(new Dimension(800, 600));
        bgcontent.setPreferredSize(new Dimension(800, 600));
        firstFitPanel.add(bgcontent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        contentPanel.add(firstFitPanel, "card2");

        jPanel1.add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 800, 590));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorymanagement/homebg.png"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
            //FIRST FIT
                    ganttPane.setBackground(new Color(236, 240, 243));
                    ganttPane.setBorder(null);
                    ganttPane.setToolTipText("");
                    ganttPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
                    ganttPane.setAutoscrolls(true);
                    ganttPane.setOpaque(false);

                    ganttPanel.setPreferredSize(new Dimension(1000, 100));
                    ganttPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                    ganttPane.setViewportView(ganttPanel);

                    firstFitPanel.add(ganttPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 360, 130));
                    
             //BEST FIT
             
                    ganttPane2.setBackground(new Color(236, 240, 243));
                    ganttPane2.setBorder(null);
                    ganttPane2.setToolTipText("");
                    ganttPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
                    ganttPane2.setAutoscrolls(true);
                    ganttPane2.setOpaque(false);

                    ganttPanel2.setPreferredSize(new Dimension(1000, 100));
                    ganttPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                    ganttPane2.setViewportView(ganttPanel2);
                    
                    bestFitPanel.add(ganttPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 360, 130));
     
                    
            //WORST FIT
                    ganttPane3.setBackground(new Color(236, 240, 243));
                    ganttPane3.setBorder(null);
                    ganttPane3.setToolTipText("");
                    ganttPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
                    ganttPane3.setAutoscrolls(true);
                    ganttPane3.setOpaque(false);

                    ganttPanel3.setPreferredSize(new Dimension(1000, 100));
                    ganttPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                    ganttPane3.setViewportView(ganttPanel3);
                    
                    worstFitPanel.add(ganttPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 360, 130));
        
        tableModelPartition = (DefaultTableModel) partitionTable.getModel();
        tableModelProcess = (DefaultTableModel) processTable.getModel();
        tableModelPartition2 = (DefaultTableModel) partitionTable2.getModel();
        tableModelProcess2 = (DefaultTableModel) processTable2.getModel();
        tableModelPartition3 = (DefaultTableModel) partitionTable3.getModel();
        tableModelProcess3 = (DefaultTableModel) processTable3.getModel();
        
        clearProcess.addActionListener(this);
        clearPartition.addActionListener(this);
        addProcess.addActionListener(this);
        addPartition.addActionListener(this);
        setMemorySize.addActionListener(this);
        calculate.addActionListener(this);
        setOsSize.addActionListener(this);
        
        clearProcess2.addActionListener(this);
        clearPartition2.addActionListener(this);
        addProcess2.addActionListener(this);
        addPartition2.addActionListener(this);
        setMemorySize2.addActionListener(this);
        calculate2.addActionListener(this);
        setOsSize2.addActionListener(this);
        
        clearProcess3.addActionListener(this);
        clearPartition3.addActionListener(this);
        addProcess3.addActionListener(this);
        addPartition3.addActionListener(this);
        setMemorySize3.addActionListener(this);
        calculate3.addActionListener(this);
        setOsSize3.addActionListener(this);
         
        pack();
    }      
    
    //first fit
    @Override
    public void actionPerformed(ActionEvent ff) 
    {   
        
        //firstfit
        
        if(ff.getSource() == setOsSize)
        {
            os = osInput.getText();
            if(Integer.parseInt(os) > Integer.parseInt(memory))
            {
                JOptionPane.showMessageDialog(
                        null, 
                        "OS Size can't be bigger than the memory size! Please try again.", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                osSize.setText(os);
                newMemory = Integer.parseInt(memory) - Integer.parseInt(osSize.getText());
                remainingMemory.setText(Integer.toString(newMemory));
            }
        }
        
        if(ff.getSource() == setMemorySize)
        {
            try
            {
                if(!osSize.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Memory Size changed! Please update OS Size.", 
                        "Notice!", 
                        JOptionPane.INFORMATION_MESSAGE);
                    osSize.setText("");
                    memory = memorySize.getText();
                    remainingMemory.setText(memory);
                    memorySize.setText(""); 
                }
                else // MAY TINANGGAL AKO DITO
                {
                    memory = memorySize.getText();
                    remainingMemory.setText(memory);
                    osSize.setText("");
                    newMemory = Integer.parseInt(memorySize.getText()) - Integer.parseInt(osSize.getText());
                    remainingMemory.setText(Integer.toString(newMemory));
                }
            }
            catch(NumberFormatException ex){}
        }
        
        if(ff.getSource() == setOsSize2)
        {
            os2 = osInput2.getText();
            if(Integer.parseInt(os2) > Integer.parseInt(memory2))
            {
                JOptionPane.showMessageDialog(
                        null, 
                        "OS Size can't be bigger than the memory size! Please try again.", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                osSize2.setText(os2);
                newMemory2 = Integer.parseInt(memory2) - Integer.parseInt(osSize2.getText());
                remainingMemory2.setText(Integer.toString(newMemory2));
            }
        }
        
        if(ff.getSource() == setOsSize3)
        {
            os3 = osInput3.getText();
            if(Integer.parseInt(os3) > Integer.parseInt(memory3))
            {
                JOptionPane.showMessageDialog(
                        null, 
                        "OS Size can't be bigger than the memory size! Please try again.", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                osSize3.setText(os3);
                newMemory3 = Integer.parseInt(memory3) - Integer.parseInt(osSize3.getText());
                remainingMemory3.setText(Integer.toString(newMemory3));
            }
        }
        
        if(ff.getSource() == addProcess){                                         
             try
            {
                String inputMemorySize = processSize.getText(); //gets the input
                int input = Integer.parseInt(inputMemorySize);

                tableModelProcess.addRow(new Object[]{processTable.getRowCount()+1,input}); //adding of elements into the jtable
                processSize.setText("");
            }
            catch (NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(
                        null, 
                        "Invalid input! Please try again", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
        } 
        
        if(ff.getSource() == addPartition){                                          
            try
            {
                int rowCount = tableModelPartition.getRowCount();
                int[] values = new int[rowCount];

                String inputMemorySize = partitionSize.getText();
                int inputMemory = Integer.parseInt(inputMemorySize);

                String remainingMemorySize = remainingMemory.getText();
                int remaining = Integer.parseInt(remainingMemorySize);

                if(inputMemory <= remaining)
                {
                    int sum = inputMemory;
                    int totalRemainingMemory = remaining - inputMemory;
                    remainingMemory.setText(Integer.toString(totalRemainingMemory));

                    tableModelPartition.addRow(new Object[]{partitionTable.getRowCount()+1, inputMemorySize});
                    for(int i = 0; i < rowCount; ++i)
                    {
                        values[i] = Integer.parseInt(tableModelPartition.getValueAt(i, 1).toString());
                        sum += values[i];
                    }
                    usedMemory.setText(Integer.toString(sum));

                    partitionSize.setText("");
                }
                else
                {
                    JOptionPane.showMessageDialog(
                            null, 
                            "You don't have enough remaining memory allocated! Please try again.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    partitionSize.setText("");
                }
            }
            catch (NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(
                        null, 
                        "Invalid input! Please try again", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if(ff.getSource() == calculate)
        {
            String osS = osSize.getText();
            osSizevar = Integer.parseInt(osS);
            int rowCount = tableModelProcess.getRowCount();
            int rowCount2 = tableModelPartition.getRowCount();
            
            processSizes = new int [rowCount];
            partitionSizes = new int [rowCount2];
            
            for(int i = 0; i < tableModelProcess.getRowCount(); i++)
            {
                processSizes[i] = Integer.parseInt(tableModelProcess.getValueAt(i, 1).toString());
            }
            
            for(int i = 0; i < tableModelPartition.getRowCount(); i++)
            {
                partitionSizes[i] = Integer.parseInt(tableModelPartition.getValueAt(i, 1).toString());
            }
            firstFit(partitionSizes, partitionSizes.length, processSizes, processSizes.length); 
            layoutGantt(ganttPanel);
        }
        
        
        if(ff.getSource() == clearProcess){                                      
            tableModelProcess.setRowCount(0);
            processSize.setText("");
            remainingMemory.setText("");
            usedMemory.setText("");
            osSize.setText("");
        }
        
        if(ff.getSource() == clearPartition){
            tableModelPartition.setRowCount(0);
            partitionSize.setText("");
            statisticsOutput.setText("");
            remainingMemory.setText("");
            usedMemory.setText("");
            osSize.setText("");
         } 
        
        //best fit
        if(ff.getSource() == setMemorySize2){                             
            try
            {
                if(!osSize2.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Memory Size changed! Please update OS Size.", 
                        "Notice!", 
                        JOptionPane.INFORMATION_MESSAGE);
                    memory2 = memorySize2.getText();
                    remainingMemory2.setText(memory2);
                    memorySize2.setText("");
                }
                else
                {
                    memory2 = memorySize2.getText();
                    remainingMemory2.setText(memory2);
                    osSize2.setText("");
                    newMemory2 = Integer.parseInt(memorySize2.getText()) - Integer.parseInt(osSize2.getText());
                    remainingMemory2.setText(Integer.toString(newMemory2));
                }
            } catch(NumberFormatException ignored){}
        } 
        
        if(ff.getSource() == addProcess2){                                         
             try
            {
                String inputMemorySize = processSize2.getText(); //gets the input
                int input = Integer.parseInt(inputMemorySize);

                tableModelProcess2.addRow(new Object[]{processTable2.getRowCount()+1,input}); //adding of elements into the jtable
                processSize2.setText("");
            }
            catch (NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(
                        null, 
                        "Invalid input! Please try again", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
        } 
        
        if(ff.getSource() == addPartition2){                                          
            try
            {
                int rowCount = tableModelPartition2.getRowCount();
                int values[] = new int[rowCount];

                String inputMemorySize = partitionSize2.getText();
                int inputMemory = Integer.parseInt(inputMemorySize);

                String remainingMemorySize = remainingMemory2.getText();
                int remaining = Integer.parseInt(remainingMemorySize);

                if(inputMemory <= remaining)
                {
                    int sum = inputMemory;
                    int totalRemainingMemory = remaining - inputMemory;
                    remainingMemory2.setText(Integer.toString(totalRemainingMemory));

                    tableModelPartition2.addRow(new Object[]{partitionTable2.getRowCount()+1, inputMemorySize});
                    for(int i = 0; i < rowCount; ++i)
                    {
                        values[i] = Integer.parseInt(tableModelPartition2.getValueAt(i, 1).toString());
                        sum += values[i];
                    }
                    usedMemory2.setText(Integer.toString(sum));

                    partitionSize2.setText("");
                }
                else
                {
                    JOptionPane.showMessageDialog(
                            null, 
                            "You don't have enough remaining memory allocated! Please try again.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    partitionSize2.setText("");
                }
            }
            catch (NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(
                        null, 
                        "Invalid input! Please try again", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if(ff.getSource() == calculate2)
        {
            String osS2 = osSize2.getText();
            osSizevar2 = Integer.parseInt(osS2);
            int rowCount = tableModelProcess2.getRowCount();
            int rowCount2 = tableModelPartition2.getRowCount();
            
            processSizes2 = new int [rowCount];
            partitionSizes2 = new int [rowCount2];
            
            for(int i = 0; i < tableModelProcess2.getRowCount(); i++)
            {
                processSizes2[i] = Integer.parseInt(tableModelProcess2.getValueAt(i, 1).toString());
            }
            
            for(int i = 0; i < tableModelPartition2.getRowCount(); i++)
            {
                partitionSizes2[i] = Integer.parseInt(tableModelPartition2.getValueAt(i, 1).toString());
            }
            
            bestFit(partitionSizes2, partitionSizes2.length, processSizes2, processSizes2.length);
            layoutGantt2(ganttPanel2);
        }
        
        
        if(ff.getSource() == clearProcess2){                                      
            tableModelProcess2.setRowCount(0);
            processSize2.setText("");
            statisticsOutput2.setText("");
            remainingMemory2.setText("");
            usedMemory2.setText("");
            osSize2.setText("");
        }
        
        if(ff.getSource() == clearPartition2){
            tableModelPartition2.setRowCount(0);
            partitionSize2.setText("");
            statisticsOutput2.setText("");
            remainingMemory2.setText("");
            usedMemory2.setText("");
            osSize2.setText("");
         }
        
     //worst fit
        if(ff.getSource() == setMemorySize3){
                                            
            try
            {
                if(!osSize3.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Memory Size changed! Please update OS Size.", 
                        "Notice!", 
                        JOptionPane.INFORMATION_MESSAGE);
                    memory3 = memorySize3.getText();
                    remainingMemory3.setText(memory3);
                    memorySize3.setText("");
                }
                else
                {
                    memory3 = memorySize3.getText();
                    remainingMemory3.setText(memory3);
                    newMemory3 = Integer.parseInt(memorySize3.getText()) - Integer.parseInt(osSize3.getText());
                    remainingMemory3.setText(Integer.toString(newMemory3));
                }
            }
            catch(NumberFormatException ex){}
        } 
        
        if(ff.getSource() == addProcess3){                                         
             try
            {
                String inputMemorySize = processSize3.getText(); //gets the input
                int input = Integer.parseInt(inputMemorySize);

                tableModelProcess3.addRow(new Object[]{processTable3.getRowCount()+1,input}); //adding of elements into the jtable
                processSize3.setText("");
            }
            catch (NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(
                        null, 
                        "Invalid input! Please try again", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
        } 
        
        if(ff.getSource() == addPartition3){                                          
            try
            {
                int rowCount = tableModelPartition3.getRowCount();
                int values[] = new int[rowCount];

                String inputMemorySize = partitionSize3.getText();
                int inputMemory = Integer.parseInt(inputMemorySize);

                String remainingMemorySize = remainingMemory3.getText();
                int remaining = Integer.parseInt(remainingMemorySize);

                if(inputMemory <= remaining)
                {
                    int sum = inputMemory;
                    int totalRemainingMemory = remaining - inputMemory;
                    remainingMemory3.setText(Integer.toString(totalRemainingMemory));

                    tableModelPartition3.addRow(new Object[]{partitionTable3.getRowCount()+1, inputMemorySize});
                    for(int i = 0; i < rowCount; ++i)
                    {
                        values[i] = Integer.parseInt(tableModelPartition3.getValueAt(i, 1).toString());
                        sum += values[i];
                    }
                    usedMemory3.setText(Integer.toString(sum));

                    partitionSize3.setText("");
                }
                else
                {
                    JOptionPane.showMessageDialog(
                            null, 
                            "You don't have enough remaining memory allocated! Please try again.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    partitionSize3.setText("");
                }
            }
            catch (NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(
                        null, 
                        "Invalid input! Please try again", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if(ff.getSource() == calculate3)
        {
           String osS3 = osSize3.getText();
           osSizevar3 = Integer.parseInt(osS3);
            int rowCount = tableModelProcess3.getRowCount();
            int rowCount2 = tableModelPartition3.getRowCount();
            
            processSizes3 = new int [rowCount];
            partitionSizes3 = new int [rowCount2];
            
            for(int i = 0; i < tableModelProcess3.getRowCount(); i++)
            {
                processSizes3[i] = Integer.parseInt(tableModelProcess3.getValueAt(i, 1).toString());
            }
            
            for(int i = 0; i < tableModelPartition3.getRowCount(); i++)
            {
                partitionSizes3[i] = Integer.parseInt(tableModelPartition3.getValueAt(i, 1).toString());
            }
            
            worstFit(partitionSizes3, partitionSizes3.length, processSizes3, processSizes3.length); 
            layoutGantt3(ganttPanel3);
        }
        
        
        if(ff.getSource() == clearProcess3){                                      
            tableModelProcess3.setRowCount(0);
            processSize3.setText("");
            statisticsOutput3.setText("");
            remainingMemory3.setText("");
            usedMemory3.setText("");
            osSize3.setText("");
        }
        
        if(ff.getSource() == clearPartition3){
            tableModelPartition3.setRowCount(0);
            partitionSize3.setText("");
            statisticsOutput3.setText("");
            remainingMemory3.setText("");
            usedMemory3.setText("");
            osSize3.setText("");
         } 
        
        
    }

    private void homeButtonMouseEntered(MouseEvent evt) {
        homeButton.setOpaque(true);
    }                                       

    private void firstFitButtonMouseEntered(MouseEvent evt) {
        firstFitButton.setOpaque(true);
    }                                           

    private void bestFitButtonMouseEntered(MouseEvent evt) {
        bestFitButton.setOpaque(true);
    }                                          

    private void worstFitButtonMouseEntered(MouseEvent evt) {
        worstFitButton.setOpaque(true);
    }                                           

    private void exitButtonMouseEntered(MouseEvent evt) {
        exitButton.setOpaque(true);
    }                                       

    private void homeButtonMouseExited(MouseEvent evt) {
        homeButton.setOpaque(false);
    }                                      

    private void firstFitButtonMouseExited(MouseEvent evt) {
        firstFitButton.setOpaque(false);
    }                                          

    private void bestFitButtonMouseExited(MouseEvent evt) {
        bestFitButton.setOpaque(false);
    }                                         

    private void worstFitButtonMouseExited(MouseEvent evt) {
        worstFitButton.setOpaque(false);
    }                                          

    private void exitButtonMouseExited(MouseEvent evt) {
        exitButton.setOpaque(false);
    }                                      

    private void firstFitButtonActionPerformed(ActionEvent evt) {
        
        //clearing panel
        contentPanel.removeAll();
        contentPanel.repaint();
        contentPanel. revalidate();
        
        //adding panels
        contentPanel.add(firstFitPanel);
        contentPanel.repaint();
        contentPanel. revalidate();
    }                                              

    private void bestFitButtonActionPerformed(ActionEvent evt) {
        
        //clearing panel
        contentPanel.removeAll();
        contentPanel.repaint();
        contentPanel. revalidate();
        
        //adding panels
        contentPanel.add(bestFitPanel);
        contentPanel.repaint();
        contentPanel. revalidate();
    }                                             

    private void worstFitButtonActionPerformed(ActionEvent evt) {
        //clearing panel
        contentPanel.removeAll();
        contentPanel.repaint();
        contentPanel. revalidate();
        
        //adding panels
        contentPanel.add(worstFitPanel);
        contentPanel.repaint();
        contentPanel. revalidate();
    }                                              

    private void homeButtonActionPerformed(ActionEvent evt) {
        
        //clearing panel
        contentPanel.removeAll();
        contentPanel.repaint();
        contentPanel. revalidate();
        
        //adding panels
        contentPanel.add(homePanel);
        contentPanel.repaint();
        contentPanel. revalidate();
    }                                          

    private void exitButtonActionPerformed(ActionEvent evt) {
        this.dispose();
        MainMenuOS mmos = new MainMenuOS();
        mmos.setVisible(true);
        mmos.setResizable(false);
        mmos.setLocationRelativeTo(null);  
        mmos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void firstFit(int partitionSizes[], int partitionSizeLength, int processSizes[], int processSizeLength)
    {
        int copyOfPartitions[] = new int[partitionSizeLength];
        int allocation[] = new int[processSizeLength];
        int reduced[] = new int[processSizeLength];
        
        //sotres all the values of partitions into copy of partitions
        for (int i = 0; i < copyOfPartitions.length; i++)
            copyOfPartitions[i] = partitionSizes[i];
        
        //walang partition pa ang nakaassign sa process
        for (int i = 0; i < allocation.length; i++) 
            allocation[i] = -1; 

        for (int i = 0; i < processSizeLength; i++) 
        { 
            for (int j = 0; j < partitionSizeLength; j++) 
            { 
                //iterate sa processes and pipiliin pag mas malaki yung partition kaysa sa process
                if (copyOfPartitions[j] >= processSizes[i]) 
                { 
                    //ililipat yung partition j papuntang process
                    //then minus yung dalawa
                    allocation[i] = j; 
                    reduced[i] = copyOfPartitions[j] -= processSizes[i];
                    break;
                } 
            }
        } 
      
        for (int i = 0; i < processSizeLength; i++) 
        { 
            //iterate throughout all of the processes
            if (allocation[i] != -1)
            {
//                blockSize[allocation[i]] PAG GUSTO NIYO NA ANG LALABAS IS YUNG PARTITION VALUE INSTEAD OF PARTIION NUMBER
//                ex. 212k is put in partition 500k / 212k is put in partition 2
//                but ang problema is pag nabawasan na yung partition, same pa rin lalabas hindi yung new partition na may minus na
                statisticsOutput.append(processSizes[i] + "K is put in Partition " + Integer.toString(allocation[i] + 1) + "\n");
                processAlloc.add(new Custom.Process(processSizes[i],allocation[i]));
//                System.out.println(processAlloc.get(i));
                statisticsOutput.append("Remaining Memory in Parition " + Integer.toString(allocation[i] + 1) + ": " + reduced[i] + "\n\n");
            }
            else
                statisticsOutput.append(processSizes[i] + "K must wait\n\n");
        } 
    }
    
    
    public void bestFit(int blockSize2[], int m, int processSize2[], int n)
    {
        copyOfPartitions2 = new int[m];
        int allocation2[] = new int[n];
        int reduced2[] = new int[n];
        
        //sotres all the values of partitions into copy of partitions
        for (int i = 0; i < copyOfPartitions2.length; i++)
            copyOfPartitions2[i] = partitionSizes2[i];
        
        //walang partition pa ang nakaassign sa process
        for (int i = 0; i < allocation2.length; i++) 
            allocation2[i] = -1; 
       
     // pick each process and find suitable blocks 
        // according to its size ad assign to it 
        for (int i=0; i<n; i++) 
        { 
            // Find the best fit block for current process 
            int bestIdx = -1; 
            for (int j=0; j<m; j++) 
            { 
                if (blockSize2[j] >= processSizes2[i]) 
                { 
                    if (bestIdx == -1) 
                        bestIdx = j; 
                    else if (blockSize2[bestIdx] > blockSize2[j]) 
                        bestIdx = j; 
                } 
            } 
       
            // If we could find a block for current process 
            if (bestIdx != -1) 
            { 
                // allocate block j to p[i] process 
                allocation2[i] = bestIdx; 
       
                // Reduce available memory in this block. 
                reduced2[i] = blockSize2[bestIdx] -= processSizes2[i]; 
            }  
        } 
      
        for (int i = 0; i < n; i++) 
        { 
            //iterate throughout all of the processes
            if (allocation2[i] != -1)
            {
//                blockSize[allocation[i]] PAG GUSTO NIYO NA ANG LALABAS IS YUNG PARTITION VALUE INSTEAD OF PARTIION NUMBER
//                ex. 212k is put in partition 500k / 212k is put in partition 2
//                but ang problema is pag nabawasan na yung partition, same pa rin lalabas hindi yung new partition na may minus na
                statisticsOutput2.append(processSizes2[i] + "K is put in Partition " + Integer.toString(allocation2[i] + 1) + "\n");
                statisticsOutput2.append("Remaining Memory in Parition " + Integer.toString(allocation2[i] + 1) + ": " + reduced2[i] + "\n\n");
                processAlloc2.add(new Custom.Process(processSizes2[i],allocation2[i]));
            }
            else
                statisticsOutput2.append(processSizes2[i] + "K must wait\n\n");
        } 
    }
    
        public void worstFit(int blockSize3[], int m, int processSize3[], int n)
    {
        copyOfPartitions3 = new int[m];
        int allocation3[] = new int[n];
        int reduced3[] = new int[n];
        
        //sotres all the values of partitions into copy of partitions
        for (int i = 0; i < copyOfPartitions3.length; i++)
            copyOfPartitions3[i] = partitionSizes3[i];
        
        //walang partition pa ang nakaassign sa process
        for (int i = 0; i < allocation3.length; i++) 
            allocation3[i] = -1; 
       
        // pick each process and find suitable blocks 
        // according to its size ad assign to it 
        for (int i=0; i<n; i++) 
        { 
            // Find the best fit block for current process 
            int wstIdx = -1; 
            for (int j=0; j<m; j++) 
            { 
                if (blockSize3[j] >= processSizes3[i]) 
                { 
                    if (wstIdx == -1) 
                        wstIdx = j; 
                    else if (blockSize3[wstIdx] < blockSize3[j]) 
                        wstIdx = j; 
                } 
            } 
       
            // If we could find a block for current process 
            if (wstIdx != -1) 
            { 
                // allocate block j to p[i] process 
                allocation3[i] = wstIdx; 
       
                // Reduce available memory in this block. 
                reduced3[i] = blockSize3[wstIdx] -= processSizes3[i]; 
            } 
        } 
      
        for (int i = 0; i < n; i++) 
        { 
            //iterate throughout all of the processes
            if (allocation3[i] != -1)
            {
//                blockSize[allocation[i]] PAG GUSTO NIYO NA ANG LALABAS IS YUNG PARTITION VALUE INSTEAD OF PARTIION NUMBER
//                ex. 212k is put in partition 500k / 212k is put in partition 2
//                but ang problema is pag nabawasan na yung partition, same pa rin lalabas hindi yung new partition na may minus na
                statisticsOutput3.append(processSizes3[i] + "K is put in Partition " + Integer.toString(allocation3[i] + 1) + "\n");
                statisticsOutput3.append("Remaining Memory in Parition " + Integer.toString(allocation3[i] + 1) + ": " + reduced3[i] + "\n\n");
                processAlloc3.add(new Custom.Process(processSizes3[i],allocation3[i]));
            }
            else
                statisticsOutput3.append(processSizes3[i] + "K must wait\n\n");
        } 
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 public void layoutGantt(JPanel panel){
        panel.removeAll();
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Dimension size;
        Border panelBorder = BorderFactory.createLineBorder(Color.BLUE);
        float width;
        int posx = 0;
        int posy = 0;
        
        JLabel osLbl = new JLabel("OS");
        panel.add(osLbl);
        osLbl.setBorder(BorderFactory.createLineBorder(Color.RED));
        
        width = ((float)osSizevar/Integer.parseInt(memory))*1000;
        size = new Dimension((int)width, 75);
        osLbl.setPreferredSize(size);
        osLbl.setBounds(posx, posy,
                    size.width, size.height);
    
            JPanel partitionGantt[] = new JPanel[partitionSizes.length];
     
        JLabel partitionSize;
        posx += size.width;
        JLabel osSizeLbl = new JLabel(osSizevar + "K");
        osSizeLbl.setPreferredSize(new Dimension(35,25));
        size = osSizeLbl.getPreferredSize();
        panel.add(osSizeLbl);
        osSizeLbl.setBounds(posx-size.width, 70,
                         size.width, size.height);
        for(int i = 0; i < partitionGantt.length; i++){
            
            partitionGantt[i] = new JPanel(null);
            partitionGantt[i].setBorder(panelBorder);
            
            if(i == partitionSizes.length-1 && unpartitioned == 0){
                width = 1000-posx;
            }
            else{
                width = ((float)partitionSizes[i]/Integer.parseInt(memory)*1000);
            }
            
            size = new Dimension((int)width, 75);
            partitionGantt[i].setPreferredSize(size);
            
            panel.add(partitionGantt[i]);
            
            partitionGantt[i].setBounds(posx, posy,
                         size.width, size.height);
            
            partitionSize = new JLabel(partitionSizes[i] + "K");
            partitionSize.setPreferredSize(new Dimension(35,25));
            size = partitionSize.getPreferredSize();
            panel.add(partitionSize);
            posx += width;
            partitionSize.setBounds(posx-size.width, 70,
                         size.width, size.height);
        }
        
        ArrayList<Custom.Process> processInPartition;
        
        for(int i=0;i<partitionSizes.length;i++){
            processInPartition = new ArrayList<>();
            for(Custom.Process item: processAlloc){
                if(item.partition() == i)
                    processInPartition.add(new Custom.Process(item));
            }
            if(!processInPartition.isEmpty());
                layoutProcess(partitionGantt[i], partitionSizes[i], processInPartition);
        }
        
    }
    public void layoutProcess(JPanel partition,int partitionSize, ArrayList<Custom.Process> processes){
        partition.setLayout(null);
        Border border = BorderFactory.createLineBorder(Color.GREEN);
        int totalSize = partition.getPreferredSize().width;
        int posx = 2;
        int posy = 2;
        float width;
        Dimension d;
        int sizeOfProcess;
        JLabel process;
        for(int i=0;i<processes.size();i++){
            sizeOfProcess = processes.get(i).size();
            process = new JLabel(sizeOfProcess+"K");
            process.setBorder(border);
            partition.add(process);
            
            width = ((float)sizeOfProcess/partitionSize)*totalSize;
            d = new Dimension((int)width-3, 70);
            process.setPreferredSize(d);
        
            process.setBounds(posx, posy,
                            d.width, d.height);
            
            posx += d.width;
            
        }
    }
    public void layoutGantt2(JPanel panel2){
        panel2.removeAll();
        panel2.setLayout(null);
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Dimension size2;
        Border panelBorder2 = BorderFactory.createLineBorder(Color.BLUE);
        float width2;
        int posx2 = 0;
        int posy2 = 0;
        
        for(int i = 0; i < partitionSizes2.length; i++)
        {
            System.out.println(partitionSizes2[i]);
        }
        
        JLabel osLbl2 = new JLabel("OS");
        panel2.add(osLbl2);
        osLbl2.setBorder(BorderFactory.createLineBorder(Color.RED));
        width2 = ((float)osSizevar2/Integer.parseInt(memory2))*1000;
        System.out.println(osSizevar2);
        size2 = new Dimension((int)width2, 75);
        osLbl2.setPreferredSize(size2);
        osLbl2.setBounds(posx2, posy2,
                    size2.width, size2.height);
        
        JPanel partitionGantt2[] = new JPanel[copyOfPartitions2.length];
        JLabel partitionSize2;
        posx2 += size2.width;
        JLabel osSizeLbl2 = new JLabel(osSizevar2 + "K");
        osSizeLbl2.setPreferredSize(new Dimension(35,25));
        size2 = osSizeLbl2.getPreferredSize();
        panel2.add(osSizeLbl2);
        osSizeLbl2.setBounds(posx2-size2.width, 70,
                         size2.width, size2.height);
        for(int i = 0; i < partitionGantt2.length; i++){
            
            partitionGantt2[i] = new JPanel(null);
            partitionGantt2[i].setBorder(panelBorder2);
            
            if(i == copyOfPartitions2.length-1 && unpartitioned2 == 0){
                width2 = 1000-posx2;
            }
            else{
                width2 = ((float)copyOfPartitions2[i]/Integer.parseInt(memory2)*1000);
            }
            
            size2 = new Dimension((int)width2, 75);
            partitionGantt2[i].setPreferredSize(size2);
            
            panel2.add(partitionGantt2[i]);
            
            partitionGantt2[i].setBounds(posx2, posy2,
                         size2.width, size2.height);
            
            partitionSize2 = new JLabel(copyOfPartitions2[i] + "K");
            partitionSize2.setPreferredSize(new Dimension(35,25));
            size2 = partitionSize2.getPreferredSize();
            panel2.add(partitionSize2);
            posx2 += width2;
            partitionSize2.setBounds(posx2-size2.width, 70,
                         size2.width, size2.height);
        }
        
        ArrayList<Custom.Process> processInPartition2;
        
        for(int i=0;i<copyOfPartitions2.length;i++){
            processInPartition2 = new ArrayList<>();
            for(Custom.Process item2: processAlloc2){
                if(item2.partition()== i)
                    processInPartition2.add(new Custom.Process(item2));
            }
            if(!processInPartition2.isEmpty());
                layoutProcess2(partitionGantt2[i], copyOfPartitions2[i], processInPartition2);
        }
    }
    
    public void layoutProcess2(JPanel partition2,int partitionSize2, ArrayList<Custom.Process> processes2){
        partition2.setLayout(null);
        Border border = BorderFactory.createLineBorder(Color.GREEN);
        int totalSize2 = partition2.getPreferredSize().width;
        int posx2 = 2;
        int posy2 = 2;
        float width2;
        Dimension d2;
        int sizeOfProcesses2;
        JLabel process;
        for(int i=0;i<processes2.size();i++){
            sizeOfProcesses2 = processes2.get(i).size();
            process = new JLabel(sizeOfProcesses2+"K");
            process.setBorder(border);
            partition2.add(process);
            
            width2 = ((float)sizeOfProcesses2/partitionSize2)*totalSize2;
            d2 = new Dimension((int)width2-3, 70);
            process.setPreferredSize(d2);
        
            process.setBounds(posx2, posy2,
                            d2.width, d2.height);
            
            posx2 += d2.width;
            
        }
    }
    public void layoutGantt3(JPanel panel3){
        panel3.removeAll();
        panel3.setLayout(null);
        panel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Dimension size3;
        Border panelBorder3 = BorderFactory.createLineBorder(Color.BLUE);
        float width3;
        int posx3 = 0;
        int posy3 = 0;
        
        for(int i = 0; i < partitionSizes3.length; i++)
        {
            System.out.println(partitionSizes3[i]);
        }
        
        JLabel osLbl3 = new JLabel("OS");
        panel3.add(osLbl3);
        osLbl3.setBorder(BorderFactory.createLineBorder(Color.RED));
        width3 = ((float)osSizevar3/Integer.parseInt(memory3))*1000;
        System.out.println(osSizevar3);
        
        size3 = new Dimension((int)width3, 75);
        osLbl3.setPreferredSize(size3);
        osLbl3.setBounds(posx3, posy3,
                    size3.width, size3.height);
        
        JPanel partitionGantt3[] = new JPanel[copyOfPartitions3.length];
        JLabel partitionSize3;
        posx3 += size3.width;
        JLabel osSizeLbl3 = new JLabel(osSizevar3 + "K");
        osSizeLbl3.setPreferredSize(new Dimension(35,25));
        size3 = osSizeLbl3.getPreferredSize();
        panel3.add(osSizeLbl3);
        osSizeLbl3.setBounds(posx3-size3.width, 70,
                         size3.width, size3.height);
        for(int i = 0; i < partitionGantt3.length; i++){
            
            partitionGantt3[i] = new JPanel(null);
            partitionGantt3[i].setBorder(panelBorder3);
            
            if(i == copyOfPartitions3.length-1 && unpartitioned3 == 0){
                width3 = 1000-posx3;
            }
            else{
                width3 = ((float)copyOfPartitions3[i]/Integer.parseInt(memory3)*1000);
            }
            
            size3 = new Dimension((int)width3, 75);
            partitionGantt3[i].setPreferredSize(size3);
            
            panel3.add(partitionGantt3[i]);
            
            partitionGantt3[i].setBounds(posx3, posy3,
                         size3.width, size3.height);
            
            partitionSize3 = new JLabel(copyOfPartitions3[i] + "K");
            partitionSize3.setPreferredSize(new Dimension(35,25));
            size3 = partitionSize3.getPreferredSize();
            panel3.add(partitionSize3);
            posx3 += width3;
            partitionSize3.setBounds(posx3-size3.width, 70,
                         size3.width, size3.height);
        }
        
        ArrayList<Custom.Process> processInPartition3;
        
        for(int i=0;i<copyOfPartitions3.length;i++){
            processInPartition3 = new ArrayList<>();
            for(Custom.Process item3: processAlloc3){
                if(item3.partition()== i)
                    processInPartition3.add(new Custom.Process(item3));
            }
            if(!processInPartition3.isEmpty());
                layoutProcess3(partitionGantt3[i], copyOfPartitions3[i], processInPartition3);
        }
    }
    public void layoutProcess3(JPanel partition3,int partitionSize3, ArrayList<Custom.Process> processes3){
        partition3.setLayout(null);
        Border border = BorderFactory.createLineBorder(Color.GREEN);
        int totalSize3 = partition3.getPreferredSize().width;
        int posx3 = 2;
        int posy3 = 2;
        float width3;
        Dimension d3;
        int sizeOfProcesses3;
        JLabel process;
        for(int i=0;i<processes3.size();i++){
            sizeOfProcesses3 = processes3.get(i).size();
            process = new JLabel(sizeOfProcesses3+"K");
            process.setBorder(border);
            partition3.add(process);
            
            width3 = ((float)sizeOfProcesses3/partitionSize3)*totalSize3;
            d3 = new Dimension((int)width3-3, 70);
            process.setPreferredSize(d3);
        
            process.setBounds(posx3, posy3,
                            d3.width, d3.height);
            
            posx3 += d3.width;
            
        }
    }
    public int getUnpartitionedMemory(int memory, int os, int partition[]){
        memory -= os;
        for(int item: partition){
            memory -= item;
        }
        
        return memory;
    }    
    public int getUnpartitionedMemory2(int memory2, int os, int partition[]){
        memory2 -= os;
        for(int item: partition){
            memory2 -= item;
        }
        
        return memory2;
    }    
    public int getUnpartitionedMemory3(int memory3, int os, int partition[]){
        memory3 -= os;
        for(int item: partition){
            memory3 -= item;
        }
        
        return memory3;
    }    

   public static void main(String[] args) 
    {
        MainFrame run = new MainFrame();
        run.setVisible(true);
        run.setResizable(false);
        run.setLocationRelativeTo(null);
    }

}

