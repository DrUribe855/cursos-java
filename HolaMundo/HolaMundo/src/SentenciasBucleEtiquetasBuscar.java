public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "tres tristes tigres tragan trigo en un trigal";
        String palabra = "trigo";

        int maxFrase = frase.length();
        int maxPalabra = palabra.length();

        int cantidad = 0;
        buscar:
        for (int i = 0; i < maxFrase; i++){
            for (int j = 0; j < maxPalabra; j++){
                if(frase.charAt(i) != palabra.charAt(j)){
                    continue buscar;
                }
            }
            cantidad++;
        }

        System.out.println("Encontrado = " + cantidad + " veces el caracter 't' en la frase");

    }
}