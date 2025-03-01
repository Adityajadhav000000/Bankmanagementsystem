package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class mini extends JFrame implements ActionListener {
    String pin;
    JButton button;

    mini(String pin){
        this.pin = pin;

        JLabel label1 = new JLabel();
        label1.setBounds(20,140,400,200);
        add(label1);

        JLabel label2 = new JLabel("TechCoder");
        label1.setFont(new Font("System",Font.BOLD,15));
        label2.setBounds(150,20,200,20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20,80,300,20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20,400,300,20);
        add(label4);

        try{
            Con c = new Con();
            ResultSet resultset = c.statement.executeQuery("select * from login where pin = '"+pin+"'");
            while(resultset.next()){
                label3.setText("Card Nummber: "+ resultset.getString("card_no").substring(0,4) + "XXXXXXXX" + resultset.getString("card_no").substring(12) );

            }

        }catch(Exception e){
            e.printStackTrace();
        }

        try{
            int balance = 0;
            Con c = new Con();
            ResultSet resultset = c.statement.executeQuery("select * from bank1 where pin_no = '"+pin+"'");

            while (resultset.next()){
                label1.setText(label1.getText() + "<html>"+resultset.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultset.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultset.getString("amount")+ "<br><br><html>");
                if(resultset.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultset.getString("amount"));
                }else {
                    balance -=Integer.parseInt(resultset.getString("amount"));
                }
            }

            label4.setText("Your Total Balance Is : "+balance);


        }catch(Exception e){
            e.printStackTrace();
        }

        button = new JButton("EXIT");
        button.setBounds(20,500,100,25);
        button.addActionListener(this);
        button.setForeground(Color.WHITE);
        button.setBackground(Color.BLACK);
        add(button);


        getContentPane().setBackground(new Color(255,204,204));
        setSize(400,600);
        setLocation(20,20);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==button){
           new main_class(pin);
       }
    }

    public static void main(String[] args) {
        new mini("");
    }
}
