 class Thread_first extends Thread
 {
    public void run()
    {
        int n=5;
        System.out.println(Thread.currentThread().getName()+" Square of "+n+" is "+(n*n));
        try
        {
             Thread.sleep(500);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
 }
 class Thread_second extends Thread
 {
    public void run()
    {
        int n=6;
        try
        {
            Thread.sleep(500);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName()+" Cube of "+n+" is "+(n*n*n));
    }
 }
 public class Sqr_Cube
 {
     public static void main(String[]args)
     {
        Thread_first th1=new Thread_first();
        Thread_second th2=new Thread_second();
        th1.start();
        th2.start();
     }
 }
 