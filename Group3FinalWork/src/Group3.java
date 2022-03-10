import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

class Cps2cGroup3 {
    private static String about;
    private JPanel mainPanel;
    private JLabel integerlable;
    private JTextField int_btn;
    private JLabel accum_lable;
    private JTextField textAcum;


 // Functions for the accumulated text display.
    // This is the main logic method for calculating the the sum to display
          int Display =0;
          int sum =0;



    public Cps2cGroup3() {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // this is an exception when the user enters alphabets or any special characters.
                textAcum.setText(String.valueOf(Display));
                textAcum.setText(String.valueOf(Display));
        try {

                //the integeer.parseInt is converting the numbers to the text field.
               int number = Integer.parseInt(int_btn.getText());
               Display += number;



               int_btn.setText(String.valueOf(sum));
            }
        catch (Exception exception){


            JOptionPane err= new JOptionPane();
            JOptionPane.showMessageDialog(null, "Please Enter an integer ...");
        }

            }
        };

        int_btn.addActionListener(listener);
        textAcum.addActionListener(listener);
    }
// Method for JMenus containing the Menus and sub menus
    private static JMenuBar MenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu file_menu = new JMenu("File");
        JMenu Editmenu = new JMenu("Edit");
        JMenu helpmenu = new JMenu("Help");


        //creating menu items for the file menu
        JMenuItem New = new JMenuItem("New");
        New.setIcon(new ImageIcon("C:\\GROUP3\\Group3FinalWork\\src\\search.png"));
        JMenuItem Saveas = new JMenuItem("Save as");
        JMenuItem exit = new JMenuItem("Exit");
        // set menu bar color
        menuBar.setBackground(Color.green);

        //creating menuitems for the Edit menu
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem Paste = new JMenuItem("Paste");
        JMenu Find = new JMenu("Find");
        JMenuItem preference = new JMenuItem("Preference");

        // creating menu item for the Help menu
        JMenuItem about = new JMenuItem("About");


       // Action listener for the about to display the about of the program
        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent about) {

            JOptionPane.showMessageDialog(null, "Welcome to group3 project\n This Application is a Graphical user interface\n which " +
                    "accepts an input from user and  perform simple calculations." +
                    " Below are  " +
                    "the functionalities listed. \n" +
                    "Calculations of Accumulated sum" +
                    " \n Menus \n subMenu Items \n Image icons\n Action listeners\n Functions \nEvent Handling " +
                    "Mnemonics\n and\n Accelerators\n"," Copyright All Reserved 2022",JOptionPane.PLAIN_MESSAGE);
            JTextArea Ta= new JTextArea();

                    //NAMES OF GROUP MEMBERS

            Ta.setText("Group 3 Project Members \n" +
                    " These are our team members who contributed to develop this application \n"+
                        "   George Basoah--01200724D\n" +
                        "   Ohene Emmanuel--01204737D  \n" +
                        "   ADIL MUSTAPHA--01204378D \n" +
                        "   ATUAHENE KELVIN--01202869D\n" +
                        "   AMOAKOHENE ALFRED PEPRAH--01205225D,  \n" +
                        "   BAAH ALEX--01200894D \n" +
                        "   ANIM EMMANUEL--01204269D, \n" +
                        "   MWINWULE ERIC--01201181D \n" +
                        "   BENJAMIN ABAKAH--01200644D ");
            // ABOUT FRAME DISPLAY
           JFrame fr = new JFrame();
            fr.setSize(500,300);
           fr.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
           ImageIcon icon =new ImageIcon("C:\\GROUP3\\Group3FinalWork\\src\\icon.png");
           fr.setIconImage(icon.getImage());
           fr.setVisible(true);
           fr.add(Ta);



            }
        });




        // CREATING SUB MENUS FOR FIND
        JMenuItem find = new JMenuItem("find");
        JMenuItem replace = new JMenuItem("Replace");
        replace.setIcon(new ImageIcon("C:\\GROUP3\\Group3FinalWork\\src\\replace1.png"));
         //insert the sub menu items of find into the Find menu
        Find.add(find);
        Find.add(replace);





        //inserting the file menuItems inside the file menu
        file_menu.add(New);
        file_menu.add(Saveas);
        file_menu.addSeparator();
        file_menu.add(exit);

        //inserting the Edit menu Items inside the Edit menu
        Editmenu.add(copy);
        Editmenu.add(Paste);
        Editmenu.addSeparator();
        Editmenu.add(Find);
        Editmenu.add(preference);

        //inserting  the  Help menuItem inside the Help menu
        helpmenu.add(about);
        JWindow.getOwnerlessWindows();



        // inserting each menu into the menu bar
          menuBar.add(file_menu);
          menuBar.add(Editmenu);
          menuBar.add(helpmenu);

          //set Mnemonics keys
        file_menu.setMnemonic(KeyEvent.VK_F);
        Editmenu.setMnemonic(KeyEvent.VK_E);
        helpmenu.setMnemonic(KeyEvent.VK_H);
        about.setMnemonic(KeyEvent.VK_A);

        // set accelerator to exit the program
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
         exit.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 System.exit(0);
             }
         });
        menuBar.getMaximumSize();
       return menuBar;

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CPS2C_Group3");
        frame.setJMenuBar(MenuBar());
        frame.setSize(500,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setContentPane(new Cps2cGroup3().mainPanel);

        //Done!!
        // This  is the final debug of the third application for the presentation.
    }

}

