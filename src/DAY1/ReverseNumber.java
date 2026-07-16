package DAY1;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3 digit number: ");
        int num = sc.nextInt();

        int last = num % 10;
        int middle = (num / 10) % 10;
        int first = num / 100;

        int reversed = (last * 100) + (middle * 10) + first;
        System.out.println("Reversed number = " + reversed);
    }
}