import java.util.Scanner;
public class Area
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double r,Area;
        r=sc.nextInt();
        Area=3.14*r*r;
        System.out.printf("%.2f",Area);
    }
}