import java.io.*;
public class fileinput 
{
    public static void main(String args[]) throws IOException
    {
        int ch;
        FileInputStream f1=new FileInputStream("demo.txt");
        File f=new File("D:/Java/text2.txt"); // also create file by using-                                                                                            
        f.createNewFile();                   // File class.
        FileOutputStream fout =new FileOutputStream(f);
        while((ch=f1.read()) !=-1)
        {
                fout.write(ch);
                //System.out.print((char)ch);   
        }
        f1.close();
        fout.close();
    }
}
