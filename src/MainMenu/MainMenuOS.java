
package MainMenu;

import java.awt.event.ActionEvent;
import oscase2.*;
import memorymanagement.*;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;


public class MainMenuOS extends JFrame implements ActionListener {

    JButton diskSchedulingButton;
    JButton exitButton;
    JButton memoryManagementButton;
    JLabel mainbg;
    JPanel mainpanel;
    
    public MainMenuOS() {
        mainpanel = new JPanel();
        diskSchedulingButton = new JButton();
        exitButton = new JButton();
        memoryManagementButton = new JButton();
        mainbg = new JLabel();
        setUndecorated(true);

        mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        diskSchedulingButton.setIcon(new ImageIcon(getClass().getResource("/MainMenu/dsbutton.png"))); // NOI18N
        diskSchedulingButton.setBorder(null);
        diskSchedulingButton.setBorderPainted(false);
        diskSchedulingButton.setContentAreaFilled(false);
        diskSchedulingButton.setPressedIcon(new ImageIcon(getClass().getResource("/MainMenu/dsbuttonpressed.png"))); 

        mainpanel.add(diskSchedulingButton, new AbsoluteConstraints(240, 460, 200, 70));

        exitButton.setIcon(new ImageIcon(getClass().getResource("/MainMenu/exitbutton.png"))); 
        exitButton.setBorder(null);
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setPressedIcon(new ImageIcon(getClass().getResource("/MainMenu/exitbuttonpressed.png")));


        mainpanel.add(exitButton, new AbsoluteConstraints(750, 10, 40, 40));

        memoryManagementButton.setIcon(new ImageIcon(getClass().getResource("/MainMenu/mmbutton.png")));
        memoryManagementButton.setBorder(null);
        memoryManagementButton.setBorderPainted(false);
        memoryManagementButton.setContentAreaFilled(false);
        memoryManagementButton.setPressedIcon(new ImageIcon(getClass().getResource("/MainMenu/mmbuttonpressed.png"))); 

        mainpanel.add(memoryManagementButton, new AbsoluteConstraints(240, 390, 200, 70));

        mainbg.setIcon(new ImageIcon(getClass().getResource("/MainMenu/mainmenu.png")));
        mainpanel.add(mainbg, new AbsoluteConstraints(0, 0, 800, 590));

        javax.swing.GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainpanel,GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        memoryManagementButton.addActionListener(this);
        diskSchedulingButton.addActionListener(this);
        exitButton.addActionListener(this);
        pack();
    }
    
    @Override
    public void actionPerformed(ActionEvent ff) 
    {   
   

        if(ff.getSource() == memoryManagementButton){

                dispose();
                MainFrame run = new MainFrame();
                run.setVisible(true);
                run.setResizable(false);
                run.setLocationRelativeTo(null);
        } 
        
        if(ff.getSource() == diskSchedulingButton){
                                            
                dispose();
                MainFrameCase2 run = new MainFrameCase2();
                run.setVisible(true);
                run.setSize(950,600);
                run.setResizable(false);
                run.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                run.setLocationRelativeTo(null);
        } 
        
        if(ff.getSource() == exitButton){
                                            
            int button = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Confirm exit", JOptionPane.YES_NO_OPTION);

            if (button != JOptionPane.YES_OPTION) {
                return;
            }

            dispose();
            System.exit(0);
            } 
    }
                                             

    public static void main(String args[]) {
        
        //</editor-fold>
        
                MainMenuOS mmos = new MainMenuOS();
                mmos.setVisible(true);
                mmos.setResizable(false);
                mmos.setLocationRelativeTo(null);
                mmos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                
            }
                 
}
