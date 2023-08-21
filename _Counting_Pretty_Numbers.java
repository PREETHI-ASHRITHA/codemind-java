import java.util.Scanner;
public class Pretty
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,j;
        n=sc.nextInt();
        for(j=1;j<=n;j++)
        {
            int l,r,s,i,c=0;
            l=sc.nextInt();
            r=sc.nextInt();
            for(i=l;i<=r;i++)
            {
                s=i%10;
                if(s==2 || s==3 || s==9)
                {
                    c++;
                }
            }
            System.out.printf("%d
",c);
        }
    }
}