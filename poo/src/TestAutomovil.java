import java.util.Date;

public class TestAutomovil {
    public static void main(String[] args) {

        Date fecha = new Date();
        Motor motorSubaru = new Motor(2.0,TipoMotor.GASOLINA);
        Automovil subaru =  new Automovil("Subaru", "Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setTanque(new Tanque());
        subaru.setColor(Colores.GRIS);

        Motor motorMazda = new Motor(3.0,TipoMotor.DIESEL);
        Automovil mazda = new Automovil("Mazda", "BT-50", Colores.ROJO,motorMazda);
        mazda.setMotor(new Motor(3.0,TipoMotor.DIESEL));
        mazda.setColor(Colores.ROJO);


        Motor motorNissan = new Motor(3.5,TipoMotor.DIESEL);
        Automovil nissan = new Automovil("Nissan", "Navara",
                Colores.GRIS, motorNissan,new Tanque(50));

        Motor motorNissan2 = new Motor(3.5,TipoMotor.DIESEL);
        Automovil nissan2 = new Automovil("Nissan", "Navara",
                Colores.GRIS, motorNissan2,new Tanque(50));
        Automovil auto = new Automovil();
        System.out.println("Son iguales: " + (nissan == nissan2) );
        System.out.println("Son iguales con equals(): " + (nissan.equals(fecha)) );
        System.out.println("Son iguales: " + (auto == nissan2) );
        newTopic("Other Auto");
        System.out.println(subaru.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println("Kilómetros por litro: " + subaru.calcularConsumo(500,75) );
        newTopic("Other Auto");
        System.out.println(mazda.verDetalle());
        System.out.println(mazda.acelerarFrenar(4000));
        System.out.println("Kilómetros por litro: " + mazda.calcularConsumo(300,.75f) );
        newTopic("Other Auto");
        System.out.println(nissan.verDetalle());
        System.out.println("Kilómetros por litro: " + nissan.calcularConsumo(300,.75f) );
        newTopic("Other Auto");
        System.out.println("auto = " + auto);

    }

    public static void newTopic(String auto){
        System.out.println("=========================" + auto + "===========================" );
    }
}
