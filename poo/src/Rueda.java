public class Rueda {
    private String fabricante;
    private int aro;
    private double ancho;

    public Rueda(String fabricante, int aro, double ancho) {
        this.fabricante = fabricante;
        this.aro = aro;
        this.ancho = ancho;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public int getAro() {
        return this.aro;
    }

    public double getAncho() {
        return this.ancho;
    }

    @Override
    public String toString() {
        return
                "fabricante='" + fabricante + '\'' +
                ", aro = " + aro +
                ", ancho = " + ancho;
    }
}
