abstract class abs
{
    abstract void fun();
    abs()
    {
        System.out.println("Constructor of A");
    }
    abs(int n)
    {
        System.out.println(" P Constructor of A");
    }

    void meth()
    {
        System.out.println("Abs class");
    }
}
class main extends abs
{
    main(int n)
    {
        super(20);
        System.out.println(" P Constructor of B");
    }
    void fun()
    {
        System.out.println("override Abs class");
    }
}
public class Abstract
{
    public static void main(String []args)
    {
        main ob=new main(10);
        ob.fun();
        ob.meth();
    }
}
