import java.util.Scanner;
public class day2_Operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a");
        int a=sc.nextInt();

        System.out.println("Enter b");
        int b=sc.nextInt();

        System.out.println("Enter c");
        int c=sc.nextInt();

        int sum1=a+b*c;
        System.out.println("Sum of a+b*c = " + sum1);

        int sum2=c+a/b;
        System.out.println("Sum of c+a/b = " + sum2);

        int sum3=a%b+c;
        System.out.println("Sum of a%b+c = " + sum3);

        int sum4=a*b+c;
        System.out.println("Sum of a*b+c = " + sum4);

        if((sum1 > sum2) && (sum1 > sum3) && (sum1 > sum4))
        {
            System.out.println("a+b*c  has the max value = " + sum1);
        }

        else if((sum2 > sum1) && (sum2 > sum3) && (sum2 > sum4))
        {
            System.out.println("c+a/b   has the max value = " + sum2);
        }

        else if((sum3 > sum1) && (sum3 > sum2) && (sum3 > sum4))
        {
            System.out.println("a%b+c has the max value = " + sum3);
        }

        else if((sum4 > sum1) && (sum4 > sum2) && (sum4 > sum3))
        {
            System.out.println("a*b+c has the max value = " + sum4);
        }


// MIN VALUE
        if((sum1 < sum2) && (sum1 < sum3) && (sum1 < sum4))
        {
            System.out.println("a+b*c has the min value = " + sum1);
        }

        else if((sum2 < sum1) && (sum2 < sum3) && (sum2 < sum4))
        {
            System.out.println("c+a/b has the min value = " + sum2);
        }

        else if((sum3 < sum1) && (sum3 < sum2) && (sum3 < sum4))
        {
            System.out.println("a%b+c has the min value = " + sum3);
        }

        else if((sum4 < sum1) && (sum4 < sum2) && (sum4 < sum3))
        {
            System.out.println("a*b+c has the min value = " + sum4);
        }


    }
}
