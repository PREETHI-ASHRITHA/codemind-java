import java.util.Scanner;
public class Temperature
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double c,f;
        c=sc.nextInt();
        f=32+(c*9/5);
        System.out.printf("%.2f",f);
    }
}