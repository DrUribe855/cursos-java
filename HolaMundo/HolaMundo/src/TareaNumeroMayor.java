import java.util.Scanner;

public class TareaNumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número");
        int num2 = scanner.nextInt();

        String numeroMayor = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;

        System.out.println("El resultado es: " + numeroMayor);
    }
}
