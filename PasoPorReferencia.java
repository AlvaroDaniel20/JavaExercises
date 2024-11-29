class Persona {
    String nombre;
    int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    public void cambiarDatos(String nuevoNombre, int nuevaEdad) {
        this.nombre = nuevoNombre;
        this.edad = nuevaEdad;
    }
}

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 25);

        System.out.println("Antes de modificar:");
        persona.mostrarInfo();

        cambiarDatosPersona(persona);

        System.out.println("Después de modificar:");
        persona.mostrarInfo();
    }

    public static void cambiarDatosPersona(Persona persona) {
        persona.cambiarDatos("Carlos", 30);
    }
}
