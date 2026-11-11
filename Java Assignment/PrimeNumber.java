import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        int n,i,flag=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");  
        n = input.nextInt();
        for(i=2;i<=n/2;i++){
            if (n%i==0) {
                flag=1;
                break;
            }
        }
        if (flag==0) {
            System.out.println("Prime Number");
        }
        else
        System.out.println(" Not Prime Number");    
    }
}
