import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
      int i,n,temp,rem,sum = 0,fact;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter elements: ");
      n = input.nextInt();
      temp = n;
      while (temp != 0) {
        rem = temp % 10;
        fact=1;
        for(i=1;i<=rem;i++){
            fact*=i;
        }
        sum = sum + fact;
        temp /=10;
      }  
      if (sum == n) {
        System.out.println(n + " is a strong number");
      }
      else
       System.out.println(n+ " is  not a strong number");

    }
}
