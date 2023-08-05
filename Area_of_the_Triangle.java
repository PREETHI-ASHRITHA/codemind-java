import java.util.Scanner;
public class Area
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        double a,b,c,s,Area;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2;
        Area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",Area);
    }
}