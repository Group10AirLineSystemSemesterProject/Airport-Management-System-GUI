package AllPages;

import javax.swing.*;
import java.awt.*;

public class GUI {
    public static final Color Main = new Color(188, 242, 252, 154);
    public static final Color Guest_COLOR = new Color(64, 68, 64, 154);
    public static final Color Login_COLOR = new Color(38, 109, 166, 255);
    public static final Color AirportAdminPage_COLOR = new Color(136, 136, 136, 255);

    JFrame frame=new JFrame();

    public void LOGIN(){

        frame.setVisible(false);
        JFrame frame1=new JFrame();
        JPanel panel=new JPanel();
        frame1.setSize(1200,700);
        frame1.setLocationRelativeTo(null);//set center

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.add(panel);
        panel.setLayout(null);
        panel.setBackground(Login_COLOR);

        JPasswordField passwordText =new JPasswordField();
        ImageIcon icon = new ImageIcon("src/Pictures/login.jpg");
        JLabel label = new JLabel(icon);
        label.setBounds(0, 0, 685, 400); // for example, you can use your own values
        panel.add(label);

        JLabel UserID=new JLabel("UserID");
        UserID.setBounds(180,300,80,25);
        panel.add(UserID);
        JTextField UserIDText=new JTextField();
        UserIDText.setBounds(265,300,160,25);
        panel.add(UserIDText);

        JLabel Password=new JLabel("Password");
        Password.setBounds(180,325,80,25);
        panel.add(Password);
        passwordText.setBounds(265,325,160,25);
        panel.add(passwordText);

        JLabel UserType=new JLabel("UserType");
        UserType.setBounds(180,350,80,25);
        panel.add(UserType);

        Object[] items = {"Airport Administrator","Airline Manager","Store Manager","Airline Administrator"
                        ,"Flight Manager","Airline Personnel","Ticketed Passenger","Guest"};
        JComboBox comboBox = new JComboBox(items);
        comboBox.setBounds(265,350,161,25);
        panel.add(comboBox);

        JButton Login=new JButton("LOGIN");
        Login.setBounds(300,390,80,25);
        panel.add(Login);
        frame1.setVisible(true);

        Login.addActionListener(e -> {// e -> lambda expression.
            if(UserIDText.getText().equals("ali") && passwordText.getText().equals("123") && comboBox.getSelectedItem().equals(items[0])){
//                frame1.setVisible(false);
//                JFrame TrueFrame=new JFrame();
//                JPanel TruePanel=new JPanel();
//                TrueFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                TrueFrame.setSize(750,750);
//                TrueFrame.add(TruePanel);
//                JLabel text=new JLabel("TRUE");
//                text.setBounds(0,0,200,25);
//                TruePanel.add(text);
//                TrueFrame.setVisible(true);
                AirportAdministrator();
            }
        });
    }

    public  void GUEST(){

        frame.setVisible(false);
        JFrame frameGuest=new JFrame();
        JPanel panelGuest=new JPanel();
        frameGuest.setSize(1200,700);
        frameGuest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelGuest.setBackground(Guest_COLOR);
        frameGuest.add(panelGuest);
        frameGuest.setLocationRelativeTo(null);//set center
        panelGuest.setLayout(null);
        JTextField SearchText=new JTextField();
        SearchText.setBounds(180,100,160,25);
        panelGuest.add(SearchText);
        JButton search=new JButton("Search");
        search.setBounds(350,100,100,25);
        panelGuest.add(search);

        search.addActionListener(e -> {
            JLabel output=new JLabel("OUTPUT WILL BE PRINTED HERE");
            output.setBounds(180,120,200,25);
            panelGuest.add(output);
        });
        frameGuest.setVisible(true);
    }
    public void AirportAdministrator(){

        //frame.setVisible(false);
        JFrame frame1=new JFrame();
        JPanel panel=new JPanel();

        frame1.setSize(1200,700);
        frame1.setLocationRelativeTo(null);//set center
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.add(panel);
        panel.setLayout(null);
        panel.setBackground(AirportAdminPage_COLOR);

        JLabel UserName=new JLabel("User Name");
        UserName.setBounds(180,300,85,25);

        panel.add(UserName);
        JTextField UserNameText=new JTextField();
        UserNameText.setBounds(300,300,160,25);
        panel.add(UserNameText);

        JLabel UserSureName=new JLabel("User SureName");
        UserSureName.setBounds(180,325,115,25);
        panel.add(UserSureName);
        JTextField UserSureNameText=new JTextField();
        UserSureNameText.setBounds(300,325,160,25);
        panel.add(UserSureNameText);

        JLabel UserID=new JLabel("User ID");
        UserID.setBounds(180,350,80,25);
        panel.add(UserID);
        JTextField UserIDText=new JTextField();
        UserIDText.setBounds(300,350,160,25);
        panel.add(UserIDText);

        JPasswordField passwordText =new JPasswordField();
        JLabel Password=new JLabel("User Password");
        Password.setBounds(180,375,115,25);
        panel.add(Password);
        passwordText.setBounds(300,375,160,25);
        panel.add(passwordText);

        JLabel UserType=new JLabel("User Type");
        UserType.setBounds(180,400,80,25);
        panel.add(UserType);

        Object[] items = {"Airline Manager","Store Manager"};
        JComboBox comboBox = new JComboBox(items);
        comboBox.setBounds(300,400,161,25);
        panel.add(comboBox);

        JButton addUser=new JButton("Add");
        addUser.setBounds(280,450,100,25);
        panel.add(addUser);

        JButton removeUser=new JButton("Remove");
        removeUser.setBounds(390,450,100,25);
        panel.add(removeUser);
        frame1.setVisible(true);

        ImageIcon icon = new ImageIcon("src/Pictures/admin.jpg");
        JLabel label = new JLabel(icon);
        label.setBounds(0, 0, 1200, 700); // for example, you can use your own values
        panel.add(label);

        addUser.addActionListener(e -> {// e -> lambda expression.
        });
        removeUser.addActionListener(e -> {// e -> lambda expression.
        });
    }
    public GUI(){

        JFrame frame=new JFrame();
        frame.setSize(1200,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);//set center

        JPanel panel=new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        panel.setBackground(Main);

        Icon icon = new ImageIcon("src/Pictures/3.gif");
        JLabel label = new JLabel(icon);
        label.setBounds(0, 200, 400, 200); // for example, you can use your own values
        panel.add(label);

        JButton Login=new JButton("LOGIN");
        Login.setBounds(470,330,150,25);
        panel.add(Login);

        frame.setVisible(true);

        Login.addActionListener( e -> LOGIN());//go to login page

        JButton Guest=new JButton("GUEST");
        Guest.setBounds(470,300,150,25);
        panel.add(Guest);
        Guest.addActionListener(e -> GUEST());//go to guest page.
    }
}