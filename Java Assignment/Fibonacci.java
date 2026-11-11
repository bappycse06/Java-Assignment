import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int n,a=0,b=1,c,i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        n = input.nextInt();
        System.out.println("fibonacci series: "+n);
        for(i=1;i<=n;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
