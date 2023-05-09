public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Colores color  = Colores.GRIS;
    private Motor motor;
    private Tanque tanque;
    private Persona conductor;
    private Rueda[] ruedas;

    private TipoAutomovil tipo;

    private static Colores colorPatente = Colores.NARANJA;
    private static int capacidadTanqueEstatico = 30;
    private static int ultimoId;
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final Integer VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris";
    public Automovil(){
        id = ++ultimoId;
    }
    public Automovil(String fabricante){
        this();
        this.fabricante = fabricante;
    }

    public Automovil(String fabricante, String modelo){
        this(fabricante);
        this.modelo = modelo;
    }

    public Automovil(String fabricante,String modelo, Colores color){
        this(fabricante,modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Colores color, Motor motor){
        this(fabricante,modelo,color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Colores color, Motor motor, Tanque tanque){
        this(fabricante, modelo, color, motor);
        this.tanque = tanque;
    }

    public Automovil(String fabricante, String modelo, Colores color, Motor motor, Tanque tanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante,modelo,color,motor,tanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Colores getColor() {
        return this.color;
    }

    public void setColor(Colores color) {

        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tanque getTanque() {
        if (tanque == null){
            this.tanque = new Tanque();
        }
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public TipoAutomovil getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public static void setColorPatente(Colores colorPatente){
        Automovil.colorPatente = colorPatente;
    }
    public static Colores getColorPatente(){
        return Automovil.colorPatente;
    }

    public static int getCapacidadTanqueEstatico(){
        return Automovil.capacidadTanqueEstatico;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico){
        Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }

    public String verDetalle(){

        return  "auto.id = "+ this.id +
                "\nauto.fabricante = " + this.getFabricante() +
                "\nauto.modelo = " + this.getModelo() +
                "\nauto.tipo = " + this.getTipo() +
                "\nauto.color = " + this.getColor()+
                 "\nauto.colorPatente = "+ Automovil.getColorPatente()+
                "\nauto.cilindrada = " + this.motor.getCilindrada();
    }

    public String acelerar (int rpm){
        return ("el auto " + this.fabricante + " Acelerando a " + rpm + "rpm");
    }
    public String frenar(){
        return  this.fabricante + " " + this.modelo +  " frenando";
    }

    public String acelerarFrenar(int rpm){
        return this.acelerar(rpm) + "\n" + this.frenar();
    }

    public float calcularConsumo(int kms, float porcentajeGasolina){
        return kms/(this.getTanque().getCapacidad()*porcentajeGasolina);

    }

    public float calcularConsumo(int kms, int porcentajeGasolina){
        return kms/(this.getTanque().getCapacidad()*(porcentajeGasolina/100f));

    }

    public static float calcularConsumoEstatico(int kms, int porcentajeGasolina){
        return kms/(Automovil.capacidadTanqueEstatico*(porcentajeGasolina/100f));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (!(obj instanceof Automovil)){
            return false;
        }

       Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()) );
    }

    @Override
    public String toString() {
        return "\nid = " + this.id +
                "\nfabricante ='" + this.fabricante + '\'' +
                ",\n modelo='" + this.modelo + '\'' +
                "\n tipo = " +this.getTipo()+
                ",\n color='" + this.color+ '\'' +
               ",\n cilindrada=" + this.getMotor().getCilindrada()+
                ",\n capacidadTanque=" + this.tanque.getCapacidad()+
                '}';
    }
}
