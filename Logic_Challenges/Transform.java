package Logic_Challenges;

import java.util.ArrayList;
import java.util.List;

public class Transform {
    public static class DatosEntrada {
        private String[] nombres;
        private int[] edades;

        public DatosEntrada(String[] nombres, int[] edades) {
            this.nombres = nombres;
            this.edades = edades;
        }
    }

    public static class DatosSalida {
        private String id;
        private String nombre;
        private int edad;

        public DatosSalida(String id, String nombre, int edad) {
            this.id = id;
            this.nombre = nombre;
            this.edad = edad;
        }

        @Override
        public String toString() {
            return "{ id: \"" + id + "\", nombre: \"" + nombre + "\", edad: " + edad + " }";
        }
    }

    public static List<DatosSalida> transformar(DatosEntrada datos) {
        List<DatosSalida> resultado = new ArrayList<>();
        
        if (datos.nombres.length != datos.edades.length) {
            throw new IllegalArgumentException("Los arrays de nombres y edades deben tener la misma longitud");
        }

        for (int i = 0; i < datos.nombres.length; i++) {
            resultado.add(new DatosSalida(
                String.valueOf(i + 1),
                datos.nombres[i],
                datos.edades[i]
            ));
        }

        return resultado;
    }

    public static void main(String[] args) {
        DatosEntrada datos = new DatosEntrada(
            new String[]{"Luis", "María"},
            new int[]{30, 25}
        );

        List<DatosSalida> salida = transformar(datos);
        
        System.out.println("[");
        for (int i = 0; i < salida.size(); i++) {
            System.out.print("  " + salida.get(i));
            if (i < salida.size() - 1) {
                System.out.println(",");
            } else {
                System.out.println();
            }
        }
        System.out.println("]");

        DatosEntrada datosVacios = new DatosEntrada(new String[]{}, new int[]{});
        List<DatosSalida> salidaVacia = transformar(datosVacios);
        System.out.println("\nDatos vacíos:");
        System.out.println(salidaVacia);

        DatosEntrada datosUnElemento = new DatosEntrada(
            new String[]{"Carlos"},
            new int[]{40}
        );
        List<DatosSalida> salidaUnElemento = transformar(datosUnElemento);
        System.out.println("\nUn solo elemento:");
        System.out.println(salidaUnElemento);
    }
}
