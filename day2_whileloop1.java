import java.util.Scanner;
public class day2_whileloop1 {
    public static void main(String[] args) {
        int i=1;
        int sum=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n Number");
        int n=sc.nextInt();

        while(i<=n) {
            sum = sum + i;
            i++;
        }
        System.out.println("sum of n numbers is = " + sum);
    }
}
