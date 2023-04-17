import java.util.Scanner;
public class day2_whileloop2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int rev=0;
        int rem;

        while(n>0)
        {
            rem=n%10;
            rev=(rev*10) + rem;
            n=n/10;
        }
        System.out.println("The reverse of Number is = " + rev);
    }}
