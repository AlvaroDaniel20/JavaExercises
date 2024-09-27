import java.util.Scanner;

public class EntradaYsalida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String name = sc.next();

        System.out.println("Ingrese su edad: ");
        int age = sc.nextInt();
        
        System.out.println("Ingrese su altura en cm: ");
        double size = sc.nextInt();

        System.out.print("Tu nombre es: " + name + " tienes: " + age + " años y mides: " + size + "centimetros");
    }
}
