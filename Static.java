public class Static
{
    Static()
    {
        System.out.println("Constructor");
    }
    static
    {
        System.out.println("Static block");
    }
    public static void main(String args[])
    {
       
        System.out.println("Main block");
        new Static();
    }
}
