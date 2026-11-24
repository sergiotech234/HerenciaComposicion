public class Main {
    public static void main(String[] args) {
        /*
        1. Gato y Animal. Herencia
        2. Biblioteca y Libro. Composicion
        3. Gerente y Empleado. Herencia
        4. Bicicleta y Rueda. Composicion
        5. Estudiante y Asignatura. Composicion
*/
        System.out.println("=== BICICLETA ===");

        Rueda ruedaDelantera = new Rueda(26);
        Rueda ruedaTrasera = new Rueda(26);

        Bicicleta bicicleta = new Bicicleta(
                "Orbea",
                ruedaDelantera,
                ruedaTrasera
        );

        bicicleta.mostrarInformacion();


        // CREACIÓN DE LA BIBLIOTECA

        System.out.println("\n=== BIBLIOTECA ===");

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        biblioteca.agregarLibro(new Libro("Don Quijote"));
        biblioteca.agregarLibro(new Libro("El principito"));
        biblioteca.agregarLibro(new Libro("Cien años de soledad"));
        biblioteca.agregarLibro(new Libro("La sombra del viento"));
        biblioteca.agregarLibro(new Libro("1984"));

        // Intentamos añadir un sexto libro

        boolean resultado = biblioteca.agregarLibro(
                new Libro("El Hobbit")
        );

        if (resultado) {
            System.out.println("Libro añadido correctamente.");
        } else {
            System.out.println("No se puede añadir el libro. Biblioteca llena.");
        }

        // Mostramos todos los libros

        biblioteca.mostrarLibros();
    }
}
