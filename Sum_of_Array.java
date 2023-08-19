import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,sum=0;
        n=sc.nextInt();
        int[] Array= new int[n];
        for(int i=0;i<n;i++)
        {
            Array[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=Array[i];
        }
        System.out.println(sum);
    }
}