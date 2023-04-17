import java.util.Scanner;

public class day2_ifelse2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number to get the units, tens, hundres.....");
        int num=sc.nextInt();
        if(num==1)
        {
            System.out.println("Unit");
        }
        else if (num==10)
        {
            System.out.println("Tens");
        }
        else if (num==100)
        {
            System.out.println("Hundreds");
        }
        else if (num==1000)
        {
            System.out.println("Thousands");
        }
        else if (num==10000)
        {
            System.out.println("Ten Thousands");
        }

        else {
            System.out.println("You Entered invalid Number");
        }
    }
}

