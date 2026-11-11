import java.util.Scanner;
public class Decimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = input.nextInt();
        int binary = 0;
        int place = 1;
        while (num > 0) {
            int remainder = num % 2;
            binary = binary + remainder * place;
            num = num / 2;
            place = place * 10;
        }
        System.out.println("Binary = " + binary);
    }
}
