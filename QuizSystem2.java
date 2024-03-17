import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class QuizSystem2 extends JFrame  implements ActionListener,SwingConstants
{
    int marks=0;
    JLabel l1,l2,l3,l4,l5,Q1,Q2,Q3,Q4,Q5,o1,o2,o3,o4,o5,R1,h1,R2;
    JRadioButton A1,A2,A3,A4,b1,b2,b3,b4,c1,c2,c3,c4,d1,d2,d3,d4,e1,e2,e3,e4;
    JButton B5,B6;
    int count=1;
    //JTabbedPane t1,t2;
    JPanel p1,p2,p3,p4,p5;
    String UA[]=new String [10];
    String A[]={"James Gosling","1995","Keyword","2","8 byte"};
   

    QuizSystem2()
    {
        p2=new JPanel();
        p3=new JPanel();
        p4=new JPanel();
        p5=new JPanel();
        setBackground(Color.gray);
        //t1=new JTabbedPane();
        p1=new JPanel();
        p5=new JPanel();
        B6=new JButton("Next");
        B6.setBounds(190,500,100,30);
        p1.add(B6);
        B6.addActionListener(this);
        h1=new JLabel("Java MCQ");
        p1.add(h1);
        Q1=new  JLabel("Questin 1:");
        o1=new  JLabel("Options:");
        l1=new  JLabel("Java is developed by.");
        A1= new JRadioButton("James Gosling");
        A2= new JRadioButton("Dennis Ritchae");
        A3= new JRadioButton("Bjarne Stroustrup");
        A4= new JRadioButton("Guido Van Rossum");
        p1.add(B6);
        p1.add(Q1);
        p1.add(l1);
        p1.add(o1);
        p1.add(A1);
        p1.add(A2);
        p1.add(A3);
        p1.add(A4);
        //add(t1);
       // t1.add("Question 1",p1);
        A1.addActionListener(this);
        A2.addActionListener(this);
        A3.addActionListener(this);
        A4.addActionListener(this);
        ButtonGroup B=new ButtonGroup();
        B.add(A1);B.add(A2);B.add(A3);B.add(A4);
        p1.setLayout(null);
        //t1.setBounds(0,0,700,700);
        p1.setBounds(0,0,700,700);add(p1);
        h1.setBounds(350,10,80,50);
        Q1.setBounds(100,80,70,50);
        l1.setBounds(170,80,150,50);
        o1.setBounds(100,120,70,50);
        A1.setBounds(160,120,130,50);
        A2.setBounds(290,120,110,50);
        A3.setBounds(410,120,140,50);
        A4.setBounds(550,120,140,50);

        
        

        

        
        
        
        B5=new JButton("Submit");
        p5.add(B5);
        B5.addActionListener(this);
        B5.setBounds(150,400,100,30);

        

        R1=new JLabel("Result:");
        p5.add(R1);
        R1.setBounds(390,390,90,50);

        R2= new JLabel();
        p5.add(R2);
        R2.setBounds(470,400,100,30);

        setLayout(null);
        setSize(750,750);
        setVisible(true);
    }

        public void actionPerformed(ActionEvent ae)
        {
            if (ae.getSource()==A1||ae.getSource()==A2||ae.getSource()==A3||ae.getSource()==A4)
            {
                UA[0]=((JRadioButton) ae.getSource()).getText();
            }
            if (ae.getSource()==b1||ae.getSource()==b2||ae.getSource()==b3||ae.getSource()==b4)
            {
                UA[1]=((JRadioButton) ae.getSource()).getText();
            }
            if (ae.getSource()==c1||ae.getSource()==c2||ae.getSource()==c3||ae.getSource()==c4)
            {
                UA[2]=((JRadioButton) ae.getSource()).getText();
            }
            if (ae.getSource()==d1||ae.getSource()==d2||ae.getSource()==d3||ae.getSource()==d4)
            {
                UA[3]=((JRadioButton) ae.getSource()).getText();
            }
            if (ae.getSource()==e1||ae.getSource()==e2||ae.getSource()==e3||ae.getSource()==e4)
            {
                UA[4]=((JRadioButton) ae.getSource()).getText();
            }

            if(ae.getSource()==B5&&marks!=0){}
            else if(ae.getSource()==B5)
            {
                if(UA[0].equals(A[0]))
                    {
                        marks++;
                    }
                if(UA[1].equals(A[1]))
                {
                    marks++;
                }
                if(UA[2].equals(A[2]))
                {
                    marks++;
                }
                if(UA[3].equals(A[3]))
                {
                    marks++;
                }
                if(UA[4].equals(A[4]))
                {
                    marks++;
                }
                if(marks>5){}
                else 
                {
                    R2.setText(String.valueOf(marks+" out of 5"));
                }
            }
            if(ae.getSource()==B6)
            {
                count++;
                if(count==2)
                {
                    p1.setVisible(false);
                    l2=new JLabel("In which year java first released.");
                    Q2=new JLabel("Questin 2:");
                    o2=new JLabel("Options:");
                    b1= new JRadioButton("1999");
                    b2= new JRadioButton("1965");
                    b3= new JRadioButton("1997");
                    b4= new JRadioButton("1995");
                    ButtonGroup B1=new ButtonGroup();
                    B1.add(b1);B1.add(b2);B1.add(b3);B1.add(b4);add(p2);
                    p2.add(Q2);
                    p2.add(l2);
                    p2.add(o2);
                    p2.add(b1);
                    p2.add(b2);
                    p2.add(b3);
                    p2.add(b4);
                    p2.add(B6);
                    p2.setLayout(null);
                    b1.addActionListener(this);
                    b2.addActionListener(this);
                    b3.addActionListener(this);
                    b4.addActionListener(this);
                    p2.setBounds(0,0,700,700);
                    Q2.setBounds(100,80,70,50);
                    l2.setBounds(170,80,200,50);
                    o2.setBounds(100,120,70,50);
                    b1.setBounds(170,120,100,50);
                    b2.setBounds(290,120,110,50);
                    b3.setBounds(410,120,110,50);
                    b4.setBounds(530,120,110,50);
                }
                else if(count==3)
                {
                    p2.setVisible(false);
                    l3=new JLabel("what is 'this()' in java.");
                    Q3=new JLabel("Questin 3:");
                    o3=new JLabel("Options:");
                    c1= new JRadioButton("Data type");
                    c2= new JRadioButton("Keyword");
                    c3= new JRadioButton("Garbage collector");
                    c4= new JRadioButton("Syntax");
                    ButtonGroup B2=new ButtonGroup();
                    B2.add(c1);B2.add(c2);B2.add(c3);B2.add(c4);add(p3);
                    p3.add(Q3);
                    p3.add(l3);
                    p3.add(o3);
                    p3.add(c1);
                    p3.add(c2);
                    p3.add(c3);
                    p3.add(c4);
                    p3.add(B6);
                    p3.setLayout(null);
                    //t1.add("Question 3",p3);
                    c1.addActionListener(this);
                    c2.addActionListener(this);
                    c3.addActionListener(this);
                    c4.addActionListener(this);
                    p3.setBounds(0,0,700,700);
                    Q3.setBounds(100,80,70,50);
                    l3.setBounds(170,80,150,50);
                    o3.setBounds(100,120,70,50);
                    c1.setBounds(170,120,100,50);
                    c2.setBounds(290,120,110,50);
                    c3.setBounds(400,120,140,50);
                    c4.setBounds(550,120,110,50);
                }
                else if(count==4)
                {
                    p3.setVisible(false);
                    p4=new JPanel();
                    l4=new JLabel("How many types of constructor in java.");
                    Q4=new JLabel("Questin 4:");
                    o4=new JLabel("Options:");
                    d1= new JRadioButton("4");
                    d2= new JRadioButton("None of these");
                    d3= new JRadioButton("2");
                    d4= new JRadioButton("3");
                    ButtonGroup B3=new ButtonGroup();
                    B3.add(d1);B3.add(d2);B3.add(d3);B3.add(d4);
                    p4.add(Q4);
                    p4.add(l4);
                    p4.add(o4);
                    p4.add(d1);
                    p4.add(d2);
                    p4.add(d3);
                    p4.add(d4);
                    p4.add(B6);
                    p4.setLayout(null);
                    //t1.add("Question 4",p4);
                    d1.addActionListener(this);
                    d2.addActionListener(this);
                    d3.addActionListener(this);
                    d4.addActionListener(this);
                    p4.setBounds(0,0,700,700);add(p4);
                    Q4.setBounds(100,80,70,50);
                    l4.setBounds(170,80,230,50);
                    o4.setBounds(100,120,70,50);
                    d1.setBounds(170,120,100,50);
                    d2.setBounds(275,120,110,50);
                    d3.setBounds(410,120,110,50);
                    d4.setBounds(530,120,110,50);
                }
                else if(count==5)
                {
                    p4.setVisible(false);
                    l5=new JLabel("What is size of 'long' data type.");
                    Q5=new JLabel("Questin 5:");
                    o5=new JLabel("Options:");
                    e1= new JRadioButton("1 byte");
                    e2= new JRadioButton("8 byte");
                    e3= new JRadioButton("4 byte");
                    e4= new JRadioButton("2 byte");
                    ButtonGroup B4=new ButtonGroup();
                    B4.add(e1);B4.add(e2);B4.add(e3);B4.add(e4);
                    p5.add(Q5);
                    p5.add(l5);
                    p5.add(o5);
                    p5.add(e1);
                    p5.add(e2);
                    p5.add(e3);
                    p5.add(e4);
                    p5.setLayout(null);
                    //t1.add("Question 5",p5);
                    e1.addActionListener(this);
                    e2.addActionListener(this);
                    e3.addActionListener(this);
                    e4.addActionListener(this);
                    p5.setBounds(0,0,700,700);add(p5);
                    Q5.setBounds(100,80,70,50);
                    l5.setBounds(170,80,200,50);
                    o5.setBounds(100,120,70,50);
                    e1.setBounds(170,120,100,50);
                    e2.setBounds(290,120,110,50);
                    e3.setBounds(410,120,110,50);
                    e4.setBounds(530,120,110,50);
                }

            }
        }
    public static void main(String args[]) 
    {
        new QuizSystem2();
    }
} 