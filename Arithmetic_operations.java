import java.util.Scanner;
public class Operations
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.printf("Sum:%d
",c);
        c=a-b;
        System.out.printf("Difference:%d
",c);
        c=a*b;
        System.out.printf("Product:%d
",c);
        c=a/b;
        System.out.printf("Quotient:%d
",c);
        c=a%b;
        System.out.printf("Remainder:%d
",c);
    }
}