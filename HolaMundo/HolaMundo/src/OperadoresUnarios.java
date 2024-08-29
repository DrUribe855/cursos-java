public class OperadoresUnarios {
    public static void main(String[] args) {
        int i = -5;

        int j = +i; // j =  (i)*i => -5;
        System.out.println("j = " + j);

        int k = -i; // k = (-1)*i => 5;
        System.out.println("k = " + k);

        i = 6;
        j = +1;
        System.out.println("j = " + j);

        k = -1;
        System.out.println("k = " + k);
    }
}
