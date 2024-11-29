package Logic_Challenges;

import java.util.*;

public class ContinentesRepresent {

    // Clase interna para representar a los desarrolladores
    public static class Developer {
        String firstName;
        String lastName;
        String country;
        String continent;
        int age;
        String language;
        String greeting;

        public Developer(String firstName, String lastName, String country, String continent, int age, String language) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.country = country;
            this.continent = continent;
            this.age = age;
            this.language = language;
        }
    }

    // Función para verificar si al menos una persona de cada continente está representada
    public static boolean continentesRepresentados(List<Developer> developers) {
        Set<String> continentes = new HashSet<>();
        for (Developer dev : developers) {
            continentes.add(dev.continent);
        }
        // Verificamos que todos los continentes estén representados
        return continentes.containsAll(Arrays.asList("Africa", "Americas", "Asia", "Europe", "Oceania"));
    }

    // Función para contar cuántos desarrolladores de JavaScript vienen de Europa
    public static long contarJavaScriptEuropeos(List<Developer> developers) {
        return developers.stream()
                .filter(dev -> dev.language.equals("JavaScript") && dev.continent.equals("Europe"))
                .count();
    }

    // Función para agregar una propiedad 'greeting' a cada desarrollador
    public static List<Developer> agregarGreeting(List<Developer> developers) {
        for (Developer dev : developers) {
            String greeting = "Hi " + dev.firstName + ", what do you like the most about " + dev.language + "?";
            dev.greeting = greeting;
        }
        return developers;
    }

    // Función para obtener los lenguajes representados sin repetir
    public static Set<String> obtenerLenguajesRepresentados(List<Developer> developers) {
        Set<String> lenguajes = new HashSet<>();
        for (Developer dev : developers) {
            lenguajes.add(dev.language);
        }
        return lenguajes;
    }

    public static void main(String[] args) {
        List<Developer> developers = new ArrayList<>(Arrays.asList(
                new Developer("Fatima", "A.", "Algeria", "Africa", 25, "JavaScript"),
                new Developer("Agustín", "M.", "Chile", "Americas", 37, "C"),
                new Developer("Jing", "X.", "China", "Asia", 39, "Ruby"),
                new Developer("Laia", "P.", "Andorra", "Europe", 55, "Ruby"),
                new Developer("Oliver", "Q.", "Australia", "Oceania", 65, "PHP")
        ));

        // Test 1: Verificar si hay al menos una persona de cada continente
        System.out.println(continentesRepresentados(developers));  // true

        // Test 2: Contar cuántos desarrolladores de JavaScript vienen de Europa
        System.out.println(contarJavaScriptEuropeos(developers));  // 0

        // Test 3: Agregar 'greeting' a cada desarrollador
        List<Developer> developersConGreeting = agregarGreeting(developers);
        for (Developer dev : developersConGreeting) {
            System.out.println(dev.firstName + ": " + dev.greeting);
        }

        // Test 4: Obtener lenguajes representados sin repetir
        Set<String> lenguajesRepresentados = obtenerLenguajesRepresentados(developers);
        System.out.println(lenguajesRepresentados);  // [JavaScript, C, Ruby, PHP]
    }
}
