import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] intArray = new int[n];
        for(int i=0;i<n;i++)
        {
            intArray[i] = sc.nextInt();
        }
        int sum=0;
        for(int eachElement: intArray)
        {
            sum +=eachElement;
        }
        System.out.printf("%d",sum);
    }
}