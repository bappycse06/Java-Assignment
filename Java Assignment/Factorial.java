import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
    long i,n,fact=1;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    n = input.nextLong();
    for(i=1;i<=n;i++){
        fact*=i;
    }
    System.out.println("Factorial: " + fact );
  }
}
