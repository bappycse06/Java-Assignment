import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        int n,i,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        n=input.nextInt();
        for(i=1;i<=n/2;i++){
            if (n%i==0) {
                sum+=i;
            }
        }
           if(sum==n){
            System.out.println("perfect number: ");
            }
            else
            System.out.println("Not perfect number");
    }
}