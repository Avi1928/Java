import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class QuizSystem4 extends JFrame  implements ActionListener,SwingConstants
{
    int marks=0;
    JLabel l1,l2,l3,l4,l5,Q1,Q2,Q3,Q4,Q5,o1,o2,o3,o4,o5,R1,h1;
    JRadioButton A1,A2,A3,A4,b1,b2,b3,b4,c1,c2,c3,c4,d1,d2,d3,d4,e1,e2,e3,e4;
    TextField R,c;
    JButton B5,B6;
    String UA[]=new String [10];
    String A[]={"James Gosling","1995","Keyword","2","8 byte"};
    Panel p1,p2;
    int count=1;
    ButtonGroup B2=new ButtonGroup();
    QuizSystem4()
    {
        p1=new Panel();
        h1=new JLabel("Java MCQ");
        p1.add(h1);
        h1.setBounds(300,50,250,50);
        Q1=new JLabel("Questin 1:");
        o1=new JLabel("Options:");
        l1= new JLabel("Java is developed by.");
        A1= new JRadioButton("James Gosling");
        A2= new JRadioButton("Dennis Ritchie");
        A3= new JRadioButton("Bjarne Stroustrup");
        A4= new JRadioButton("Guido Van Rossum");
        ButtonGroup B=new ButtonGroup();
        B.add(A1);B.add(A2);B.add(A3);B.add(A4);add(p1);
        p1.setLayout(null);
        p1.add(l1);
        p1.add(A1);
        p1.add(A2);
        p1.add(A3);
        p1.add(A4);
        p1.add(Q1);
        p1.add(o1);
        //p1.setBackground(Color.red);
        p1.setBounds(0,00,700,700);
        A1.addActionListener(this);
        A2.addActionListener(this);
        A3.addActionListener(this);
        A4.addActionListener(this);
        Q1.setBounds(100,100,70,50);
        l1.setBounds(170,100,250,50);
        o1.setBounds(100,130,70,50);
        A1.setBounds(170,130,100,50);
        A2.setBounds(290,130,110,50);
        A3.setBounds(410,130,110,50);
        A4.setBounds(530,130,120,50);

        l2= new JLabel("In which year java first released.");
        Q2=new JLabel("Questin 2:");
        o2=new JLabel("Options:");
        b1= new JRadioButton("1999");
        b2= new JRadioButton("1965");
        b3= new JRadioButton("1997");
        b4= new JRadioButton("1995");
        b1.setBounds(290,230,110,50);
        ButtonGroup B1=new ButtonGroup();
        B1.add(b1);B1.add(b2);B1.add(b3);B1.add(b4);
        Q2.setBounds(100,80,70,50);
        l2.setBounds(170,80,200,50);
        o2.setBounds(100,120,70,50);
        b1.setBounds(170,120,100,50);
        b2.setBounds(290,120,110,50);
        b3.setBounds(410,120,110,50);
        b4.setBounds(530,120,110,50);
        

        l3= new JLabel("What is 'this()' in java.");
        Q3=new JLabel("Questin 3:");
        o3=new JLabel("Options:");
        c1= new JRadioButton("Data type");
        c2= new JRadioButton("Keyword");
        c3= new JRadioButton("Garbage collector");
        c4= new JRadioButton("Syntax");
        
        B2.add(c1);B2.add(c2);B2.add(c3);B2.add(c4);

        l4= new JLabel("How many types of constructor in java.");
        Q4=new JLabel("Questin 4:");
        o4=new JLabel("Options:");
        d1= new JRadioButton("4");
        d2= new JRadioButton("None of these");
        d3= new JRadioButton("2");
        d4= new JRadioButton("3");
        ButtonGroup B3=new ButtonGroup();
        B3.add(d1);B3.add(d2);B3.add(d3);B3.add(d4);


        l5=new JLabel("What is size of 'long' data type.");
        Q5=new JLabel("Questin 5:");
        o5=new JLabel("Options:");
        e1= new JRadioButton("1 byte");
        e2= new JRadioButton("8 byte");
        e3= new JRadioButton("4 byte");
        e4= new JRadioButton("2 byte");
        ButtonGroup B4=new ButtonGroup();
        B4.add(e1);B4.add(e2);B4.add(e3);B4.add(e4);
        
        B5=new JButton("Submit");
        p1.add(B5);
        B5.addActionListener(this);
        B5.setBounds(190,600,70,30);

        B6=new JButton("Next");
        p1.add(B6);
        B6.addActionListener(this);
        B6.setBounds(560,400,70,30);


        setLayout(null);
        setBounds(0,0,700,700);
        setVisible(true);
    }

        
    public void actionPerformed(ActionEvent ob)
        {
            if(ob.getSource()==B5&&marks!=0){}
            else if(ob.getSource()==B5)
            {
               
            }
            if(ob.getSource()==B6)
            {
                count++;
                if(count==2)
                {
                    
                    A1.setSelected(false);
                    A2.setSelected(false);
                    A3.setSelected(false);
                    A4.setSelected(false);
                    String o=Q2.getText();
                    Q1.setText(o);
                    String on=l2.getText();
                    l1.setText(on);
                    String o1=b1.getText();
                    A1.setText(o1);
                    String o2=b2.getText();
                    A2.setText(o2);                    
                    String o3=b3.getText();
                    A3.setText(o3);                    
                    String o4=b4.getText();
                    A4.setText(o4);
                    //B.setSelected(B.getSelection(), false);
                    
                
                }
                else if(count==3)
                {
                    String o=Q3.getText();
                    Q1.setText(o);
                    String on=l3.getText();
                    l1.setText(on);
                    String o1=c1.getText();
                    A1.setText(o1);
                    String o2=c2.getText();
                    A2.setText(o2);
                    String o3=c3.getText();
                    A3.setText(o3);
                    String o4=c4.getText();
                    A4.setText(o4);                                                                  
                }
                else if(count==4)
                {
                    String o=Q4.getText();
                    Q1.setText(o);
                    String on=l4.getText();
                    l1.setText(on);
                    String o1=d1.getText();
                    A1.setText(o1);
                    String o2=d2.getText();
                    A2.setText(o2);
                    String o3=d3.getText();
                    A3.setText(o3);
                    String o4=d4.getText();
                    A4.setText(o4); 
                    
                }
                else if(count==5)
                {
                    String o=Q5.getText();
                    Q1.setText(o);
                    String on=l5.getText();
                    l1.setText(on);
                    String o1=e1.getText();
                    A1.setText(o1);
                    String o2=e2.getText();
                    A2.setText(o2);
                    String o3=e3.getText();
                    A3.setText(o3);
                    String o4=e4.getText();
                    A4.setText(o4); 
                
                    R1=new JLabel("Result:");
                    p1.add(R1);
                    R1.setBounds(350,590,50,50);
            
                    R= new TextField();
                    p1.add(R);
                    R.setBounds(420,600,70,30);
                    
                }
            }
        }
    public static void main(String args[]) 
    {
        new QuizSystem4();
    }
} 
