public class Intercambio_de_valores {

    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        intercambiar(a, b);

        System.out.println("numero a: " + a + " numero b: " + b);

        
    }

    public static void intercambiar(int a, int b) {
        int c = a;
        a = b;
        b = c;
       
        System.out.println("numero a: " + a + " numero b: " + b );
        
    } 

    
}