import java.util.Scanner;
public class Array2d 
{  
    public static void main(String args[])
    {
        int arr[][]=new int[3][3];
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.println("Enter the array");
            for(int i=0;i<=2;i++)
            {
                for(int j=0;j<=2;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
        }
        for(int i=0;i<=2;i++)
            {
                for(int j=0;j<=2;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
            System.out.println(" ");
            }
        
    }
}
