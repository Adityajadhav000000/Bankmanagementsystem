package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static javax.swing.JOptionPane.showMessageDialog;

public class signup3 extends JFrame implements ActionListener {

    JRadioButton a1,a2,a3,a4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton c8,c9;
    String first;

    signup3( String first){
        this.first = first;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel bank= new JLabel(i3);
        bank.setBounds(150,5,100,100);
        add(bank);

        JLabel l3 = new JLabel("Page No : ");
        l3.setFont(new Font("Raleway",Font.BOLD,22));
        l3.setBounds(280,40,150,40);
        add(l3);


        JLabel l1 = new JLabel("Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,70,400,40);
        add(l1);

        JLabel l2 = new JLabel("Account Type");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(100,140,400,40);
        add(l2);

        a1 = new JRadioButton("Saving Account");
        a1.setFont(new Font("Raleway",Font.BOLD,14));
        a1.setBounds(100,180,150,30);
        a1.setBackground(new Color(215,252,252));
        a1.addActionListener(this);
        add(a1);

        a2 = new JRadioButton("Fixed Deposit");
        a2.setFont(new Font("Raleway",Font.BOLD,14));
        a2.setBackground(new Color(215,252,252));
        a2.setBounds(350,180,150,30);
        a2.addActionListener(this);
        add(a2);

        a3 = new JRadioButton("Recurring Deposit Account");
        a3.setFont(new Font("Raleway",Font.BOLD,14));
        a3.setBackground(new Color(215,252,252));
        a3.setBounds(350,220,220,30);
        a3.addActionListener(this);
        add(a3);

        a4 = new JRadioButton("Current Account");
        a4.setFont(new Font("Raleway",Font.BOLD,14));
        a4.setBackground(new Color(215,252,252));
        a4.setBounds(100,220,200,30);
        a4.addActionListener(this);
        add(a4);

        ButtonGroup a = new ButtonGroup();
        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(a4);

        JLabel l4 = new JLabel("Card Number : ");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,300,200,20);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-Digit Card Number)");
        l5.setFont(new Font("Raleway",Font.BOLD,14));
        l5.setBounds(100,330,200,20);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-XXXX");
        l6.setFont(new Font("Raleway",Font.BOLD,14));
        l6.setBounds(330,300,250,30);
        add(l6);

        JLabel l7 = new JLabel("It Would appear on atm/cheque Book and Statements");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(330,330,250,30);
        add(l7);


        JLabel l8 = new JLabel("Pin : ");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,200,30);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,14));
        l9.setBounds(330,370,200,30);
        add(l9);

        JLabel l10 = new JLabel("(4-Digit Password)");
        l10.setFont(new Font("Raleway",Font.BOLD,14));
        l10.setBounds(100,400,200,14);
        add(l10);

        JLabel l11 = new JLabel("Services Required : ");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,450,200,30);
        add(l11);

         c1 = new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBackground(new Color(215,252,252));
        c1.setBounds(100,480,200,30);
        c1.addActionListener(this);
        add(c1);

         c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBackground(new Color(215,252,252));
        c2.setBounds(350,480,200,30);
        c2.addActionListener(this);
        add(c2);

         c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBackground(new Color(215,252,252));
        c3.setBounds(100,530,200,30);
        c3.addActionListener(this);
        add(c3);

         c4 = new JCheckBox("E-mail Alert");
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBackground(new Color(215,252,252));
        c4.setBounds(350,530,200,30);
        c4.addActionListener(this);
        add(c4);

        c5   = new JCheckBox("Check-Book");
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBackground(new Color(215,252,252));
        c5.setBounds(100,580,200,30);
        c5.addActionListener(this);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBackground(new Color(215,252,252));
        c6.setBounds(350,580,200,30);
        c6.addActionListener(this);
        add(c6);

        c7 = new JCheckBox("I here by that the all above info entered is correct.");
        c7.setFont(new Font("Raleway",Font.BOLD,10));
        c7.setBackground(new Color(215,252,252));
        c7.setBounds(700,200,600,30);
        c7.addActionListener(this);
        add(c7);



        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        l12.setBounds(850,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(first);
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        l13.setBounds(930,10,60,30);
        add(l13);


        c8 = new JButton("Submit");
        c8.setFont(new Font("Raleway",Font.BOLD,14));
        c8.setBackground(Color.BLACK);
        c8.setForeground(Color.WHITE);
        c8.setBounds(750,250,100,30);
        c8.addActionListener(this);
        add(c8);

        c9 = new JButton("Cancel");
        c9.setFont(new Font("Raleway",Font.BOLD,14));
        c9.setBackground(Color.BLACK);
        c9.setForeground(Color.WHITE);
        c9.setBounds(870,250,100,30);
        c9.addActionListener(this);
        add(c9);







        getContentPane().setBackground(new Color(215,252,252));
        setSize(1000,1000);
        setLayout(null);
        setLocation(400,200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

     String atype = "";
     if(a1.isSelected()){
         atype = "Saving Account";
     } else if (a2.isSelected()) {
         atype = "Fixed Deposit";
     } else if (a3.isSelected()) {
         atype = "Recurring Deposit Account";
     }else {
         atype = "Current Account";
     }

     Random ran = new Random();
     long first7 = (ran.nextLong()%90000000L)+1409963000000000L;
     String cardno = "" + Math.abs(first7);

     long first3 = (ran.nextLong() % 9000L) + 1000L;
     String pin = "" + Math.abs(first3);

     String fac = "";
     if(c1.isSelected()){
         fac =fac+ "ATM CARD";
     } else if (c2.isSelected()) {
         fac = fac+"Internet Banking";
     } else if (c3.isSelected()) {
         fac = fac+"Mobile Banking";
     } else if (c4.isSelected()) {
         fac = fac+"Email-Alerts";
     } else if (c5.isSelected()) {
         fac = fac+"Cheque Book";
     } else if (c6.isSelected()) {
         fac = fac+"E-Statement";
     }
     try{
         if(e.getSource()==c8){
            if(atype.isBlank()){
                JOptionPane.showMessageDialog(null,"Fill All The Fields");
            }else{
                Con c1 = new Con();
                String q1 = "insert into signupthree values('"+first+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                String q2 =  "insert into login values('"+first+"','"+cardno+"','"+pin+"')";
                c1.statement.executeUpdate(q1);
                c1.statement.executeUpdate(q2);

                JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+pin );
                new deposit(pin);
                setVisible(false);
            }
         }
         else if(e.getSource()==c9) {
             System.exit(0);
         }

     }catch(Exception E){
         E.printStackTrace();
     }
    }

    public static void main(String[] args) {

      new signup3(" ");

    }
}
