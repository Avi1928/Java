import java.awt.*;
import java.awt.event.*;
public class DemoCal extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button c1,c2,c3,c4,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
    DemoCal()
    {
        l1= new Label("First no");
        l2= new Label("Second no");
        l3= new Label("result");
        t1= new TextField();
        t2= new TextField();
        t3= new TextField();
        c1= new Button("ADD");
        c2= new Button("SUB");
        c3= new Button("MUL");
        c4= new Button("DIV");
        b0= new Button("0");
        b1= new Button("1");
        b2= new Button("2");
        b3= new Button("3");
        b4= new Button("4");
        b5= new Button("5");
        b6= new Button("6");
        b7= new Button("7");
        b8= new Button("8");
        b9= new Button("9");
        b10=new Button("00");
        b11=new Button("=");
        add(l1);add(l2);add(l3);
        add(t1);add(t2);add(t3);
        add(c1);add(c2);add(c3);add(c4);
        add(b0);add(b1);add(b2);add(b3);add(b4);add(b5);
        add(b6);add(b7);add(b8);add(b9);add(b10);add(b11);
        setLayout(null);
        l1.setBounds(700,150,50,50);
        t1.setBounds(800,150,250,50);
        l2.setBounds(700,250,70,50);
        t2.setBounds(800,250,250,50);
        l3.setBounds(700,350,50,50);
        t3.setBounds(800,350,250,50);
        b0.setBounds(700,450,50,50);
        b1.setBounds(800,450,50,50);
        b2.setBounds(900,450,50,50);
        c1.setBounds(1000,450,50,50);
        b3.setBounds(700,550,50,50);
        b4.setBounds(800,550,50,50);
        b5.setBounds(900,550,50,50);
        c2.setBounds(1000,550,50,50);
        b6.setBounds(700,650,50,50);
        b7.setBounds(800,650,50,50);
        b8.setBounds(900,650,50,50);
        c3.setBounds(1000,650,50,50);
        b9.setBounds(700,750,50,50);
        b10.setBounds(800,750,50,50);
        b11.setBounds(900,750,50,50);
        c4.setBounds(1000,750,50,50);
        setVisible(true);
        setSize(500,500);
        c1.addActionListener(this);
        c2.addActionListener(this);
        c3.addActionListener(this);
        c4.addActionListener(this);
        b0.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ob)
    {
        String s1=t1.getText();
        String s2=t2.getText();
        int a= Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        
        if(ob.getSource()==b0)
        {
            
            t1.setText(b0.getLabel());
        }
        if(ob.getSource()==c1)
        {
            int c=a+b;
            t3.setText(String.valueOf(c));
        }
        if(ob.getSource()==c2)
        {
            int c=a-b;
            t3.setText(String.valueOf(c));
        }
        if(ob.getSource()==c3)
        {
            int c=a*b;
            t3.setText(String.valueOf(c));
        }
        if(ob.getSource()==c4)
        {
            int c=a/b;
            t3.setText(String.valueOf(c));
        }
    }
    public static void main(String arg[])
    {
        new DemoCal();
    }
}