import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        String variable = 7 == 7 ? "si es verdadero": "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 6.2;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la nota de matematicas entre 1.0 - 5.0: ");
        matematicas = s.nextDouble();

        System.out.println("Ingrese la nota de ciencias entre 1.0 - 5.0: ");
        ciencias = s.nextDouble();

        System.out.println("Ingrese la nota de historia entre 1.0 - 5.0: ");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 3.0 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);

        /* if(promedio >= 5.49){
            estado = "Aprobado";
        }else{
            estado = "Rechazado";
        } */
    }
}
