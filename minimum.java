import java.util.Scanner;
public class minimum
{
    public static void main(String[]args)
    {
     int arr[]=new int[10];
     System.out.println("Enter 10 numbers");
     try (Scanner sc = new Scanner(System.in)) 
     {
        for(int i=0;i<=9;i++)
        arr[i]=sc.nextInt();
    }
     int min;
      min=arr[0];
      for(int i=1;i<=9;i++)
      if(min<arr[i])
      arr[i]=min;
      System.out.println("Minimum numbers is:"+min);
     }
}