import java.util.Scanner;
public class Monopoly
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            if(a+b<c||b+c<a||c+a<b)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}