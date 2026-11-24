public class Rueda {
    private double diametro;

    public Rueda(double diametro){
        if(diametro<=0){
            throw new IllegalArgumentException("El diámetro debe ser mayor que cero");
        }
        this.diametro=diametro;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    public void mostrarInformacion() {
        System.out.println("Diámetro: " + diametro);
    }
}
