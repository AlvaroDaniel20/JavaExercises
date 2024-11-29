class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

public class ReasignacionDeReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 25);

        System.out.println("Antes de reasignar:");
        persona1.mostrarInfo();

        reasignarReferencia(persona1);

        System.out.println("Después de reasignar:");
        persona1.mostrarInfo();
    }

    public static void reasignarReferencia(Persona persona) {
        persona = new Persona("Carlos", 30);
    }
}
