public class ModificarValorporValor {
    
    public static void main(String[] args) {
        int x = 5;
        
        System.out.println("Antes de incrementar, x = " + x);
        
        incrementar(x);
        
        System.out.println("Después de intentar incrementar (sin asignar un valor), x = " + x);
        
        x = incrementar(x);
        
        System.out.println("Después de incrementar (con asignación), x = " + x);
    }

    public static int incrementar(int x) {
        x += 1;
        return x;
    }
}
