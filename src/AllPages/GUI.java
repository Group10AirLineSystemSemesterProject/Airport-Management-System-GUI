<<<<<<< HEAD
package AllPages;
import javax.naming.Name;
=======
import Airport.Shop;
import Airport.ShopManager;

>>>>>>> 61a8f4b6d6260e6e55949a6ccd5fbaf215d5e15a
import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
<<<<<<< HEAD
import Airport.AirportAdmin;
import Airport.AirportSystemStorage;
=======
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
>>>>>>> 61a8f4b6d6260e6e55949a6ccd5fbaf215d5e15a

public class GUI{

    public static final String AirportName = "Data Airport";
    public static final String portAdminName = "felix";
    public static final String portAdminSurname = "morgan";
    public static final String portAdminSSN = "123";
    public static final String portAdminPassword = "123";

    public static final Color Main = new Color(188, 242, 252, 154);
    public static final Color Guest_COLOR = new Color(64, 68, 64, 154);
    public static final Color Login_COLOR = new Color(35, 131, 32, 10);
    public static final Color AirportAdminPage_COLOR = new Color(255, 255, 255, 255);
    public static final Color AirportAdminTitle_COLOR = new Color(222, 201, 27, 255);
    public static final Color Landing_COLOR = new Color(126, 11, 11, 65);


    JFrame frame = new JFrame();
    AirportSystemStorage portStorage = new AirportSystemStorage();
    AirportAdmin portAdmin = new AirportAdmin(portAdminName,portAdminSurname,portAdminSSN,portAdminPassword,portStorage);
    public void LOGIN(){

        frame.setVisible(false);
        JFrame frame1=new JFrame();
        JPanel panel=new JPanel();
        frame1.setSize(1920,1080);;
        frame1.setLocationRelativeTo(null);//set center

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(null);
        panel.setBackground(Login_COLOR);

<<<<<<< HEAD
        JLabel a=new JLabel("label");
        a.setText("LOGIN TO YOUR ACCOUNT :)");
        a.setForeground(AirportAdminTitle_COLOR);
        a.setBounds(530,130,1000,55);
        Font font = new Font("arial", Font.BOLD, 50);
        a.setFont(font);
        panel.add(a);

=======
        ImageIcon icon = new ImageIcon("login.jpg");
        JLabel label = new JLabel(icon);
        label.setBounds(0, 0, 685, 400); // for example, you can use your own values
        panel.add(label);
>>>>>>> 61a8f4b6d6260e6e55949a6ccd5fbaf215d5e15a

        //logo mouse click event
        LogoMouseListener logoMouseListener = new LogoMouseListener(frame1,panel);
        //***************************************************

        JLabel Name = new JLabel("Name");
        Name.setBounds(180,300,80,25);
        Name.setForeground(AirportAdminTitle_COLOR);
        panel.add(Name);
        JTextField nameText=new JTextField();
        nameText.setBounds(265,300,160,25);
        panel.add(nameText);

        JLabel SureName =new JLabel("Sure Name");
        SureName.setBounds(180,330,80,25);
        SureName.setForeground(AirportAdminTitle_COLOR);
        panel.add(SureName);
        JTextField sureNameText=new JTextField();
        sureNameText.setBounds(265,330,160,25);
        panel.add(sureNameText);

        JLabel SSN =new JLabel("SSN/UAID");
        SSN.setBounds(180,360,80,25);
        SSN.setForeground(AirportAdminTitle_COLOR);
        panel.add(SSN);
        JPasswordField ssnText  =new JPasswordField();
        ssnText.setBounds(265,360,160,25);
        panel.add(ssnText);

        JLabel PASSWORD = new JLabel("Password");
        PASSWORD.setBounds(180,390,80,25);
        PASSWORD.setForeground(AirportAdminTitle_COLOR);
        panel.add(PASSWORD);
        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(265,390,160,25);
        panel.add(passwordText);

        JLabel UserType = new JLabel("User Type");
        UserType.setBounds(180,420,80,25);
        UserType.setForeground(AirportAdminTitle_COLOR);
        panel.add(UserType);

<<<<<<< HEAD
        Object[] items = {"Airport Administrator","Airline Manager","Store Manager"
                        ,"Flight Manager","Airline Personnel","Ticketed Passenger"};
=======
        Object[] items = {"Airport Administrator","Store Manager","Airline Administrator"
                ,"Flight Manager","Airline Personnel","Ticketed Passenger"};
>>>>>>> 61a8f4b6d6260e6e55949a6ccd5fbaf215d5e15a
        JComboBox comboBox = new JComboBox(items);
        comboBox.setBounds(265,420,161,25);
        panel.add(comboBox);

        JButton Login=new JButton("LOGIN");
        Login.setBounds(300,470,80,25);
        panel.add(Login);


        ImageIcon icon = new ImageIcon("src/Pictures/loginpage.jpg");
        JLabel label = new JLabel(icon);
        label.setBounds(0, 0, 1920, 1080); // for example, you can use your own values
        panel.add(label);

        frame1.setVisible(true);

        Login.addActionListener(e -> {// e -> lambda expression.
<<<<<<< HEAD
            AirportAdministrator();

//            if(comboBox.getSelectedItem().toString().equals(items[0])){// airport admin
//                String ssn = new String(ssnText.getPassword());
//                String password = new String(passwordText.getPassword());
//                if (nameText.getText().equals(portAdmin.getName()) && sureNameText.getText().equals(portAdmin.getSurname())
//                        && ssn.equals(portAdmin.getSSN()) && password.equals(portAdmin.getPassword())){
//                    AirportAdministrator();
//                }else{
//                    JOptionPane.showMessageDialog(this.frame,"Incorrect User Info :(");
//                }
//            }
//            else if (comboBox.getSelectedItem().toString().equals(items[1])){//if airline admin
//            }
//            else if (comboBox.getSelectedItem().toString().equals(items[2])){
//            }
//            else if (comboBox.getSelectedItem().toString().equals(items[3])){
//            }
//            else if (comboBox.getSelectedItem().toString().equals(items[4])){
//            }
//            else if (comboBox.getSelectedItem().toString().equals(items[5])){
//            }
=======
            if(UserIDText.getText().equals("ali") && passwordText.getText().equals("123") && comboBox.getSelectedItem().equals(items[0])){
                AirportAdministrator();
            }
            else if(UserIDText.getText().equals("alp")&&passwordText.getText().equals("456")&&comboBox.getSelectedItem().equals(items[1])){
                    StoreManager();
            }
>>>>>>> 61a8f4b6d6260e6e55949a6ccd5fbaf215d5e15a
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
        LogoMouseListener logoMouseListener = new LogoMouseListener(frame,panel);
        //***************************************************

        frame1.setSize(1920,1080);;
        frame1.setLocationRelativeTo(null);//set center
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.add(panel);
        panel.setLayout(null);
        panel.setBackground(AirportAdminPage_COLOR);


        JLabel a=new JLabel("label");
        a.setText("AIRPORT ADMINISTRATION");
        a.setForeground(AirportAdminTitle_COLOR);
        a.setBounds(530,130,1000,55);
        Font font = new Font("arial", Font.BOLD, 50);
        a.setFont(font);
        panel.add(a);


        JLabel UserName=new JLabel("User Name");
        UserName.setForeground(AirportAdminPage_COLOR);
        UserName.setBounds(180,300,85,25);
        panel.add(UserName);
        JTextField UserNameText=new JTextField();
        UserNameText.setBounds(300,300,160,25);
        panel.add(UserNameText);

        JLabel UserSureName=new JLabel("User SureName");
        UserSureName.setForeground(AirportAdminPage_COLOR);
        UserSureName.setBounds(180,325,115,25);
        panel.add(UserSureName);
        JTextField UserSureNameText=new JTextField();
        UserSureNameText.setBounds(300,325,160,25);
        panel.add(UserSureNameText);

        JLabel UserID=new JLabel("User ID");
        UserID.setForeground(AirportAdminPage_COLOR);
        UserID.setBounds(180,350,80,25);
        panel.add(UserID);
        JTextField UserIDText=new JTextField();
        UserIDText.setBounds(300,350,160,25);
        panel.add(UserIDText);

        JPasswordField passwordText =new JPasswordField();
        JLabel Password=new JLabel("User Password");
        Password.setForeground(AirportAdminPage_COLOR);

        Password.setBounds(180,375,115,25);
        panel.add(Password);
        passwordText.setBounds(300,375,160,25);
        panel.add(passwordText);

        JLabel UserType=new JLabel("User Type");
        UserType.setForeground(AirportAdminPage_COLOR);
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

<<<<<<< HEAD

        JButton adminInfo=new JButton("Display Personnel Info");
        adminInfo.setBounds(1700,5,200,40);
        panel.add(adminInfo);
        Font t = new Font("arial", Font.BOLD, 13);
        adminInfo.setFont(t);
        panel.add(adminInfo);

        JButton airline_settings=new JButton("Airline Settings");
        airline_settings.setBounds(1700,50,200,40);
        panel.add(airline_settings);
        Font airlineT = new Font("arial", Font.BOLD, 13);
        airline_settings.setFont(airlineT);
        panel.add(airline_settings);

        JButton shops_settings=new JButton("Shops Settings");
        shops_settings.setBounds(1700,100,200,40);
        panel.add(shops_settings);
        Font shopsT = new Font("arial", Font.BOLD, 13);
        shops_settings.setFont(shopsT);
        panel.add(shops_settings);

        JButton personnel_setting=new JButton("Airport Personnel Setting");
        personnel_setting.setBounds(1700,150,200,40);
        panel.add(personnel_setting);
        Font personalT = new Font("arial", Font.BOLD, 13);
        personnel_setting.setFont(personalT);
        panel.add(personnel_setting);

        ImageIcon icon = new ImageIcon("src/Pictures/airportadminis.jpg");
=======
        ImageIcon icon = new ImageIcon("admin.jpg");
>>>>>>> 61a8f4b6d6260e6e55949a6ccd5fbaf215d5e15a
        JLabel label = new JLabel(icon);
        label.setBounds(0, 0, 1920, 1080); // for example, you can use your own values
        panel.add(label);
        frame1.setVisible(true);

        addUser.addActionListener(e -> {// e -> lambda expression.
        });
        removeUser.addActionListener(e -> {// e -> lambda expression.
        });
        adminInfo.addActionListener(e ->{
            AirportAdministratorPersonnelInfo();
        });
        airline_settings.addActionListener(e ->{
            AirportAdminAirlinesSetting();
        });

    }
<<<<<<< HEAD

    public void AirportAdministratorPersonnelInfo(){

        frame.setVisible(false);

        JFrame frame1=new JFrame();
        JPanel panel=new JPanel();

        //logo mouse click event
        LogoMouseListener logoMouseListener = new LogoMouseListener(frame,panel);
        //***************************************************

        frame1.setSize(1920,1080);;
        frame1.setLocationRelativeTo(null);//set center
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.add(panel);
        panel.setLayout(null);
        panel.setBackground(AirportAdminPage_COLOR);


        JLabel a=new JLabel("admin");
        a.setText("PERSONNEL INFORMATION");
        a.setForeground(AirportAdminTitle_COLOR);
        a.setBounds(530,130,1000,55);
        Font font = new Font("arial", Font.BOLD, 50);
        a.setFont(font);
        panel.add(a);

        JLabel name=new JLabel("name");
        name.setText("Name : " + portAdmin.getName());
        name.setForeground(AirportAdminPage_COLOR);
        name.setBounds(530,190,1000,55);
        Font nameFont = new Font("arial", Font.BOLD, 20);
        name.setFont(nameFont);
        panel.add(name);

        JLabel sureName=new JLabel("sureName");
        sureName.setText("SureName : "+portAdmin.getSurname());
        sureName.setForeground(AirportAdminPage_COLOR);
        sureName.setBounds(530,250,1000,55);
        Font sureNameFont = new Font("arial", Font.BOLD, 20);
        sureName.setFont(sureNameFont);
        panel.add(sureName);

        JLabel ssn=new JLabel("ssn");
        ssn.setText("SSN : "+portAdmin.getSSN());
        ssn.setForeground(AirportAdminPage_COLOR);
        ssn.setBounds(530,310,1000,55);
        Font ssnFont = new Font("arial", Font.BOLD, 20);
        ssn.setFont(ssnFont);
        panel.add(ssn);

        JLabel pass=new JLabel("pass");
        pass.setText("Password : " + portAdmin.getPassword());
        pass.setForeground(AirportAdminPage_COLOR);
        pass.setBounds(530,370,1000,55);
        Font passFont = new Font("arial", Font.BOLD, 20);
        pass.setFont(passFont);
        panel.add(pass);


        JButton adminInfo=new JButton("Hide Personnel Info");
        adminInfo.setBounds(1700,5,200,40);
        panel.add(adminInfo);
        Font t = new Font("arial", Font.BOLD, 13);
        adminInfo.setFont(t);
        panel.add(adminInfo);


        JLabel SSN=new JLabel("New SSN ");
        SSN.setForeground(AirportAdminPage_COLOR);
        SSN.setBounds(180,350,80,25);
        panel.add(SSN);
        JTextField UserIDText=new JTextField();
        UserIDText.setBounds(300,350,160,25);
        panel.add(UserIDText);

        JPasswordField passwordText =new JPasswordField();
        JLabel Password=new JLabel("New Password");
        Password.setForeground(AirportAdminPage_COLOR);

        Password.setBounds(180,375,115,25);
        panel.add(Password);
        passwordText.setBounds(300,375,160,25);
        panel.add(passwordText);


        JButton addUser=new JButton("Reset");
        addUser.setBounds(330,410,100,25);
        panel.add(addUser);

        ImageIcon icon = new ImageIcon("src/Pictures/adminInfoPageImage.jpg");
        JLabel label = new JLabel(icon);
        label.setBounds(0, 0, 1920, 1080); // for example, you can use your own values
        panel.add(label);
        frame1.setVisible(true);

        adminInfo.addActionListener(e ->{
            AirportAdministrator();
        });
        addUser.addActionListener(e->{
            boolean isPassed = true;
            try {
                portAdmin.setSSN(UserIDText.getText());
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(this.frame,"Oops Can't Reset :(");
                isPassed = false;
                exception.printStackTrace();
            }
            try {
                portAdmin.setPassword(passwordText.getPassword().toString());
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(this.frame,"Oops Can't Reset :(");
                isPassed = false;
                exception.printStackTrace();
            }
            if (isPassed) {
                JOptionPane.showMessageDialog(this.frame, "Airport Admin's SSN has been reset Successfully :)");
            }
        });
    }

    public void AirportAdminAirlinesSetting(){

        frame.setVisible(false);
        JFrame frame1=new JFrame();
        JPanel panel=new JPanel();

        //logo mouse click event
        LogoMouseListener logoMouseListener = new LogoMouseListener(frame,panel);
        //***************************************************

        frame1.setSize(1920,1080);;
        frame1.setLocationRelativeTo(null);//set center
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.add(panel);
        panel.setLayout(null);
        panel.setBackground(AirportAdminPage_COLOR);


        JLabel a=new JLabel("label");
        a.setText("AIRLINE SETTINGS");
        a.setForeground(AirportAdminTitle_COLOR);
        a.setBounds(530,130,1000,55);
        Font font = new Font("arial", Font.BOLD, 50);
        a.setFont(font);
        panel.add(a);


        JLabel UserName=new JLabel("User Name");
        UserName.setForeground(AirportAdminPage_COLOR);
        UserName.setBounds(180,300,85,25);
        panel.add(UserName);
        JTextField UserNameText=new JTextField();
        UserNameText.setBounds(300,300,160,25);
        panel.add(UserNameText);

        JLabel UserSureName=new JLabel("User SureName");
        UserSureName.setForeground(AirportAdminPage_COLOR);
        UserSureName.setBounds(180,325,115,25);
        panel.add(UserSureName);
        JTextField UserSureNameText=new JTextField();
        UserSureNameText.setBounds(300,325,160,25);
        panel.add(UserSureNameText);

        JLabel UserID=new JLabel("UAID_KEY");
        UserID.setForeground(AirportAdminPage_COLOR);
        UserID.setBounds(180,350,80,25);
        panel.add(UserID);
        JTextField UserIDText=new JTextField();
        UserIDText.setBounds(300,350,160,25);
        panel.add(UserIDText);

        JPasswordField passwordText =new JPasswordField();
        JLabel Password=new JLabel("Password");
        Password.setForeground(AirportAdminPage_COLOR);

        Password.setBounds(180,375,115,25);
        panel.add(Password);
        passwordText.setBounds(300,375,160,25);
        panel.add(passwordText);

        JLabel UserType=new JLabel("User Type");
        UserType.setForeground(AirportAdminPage_COLOR);
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


        JButton adminInfo=new JButton("Go Prev Page");
        adminInfo.setBounds(1700,5,200,40);
        panel.add(adminInfo);
        Font t = new Font("arial", Font.BOLD, 13);
        adminInfo.setFont(t);
        panel.add(adminInfo);

        JButton airline_settings=new JButton("List Airlines");
        airline_settings.setBounds(1700,50,200,40);
        panel.add(airline_settings);
        Font airlineT = new Font("arial", Font.BOLD, 13);
        airline_settings.setFont(airlineT);
        panel.add(airline_settings);

        ImageIcon icon = new ImageIcon("src/Pictures/airlinepage.jpg");
        JLabel label = new JLabel(icon);
        label.setBounds(0, 0, 1920, 1080); // for example, you can use your own values
        panel.add(label);
        frame1.setVisible(true);
        
        addUser.addActionListener(e -> {// e -> lambda expression.
        });
        removeUser.addActionListener(e -> {// e -> lambda expression.
        });
        adminInfo.addActionListener(e ->{
            AirportAdministrator();
        });
        airline_settings.addActionListener(e ->{ });

    }

    public GUI(){

        try{
        //Airport airport = new Airport(AirportName);
        AirportSystemStorage portStorage = new AirportSystemStorage();
        AirportAdmin portAdmin = new AirportAdmin(portAdminName,portAdminSurname,portAdminSSN,portAdminPassword,portStorage);

=======
    public GUI(){

>>>>>>> 61a8f4b6d6260e6e55949a6ccd5fbaf215d5e15a
        frame.setSize(1920,1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);//set center

        JPanel panel=new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        panel.setBackground(Main);

<<<<<<< HEAD
        JLabel a=new JLabel("label");
        a.setText("WELCOME TO DATA AIRPORT");
        a.setForeground(Landing_COLOR);
        a.setBounds(530,130,1000,55);
        Font font = new Font("Arial", Font.BOLD, 50);
        a.setFont(font);
        panel.add(a);


        Icon icon = new ImageIcon("src/Pictures/3.gif");
=======
        Icon icon = new ImageIcon("3.gif");
>>>>>>> 61a8f4b6d6260e6e55949a6ccd5fbaf215d5e15a
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

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
