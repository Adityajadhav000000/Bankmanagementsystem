package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame implements ActionListener {
    JComboBox combobox,combobox2,combobox3,combobox4,combobox5;
    String first;
    JTextField textpan,textaadhar;
    JRadioButton r1,r2,r3,r4;
    JButton next;


    signup2(String first){

        super("Application Form");
        this.first = first;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel bank= new JLabel(i3);
        bank.setBounds(150,5,100,100);
        add(bank);



        JLabel l1 = new JLabel("Page 2 : ");
        l1.setFont((new Font("Raleway",Font.BOLD,22)));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details : ");
        l2.setFont((new Font("Raleway",Font.BOLD,22)));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion : ");
        l3.setFont((new Font("Raleway",Font.BOLD,18)));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[] = {"Hindu","Muslim","Christian","Other"};
        combobox = new JComboBox<>(religion);
        combobox.setFont(new Font("Ralway",Font.BOLD,14));
        combobox.setBackground(new Color(252,208,76));
        combobox.setBounds(350,120,320,30);
        add(combobox);

        JLabel l4 = new JLabel("Category : ");
        l4.setFont((new Font("Raleway",Font.BOLD,18)));
        l4.setBounds(100,170,100,30);
        add(l4);

        String Category[] = {"Sc","St","opn","nt","Other"};
        combobox2 = new JComboBox<>(Category);
        combobox2.setFont(new Font("Ralway",Font.BOLD,14));
        combobox2.setBackground(new Color(252,208,76));
        combobox2.setBounds(350,170,320,30);
        add(combobox2);


        JLabel l5= new JLabel("Income: ");
        l5.setFont((new Font("Raleway",Font.BOLD,18)));
        l5.setBounds(100,220,100,30);
        add(l5);

        String Income[] = {"Null","<50,000","<1,00,000","<2,00,000","upto,10.00.000"};
        combobox3 = new JComboBox<>(Income);
        combobox3.setFont(new Font("Ralway",Font.BOLD,14));
        combobox3.setBackground(new Color(252,208,76));
        combobox3.setBounds(350,220,320,30);
        add(combobox3);

        JLabel l6= new JLabel("Educational Details : ");
        l6.setFont((new Font("Raleway",Font.BOLD,18)));
        l6.setBounds(100,270,200,30);
        add(l6);

        String Educational_Details[] = {"Non-Graduate","Graduate","Doctorate","Others",};
        combobox4 = new JComboBox<>(Educational_Details);
        combobox4.setFont(new Font("Ralway",Font.BOLD,14));
        combobox4.setBackground(new Color(252,208,76));
        combobox4.setBounds(350,270,320,30);
        add(combobox4);


        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont((new Font("Raleway",Font.BOLD,18)));
        l7.setBounds(100,340,150,30);
        add(l7);

        String Occupation[] = {"Salaried","Self-Employee","Employed","Buisness","Retire","Student"};
        combobox5 = new JComboBox<>(Occupation);
        combobox5.setFont(new Font("Ralway",Font.BOLD,14));
        combobox5.setBackground(new Color(252,208,76));
        combobox5.setBounds(350,340,320,30);
        add(combobox5);

        JLabel l8 = new JLabel("PAN NUMBER : ");
        l8.setFont((new Font("Raleway",Font.BOLD,18)));
        l8.setBounds(100,390,150,30);
        add(l8);

        textpan = new JTextField();
        textpan.setFont(new Font("Raleway",Font.BOLD,18));
        textpan.setBounds(350,390,320,30);
        add(textpan);

        JLabel l9 = new JLabel("AADHAR NUMBER : ");
        l9.setFont((new Font("Raleway",Font.BOLD,18)));
        l9.setBounds(100,440,180,30);
        add(l9);

        textaadhar = new JTextField();
        textaadhar.setFont(new Font("Raleway",Font.BOLD,18));
        textaadhar.setBounds(350,440,320,30);
        add(textaadhar);


        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont((new Font("Raleway",Font.BOLD,18)));
        l10.setBounds(100,490,180,30);
        add(l10);

        r1 = new JRadioButton("YES");
        r1.setBackground(new Color(252,208,76));
        r1.setFont((new Font("Raleway",Font.BOLD,14)));
        r1.setBounds(350,490,100,30);
        add(r1);

        r2 = new JRadioButton("NO");
        r2.setBackground(new Color(252,208,76));
        r2.setFont((new Font("Raleway",Font.BOLD,14)));
        r2.setBounds(450,490,100,30);
        add(r2);

        JLabel l11 = new JLabel("Existing Account : ");
        l11.setFont((new Font("Raleway",Font.BOLD,18)));
        l11.setBounds(100,540,180,30);
        add(l11);

        r3 = new JRadioButton("YES");
        r3.setBackground(new Color(252,208,76));
        r3.setFont((new Font("Raleway",Font.BOLD,14)));
        r3.setBounds(350,540,100,30);
        add(r3);

        r4 = new JRadioButton("NO");
        r4.setBackground(new Color(252,208,76));
        r4.setFont((new Font("Raleway",Font.BOLD,14)));
        r4.setBounds(450,540,100,30);
        add(r4);

        ButtonGroup button = new ButtonGroup();
        button.add(r1);
        button.add(r2);

        ButtonGroup button1 = new ButtonGroup();
        button1.add(r3);
        button.add(r4);

        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(first);
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        l13.setBounds(800,10,100,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.white);
        next.setForeground(Color.BLACK);
        next.addActionListener(this);
        next.setBounds(570,600,100,30);
        add(next);






        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,200,76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String rel = (String) combobox.getSelectedItem();
        String cate = (String) combobox2.getSelectedItem();
        String inc = (String) combobox3.getSelectedItem();
        String edu = (String) combobox4.getSelectedItem();
        String ocu = (String) combobox5.getSelectedItem();

        String pan = textpan.getText();
        String adha = textaadhar.getText();

        String scitizen = " ";
        if(r1.isSelected()){
            scitizen = "Yes";
        }else{
            scitizen = "No";
        }
        String eAccount = " ";
        if(r3.isSelected()){
            scitizen = "Yes";
        }else{
            scitizen = "No";
        }

        try{
            if(pan.equals("") || adha.equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the Fields ");
            }else{
                Con c1 = new Con();
                String p = "insert into signupt values('"+first+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+ocu+"','"+pan+"','"+adha+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(p);
                setVisible(false);
                new signup3(first);
            }

        }
        catch(Exception E){
            E.printStackTrace();

        }




    }

    public static void main(String[] args) {
        new signup2(" ");
    }

}
