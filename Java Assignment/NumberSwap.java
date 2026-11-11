import java.util.Scanner;
public class NumberSwap {
    public static void main(String[] args){
        int a,b,temp;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Two Number: ");
        a=input.nextInt();
        b=input.nextInt();
        temp = a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
