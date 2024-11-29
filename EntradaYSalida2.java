import java.util.Scanner;

public class EntradaYSalida2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        
        System.out.println("Ingrese 3 numeros:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        double result = (num1 + num2 + num3) / 3;

        System.out.println("El resultado es: " + result);

        scanner.close();
    }
}
