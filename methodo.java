public class methodo 
{
    public static void main(String args[])
    {
        System.out.println("Main 1 with string");
        methodo.main("Call");
        methodo.main();
    }
    public static void main(String args)
    {
        System.out.println("Main with string");
    }
    public static void main()
    {
        System.out.println("Main without string");
    }
}

