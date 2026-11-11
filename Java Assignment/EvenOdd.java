import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = input.nextInt();
        if (n == 0) {
        System.out.println("Zero");
        }
        else if (n%2 == 0) {
        System.out.println("Even");
        }
        else
            System.out.println("Odd");

    }
}
