import java.util.Scanner;
public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,a=0,b=1,i;
        n=sc.nextInt();
        System.out.printf("%d %d",a,b);
        for(i=1;i<n-1;i++)
        {
            int c;
            c=a+b;
            a=b;
            b=c;
            System.out.printf(" %d",c);
        }
    }
}