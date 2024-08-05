class Number
{
    protected int x;
    protected int y;
}
interface Arithmetic
{
    public int add(int a,int b);
    public int subtract(int a, int b);
}
class Calc extends Number implements Arithmetic
{
    public int add(int a, int b)
    {
        return a+b;
    }
    public int subtract(int a,int b)
    {
        return a-b;
    }
}
class MyProject
{
    public static void main(String[] args)    
    { 
        Calc ob = new Calc();
        System.out.println("Addition--->"+ob.add(10,3));
        System.out.println("Subtraction--->"+ob.subtract(5, 1));
    }
}
