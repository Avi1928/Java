class A
{
    int x=10;
    A()
    {
        System.out.println("Constructor of A");
    }
    
    void fun()
    {
        System.out.println("Class A");
    }
}
class B extends A
{
    void fun()
    {
        //super.fun();
        System.out.println(super.x);
        System.out.println("Class B");
    }
}
class inheritance
{
    public static void main(String args[])
    {
      B ob = new B();
      ob.fun();
    }
}
