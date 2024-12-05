import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int longitud = productos.length;

        productos[0] = "Kingstone Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro SSD Samsung externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta Oxford";

        System.out.println("=============== Usando while =====================");

        for (int i = 0; i < longitud; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        System.out.println("=============== Usando foreach ===================");

        for(String prod:productos){
            System.out.println("prod = " + prod);
        }

        System.out.println("============== Usando while ======================");
        int i = 0;
        while (i < longitud){
            System.out.println("Para indice " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("============== Usando do while ======================");
        int j = 0;
        do{
            System.out.println("Para indice " + j + " : " + productos[j]);
            j++;
        }while (j < longitud);


        int [] numeros = new int[4];
        int totalNumeros = numeros.length;

        for (int k = 0; k< totalNumeros; k++){
            System.out.println("k = " + k);
        }


    }
}
