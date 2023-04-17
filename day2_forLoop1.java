import java.util.Scanner;
public class day2_forLoop1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum + i;

        }
        System.out.println("The Sum is = " + sum );
    }
}
