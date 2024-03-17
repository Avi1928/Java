import java.awt.*;
import java.awt.event.*;
import java.awt.Panel;
public class QuizSystem3 extends Frame implements ItemListener,ActionListener
{
    int marks=0;
    Label l1,l2,l3,l4,l5,Q1,Q2,Q3,Q4,Q5,o1,o2,o3,o4,o5,R1,h1;
    Checkbox A1,A2,A3,A4,b1,b2,b3,b4,c1,c2,c3,c4,d1,d2,d3,d4,e1,e2,e3,e4;
    CheckboxGroup opt1,opt2,opt3,opt4,opt5;
    TextField R,c;
    Button B1,B2;
    String UA[]=new String [10];
    String A[]={"James Gosling","1995","Keyword","2","8 byte"};
    Panel p1,p2;
    int count=1;
    
    QuizSystem3()
    {
        p1=new Panel();
        h1=new Label("Java MCQ");
        p1.add(h1);
        h1.setBounds(300,50,250,50);
        opt1=new CheckboxGroup();
        Q1=new Label("Questin 1:");
        o1=new Label("Options:");
        l1= new Label("Java is developed by.");
        A1= new Checkbox("James Gosling",opt1,false);
        A2= new Checkbox("Dennis Ritchie",opt1,false);
        A3= new Checkbox("Bjarne Stroustrup",opt1,false);
        A4= new Checkbox("Guido Van Rossum",opt1,false);
        add(p1);
        p1.setLayout(null);
        p1.add(l1);
        p1.add(A1);
        p1.add(A2);
        p1.add(A3);
        p1.add(A4);
        p1.add(Q1);
        p1.add(o1);
        p1.setBackground(Color.red);
        p1.setBounds(0,00,700,700);
        A1.addItemListener(this);
        A2.addItemListener(this);
        A3.addItemListener(this);
        A4.addItemListener(this);
        Q1.setBounds(100,100,70,50);
        l1.setBounds(170,100,250,50);
        o1.setBounds(100,130,70,50);
        A1.setBounds(170,130,100,50);
        A2.setBounds(290,130,110,50);
        A3.setBounds(410,130,110,50);
        A4.setBounds(530,130,120,50);

        opt2=new CheckboxGroup();
        l2= new Label("In which year java first released.");
        Q2=new Label("Questin 2:");
        o2=new Label("Options:");
        b1= new Checkbox("1999",opt2,false);
        b2= new Checkbox("1965",opt2,false);
        b3= new Checkbox("1997",opt2,false);
        b4= new Checkbox("1995",opt2,false);
        

        opt3=new CheckboxGroup();
        l3= new Label("What is 'this()' in java.");
        Q3=new Label("Questin 3:");
        o3=new Label("Options:");
        c1= new Checkbox("Data type",opt3,false);
        c2= new Checkbox("Keyword",opt3,false);
        c3= new Checkbox("Garbage collector",opt3,false);
        c4= new Checkbox("Syntax",opt3,false);

        opt4=new CheckboxGroup();
        l4= new Label("How many types of constructor in java.");
        Q4=new Label("Questin 4:");
        o4=new Label("Options:");
        d1= new Checkbox("4",opt4,false);
        d2= new Checkbox("None of these",opt4,false);
        d3= new Checkbox("2",opt4,false);
        d4= new Checkbox("3",opt4,false);

        opt5=new CheckboxGroup();
        l5=new Label("What is size of 'long' data type.");
        Q5=new Label("Questin 5:");
        o5=new Label("Options:");
        e1= new Checkbox("1 byte",opt5,false);
        e2= new Checkbox("8 byte",opt5,false);
        e3= new Checkbox("4 byte",opt5,false);
        e4= new Checkbox("2 byte",opt5,false);
        
        B1=new Button("Submit");
        p1.add(B1);
        B1.addActionListener(this);
        B1.setBounds(190,600,70,30);

        B2=new Button("Next");
        p1.add(B2);
        B2.addActionListener(this);
        B2.setBounds(560,400,70,30);


        setLayout(null);
        setBounds(0,0,700,700);
        setVisible(true);
    }

     public void itemStateChanged(ItemEvent ie)
        {
            
        }
        
    public void actionPerformed(ActionEvent ob)
        {
            if(ob.getSource()==B1&&marks!=0){}
            else if(ob.getSource()==B1)
            {
               
            }
            if(ob.getSource()==B2)
            {
                count++;
                if(count==2)
                {
                    A1.setState(true);
                    A2.setState(true);
                    A3.setState(true);
                    A4.setState(true);
                    String o=Q2.getText();
                    Q1.setText(o);
                    String on=l2.getText();
                    l1.setText(on);
                    String o1=b1.getLabel();
                    A1.setLabel(o1);
                    String o2=b2.getLabel();
                    A2.setLabel(o2);                    
                    String o3=b3.getLabel();
                    A3.setLabel(o3);                    
                    String o4=b4.getLabel();
                    A4.setLabel(o4);
                
                }
                else if(count==3)
                {
                    String o=Q3.getText();
                    Q1.setText(o);
                    String on=l3.getText();
                    l1.setText(on);
                    String o1=c1.getLabel();
                    A1.setLabel(o1);
                    String o2=c2.getLabel();
                    A2.setLabel(o2);
                    String o3=c3.getLabel();
                    A3.setLabel(o3);
                    String o4=c4.getLabel();
                    A4.setLabel(o4); 
                    if(A1.getState()==true||A2.getState()==true|| A3.getState()==true||A4.getState()==true)
                    {
                    A1.setState(false);
                    A2.setState(false);
                    A3.setState(false);
                    A4.setState(false);
                    }
                    
                   
                   
                }
                else if(count==4)
                {
                    String o=Q4.getText();
                    Q1.setText(o);
                    String on=l4.getText();
                    l1.setText(on);
                    String o1=d1.getLabel();
                    A1.setLabel(o1);
                    String o2=d2.getLabel();
                    A2.setLabel(o2);
                    String o3=d3.getLabel();
                    A3.setLabel(o3);
                    String o4=d4.getLabel();
                    A4.setLabel(o4); 
                    A1.setState(true);
                    A2.setState(true);
                    A3.setState(true);
                    A4.setState(true);
                }
                else if(count==5)
                {
                    String o=Q5.getText();
                    Q1.setText(o);
                    String on=l5.getText();
                    l1.setText(on);
                    String o1=e1.getLabel();
                    A1.setLabel(o1);
                    String o2=e2.getLabel();
                    A2.setLabel(o2);
                    String o3=e3.getLabel();
                    A3.setLabel(o3);
                    String o4=e4.getLabel();
                    A4.setLabel(o4); 
                    A1.setState(true);
                    A2.setState(true);
                    A3.setState(true);
                    A4.setState(false);


                    R1=new Label("Result:");
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
        new QuizSystem3();
    }
} 
