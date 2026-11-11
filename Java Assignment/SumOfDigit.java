import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        int n,temp,rem,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = input.nextInt();
        temp=n;
        while (temp!=0) {
            rem=temp %10;
            sum = sum + rem;
            temp = temp / 10;
        }
        System.out.println("Sum: "+sum);
    }
}
