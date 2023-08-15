import java.util.Scanner;
public class Largest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,q,r,s=0,max;
        n=sc.nextInt();
        q=n;
        max=0;
        while(q!=0)
        {
            r=q%10;
            if(r>max)
            {
                max=r;
            }
            q=q/10;
        }
        System.out.println(max);
    }
}