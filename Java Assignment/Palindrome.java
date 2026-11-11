import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        int n,rev=0,temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        n = input.nextInt();
        temp=n;
        while (n>0) {
         rev = rev*10 + n%10;
         n=n/10;   
        }
        if (temp==rev) {
            System.out.println("palindrome ");
        }
        else
         System.out.println("Not palindrome ");
    }
}