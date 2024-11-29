package Logic_Challenges;

public class ValidarParentesis {
    public static boolean esValido(String str) {
        int contador = 0;
  
        for (char c : str.toCharArray()) {
            if (c == '(') {
                contador++;
            } else if (c == ')') {
                contador--;
            }
            
            if (contador < 0) {
                return false;
            }
        }
        
        return contador == 0;
    }

    public static void main(String[] args) {
        System.out.println(esValido("()"));
        System.out.println(esValido(")(()))"));
        System.out.println(esValido("("));
        System.out.println(esValido("(())((()())())"));
    }
}
