package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class fastcash extends JFrame implements ActionListener {
    String pin;
    JButton b1,b2,b3,b4,b5,b6,b7;

    fastcash(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(-100,0,1500,800);
        add(l3);

        JLabel label = new JLabel("SELECT WITHDRAWAL AMOUNT");
        label.setFont(new Font("System",Font.BOLD,24));
        label.setBounds(400,180,700,35);
        label.setForeground(Color.WHITE);
        l3.add(label);

        b1 = new JButton("Rs.100");
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.setBounds(400,260,150,35);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("Rs.500");
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.setBounds(670,260,150,35);
        b2.addActionListener(this);
        l3.add(b2);


        b3 = new JButton("Rs.1000");
        b3.setBackground(new Color(65,125,128));
        b3.setForeground(Color.WHITE);
        b3.setBounds(400,310,150,35);
        b3.addActionListener(this);
        l3.add(b3);


        b4 = new JButton("Rs.2000");
        b4.setBackground(new Color(65,125,128));
        b4.setForeground(Color.WHITE);
        b4.setBounds(670,310,150,35);
        b4.addActionListener(this);
        l3.add(b4);


        b5 = new JButton("Rs.5000");
        b5.setBackground(new Color(65,125,128));
        b5.setForeground(Color.WHITE);
        b5.setBounds(400,360,150,35);
        b5.addActionListener(this);
        l3.add(b5);


        b6 = new JButton("Rs.10,000");
        b6.setBackground(new Color(65,125,128));
        b6.setForeground(Color.WHITE);
        b6.setBounds(670,360,160,35);
        b6.addActionListener(this);
        l3.add(b6);


        b7 = new JButton("BACK");
        b7.setBackground(new Color(65,125,128));
        b7.setForeground(Color.WHITE);
        b7.setBounds(400,410,150,35);
        b7.addActionListener(this);
        l3.add(b7);


        setLayout(null);
        setSize(1550,1000);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==b7){
           setVisible(false);
           new main_class(pin);
       }else{
           String amount = ((JButton)e.getSource()).getText().substring(3);
           Con c = new Con();
           Date date = new Date();

           try{
               ResultSet res = c.statement.executeQuery("select * from bank1 where pin_no = '"+pin+"'");
               int balance = 0;
               while (res.next()){
                   if(res.getString("type").equals("Deposit")){
                       balance += Integer.parseInt(res.getString("amount"));
                   }else {
                       balance -=Integer.parseInt(res.getString("amount"));
                   }
               }String num = "17";

               if(e.getSource() != b7 && balance < Integer.parseInt(amount)){
                   JOptionPane.showMessageDialog(null,"Insufficient Balance");
                   return;
               }
               c.statement.executeUpdate("insert into bank1 values ('"+pin+"','"+date+"','withdrawal','"+amount+"')");
               JOptionPane.showMessageDialog(null,"Rs."+amount+" Debited Successfully");


           }catch(Exception E){
               E.printStackTrace();
           }

           setVisible(false);
           new main_class(pin);
       }

    }

    public static void main(String[] args) {
        new fastcash("");
    }

}
