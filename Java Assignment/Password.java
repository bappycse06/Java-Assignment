import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int password;
        do {
            System.out.print("Enter password: ");
            password = input.nextInt();
            if (password != 1234) {
                System.out.println("Wrong Password! Try Again.");
            }
        } while (password != 1234);
        System.out.println("Login Successful!");
    }
}