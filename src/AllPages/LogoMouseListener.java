package AllPages;
import javax.swing.*;
import java.awt.event.MouseListener;
import java.awt.event.*;
import java.awt.*;
class LogoMouseListener extends JFrame{

    LogoMouseListener(JFrame frame,JPanel panel){

        //logo mouse click event
      //  JButton logoButton = new JButton(new ImageIcon("src/Pictures/logo.jpg"));

        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("src/Pictures/logo.jpg"));
        label.setBounds(0,0,176,39);
        panel.add(label);
        frame.add(panel);
        label.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                GUI homePage = new GUI();
            }
        });
        //***************************************************
    }
}