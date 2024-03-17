public class string 
{
    public static void main(String args[])
    {
        String s = "Avi";
        String s1=new String("hello");
        System.out.println(s);
        System.out.println(s1);

        char ch=s.charAt(2);
        System.out.println(ch);

        int i=s1.length();
        System.out.println(i);

        String s2=s1.substring(3);
        System.out.println(s2);

        System.out.println(s1.isEmpty());

        int a=8;
        System.out.println(2+ String.valueOf(a)+s1+7+2);

        System.out.println(s1.concat("java"));
        System.out.println(s1);
        
    }
}
