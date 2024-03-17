import java.awt.*;
import java.awt.event.*;
public class QuizSystem0 extends Frame implements ItemListener,ActionListener
{
    int marks=0;
    Label l1,l2,l3,l4,l5,Q1,Q2,Q3,Q4,Q5,o1,o2,o3,o4,o5,R1,h1;
    Checkbox A1,A2,A3,A4,b1,b2,b3,b4,c1,c2,c3,c4,d1,d2,d3,d4,e1,e2,e3,e4;
    CheckboxGroup opt1,opt2,opt3,opt4,opt5;
    TextField R;
    Button B1;
    String UA[]=new String [10];
    String A[]={"James Gosling","1995","Keyword","2","8 byte"};
    QuizSystem0()
    {
        
        h1=new Label("Java MCQ");
        add(h1);
        h1.setBounds(350,10,80,50);
        opt1=new CheckboxGroup();
        Q1=new Label("Questin 1:");
        o1=new Label("Options:");
        l1= new Label("Java is developed by.");
        A1= new Checkbox("James Gosling",opt1,false);
        A2= new Checkbox("Dennis Ritchie",opt1,false);
        A3= new Checkbox("Bjarne Stroustrup",opt1,false);
        A4= new Checkbox("Guido Van Rossum",opt1,false);
        add(l1);add(A1);add(A2);add(A3);add(A4);add(Q1);add(o1);
        A1.addItemListener(this);
        A2.addItemListener(this);
        A3.addItemListener(this);
        A4.addItemListener(this);
        Q1.setBounds(100,50,70,50);
        l1.setBounds(170,50,150,50);
        o1.setBounds(100,80,70,50);
        A1.setBounds(170,80,100,50);
        A2.setBounds(290,80,110,50);
        A3.setBounds(410,80,110,50);
        A4.setBounds(530,80,110,50);

        opt2=new CheckboxGroup();
        l2= new Label("In which year java first released.");
        Q2=new Label("Questin 2:");
        o2=new Label("Options:");
        b1= new Checkbox("1999",opt2,false);
        b2= new Checkbox("1965",opt2,false);
        b3= new Checkbox("1997",opt2,false);
        b4= new Checkbox("1995",opt2,false);
        add(l2);add(b1);add(b2);add(b3);add(b4);add(Q2);add(o2);
        b1.addItemListener(this);
        b2.addItemListener(this);
        b3.addItemListener(this);
        b4.addItemListener(this);
        Q2.setBounds(100,150,70,50);
        l2.setBounds(170,150,200,50);
        o2.setBounds(100,180,70,50);
        b1.setBounds(170,180,100,50);
        b2.setBounds(290,180,110,50);
        b3.setBounds(410,180,110,50);
        b4.setBounds(530,180,110,50);

        opt3=new CheckboxGroup();
        l3= new Label("what is 'this()' in java.");
        Q3=new Label("Questin 3:");
        o3=new Label("Options:");
        c1= new Checkbox("Data type",opt3,false);
        c2= new Checkbox("Keyword",opt3,false);
        c3= new Checkbox("Garbage collector",opt3,false);
        c4= new Checkbox("Syntax",opt3,false);
        add(l3);add(c1);add(c2);add(c3);add(c4);add(Q3);add(o3);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
        Q3.setBounds(100,250,70,50);
        l3.setBounds(170,250,150,50);
        o3.setBounds(100,280,70,50);
        c1.setBounds(170,280,100,50);
        c2.setBounds(290,280,110,50);
        c3.setBounds(410,280,110,50);
        c4.setBounds(530,280,110,50);

        opt4=new CheckboxGroup();
        l4= new Label("How many types of constructor in java.");
        Q4=new Label("Questin 4:");
        o4=new Label("Options:");
        d1= new Checkbox("4",opt4,false);
        d2= new Checkbox("None of these",opt4,false);
        d3= new Checkbox("2",opt4,false);
        d4= new Checkbox("3",opt4,false);
        add(l4);add(d1);add(d2);add(d3);add(d4);add(Q4);add(o4);
        d1.addItemListener(this);
        d2.addItemListener(this);
        d3.addItemListener(this);
        d4.addItemListener(this);
        Q4.setBounds(100,350,70,50);
        l4.setBounds(170,350,210,50);
        o4.setBounds(100,380,70,50);
        d1.setBounds(170,380,100,50);
        d2.setBounds(290,380,110,50);
        d3.setBounds(410,380,110,50);
        d4.setBounds(530,380,110,50);

        opt5=new CheckboxGroup();
        l5=new Label("What is size of 'long' data type.");
        Q5=new Label("Questin 5:");
        o5=new Label("Options:");
        e1= new Checkbox("1 byte",opt5,false);
        e2= new Checkbox("8 byte",opt5,false);
        e3= new Checkbox("4 byte",opt5,false);
        e4= new Checkbox("2 byte",opt5,false);
        add(l5);add(e1);add(e2);add(e3);add(e4);add(Q5);add(o5);
        e1.addItemListener(this);
        e2.addItemListener(this);
        e3.addItemListener(this);
        e4.addItemListener(this);
        Q5.setBounds(100,450,70,50);
        l5.setBounds(170,450,200,50);
        o5.setBounds(100,480,70,50);
        e1.setBounds(170,480,100,50);
        e2.setBounds(290,480,110,50);
        e3.setBounds(410,480,110,50);
        e4.setBounds(530,480,110,50);
        
        B1=new Button("Submit");
        add(B1);
        B1.addActionListener(this);
        B1.setBounds(190,600,70,30);

        R1=new Label("Result:");
        add(R1);
        R1.setBounds(350,590,50,50);

        R= new TextField();
        add(R);
        R.setBounds(420,600,70,30);

        setLayout(null);
        setSize(750,750);
        setVisible(true);
    }

     public void itemStateChanged(ItemEvent ie)
        {
            if (ie.getSource()==A1||ie.getSource()==A2||ie.getSource()==A3||ie.getSource()==A4)
            {
                UA[0]=((Checkbox) ie.getSource()).getLabel();
            }
            if (ie.getSource()==b1||ie.getSource()==b2||ie.getSource()==b3||ie.getSource()==b4)
            {
                UA[1]=((Checkbox) ie.getSource()).getLabel();
            }
            if (ie.getSource()==c1||ie.getSource()==c2||ie.getSource()==c3||ie.getSource()==c4)
            {
                UA[2]=((Checkbox) ie.getSource()).getLabel();
            }
            if (ie.getSource()==d1||ie.getSource()==d2||ie.getSource()==d3||ie.getSource()==d4)
            {
                UA[3]=((Checkbox) ie.getSource()).getLabel();
            }
            if (ie.getSource()==e1||ie.getSource()==e2||ie.getSource()==e3||ie.getSource()==e4)
            {
                UA[4]=((Checkbox) ie.getSource()).getLabel();
            }
        }
        
    public void actionPerformed(ActionEvent ob)
        {
            if(ob.getSource()==B1&&marks!=0){}
            else if(ob.getSource()==B1)
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
                    R.setText(String.valueOf(marks+" out of 5"));
                }
            }
        }
    public static void main(String args[]) 
    {
        new QuizSystem0();
    }
} 