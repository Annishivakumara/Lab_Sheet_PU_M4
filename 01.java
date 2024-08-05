class Inherit
{
    protected String str;
    public Inherit()
    {
        str = "JA";
    }
}
class Subclass1 extends Inherit
{
    public Subclass1()
    {
        str = str.concat("VA");
    }            
}
class Subclass2 extends Subclass1
{
    public Subclass2()
    {
        str = str.concat(" Programming");
    }
    public void display()
    {
        System.out.println(str);
    }
}
class MyProject
{
    public static void main(String[] args)    
    { 
        Subclass2 ob = new Subclass2();
        ob.display();
    }
}
