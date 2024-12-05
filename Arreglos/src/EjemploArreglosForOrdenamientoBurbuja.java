import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForOrdenamientoBurbuja {
    public static void main(String[] args) {

        // String[] productos = new String[7];
        String[] productos = { "Kingstone Pendrive 64GB", "Samsung Galaxy", "Disco duro SSD Samsung externo",
                                "Asus Notebook", "Macbook Air", "Chromecast 4ta generacion", "Bicicleta Oxford"
                            };
        int longitud = productos.length;

        for(int i = 0; i < longitud; i++){


            for (int j = 0; j < longitud -1 -i; j++){
                if(productos[j+1].compareTo(productos[j]) < 0){
                    String auxiliar = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = auxiliar;
                }
            }
        }

        for (int i = 0; i < longitud; i++){
            System.out.println("Item = " + productos[i]);
        }

        int [] numeros = new int[4];
        int totalNumeros = numeros.length;

        numeros[0] = 10;
        numeros[1] = 7;
        numeros[2] = 35;
        numeros[3] = -1;

        for(int i = 0; i < totalNumeros; i++){
            for (int j = 0; j < totalNumeros -1 -i; j++){
                if(((Integer) numeros[j+1]).compareTo(numeros[j]) < 0){
                    int auxiliar = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = auxiliar;

                }
            }
        }
    }
}
