import java.util.Scanner;
public class Vowel
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char c;
        c=sc.next().charAt(0);
        if(c=='A' || c=='a' || c=='E' || c=='e' || c=='I' || c=='i' || c=='O' || c=='o' || c=='U' || c=='u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}