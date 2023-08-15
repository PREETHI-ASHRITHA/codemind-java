import java.util.Scanner;
public class Neon
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,m,sn,s=0,r;
        n=sc.nextInt();
        sn=n*n;
        m=sn;
        while(m!=0)
        {
            r=m%10;
            s=s+r;
            m=m/10;
        }
        if(n==s)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
    }
}