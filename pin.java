package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pin extends JFrame implements ActionListener {
    JButton b1,b2;
    JPasswordField p1,p2;
    String pin;

    pin(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(-100,0,1500,830);
        add(l3);

        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(530,180,400,35);
        label1.setForeground(Color.WHITE);
        l3.add(label1);

        JLabel label2 = new JLabel("New PIN: ");
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(390,250,400,35);
        label2.setForeground(Color.WHITE);
        l3.add(label2);

        JLabel label3 = new JLabel("Re-Enter New PIN: ");
        label3.setFont(new Font("System",Font.BOLD,16));
        label3.setBounds(390,300,400,35);
        label3.setForeground(Color.WHITE);
        l3.add(label3);

        p1 = new JPasswordField();
        p1.setBounds(540,250,200,30);
        p1.setFont(new Font("Raleway",Font.BOLD,22));
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.WHITE);
        l3.add(p1);

        p2 = new JPasswordField();
        p2.setBounds(540,300,200,30);
        p2.setFont(new Font("Raleway",Font.BOLD,22));
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.WHITE);
        l3.add(p2);



        b1 = new JButton("NEXT");
        b1.setBounds(665,362,150,35);
        b1.setBackground(new Color(65,128,125));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);




        b2 = new JButton("Back");
        b2.setBounds(665,400,150,35);
        b2.setBackground(new Color(65,128,125));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);




        setSize(1550,1080);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try{
            String pin1 = p1.getText();
            String pin2 = p2.getText();

            if(!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Pin Does Not Match");
                return;
            }

            if(e.getSource()==b1) {
                if (pin1.equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter The Pin");
                }
                if (pin2.equals("")) {
                    JOptionPane.showMessageDialog(null, "Re-Enter The NEw Pin");
                }

                Con c = new Con();
                String q1 = "update bank1 set pin_no = '" + pin1 + "' where pin = '" + pin + "'";
                String q2 = "update login set pin = '" + pin1 + "' where pin = '" + pin + "'";
                String q3 = "update signupthree set pin = '" + pin1 + "' where pin = '" + pin + "'";


                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "Pin Changed Successfully");
                setVisible(false);
                new main_class(pin);
            }
            else if(e.getSource()==b2){
                setVisible(false);
                new main_class(pin);
            }

        }catch(Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new pin("");
    }
}
