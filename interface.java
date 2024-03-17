interface A2
{
    void fun();
    public abstract void meth();
}
class B2 implements A2
{
    public void fun()
    {
        System.out.println("Fun is over riddened");
    }
    public void meth()
    {
        System.out.println("Meth is over riddened");
    }
}
class demointer
{
    public static void main(String args[])
    {
        B2 ob1= new B2();
        ob1.fun();
        ob1.meth();
    }
}
