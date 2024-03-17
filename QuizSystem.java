//import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class QuizSystem extends JFrame  implements ActionListener,SwingConstants
{
    int marks=0,count=1;
    JLabel l1,l2,l3,l4,l5,q1,q2,q3,q4,q5,a,b,c,d,result,heading,obtained_mark;
    JRadioButton a1,a2,a3,a4,b1,b2,b3,b4,c1,c2,c3,c4,d1,d2,d3,d4,e1,e2,e3,e4;
    JButton submit,next,previous;
    JPanel panel1,panel2,panel3,panel4,panel5;
    String User_Ans[]=new String [10];
    String Stored_Ans[]={"Molecules","Strongly","Sedimentation","Condensation","Sediments"};
     
    QuizSystem()
    { 
        panel1=new JPanel();
        heading=new JLabel("Science MCQ");
        panel1.add(heading);
        q1=new  JLabel("Questin 1:");
        l1=new  JLabel("Matter is made up of.");
        a1= new JRadioButton("Atoms");
        a2= new JRadioButton("All of these");     // Creating options of the question.
        a3= new JRadioButton("Crystal");
        a4= new JRadioButton("Molecules");

        a=new  JLabel("a)");
        b=new  JLabel("b)");
        c=new  JLabel("c)");
        d=new  JLabel("d)");

        next=new JButton("Next");
        next.setBounds(420,450,100,30);
        previous=new JButton("Previous");
        previous.setBounds(150,450,100,30);
        
        panel1.add(next); panel1.add(q1); panel1.add(l1);
        panel1.add(a1); panel1.add(a2); panel1.add(a3);        // Adding components to the panel.
        panel1.add(a4); panel1.add(a); panel1.add(b);
        panel1.add(c); panel1.add(d); add(panel1);

        a1.addActionListener(this);  
        a2.addActionListener(this);
        a3.addActionListener(this);       // Registry of buttons.
        a4.addActionListener(this); 
        next.addActionListener(this);
        previous.addActionListener(this);  

        ButtonGroup B=new ButtonGroup();
        B.add(a1);B.add(a2);B.add(a3);B.add(a4);        // Grouping of buttons.

        panel1.setLayout(null);
        panel1.setBounds(0,0,700,700);
        heading.setBounds(350,10,80,50);
        q1.setBounds(100,80,70,50);
        l1.setBounds(170,80,150,50);
        a.setBounds(100,130,70,50);
        b.setBounds(100,170,70,50);
        c.setBounds(100,210,70,50);          // Setup of postion of component on the panel.
        d.setBounds(100,250,70,50);
        a1.setBounds(140,130,130,50);
        a2.setBounds(140,170,110,50);
        a3.setBounds(140,210,140,50);
        a4.setBounds(140,250,140,50);

        setLayout(null);
        setSize(750,750);
        setVisible(true);
    }

    // Code for handel action generated on various action perform.

        public void actionPerformed(ActionEvent ae)
        {
            // Code for reciving user answer
            if (ae.getSource()==a1||ae.getSource()==a2||ae.getSource()==a3||ae.getSource()==a4)
            {
                User_Ans[0]=((JRadioButton) ae.getSource()).getText();
            }
            if (ae.getSource()==b1||ae.getSource()==b2||ae.getSource()==b3||ae.getSource()==b4)
            {
                User_Ans[1]=((JRadioButton) ae.getSource()).getText();
            }
            if (ae.getSource()==c1||ae.getSource()==c2||ae.getSource()==c3||ae.getSource()==c4)
            {
                User_Ans[2]=((JRadioButton) ae.getSource()).getText();
            }
            if (ae.getSource()==d1||ae.getSource()==d2||ae.getSource()==d3||ae.getSource()==d4)
            {
                User_Ans[3]=((JRadioButton) ae.getSource()).getText();
            }
            if (ae.getSource()==e1||ae.getSource()==e2||ae.getSource()==e3||ae.getSource()==e4)
            {
                User_Ans[4]=((JRadioButton) ae.getSource()).getText();
            }

            // Code for calculating marks
            
            if(ae.getSource()==submit&&marks!=0){}
            else if(ae.getSource()==submit)
            {
                if(User_Ans[0].equals(Stored_Ans[0]))
                    {
                        marks++;
                    }
                if(User_Ans[1].equals(Stored_Ans[1]))
                {
                    marks++;
                }
                if(User_Ans[2].equals(Stored_Ans[2]))
                {
                    marks++;
                }
                if(User_Ans[3].equals(Stored_Ans[3]))
                {
                    marks++;
                }
                if(User_Ans[4].equals(Stored_Ans[4]))
                {
                    marks++;
                }
                if(marks>5){}
                else 
                {
                    obtained_mark.setText(String.valueOf(marks+" out of 5"));
                }
            }

            //Code for going next question.
            if(ae.getSource()==next)
            {
                count++;
                if(count==1)
                {
                    heading=new JLabel("Science MCQ");
                    panel1.add(heading);
                    add(panel1);                                      // Creating & adding panel into frame.
                    panel1.setLayout(null);
                    panel1.setBounds(0,0,700,700);

                    q1=new  JLabel("Questin 1:");
                    l1=new  JLabel("Matter is made up of.");    
                    a1= new JRadioButton("Atoms");
                    a2= new JRadioButton("All of these");        // Creating options of the question.   
                    a3= new JRadioButton("Crystal");
                    a4= new JRadioButton("Molecules");

                    panel1.add(next); panel1.add(q1); panel1.add(l1);
                    panel1.add(a); panel1.add(a1); panel1.add(a2);     // Adding component on the panel.
                    panel1.add(a3); panel1.add(a4); panel1.add(a);
                    panel1.add(b); panel1.add(c); panel1.add(d); 

                    a1.addActionListener(this);
                    a2.addActionListener(this);
                    a3.addActionListener(this);                        // Registry of buttons.
                    a4.addActionListener(this);

                    ButtonGroup B=new ButtonGroup();
                    B.add(a1);B.add(a2);B.add(a3);B.add(a4);           // Grouping of buttons.

                    
                    heading.setBounds(350,10,80,50);
                    q1.setBounds(100,80,70,50);
                    l1.setBounds(170,80,150,50);
                    a1.setBounds(140,130,130,50);     
                    a2.setBounds(140,170,110,50);     // Setup of component on the frame.
                    a3.setBounds(140,210,140,50);
                    a4.setBounds(140,250,140,50);
                }
                if(count==2)
                {
                    panel1.setVisible(false);
                    panel2=new JPanel();
                    add(panel2);                                        
                    panel2.setLayout(null);
                    panel2.setBounds(0,0,700,700);

                    q2=new JLabel("Questin 2:");
                    l2=new JLabel("Molecules of solids are attracted to each other.");
                    b1= new JRadioButton("Strongly");
                    b2= new JRadioButton("None of these");          
                    b3= new JRadioButton("Weakly");
                    b4= new JRadioButton("Freely");

                    ButtonGroup B1=new ButtonGroup();                    
                    B1.add(b1);B1.add(b2);B1.add(b3);B1.add(b4);       
                   
                    panel2.add(q2); panel2.add(l2); panel2.add(b1);
                    panel2.add(b2); panel2.add(b3); panel2.add(b4);
                    panel2.add(next); panel2.add(previous);             
                    panel2.add(a); panel2.add(b); 
                    panel2.add(c); panel2.add(d);
 
                    b1.addActionListener(this);
                    b2.addActionListener(this);
                    b3.addActionListener(this);                         
                    b4.addActionListener(this);

                    q2.setBounds(100,80,70,50);
                    l2.setBounds(170,80,300,50);
                    b1.setBounds(140,130,100,50);      
                    b2.setBounds(140,170,110,50);   
                    b3.setBounds(140,210,110,50);
                    b4.setBounds(140,250,110,50);
                }
                if(count==3)
                {
                    panel2.setVisible(false);
                    panel3=new JPanel();
                    add(panel3);
                    panel3.setLayout(null);
                    panel3.setBounds(0,0,700,700);
                    
                    q3=new JLabel("Questin 3:");
                    l3=new JLabel("The process of setting down heavy particle called.");
                    c1= new JRadioButton("Decantation");
                    c2= new JRadioButton("Sieving");
                    c3= new JRadioButton("Sedimentation");
                    c4= new JRadioButton("Evaporation");

                    ButtonGroup B2=new ButtonGroup();
                    B2.add(c1);B2.add(c2);B2.add(c3);B2.add(c4);

                    panel3.add(q3); panel3.add(l3); panel3.add(c1); 
                    panel3.add(c2); panel3.add(c3); panel3.add(c4);
                    panel3.add(next); panel3.add(previous);
                    panel3.add(a); panel3.add(b); 
                    panel3.add(c); panel3.add(d);
                    
                    c1.addActionListener(this);
                    c2.addActionListener(this);
                    c3.addActionListener(this);
                    c4.addActionListener(this);

                    q3.setBounds(100,80,70,50);
                    l3.setBounds(170,80,350,50);
                    c1.setBounds(140,130,100,50);
                    c2.setBounds(140,170,110,50);
                    c3.setBounds(140,210,140,50);
                    c4.setBounds(140,250,110,50);
                }
                if(count==4)
                {
                    panel3.setVisible(false);
                    panel4=new JPanel();
                    add(panel4);
                    panel4.setLayout(null);
                    panel4.setBounds(0,0,700,700);add(panel4);

                    q4=new JLabel("Questin 4:");
                    l4=new JLabel("In which of these process does steam change to water.");
                    d1= new JRadioButton("Evaporation");
                    d2= new JRadioButton("Mealting");
                    d3= new JRadioButton("Freezing");
                    d4= new JRadioButton("Condensation");

                    ButtonGroup B3=new ButtonGroup();
                    B3.add(d1);B3.add(d2);B3.add(d3);B3.add(d4);

                    panel4.add(q4); panel4.add(l4); panel4.add(d1); 
                    panel4.add(d2); panel4.add(d3); panel4.add(d4);
                    panel4.add(next); panel4.add(previous);
                    panel4.add(a); panel4.add(b);
                    panel4.add(c); panel4.add(d);
                   
                    d1.addActionListener(this);
                    d2.addActionListener(this);
                    d3.addActionListener(this);
                    d4.addActionListener(this);
                    
                    q4.setBounds(100,80,70,50);
                    l4.setBounds(170,80,350,50);
                    d1.setBounds(140,130,100,50);
                    d2.setBounds(140,170,110,50);
                    d3.setBounds(140,210,110,50);
                    d4.setBounds(140,250,110,50);
                }
                if(count==5)
                {
                    panel4.setVisible(false);
                    panel5=new JPanel();
                    panel5.setLayout(null);

                    q5=new JLabel("Questin 5:");
                    l5=new JLabel("The heavy particle settle down are called.");
                    e1= new JRadioButton("Sediments");
                    e2= new JRadioButton("Solvent");
                    e3= new JRadioButton("solute");
                    e4= new JRadioButton("All of these");

                    ButtonGroup B4=new ButtonGroup();
                    B4.add(e1);B4.add(e2);B4.add(e3);B4.add(e4);

                    panel5.add(q5); panel5.add(l5); panel5.add(e1);
                    panel5.add(e2); panel5.add(e3); panel5.add(e4);
                    panel5.add(previous); panel5.add(a); panel5.add(b);
                    panel5.add(c); panel5.add(d);
                   
                    e1.addActionListener(this);
                    e2.addActionListener(this);
                    e3.addActionListener(this);
                    e4.addActionListener(this);

                    panel5.setBounds(0,0,700,700);add(panel5);
                    q5.setBounds(100,80,70,50);
                    l5.setBounds(170,80,300,50);
                    e1.setBounds(140,130,100,50);
                    e2.setBounds(140,170,110,50);
                    e3.setBounds(140,210,110,50);
                    e4.setBounds(140,250,110,50);

                    submit=new JButton("Submit");
                    panel5.add(submit);
                    submit.addActionListener(this);
                    submit.setBounds(420,450,110,30);
            
                    result=new JLabel("Result:");
                    panel5.add(result);
                    result.setBounds(260,540,90,50);
            
                    obtained_mark= new JLabel();
                    panel5.add(obtained_mark);
                    obtained_mark.setBounds(330,550,100,30);
                }
            }

            // Code for going previous questions.
            if (ae.getSource()==previous)
            {
                count--;
                if(count==5)
                {
                    panel5.setLayout(null);
                    add(panel5);
                    panel5.setBounds(0,0,700,700);

                    q5=new JLabel("Questin 5:");
                    l5=new JLabel("The heavy particle settle down are called.");
                    e1= new JRadioButton("Sedimentation");
                    e2= new JRadioButton("Solvent");
                    e3= new JRadioButton("Solute");
                    e4= new JRadioButton("All of these");

                    ButtonGroup B4=new ButtonGroup();
                    B4.add(e1);B4.add(e2);B4.add(e3);B4.add(e4);

                    panel5.add(q5); panel5.add(l5); panel5.add(e1); 
                    panel5.add(e2); panel5.add(e3); panel5.add(e4);
                    panel5.add(previous);
                    panel5.add(a); panel5.add(b);
                    panel5.add(c); panel5.add(d);

                    e1.addActionListener(this);
                    e2.addActionListener(this);
                    e3.addActionListener(this);
                    e4.addActionListener(this);

                    q5.setBounds(100,80,70,50);
                    l5.setBounds(170,80,300,50);
                    e1.setBounds(140,130,100,50);
                    e2.setBounds(140,170,110,50);
                    e3.setBounds(140,210,110,50);
                    e4.setBounds(140,250,110,50);   
                    submit=new JButton("Submit");
                    panel5.add(submit);
                    submit.addActionListener(this);
                    submit.setBounds(150,600,100,30);
            
                    result=new JLabel("Result:");
                    panel5.add(result);
                    result.setBounds(390,400,70,50);
            
                    obtained_mark= new JLabel();
                    panel5.add(obtained_mark);
                    obtained_mark.setBounds(330,550,100,30);
     
                }
                if(count==4)
                {
                    panel5.setVisible(false);
                    panel4=new JPanel();
                    panel4.setLayout(null);
                    panel4.setBounds(0,0,700,700);add(panel4);

                    q4=new JLabel("Questin 4:");
                    l4=new JLabel("In which of these process does steam change to water.");
                    d1= new JRadioButton("Evaporation");
                    d2= new JRadioButton("Mealting");
                    d3= new JRadioButton("Freezing");
                    d4= new JRadioButton("Condensation");

                    ButtonGroup B3=new ButtonGroup();
                    B3.add(d1);B3.add(d2);B3.add(d3);B3.add(d4);

                    panel4.add(q4); panel4.add(l4);
                    panel4.add(d1); panel4.add(d2); panel4.add(d3);
                    panel4.add(d4); panel4.add(next); panel4.add(previous);
                    panel4.add(a); panel4.add(b); panel4.add(c); panel4.add(d);

                    d1.addActionListener(this);
                    d2.addActionListener(this);
                    d3.addActionListener(this);
                    d4.addActionListener(this);

                    q4.setBounds(100,80,70,50);
                    l4.setBounds(170,80,350,50);
                    d1.setBounds(140,130,100,50);
                    d2.setBounds(140,170,110,50);
                    d3.setBounds(140,210,110,50);
                    d4.setBounds(140,250,110,50);  
                }
                if(count==3)
                {
                    panel4.setVisible(false);
                    panel3=new JPanel();
                    add(panel3);
                    panel3.setLayout(null);
                    panel3.setBounds(0,0,700,700);

                    q3=new JLabel("Questin 3:");
                    l3=new JLabel("The process of setting down heavy particle called.");
                    c1= new JRadioButton("Decantation");
                    c2= new JRadioButton("Sieving");
                    c3= new JRadioButton("Sedimentation");
                    c4= new JRadioButton("Evaporation");

                    ButtonGroup B2=new ButtonGroup();
                    B2.add(c1);B2.add(c2);B2.add(c3);B2.add(c4);

                    panel3.add(q3); panel3.add(l3);  
                    panel3.add(c1); panel3.add(c2); panel3.add(c3); 
                    panel3.add(c4); panel3.add(next); panel3.add(previous);
                    panel3.add(a); panel3.add(b); panel3.add(c); panel3.add(d);
                    
                    c1.addActionListener(this);
                    c2.addActionListener(this);
                    c3.addActionListener(this);
                    c4.addActionListener(this);
                    
                    q3.setBounds(100,80,70,50);
                    l3.setBounds(170,80,350,50);
                    c1.setBounds(140,130,100,50);
                    c2.setBounds(140,170,110,50);
                    c3.setBounds(140,210,140,50);
                    c4.setBounds(140,250,110,50); 
                }
                if(count==2)
                {
                    panel3.setVisible(false);
                    panel2=new JPanel();
                    add(panel2);
                    panel2.setLayout(null);
                    panel2.setBounds(0,0,700,700);

                    q2=new JLabel("Questin 2:");
                    l2=new JLabel("Molecules of solids are attracted to each other.");
                    b1= new JRadioButton("Strongly");
                    b2= new JRadioButton("None of these");
                    b3= new JRadioButton("Weakly");
                    b4= new JRadioButton("Freely");

                    ButtonGroup B1=new ButtonGroup();
                    B1.add(b1);B1.add(b2);B1.add(b3);B1.add(b4);

                    panel2.add(q2); panel2.add(l2); panel2.add(b1); 
                    panel2.add(b2); panel2.add(b3); panel2.add(b4);
                    panel2.add(next); panel2.add(previous);
                    panel2.add(a); panel2.add(b);
                    panel2.add(c); panel2.add(d);

                    b1.addActionListener(this);
                    b2.addActionListener(this);
                    b3.addActionListener(this);
                    b4.addActionListener(this);

                    q2.setBounds(100,80,70,50);
                    l2.setBounds(170,80,300,50);
                    b1.setBounds(140,130,100,50);
                    b2.setBounds(140,170,110,50);
                    b3.setBounds(140,210,110,50);
                    b4.setBounds(140,250,110,50);
                }
                if(count==1)
                {
                    panel2.setVisible(false);
                    panel1=new JPanel();
                    panel1.setLayout(null);
                    panel1.setBounds(0,0,700,700);add(panel1);

                    heading=new JLabel("Science MCQ");
                    panel1.add(heading);

                    q1=new  JLabel("Questin 1:");
                    l1=new  JLabel("Matter is made up of.");
                    a1= new JRadioButton("Atoms");
                    a2= new JRadioButton("All of these");
                    a3= new JRadioButton("Crystal");
                    a4= new JRadioButton("Molecules");

                    panel1.add(q1); panel1.add(l1); panel1.add(a); 
                    panel1.add(a1); panel1.add(a2); panel1.add(a3);
                    panel1.add(a4); panel1.add(b); panel1.add(c);  
                    panel1.add(d); panel1.add(next);
                    
                    a1.addActionListener(this);
                    a2.addActionListener(this);
                    a3.addActionListener(this);
                    a4.addActionListener(this);

                    ButtonGroup B=new ButtonGroup();
                    B.add(a1);B.add(a2);B.add(a3);B.add(a4);
                    
                    heading.setBounds(350,10,80,50);
                    q1.setBounds(100,80,70,50);
                    l1.setBounds(170,80,150,50);
                    a1.setBounds(140,130,130,50);
                    a2.setBounds(140,170,110,50);
                    a3.setBounds(140,210,140,50);
                    a4.setBounds(140,250,140,50);
                }
            }    
        } 
    public static void main(String args[]) 
    {
        new QuizSystem();
    }
} 