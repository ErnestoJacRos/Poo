public enum TipoAutomovil {
    SEDAN("Sedan", "Auto mediano", 4),
    STATION_WAGON("Station Wagon","Auto grande",4),
    HATCHBACK("Hatchback", "Auto compacto", 4),
    PICKUP("Pickup",  "Camioneta", 2),
    COUPE("Coupé", "Auto pequeño", 2),
    CONVERTIBLE("Convertible", "Auto pequeño", 2),
    FURGON("Furgón", "Auto utilitario", 4);

    private final String nombre;
    private final String descripcion;
    private final int numeroPuertas;

    TipoAutomovil(String nombre, String descripcion,  int nummeroPuertas){

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuertas = nummeroPuertas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public String toString() {
        return "nombre = '" + nombre + '\'' +
                ", descripción = '" + descripcion + '\'' +
                ", numeroPuertas = '" + numeroPuertas + '\'';
    }
}
