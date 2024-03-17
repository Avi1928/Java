import java.awt.*;
import java.awt.event.*;
public class Project extends Frame implements ItemListener
{
    int marks=0;
    Label l1,l2,R;
    Checkbox A1,A2,A3,A4,b1,b2,b3,b4;
    CheckboxGroup opt;
    Project()
    {
        opt=new CheckboxGroup();
        A1= new Checkbox("James Gosling",opt,false);
        A2= new Checkbox("Dennis Ritchie",opt,false);
        A3= new Checkbox("Bjarne Stroustrup",opt,false);
        A4= new Checkbox("Guido Van Rossum",opt,false);
        l1= new Label("Java is developed by.");
        R= new Label();
        add(l1);add(R);
        add(A1);
        add(A2);
        add(A3);
        add(A4);
        setLayout(new FlowLayout());
        setSize(500,500);
        setVisible(true);
        A1.addItemListener(this);
        A2.addItemListener(this);
        A3.addItemListener(this);
        A4.addItemListener(this);

        l2= new Label("ugjfctfdjufkufkyf");
        b1= new Checkbox("James Gosling",opt,false);
        b2= new Checkbox("Dennis Ritchie",opt,false);
        b3= new Checkbox("Bjarne Stroustrup",opt,false);
        b4= new Checkbox("Guido Van Rossum",opt,false);
        add(l2);add(b1);add(b2);add(b3);add(b4);
        b1.addItemListener(this);
        b2.addItemListener(this);
        b3.addItemListener(this);
        b4.addItemListener(this);

    }
    
    public void itemStateChanged(ItemEvent ie)
        {
            if (ie.getSource()==A1 &&marks<1)
            {
                marks++;
                R.setText(String.valueOf(marks));
            }
            else if  (ie.getSource()==A2 || ie.getSource()==A3 || ie.getSource()==A4)
            {
                if(marks>0)
                R.setText(String.valueOf(marks));
            }
           /* if (ie.getSource()==b3  && (marks<2))
            {
                marks++;
                R.setText(String.valueOf(marks));
            }*/
        }
    public static void main(String args[]) 
    {
        
        new Project();
       
    }
} 