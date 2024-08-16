import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        // String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try{
            numeroDecimal = scanner.nextInt();
        }catch(InputMismatchException e){
            System.out.println("ERROR: Debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        String resultadoBinario = "numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        int numeroBinario = 0b111110100;


        String resultadoOctal = "numero octal de = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        int numeroOctal = 0764;

        String resultadoHex = "numero hexadecimal de = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        int numeroHex = 0x1f4;


        String mensaje = resultadoBinario;
        mensaje += " \n " + resultadoOctal;
        mensaje += " \n " + resultadoHex;

        System.out.println(mensaje);

    }
}
