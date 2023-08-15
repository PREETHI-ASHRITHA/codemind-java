import java.util.Scanner;
public class Gcd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i,m,s=0;
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=1;i<=n&&i<=m;i++)
        {
            if(n%i==0 && m%i==0)
            {
                s=i;
            }
        }
        System.out.println(s);
    }
}