import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args){
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three number: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if(a>b && a>c){
            System.out.println(a +" is a largest number.");
        }
        else if (b>a && b>c) {
            System.out.println(b +" is a largest number.");
        }
        else
            System.out.println(c +" is a largest number.");
    }
}
