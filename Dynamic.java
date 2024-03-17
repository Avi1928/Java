class A1
{
    void fun()
    {
        System.out.println("Class A");
    }
}
class B1 extends A1
{
    void fun()
    {
        System.out.println("Class B");
    }
}
class c extends A1
{
    void fun()
    {
        System.out.println("Class C");
    }
}
public class Dynamic
{
    public static void main(String []args)
    {
        A1 ob=new A1();
        ob.fun(); 
        ob=new B1();
        ob.fun();
        ob=new c();
        ob.fun();
        

    }
}
