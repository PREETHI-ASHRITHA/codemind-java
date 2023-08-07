import java.util.Scanner;
public class Inches
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double i,cm;
        i=sc.nextInt();
        cm=2.54*i;
        System.out.printf("%.2f",cm);
    }
}