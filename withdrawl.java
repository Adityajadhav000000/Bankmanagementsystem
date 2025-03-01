package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class withdrawl extends JFrame implements ActionListener {
    String pin;
    TextField textfield;
    JButton b1,b2;

    withdrawl(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(-100,0,1500,830);
        add(l3);

        JLabel label1 = new JLabel("MAX WITHDRAWL CAN BE RS.10,000");
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(430,180,400,35);
        label1.setForeground(Color.WHITE);
        l3.add(label1);

        JLabel label2 = new JLabel("ENTER THE AMOUNT");
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(460,220,400,35);
        label2.setForeground(Color.WHITE);
        l3.add(label2);

        textfield = new TextField();
        textfield.setBounds(460,260,360,25);
        textfield.setFont(new Font("Raleway",Font.BOLD,22));
        textfield.setBackground(new Color(65,125,128));
        textfield.setForeground(Color.WHITE);
        l3.add(textfield);

        b1 = new JButton("WITHDRAW");
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
        String amount = textfield.getText();
        Date date = new Date();
        if(e.getSource()==b1) {
            try {
                if (amount.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Enter the amount");
                } else {
                    Con c = new Con();
                    ResultSet resultset = c.statement.executeQuery("select * from bank1 where pin_no = '" + pin + "'");
                    int balance = 0;
                    while (resultset.next()) {
                        if (resultset.getString("type").equals("Deposit")) {
                            balance = Integer.parseInt(resultset.getString("amount"));
                        } else {
                            balance = Integer.parseInt(resultset.getString("amount"));
                        }
                        if (balance < Integer.parseInt(amount)) {
                            JOptionPane.showMessageDialog(null, "Insufficient Balance");
                            return;
                        }

                        c.statement.executeUpdate("insert into bank1 values ('" +pin+ "','" +date+ "','Withdrawal','" +amount+ "')");
                        JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                        setVisible(false);
                        new main_class(pin);

                    }
                }
            } catch (Exception E) {
                E.printStackTrace();
            }
        }else if(e.getSource()==b2){
            setVisible(false);
            new main_class(pin);
        }

    }

    public static void main(String[] args) {
        new withdrawl("");
    }
}
