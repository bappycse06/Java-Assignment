import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double a,b;
        char op;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First number: ");
        a = input.nextDouble();
        System.out.println("Enter operator(+,-,*,/): ");
        op = input.next().charAt(0);
        System.out.println("Enter second number: ");
        b = input.nextDouble();
        switch (op) {
            case '+':
                System.out.println("Result = " + (a+b));
                break;
               case '-':
                System.out.println("Result = " + (a-b));
                break; 
                 case '*':
                System.out.println("Result = " + (a*b));
                break; 
                 case '/':
                     if(b!=0){ 
                System.out.println("Result = " + (a/b));
                     }
                     else
                        System.out.println("The divission by zero is not possible");
                break;
        
            default:
                System.out.println("Invalid operator!");

                break;
        }
    }
}
