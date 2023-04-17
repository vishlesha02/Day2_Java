import java.util.Scanner;

public class day2_switch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Letter");
        String letter=sc.nextLine();

        switch(letter)
        {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(letter + " is a Vowel");
                break;

            default:
                System.out.println(letter + " is a Constant");
        }
    }
}
