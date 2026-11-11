import java.util.Scanner;
public class SeriesSum {
    public static void main(String[] args) {
        double sum=1;
        int i,n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter last value: ");
        n = input.nextInt();
        for(i=2;i<=n;i++){
            sum=sum+i/Math.pow(2, i);
        }
        System.out.println("Sum: "+sum);
    }
}