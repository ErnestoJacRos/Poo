import java.util.Date;

public class TestAutomovilStatic {
    public static void main(String[] args) {

        Date fecha = new Date();

        Automovil subaru =  new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.GASOLINA));
        subaru.setColor(Colores.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-50", Colores.ROJO);
        mazda.setMotor(new Motor(3.0,TipoMotor.DIESEL));
        mazda.setColor(Colores.ROJO);
        mazda.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan = new Automovil("Nissan", "Navara",
                Colores.GRIS, new Motor(3.0,TipoMotor.DIESEL),new Tanque());
        nissan.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan2 = new Automovil("Nissan", "Navara",
                Colores.GRIS, new Motor(3.5,TipoMotor.DIESEL),new Tanque());
        nissan2.setTipo(TipoAutomovil.PICKUP);
        Automovil auto = new Automovil();

        Automovil.setColorPatente(Colores.AZUL);
        Automovil.setCapacidadTanqueEstatico(50);

        newTopic(subaru);
        System.out.println(subaru.verDetalle());
        System.out.println("Consumo: " + Automovil.calcularConsumoEstatico(300,75));
        newTopic(mazda);
        System.out.println(mazda.verDetalle());
        newTopic(nissan);
        System.out.println(nissan.verDetalle());
        newTopic(auto) ;

        System.out.println( "Consumo_Estatico: "+Automovil.calcularConsumoEstatico(300,98));
        System.out.println("Velocidad Max Carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA + " Kms/Hr");
        System.out.println("Velocidad Max Ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD + " Kms/Hr");
        auto.setMotor(new Motor(2.0,TipoMotor.GASOLINA));
        auto.setTanque(new Tanque());
        System.out.println(auto);

    }

    public static void newTopic(Automovil auto){


        System.out.println("========================= " + auto.getFabricante() + " ===========================" );
    }
}
