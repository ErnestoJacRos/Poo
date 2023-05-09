public enum Colores {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    GRIS("Gris"),
    BLANCO("Blanco"),
    NARANJA("Naranja");

    private final String color;

    Colores(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
