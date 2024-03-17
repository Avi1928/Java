import java.awt.*;
import java.awt.event.*;
public class question extends Frame implements ActionListener
{    
    Button b1,b2,b3,b4;
    TextField t1,t2;
    Label l1,l2;
    question() 
    {
        b1=new Button("Addition");
        b2=new Button("Multiply");
        b3=new Button("Substraction");
        b4=new Button("Division");
        t1=new TextField();
        t2=new TextField();
        l1=new Label("1.");
        l2=new Label("2.");
        add(l1);
        add(l2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(t1);
        add(t2);
        setLayout(null);
        l1.setBounds(750,200,50,50);
        l2.setBounds(750,300,50,50);
        t1.setBounds(800,200,300,50);
        t2.setBounds(800,300,300,50);
        b1.setBounds(600,600,100,50);
        b2.setBounds(800,600,100,50);
        b3.setBounds(1000,600,100,50);
        b4.setBounds(1200,600,100,50);
        setSize(500,500);
        setVisible(true);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ob) 
    {   
        String s1=t1.getText() ;
        String s2=t2.getText();
        int a=Integer.parseInt(s1) ;
        int b=Integer.parseInt(s2);
        int c=a+b;
        t2.setText(String.valueOf(c));
    }

    public static void main(String args[])
    {
        new question();
    }    
}    
