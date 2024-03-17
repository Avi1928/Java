import java.util.Scanner;
class facto
{
    int fact=1,n;
    facto()
    {
        System.out.print("Enter the number:-");
        try (Scanner sc = new Scanner(System.in)) 
        {
            n=sc.nextInt();
        }
    }
    void factorial()
    {
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
    }
    void display()
    {
        System.out.println("Factorial = "+fact);
    }
}
 public class factorial
{
    public static void main(String[] args)
    {
        facto ob = new facto();
        ob.factorial();
        ob.display();
    }
}
