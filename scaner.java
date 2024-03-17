import java.io.*;
import java.util.Scanner;
public class scaner 
{
    public static void main( String args[]) throws IOException
    {
        try (Scanner ob = new Scanner(System.in))
        {
            System.out.println("Enter your name");
            String name=ob.nextLine();
            System.out.println(name);
        }   
    }
}
