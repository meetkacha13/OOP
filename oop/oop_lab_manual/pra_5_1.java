/* create circle class with area function to find area of circle*/

import java.util.*;

class findArea
{
    double pi=3.14, ans;

    void area(double r)
    {
        ans = pi*r*r;

        System.out.println("radius = "+ans);
    }
}

public class pra_5_1
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("enter radius : ");
        double r = s.nextDouble();

        findArea f = new findArea();

        f.area(r);
    }
}