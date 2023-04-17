import java.util.Scanner;
public class day2_forloop2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();

        int rev=0;
        int rem;
        for(int i=1;i<=n;i++)
        {
            rem=n%10;
            rev=(rev*10) + rem;
            n=n/10;
        }
        System.out.println("The Reverse number = " + rev );
    }
}
