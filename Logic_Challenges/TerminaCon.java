package Logic_Challenges;

public class TerminaCon {
    public static boolean terminaCon(String str, String ending) {
        return str.endsWith(ending);
    }

    public static boolean terminaConManual(String str, String ending) {
        if (ending.isEmpty()) {
            return false;
        }
        if (ending.length() > str.length()) {
            return false;
        }
        
        return str.substring(str.length() - ending.length()).equals(ending);
    }

    public static void main(String[] args) {
        System.out.println(terminaCon("abc", "bc"));
        System.out.println(terminaCon("abc", "d"));
        
        System.out.println(terminaConManual("abc", "bc"));
        System.out.println(terminaConManual("abc", "d"));
    }
}
