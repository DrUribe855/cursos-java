import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    public static void main(String[] args) {

        // String[] productos = new String[7];
        String[] productos = { "Kingstone Pendrive 64GB", "Samsung Galaxy", "Disco duro SSD Samsung externo",
                                "Asus Notebook", "Macbook Air", "Chromecast 4ta generacion", "Bicicleta Oxford"
                            };
        int longitud = productos.length;

        Arrays.sort(productos);
        System.out.println("=============== Usando for =====================");

        for (int i = 0; i < longitud; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        Collections.reverse(Arrays.asList(productos));

        for(int i = 0; i < longitud / 2; i++){
            String actual = productos[i];
            String inverso = productos[longitud-1-i];
            productos[i] = inverso;
            productos[longitud-1-i] = actual;
        }

    }
}
