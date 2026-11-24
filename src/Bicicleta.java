public class Bicicleta {
    private String marca;
    private Rueda delantera;
    private Rueda trasera;

    public Bicicleta(String marca, Rueda delantera, Rueda trasera) {
        this.marca = marca;
        this.delantera = delantera;
        this.trasera = trasera;
    }

    public void mostrarInformacion(){
        System.out.println("Marca: " + marca);

        System.out.println("Rueda delantera:");
        delantera.mostrarInformacion();

        System.out.println("Rueda trasera:");
        trasera.mostrarInformacion();
    }
}
