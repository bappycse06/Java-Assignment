
import java.util.Scanner;

public class ShiftOp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter shift position: ");
        int position = sc.nextInt();

        int left = num << position;
        int right = num >> position;

        System.out.println("Left Shift = " + left);
        System.out.println("Right Shift = " + right);

        sc.close();
    }
}
