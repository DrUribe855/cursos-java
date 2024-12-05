import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil("Subaru","Impresa");
        Date fecha = new Date();
        System.out.println(subaru.equals(fecha));

        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");

        Automovil mazda = new Automovil("Mazda","BT-50", "Rojo", 3.0);


        Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 150);
        Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 150);
        System.out.println("Son iguales? " + (nissan == nissan2));
        System.out.println("Son iguales con equals ? " + (nissan.equals(nissan2)));

        System.out.println(mazda.getFabricante());

        System.out.println("\n" + subaru.detalle());
        System.out.println("\n" + mazda.detalle());
        System.out.println("\n" + nissan.detalle());
        System.out.println("\n" + mazda.acelerar(3000));
        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilometros por litro: " + mazda.calcularConsumo(300, 0.6f));
        System.out.println("Kilometros por litro: " + mazda.calcularConsumo(300, 60));
        System.out.println("Kilometros por litro: " + nissan.calcularConsumo(300, 60));
    }
}
