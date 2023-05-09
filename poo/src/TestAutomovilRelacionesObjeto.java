import java.util.Date;

public class TestAutomovilRelacionesObjeto {
    public static void main(String[] args) {


        Rueda[] ruedasSub = new Rueda[5];

        ruedasSub[0] = new Rueda("Yokohama",16,7.5);
        ruedasSub[1] = new Rueda("Yokohama",16,7.5);
        ruedasSub[2] = new Rueda("Yokohama",16,7.5);
        ruedasSub[3] = new Rueda("Yokohama",16,7.5);
        ruedasSub[4] = new Rueda("Yokohama",16,7.5);


        Persona conductorSubaru = new Persona("Lucy","Martínez");
        Automovil subaru =  new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.GASOLINA));
        subaru.setTanque(new Tanque());
        subaru.setColor(Colores.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        subaru.setRuedas(ruedasSub);


        Rueda[] ruedasMazda = { new Rueda("Michelin", 18,10.5),
                new Rueda("Michelin", 18,10.5),
                new Rueda("Michelin", 18,10.5),
                new Rueda("Michelin", 18,10.5),
                new Rueda("Michelin", 18,10.5)};
        Persona pato = new Persona("Pato", "Rodríguez");
        Automovil mazda = new Automovil("Mazda", "BT-50", Colores.ROJO,
                new Motor(3.0,TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setTanque(new Tanque());
        mazda.setConductor(pato);
        mazda.setRuedas(ruedasMazda);

        Rueda[] ruedasNissan = {new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5)};
        Persona bea = new Persona("Bea", "González");
        Automovil nissan = new Automovil("Nissan", "Navara",
                Colores.GRIS, new Motor(3.0,TipoMotor.DIESEL),new Tanque(50),bea,ruedasNissan);
        nissan.setTipo(TipoAutomovil.PICKUP);


        Rueda[] ruedasNissan2 = {new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5)};

        Persona lalo = new Persona("Lalo", "Mena");
        Automovil nissan2 = new Automovil("Nissan", "Navara",
                Colores.GRIS, new Motor(3.5,TipoMotor.DIESEL),new Tanque(50),lalo,ruedasNissan2);
        nissan2.setTipo(TipoAutomovil.PICKUP);

        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println("subaru.getConductor() = " + subaru.getConductor());
        for (Rueda r : subaru.getRuedas()){
            System.out.println("r = " + r);
        }



    }

}
