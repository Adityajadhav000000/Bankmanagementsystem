package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.util.Random;

@SuppressWarnings("ALL")
public class signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;

    JTextField textName,textFname,textEmail,textMs,textAdd,textCity,textpin,textstate;
    JDateChooser dateChooser;

    Random ran = new Random();

    long first4 = (ran.nextLong() % 9000L) +1000L;

    String first = " " + Math.abs(first4);


    signup(){

        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel bank= new JLabel(i3);
        bank.setBounds(25,10,100,100);
        add(bank);


        JLabel label1 = new JLabel("APPLICATION FORM NO." +first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(330,90,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name");
        labelName.setFont(new Font("Ralway",Font.BOLD,20));
        labelName.setBounds(100,150,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Ralway",Font.BOLD,14));
        textName.setBounds(300,150,400,30);
        add(textName);


        JLabel labelfName = new JLabel("Father's Name");
        labelfName.setFont(new Font("Ralway",Font.BOLD,20));
        labelfName.setBounds(100,200,200,30);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Ralway",Font.BOLD,14));
        textFname.setBounds(300,200,400,30);
        add(textFname);


        JLabel DOB = new JLabel("Date Of Birth");
       DOB.setFont(new Font("Ralway",Font.BOLD,20));
        DOB.setBounds(100,250,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,250,400,30);
        add(dateChooser);


        JLabel labelg = new JLabel("Gender");
        labelg.setFont(new Font("Raleway",Font.BOLD,20));
        labelg.setBounds(100,290,200,30);
        add(labelg);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Ralway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Ralway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(400,290,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email Address");
        labelEmail.setFont(new Font("Ralway",Font.BOLD,20));
        labelEmail.setBounds(100,340,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Ralway",Font.BOLD,14));
        textEmail.setBounds(300,340,400,30);
        add(textEmail);


        JLabel labelMs = new JLabel("Marital Status");
        labelMs.setFont(new Font("Ralway",Font.BOLD,20));
        labelMs.setBounds(100,390,200,30);
        add(labelMs);


        m1= new JRadioButton("Married");
        m1.setFont(new Font("Ralway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,390,100,30);
        add(m1);

        m2 = new JRadioButton("UnMarried");
        m2.setFont(new Font("Ralway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,390,100,30);
        add(m2);

        m3= new JRadioButton("Other");
        m3.setFont(new Font("Ralway",Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(600,390,100,30);
        add(m3);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(m1);
        buttonGroup2.add(m2);
        buttonGroup2.add(m3);


        JLabel labelAdd = new JLabel("Address");
        labelAdd.setFont(new Font("Ralway",Font.BOLD,20));
        labelAdd.setBounds(100,440,200,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Ralway",Font.BOLD,14));
        textAdd.setBounds(300,440,400,30);
        add(textAdd);

        JLabel labelcity = new JLabel("City");
        labelcity.setFont(new Font("Ralway",Font.BOLD,20));
        labelcity.setBounds(100,490,200,30);
        add(labelcity);

        textCity = new JTextField();
        textCity.setFont(new Font("Ralway",Font.BOLD,14));
        textCity.setBounds(300,490,400,30);
        add(textCity);

        JLabel labelpin = new JLabel("Pin Code");
        labelpin.setFont(new Font("Ralway",Font.BOLD,20));
        labelpin.setBounds(100,540,200,30);
        add(labelpin);

        textpin = new JTextField();
        textpin.setFont(new Font("Ralway",Font.BOLD,14));
        textpin.setBounds(300,540,400,30);
        add(textpin);


        JLabel labelstate = new JLabel("State");
        labelstate.setFont(new Font("Ralway",Font.BOLD,20));
        labelstate.setBounds(100,590,200,30);
        add(labelstate);

        textstate = new JTextField();
        textstate.setFont(new Font("Ralway",Font.BOLD,14));
        textstate.setBounds(300,590,400,30);
        add(textstate);


        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(750,540,80,30);
        next.addActionListener(this);
        add(next);









        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(1500,1500);
        setLocation(360,40);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;

        if(m1.isSelected()){
            marital = "Married";
        } else if (m2.isSelected()) {
            marital = "UnMarried";
        }else{
            marital = "Other";
        }

        String address = textAdd.getText();
        String city = textCity.getText();
        String state = textstate.getText();
        String pin = textpin.getText();

        try{
          if(name.equals("")){
              JOptionPane.showMessageDialog(null,"Fill all the Fields");
          }else{
            Con con1 = new Con();   
            String q ="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
             con1.statement.executeUpdate(q);
             setVisible(false);
             new signup2(first);
          }
        }
        catch(Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new signup();
    }
}
