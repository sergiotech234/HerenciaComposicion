public class Biblioteca {

    private String nombre;
    private Libro[] libros;
    private int contador;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new Libro[5];
        this.contador = 0;
    }

    public boolean agregarLibro(Libro libro) {

        if (contador >= libros.length) {
            return false;
        }

        libros[contador] = libro;
        contador++;

        return true;
    }

    public void mostrarLibros() {

        System.out.println("Biblioteca: " + nombre);
        System.out.println("Libros disponibles:");

        for (int i = 0; i < contador; i++) {
            System.out.println("- " + libros[i].getTitulo());
        }
    }
}