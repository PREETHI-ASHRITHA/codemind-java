import java.util.Scanner;
public class Weight
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x,y,z,a;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        a=3*x-(y+z);
        System.out.println(a);
    }
}