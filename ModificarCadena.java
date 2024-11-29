public class ModificarCadena {
    public static void main(String[] args) {
        String texto = "Hola Mundo";
        
        System.out.println("Antes de modificar: " + texto);
        
        modificarCadena(texto);
        
        System.out.println("Después de modificar (sin asignar valor), texto = " + texto);
    }

    public static void modificarCadena(String texto) {
        texto = texto + " - Modificado";
        System.out.println("Dentro del método, texto modificado: " + texto);
    }
}
