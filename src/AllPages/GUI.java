import Airport.Shop;
import Airport.ShopManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI{

    public static final Color Main = new Color(188, 242, 252, 154);
    public static final Color Guest_COLOR = new Color(64, 68, 64, 154);
    public static final Color Login_COLOR = new Color(35, 131, 32, 10);
    public static final Color AirportAdminPage_COLOR = new Color(136, 136, 136, 255);
    JFrame frame = new JFrame();

    public void LOGIN(){

        frame.setVisible(false);
        JFrame frame1=new JFrame();
        JPanel panel=new JPanel();
        frame1.setSize(1920,1080);;
        frame1.setLocationRelativeTo(null);//set center

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.add(panel);
        panel.setLayout(null);
        panel.setBackground(Login_COLOR);

        ImageIcon icon = new ImageIcon("login.jpg");
        JLabel label = new JLabel(icon);
        label.setBounds(0, 0, 685, 400); // for example, you can use your own values
        panel.add(label);

        //logo mouse click event
        LogoMouseListener logoMouseListener = new LogoMouseListener(frame1,panel);
        //***************************************************

        JLabel UserID=new JLabel("UserID");
        UserID.setBounds(180,300,80,25);
        panel.add(UserID);
        JTextField UserIDText=new JTextField();
        UserIDText.setBounds(265,300,160,25);
        panel.add(UserIDText);

        JPasswordField passwordText =new JPasswordField();
        JLabel Password=new JLabel("Password");
        Password.setBounds(180,325,80,25);
        panel.add(Password);
        passwordText.setBounds(265,325,160,25);
        panel.add(passwordText);

        JLabel UserType=new JLabel("UserType");
        UserType.setBounds(180,350,80,25);
        panel.add(UserType);

        Object[] items = {"Airport Administrator","Store Manager","Airline Administrator"
                ,"Flight Manager","Airline Personnel","Ticketed Passenger"};
        JComboBox comboBox = new JComboBox(items);
        comboBox.setBounds(265,350,161,25);
        panel.add(comboBox);

        JButton Login=new JButton("LOGIN");
        Login.setBounds(300,390,80,25);
        panel.add(Login);
        frame1.setVisible(true);

        Login.addActionListener(e -> {// e -> lambda expression.
            if(UserIDText.getText().equals("ali") && passwordText.getText().equals("123") && comboBox.getSelectedItem().equals(items[0])){
                AirportAdministrator();
            }
            else if(UserIDText.getText().equals("alp")&&passwordText.getText().equals("456")&&comboBox.getSelectedItem().equals(items[1])){
                    StoreManager();
            }
        });
    }
    public void StoreManager(){
        frame.setVisible(false);
        JFrame frame1=new JFrame();
        JPanel panel=new JPanel();
        //logo mouse click event
        LogoMouseListener logoMouseListener = new LogoMouseListener(frame1,panel);
        //***************************************************
        frame1.setSize(1920,1080);;
        frame1.setLocationRelativeTo(null);//set center
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.add(panel);
        panel.setLayout(null);
        panel.setBackground(AirportAdminPage_COLOR);

        ///////Name
        JLabel UserID=new JLabel("Name");
        UserID.setBounds(180,300,80,25);
        panel.add(UserID);
        JTextField name=new JTextField();
        name.setBounds(280,300,160,25);
        panel.add(name);
        ///////ShopManager
        JTextField ShopManagerTEXT=new JTextField();
        ShopManagerTEXT.setBounds(280,330,160,25);
        panel.add(ShopManagerTEXT);
        frame1.setVisible(true);
        JLabel ShopManagerLBL=new JLabel("Shop Manager");
        ShopManagerLBL.setBounds(180,330,100,25);
        panel.add(ShopManagerLBL);

        /////////FEE
        JTextField fee=new JTextField();
        fee.setBounds(280,360,160,25);
        panel.add(fee);
        JLabel feeLBL=new JLabel("Fee");
        feeLBL.setBounds(180,360,100,25);
        panel.add(feeLBL);

        ///////////ID
        JTextField ID=new JTextField();
        ID.setBounds(280,390,160,25);
        panel.add(ID);
        JLabel IDLBL=new JLabel("ID");
        IDLBL.setBounds(180,390,100,25);
        panel.add(IDLBL);


        /////////BUTTONS
        JButton addUser=new JButton("Add");
        addUser.setBounds(280,450,100,25);
        panel.add(addUser);

        JButton removeUser=new JButton("Remove");
        removeUser.setBounds(390,450,100,25);
        panel.add(removeUser);



        addUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str=ShopManagerTEXT.getText();
                String words[]=str.split("-");
                System.out.println(words[0]);
                Double FEE=Double.parseDouble(words[4]);
                System.out.println(FEE);
                try {
                    ShopManager SM=new ShopManager(words[0],words[1],words[2],words[3],FEE,null);
                    int feeShop=Integer.parseInt(fee.getText());
                    Shop shp=new Shop(UserID.getText(),SM,feeShop,ID.getText());
                    //addtotheCollection Shop
                } catch (Exception exception) {
                    exception.printStackTrace();
                }

            }
        });
        removeUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str=ShopManagerTEXT.getText();
                String words[]=str.split("-");
                System.out.println(words[0]);
                Double FEE=Double.parseDouble(words[4]);
                System.out.println(FEE);
                //ShopManager SM=new ShopManager(words[0],words[1],words[2],words[3],FEE,null);
            }
        });

    }
    public void GUEST(){

        frame.setVisible(false);
        JFrame frameGuest=new JFrame();
        JPanel panelGuest=new JPanel();
        frameGuest.setSize(1920,1080);;
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
        //logo mouse click event
        LogoMouseListener logoMouseListener = new LogoMouseListener(frameGuest,panelGuest);
        //***************************************************
        frameGuest.setVisible(true);
    }

    public void AirportAdministrator(){

        frame.setVisible(false);
        JFrame frame1=new JFrame();
        JPanel panel=new JPanel();
        //logo mouse click event
        LogoMouseListener logoMouseListener = new LogoMouseListener(frame1,panel);
        //***************************************************
        frame1.setSize(1920,1080);;
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

        ImageIcon icon = new ImageIcon("admin.jpg");
        JLabel label = new JLabel(icon);
        label.setBounds(0, 0, 1200, 700); // for example, you can use your own values
        panel.add(label);

        addUser.addActionListener(e -> {// e -> lambda expression.
        });
        removeUser.addActionListener(e -> {// e -> lambda expression.
        });

    }
    public GUI(){

        frame.setSize(1920,1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);//set center

        JPanel panel=new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        panel.setBackground(Main);

        Icon icon = new ImageIcon("3.gif");
        JLabel label = new JLabel(icon);
        label.setBounds(0, 200, 400, 200); // for example, you can use your own values
        panel.add(label);

        JButton Login=new JButton("LOGIN");
        Login.setBounds(470,330,150,25);
        panel.add(Login);

        frame.setVisible(true);

        Login.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                LOGIN();
            }
        });//go to login page

        JButton Guest=new JButton("GUEST");
        Guest.setBounds(470,300,150,25);
        panel.add(Guest);
        Guest.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                GUEST();

            }
        });//go to guest page.

        //logo mouse click event
        LogoMouseListener logoMouseListener = new LogoMouseListener(frame,panel);
        //***************************************************
    }
}
