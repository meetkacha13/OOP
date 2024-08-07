import java.util.*;

abstract class vegatable
{
    String color;
    abstract public void tostring(); 
}

class potato extends vegatable
{
    potato(String color)
    {
        this.color=color;
    }

    public void tostring()
    {
        System.out.println("color of potato is : "+color);
    }
}

class brinjal extends vegatable
{
    brinjal(String color)
    {
        this.color=color;
    }

    public void tostring()
    {
        System.out.println("color of brinjal is : "+color);
    }
}

class tomato extends vegatable
{
    tomato(String color)
    {
        this.color=color;
    }

    public void tostring()
    {
        System.out.println("color of tomato is : "+color);
    }
}

public class abstract_class
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("enter color of potato : ");
        String color1 = s.next();
        potato p = new potato(color1);
        p.tostring();

        System.out.println("enter color of brinjal : ");
        String color2 = s.next();
        brinjal b = new brinjal(color2);
        b.tostring();

        System.out.println("enter color of tomato : ");
        String color3 = s.next();
        tomato t = new tomato(color3);
        t.tostring();
    }
}