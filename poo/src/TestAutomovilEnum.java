import java.util.Date;

public class TestAutomovilEnum {
    public static void main(String[] args) {

        Automovil subaru =  new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.GASOLINA));
        subaru.setColor(Colores.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-50", Colores.ROJO,new Motor(3.0,TipoMotor.DIESEL));
        mazda.setMotor(new Motor(3.0,TipoMotor.DIESEL));
        mazda.setColor(Colores.ROJO);
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());
        
        TipoAutomovil tipoSubaru  = subaru.getTipo();
        System.out.println("tipoSubaru.getNombre() = " + tipoSubaru.getNombre());
        System.out.println("tipoSubaru.getDescripcion() = " + tipoSubaru.getDescripcion());


        switch (tipoSubaru){
            case CONVERTIBLE -> System.out.println("una descripción-0");
            case PICKUP -> System.out.println("una descripción-1");
            case STATION_WAGON -> System.out.println("una descripción-2");
            case SEDAN -> System.out.println("una descripción-3");
            case HATCHBACK -> System.out.println("una descripción-4");
            case FURGON -> System.out.println("una descripción-5");
            case COUPE -> System.out.println("una descripción-6");

        }

        TipoAutomovil[] tipo = TipoAutomovil.values();//devuelve un arreglo
        for (TipoAutomovil ts :tipo){
            System.out.println("ts = " + ts);
    }




    }


}
