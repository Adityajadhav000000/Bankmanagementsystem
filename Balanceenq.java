package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.awt.event.ActionListener;

public class Balanceenq extends JFrame implements ActionListener {
    String pin;
    JLabel label1,label2;
    JButton b1,b2;

    Balanceenq(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(-100,0,1500,830);
        add(l3);

        label1 = new JLabel("Your Current Balance is : ");
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(430,180,700,35);
        label1.setForeground(Color.WHITE);
        l3.add(label1);

        label2 = new JLabel();
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(460,220,400,35);
        label2.setForeground(Color.WHITE);
        l3.add(label2);

        b1 = new JButton("Back");
        b1.setBounds(650,362,150,35);
        b1.setBackground(new Color(65,128,125));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        int balance = 0;
        try{
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("select * from bank1 where pin_no = '"+pin+"'");
            while(resultSet.next()){
                if(resultSet.getString("type").matches("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else{
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        label2.setText(""+balance);







        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_class(pin);
    }

    public static void main(String[] args) {
        new Balanceenq(" ");
    }
}
