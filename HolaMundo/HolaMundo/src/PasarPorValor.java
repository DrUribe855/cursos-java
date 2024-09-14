public class PasarPorValor {
    public static void main(String[] args) {

        int i = 10;

        System.out.println("Iniciamos el método main con i = " + i);
        test(i);
        System.out.println("Finaliza el método main con el valor de i00 = ");
    }

    public static void test(int parameter){
        System.out.println("Iniciamos el método test con parameter " + parameter);
    }
}
