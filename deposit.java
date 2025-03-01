package bank.management.system;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.util.Date;

public class deposit extends JFrame implements ActionListener {
    String pin;
    JButton b1,b2;
    TextField textfield;

    deposit(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(-100,0,1500,830);
        add(l3);

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(430,180,400,35);
        label1.setForeground(Color.WHITE);
        l3.add(label1);

        textfield = new TextField();
        textfield.setBounds(430,230,360,25);
        textfield.setFont(new Font("Raleway",Font.BOLD,22));
        textfield.setBackground(new Color(65,125,128));
        textfield.setForeground(Color.WHITE);
        l3.add(textfield);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(650,362,150,35);
        b1.setBackground(new Color(65,128,125));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);


        b2 = new JButton("Back");
        b2.setBounds(650,400,150,35);
        b2.setBackground(new Color(65,128,125));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);





        setLayout(null);
        setSize(1500,1000);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
        String amount = textfield.getText();
        Date date = new Date();
        if(e.getSource()==b1){
            if(amount.isEmpty()){
                JOptionPane.showMessageDialog(null,"Please Enter The Amount");
            }
        else{
            Con c = new Con();
            String a = "insert into bank1 values('"+pin+"' , '"+date+"' , 'Deposit' , '"+amount+"')";
            c.statement.executeUpdate(a);
            JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposited Successfully");
            setVisible(false);
            new main_class(pin);
            }
        } else if (e.getSource()==b2) {
            setVisible(false);
            new main_class(pin);
        }


        }catch(Exception E){
            E.printStackTrace();
        }
    }


        public static void main(String[] args){
            new deposit("");
        }
    }
