import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese dos numero: ");
        int number1 = reader.nextInt();
        int number2 = reader.nextInt();
        
        float addition = number1 + number2;
        System.out.println("El resultado de la suma es: " + addition);
        
        float sustraction = number1 - number2;
        System.out.println("El resultado de la resta es: " + sustraction);
        
        float multiplication = number1 * number2;
        System.out.println("El resultado de la multiplicación es: " + multiplication);
        
        float division = number1 / number2;
        System.out.println("El resultado de la división es: " + division);
        
        float module = number1 & number2;
        System.out.println("El resultado del module es: " + module);
    }
}