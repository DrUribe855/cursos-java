import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        // String[] productos = new String[7];
        String[] productos = { "Kingstone Pendrive 64GB", "Samsung Galaxy", "Disco duro SSD Samsung externo",
                                "Asus Notebook", "Macbook Air", "Chromecast 4ta generacion", "Bicicleta Oxford"
                            };
        int longitud = productos.length;

        /* productos[0] = "Kingstone Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro SSD Samsung externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta Oxford";

         */

        Arrays.sort(productos);

        System.out.println("=============== Usando for =====================");

        for (int i = 0; i < longitud; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        System.out.println("=============== Usando for inverso =====================");

        for (int i = 0; i < longitud; i++){
            System.out.println("para i = " + (longitud-1-i) + " valor: " + productos[longitud-1-i]);
        }

        System.out.println("=============== Usando for inverso 2 =====================");

        for (int i = longitud - 1; i >= longitud; i--){
            System.out.println("para i = " + i + " valor: " + productos[i]);
        }

    }
}
