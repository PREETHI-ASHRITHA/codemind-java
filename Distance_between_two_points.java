import java.util.Scanner;
public class Distance
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double x1,x2,y1,y2,d;
        x1=sc.nextInt();
        x2=sc.nextInt();
        y1=sc.nextInt();
        y2=sc.nextInt();
        d=Math.sqrt(((x1-y1)*(x1-y1))+((x2-y2)*(x2-y2)));
        System.out.printf("%.4f",d);
    }
}