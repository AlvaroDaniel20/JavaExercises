import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese 3 numeros:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean result = (num1 > num2) && (num1 < num3);

        System.out.println("Es el primer numero mayor que el segundo pero menor que el tercero? " + result);

        scanner.close();
    }
}
