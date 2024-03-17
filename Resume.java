import java.awt.*;
public class Resume extends Frame
{
Label l1,l2,l3,l4,l5;
TextField t1,t2;
Choice ch1;
Checkbox c1,c2,c3,c4,c5;
TextArea ta1;
 Button b1;
 public Resume()
 {
 setVisible(true);
 setSize(400,400);
 l1=new Label("Name:");
 l2=new Label("Age:");
 l3=new Label("Qualification:");
 l4=new Label("Hobbies:");
 l5=new Label("About Us:");
 t1=new TextField();
 t2=new TextField();
 ch1=new Choice();
 ch1.add("BCA/MCA");
 ch1.add("BCA/MSC");
 ch1.add("BSC/MSC");
 ch1.add("BCS/MCA");
 c1=new Checkbox("Coding");
 c2=new Checkbox("Playing");
 c3=new Checkbox("Swimming");
 c4=new Checkbox("Dancing");
 c5=new Checkbox("Singing");
 ta1=new TextArea();
 b1=new Button("SUBMIT");
 setLayout(null);
 l1.setBounds(100,100,100,20);
 t1.setBounds(230,100,100,20);
 
 l2.setBounds(100,150,100,20);
 t2.setBounds(230,150,100,20);
 
 l3.setBounds(100,200,100,20);
 ch1.setBounds(230,200,100,20);
 
 l4.setBounds(100,250,100,20);
 
 c1.setBounds(130,300,100,20);
 c2.setBounds(280,300,100,20);
 c3.setBounds(430,300,100,20);
 c4.setBounds(580,300,100,20);
 c5.setBounds(710,300,100,20);
 
 l5.setBounds(150,350,100,20);
 ta1.setBounds(200,450,100,100);
 
 b1.setBounds(180,600,100,20);
 add(t1);
 add(t2);
 add(l1);
 add(l2);
 add(l3);
 add(l4);
 add(l5);
 add(ch1);
 add(c1);
 add(c2);
 add(c3);
 add(c4);
 add(c5);
 add(ta1);
 add(b1);
 }
 public static void main(String[]at)
 {
 new Resume();
 }
 
 }