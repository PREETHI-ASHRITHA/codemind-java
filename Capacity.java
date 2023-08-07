import java.util.Scanner;
public class Capacity
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T,S,B,C;
        T=sc.nextInt();
        S=sc.nextInt();
        B=sc.nextInt();
        C=(2*T*B*S*512)/1024;
        System.out.println(C+" KB");
    }
}