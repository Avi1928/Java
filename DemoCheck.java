import java.awt.*;
import java.awt.event.*;
public class DemoCheck extends Frame implements ItemListener
{
    Checkbox c1,c2,c3,c4;
    Label l1;
    DemoCheck()
    {
        l1=new Label();
        c1= new Checkbox("c/c++");
        c2=new Checkbox("java");
        c3= new Checkbox("c#");
        c4=new Checkbox("Python");
        
        add(c1);add(c2);add(c3);add(c4);add(l1);
        setLayout(new FlowLayout());
        setSize(500,500);
        setVisible(true);
        c1.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ob)
    {
        l1.setText(c1.getLabel());
    }
    public static void main(String arg[])
    {
        new DemoCheck();
    }
}
