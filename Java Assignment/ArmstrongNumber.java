import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n,temp,rem,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = input.nextInt();
        temp = n;
        while (temp != 0) {
            rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        }
        if (sum == n) {
           System.out.println("Armstrong Number");
        }
        else
         System.out.println("Not Armstrong Number");
    }
}
