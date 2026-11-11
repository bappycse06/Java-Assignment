import java.util.Scanner; 
public class CelciusToFarenheit {
    public static void main(String[] args) {
        double celsius,fahrenheit;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter celsius: ");
        celsius = input.nextDouble();
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
    }


}
