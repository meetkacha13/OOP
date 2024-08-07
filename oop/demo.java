import java.util.*;

/**
 * demo
 */
class A 
{
    int a=10;
}

class B extends A
{
    int b=20;

    void show()
    {
        System.out.println("a = "+a+" b = "+b);
    }
}

public class demo {
    public static void main(String[] args) 
    {
        B i = new B();
        i.show();
    }
}