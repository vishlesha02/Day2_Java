import java.util.Scanner;
public class day2_forloop3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");

        int num = sc.nextInt();
        int temp = num;

        int rem = 0;
        int rev = 0;
        for (int i = 1; i <= temp; i++) {
            while (temp != 0)
            {
                rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;

        }
        System.out.println("Reverse : " + rev);

        if (num == rev) {
            System.out.println("It is a palindrome number");
        } else {
            System.out.println("It is not a palindrome number");
        }}
    }

    }

