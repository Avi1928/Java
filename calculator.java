
import java.awt.*;
import java.awt.event.*;

public class calculator extends Frame implements ActionListener
{
	
	TextField t;
	char sn;
	float a,b,res;
	Button b1=null,b2=null,b3=null,b4=null,b5=null,b6=null,b7=null,n1=null,n2=null,n3=null,
	n4=null,n5=null,n6=null,n7=null,n8=null,n9=null,n0=null;
	Label l;

		calculator()
		{
			t= new TextField(10);
			l=new Label("Calculator");
			b1=new  Button("+");
			b2=new  Button("-");
			b3=new  Button("*");
			b4=new  Button("/");
			b5=new  Button("=");
			b6=new  Button("Clear");
			b7=new  Button(".");
			n1=new  Button("1");
			n2=new  Button("2");
			n3=new  Button("3");
			n4=new  Button("4");
			n5=new  Button("5");
			n6=new  Button("6");
			n7=new  Button("7");
			n8=new  Button("8");
			n9=new  Button("9");
			n0=new  Button("0");
			
		
			setLayout(null);
			n1.setBounds(70,90,50,50);
			l.setBounds(135,20,65,40);
			n2.setBounds(122,90,50,50);
			n3.setBounds(175,90,50,50);
			n4.setBounds(70,143,50,50);
			n5.setBounds(122,143,50,50);
			n6.setBounds(175,143,50,50);
			n7.setBounds(70,196,50,50);
			n8.setBounds(122,196,50,50);
			n9.setBounds(175,196,50,50);
			n0.setBounds(122,249,50,50);
			t.setBounds(70,50,210,30);
			b1.setBounds(228,90,50,50);
			b2.setBounds(228,143,50,50);
			b3.setBounds(228,196,50,50);
			b4.setBounds(228,249,50,50);
			b5.setBounds(70,302,209,50);
			b6.setBounds(70,249,50,50);
			b7.setBounds(175,249,50,50);
			add(t);
			add(l);
			add(b1);
			add(b2);
			add(b3);
			add(b4);
			add(b5);
			add(b6);
			add(b7);
			add(n1);
			add(n2);
			add(n3);
			add(n4);
			add(n5);
			add(n6);
			add(n7);
			add(n8);
			add(n9);
			add(n0);
			setSize(350,350);
			setVisible(true);
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			b6.addActionListener(this);
			b7.addActionListener(this);
			n0.addActionListener(this);
			n1.addActionListener(this);
			n2.addActionListener(this);
			n3.addActionListener(this);
			n4.addActionListener(this);
			n5.addActionListener(this);
			n6.addActionListener(this);
			n7.addActionListener(this);
			n8.addActionListener(this);
			n9.addActionListener(this);
			t.addActionListener(this);
			setBackground(Color.blue);
		}
		public void actionPerformed(ActionEvent ob)
		{
			String str=ob.getActionCommand();
			char ch=str.charAt(0);
			if ( Character.isDigit(ch))
			t.setText(t.getText()+str);
			else if(str.equals("."))
			t.setText(t.getText()+str);
			
			else 
			if(str.equals("+"))
			{
				a=Float.parseFloat(t.getText());
				sn='+';
				t.setText("");
			}
			else if(str.equals("-"))
			{
			a=Float.parseFloat(t.getText());
			sn='-';
			t.setText("");
		}
		else if(str.equals("*"))
		{
			a=Float.parseFloat(t.getText());
			sn='*';
			t.setText("");
		}
		else if(str.equals("/"))
		{
			a=Float.parseFloat(t.getText());
			sn='/';
			t.setText("");
		}
		
		
		if(str.equals("="))
		{
			b=Float.parseFloat(t.getText());
			if(sn=='+')
				res=a+b;
			else if(sn=='-')
				res=a-b;
			else if(sn=='*')
				res=a*b;
			else if(sn=='/')
				res=a/b;
			t.setText(""+res);
			
			
		}	
		if(str.equals("Clear"))
		{
			t.setText("");
		}
	}


	
	public static void main(String args[])
	{	try
	   {
		 new calculator();
		
	    }
	
	catch(Exception e)
	{
		System.out.println("error"+e);
	}
	}
}