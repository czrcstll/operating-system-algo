package oscase2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LOOK extends JFrame implements ActionListener
{
    private javax.swing.JTable FCFSTable;
    private javax.swing.JScrollPane FCFSTableScrollPane;
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton clearDiskButton;
    private javax.swing.JButton diskButton;
    private javax.swing.JLabel diskLabel;
    private javax.swing.JTextField diskTextField;
    private javax.swing.JButton headButton;
    private javax.swing.JLabel headLabel;
    private javax.swing.JTextField headTextField;
    private javax.swing.JButton ioRequestsButton;
    private javax.swing.JLabel ioRequestsLabel;
    private javax.swing.JTextField requestsTextField;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextArea resultsTextArea;
    private javax.swing.JScrollPane resultsTextAreaScrollPane;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel totalTracksLabel;
    private javax.swing.JLabel tracksLabel;
    
    public LOOK()
    {
        titleLabel = new javax.swing.JLabel();
        headLabel = new javax.swing.JLabel();
        headTextField = new javax.swing.JTextField();
        FCFSTableScrollPane = new javax.swing.JScrollPane();
        FCFSTable = new javax.swing.JTable();
        headButton = new javax.swing.JButton();
        ioRequestsLabel = new javax.swing.JLabel();
        requestsTextField = new javax.swing.JTextField();
        resultsTextAreaScrollPane = new javax.swing.JScrollPane();
        resultsTextArea = new javax.swing.JTextArea();
        ioRequestsButton = new javax.swing.JButton();
        calculateButton = new javax.swing.JButton();
        tracksLabel = new javax.swing.JLabel();
        totalTracksLabel = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        diskLabel = new javax.swing.JLabel();
        diskTextField = new javax.swing.JTextField();
        diskButton = new javax.swing.JButton();
        clearDiskButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLabel.setText("LOOK Disk Scheduling");
        getContentPane().add(titleLabel);
        titleLabel.setBounds(30, 10, 290, 72);

        headLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        headLabel.setText("Initital Head Start:");
        getContentPane().add(headLabel);
        headLabel.setBounds(100, 120, 150, 30);
        getContentPane().add(headTextField);
        headTextField.setBounds(260, 120, 120, 30);

        FCFSTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process", "IO/Requests"
            }
        ));
        FCFSTableScrollPane.setViewportView(FCFSTable);

        getContentPane().add(FCFSTableScrollPane);
        FCFSTableScrollPane.setBounds(30, 220, 280, 300);

        headButton.setText("SET");
        getContentPane().add(headButton);
        headButton.setBounds(390, 120, 88, 30);

        ioRequestsLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ioRequestsLabel.setText("I/O Requests:");
        getContentPane().add(ioRequestsLabel);
        ioRequestsLabel.setBounds(100, 170, 150, 30);
        getContentPane().add(requestsTextField);
        requestsTextField.setBounds(260, 170, 120, 30);

        resultsTextArea.setColumns(20);
        resultsTextArea.setRows(5);
        resultsTextAreaScrollPane.setViewportView(resultsTextArea);

        getContentPane().add(resultsTextAreaScrollPane);
        resultsTextAreaScrollPane.setBounds(340, 220, 400, 300);

        ioRequestsButton.setText("SET");
        getContentPane().add(ioRequestsButton);
        ioRequestsButton.setBounds(390, 170, 88, 30);

        calculateButton.setText("CALCULATE");
        getContentPane().add(calculateButton);
        calculateButton.setBounds(600, 110, 110, 50);

        tracksLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tracksLabel.setText("[tracks]");
        getContentPane().add(tracksLabel);
        tracksLabel.setBounds(440, 518, 140, 40);

        totalTracksLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totalTracksLabel.setText("Total Head Movement:");
        getContentPane().add(totalTracksLabel);
        totalTracksLabel.setBounds(250, 518, 180, 40);

        clearButton.setText("CLEAR");
        getContentPane().add(clearButton);
        clearButton.setBounds(490, 120, 88, 30);

        resetButton.setText("RESET");
        getContentPane().add(resetButton);
        resetButton.setBounds(490, 170, 88, 30);

        diskLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        diskLabel.setText("Total Disk Size:");
        getContentPane().add(diskLabel);
        diskLabel.setBounds(100, 70, 150, 30);

        getContentPane().add(diskTextField);
        diskTextField.setBounds(260, 70, 120, 30);

        diskButton.setText("SET");
        getContentPane().add(diskButton);
        diskButton.setBounds(390, 70, 88, 30);

        clearDiskButton.setText("CLEAR");
        getContentPane().add(clearDiskButton);
        clearDiskButton.setBounds(490, 70, 88, 30);
        
        headButton.addActionListener(this);
        ioRequestsButton.addActionListener(this);
        calculateButton.addActionListener(this);
        clearButton.addActionListener(this);
        resetButton.addActionListener(this);
        diskButton.addActionListener(this);
        clearDiskButton.addActionListener(this);
        
        tableModel = (DefaultTableModel) FCFSTable.getModel();

        pack();
    }
    
    //global variables
    String head, requests, disk;
    int requestsInt, headInt, diskInt, totalTracks = 0, track, distance[], sort[], temp, first;
    DefaultTableModel tableModel;

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
            resultsTextArea.selectAll();
            resultsTextArea.replaceSelection("");
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
        }
        
        if(e.getSource() == calculateButton)
        {
            int req[] = new int[tableModel.getRowCount()];
            String direction = "right";
            headInt = Integer.parseInt(head);
            diskInt = Integer.parseInt(disk);
            
            for (int i = 0; i < tableModel.getRowCount(); i++)
            {
                req[i] = Integer.parseInt(tableModel.getValueAt(i, 1).toString());
            }
            
            LOOK(req, headInt, direction);
            
            //98, 183, 37, 122, 14, 124, 65, and 67
        }
    }
    
public void LOOK(int[] arr, int head, String direction)
{
	int seek_count = 0;
        first = head;
	int distance[] = new int[arr.length];
	int cur_track;
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

	sort = new int[tableModel.getRowCount()];
          
        for (int i = 0; i < tableModel.getRowCount(); i++) 
            sort[i] = arr[i]; //sort the tracks for output
        
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
        
        int []dis = new int[seek_sequence.size()];
        
        resultsTextArea.append("SCAN Disk Scheduling\n\n");
        for (int i = 0; i < tableModel.getRowCount(); i++)
            resultsTextArea.append(sort[i] + " ");
        resultsTextArea.append("\n\nComputing for the total head movement: \n");
        
        int first_dis = Math.abs(first - seek_sequence.get(0));
        resultsTextArea.append("     from " + first + " to " + seek_sequence.get(0) + " = " + first_dis + "\n");
        
        tracksLabel.setText(seek_count + " tracks");
        
        try
        {
            for (int i = 0; i < seek_sequence.size(); i++) 
            {
                dis[i] = Math.abs(seek_sequence.get(i+1) - seek_sequence.get(i));
                resultsTextArea.append("     from " + seek_sequence.get(i) + " to " + seek_sequence.get(i+1) + " = " + dis[i] + "\n");
            }
        } catch(IndexOutOfBoundsException ex) { System.out.println(" "); }
    }

    public static void main(String[] args) 
    {
        LOOK run = new LOOK();
        run.setVisible(true);
        run.setSize(766, 600);
        run.setResizable(false);
        run.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        run.setLocationRelativeTo(null);
    }
}
