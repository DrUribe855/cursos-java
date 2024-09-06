public class SentenciaSwitchCase {
    public static void main(String[] args) {

        int num = 3;

        switch (num){
            case 0:
                System.out.println("El num es 0");
                break;
            case 1:
                System.out.println("El num es 1");
                break;
            case 2:
                System.out.println("El num es 2");
                break;
            case 3:
                System.out.println("El num es 3");
                break;
            default:
                System.out.println("Numero o cáracter desconocido");
        }

        String nombre = "Yeison";

        switch (nombre){
            case "admin":
                System.out.println("Bienvenido admin");
                break;
            case "Yeison":
                System.out.println("Bienvenido Yeison");
            case "Pepe":
                System.out.println("Bienvenido Pepe");
            default:
                System.out.println("Usuario desconocido");
        }

    }
}
