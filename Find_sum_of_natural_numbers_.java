import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        //int m = (n*(n+1))/2;
        //System.out.println(m);
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}