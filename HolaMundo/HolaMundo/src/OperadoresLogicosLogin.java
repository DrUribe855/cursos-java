import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String [] usernames = new String[3];
        String [] passwords = new String[3];
        usernames[0] = "yeison";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "pepe";
        passwords[2] = "12345";

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre de usuario");

        String usuario = entrada.next();

        System.out.println("Ingrese la contraseña");

        String pass = entrada.next();

        boolean isAuth = false;
        for (int i = 0; i < usernames.length; i++) {

            isAuth = (usernames[i].equals(usuario) && passwords[i].equals(pass)) ? true : isAuth;

            /* if(usernames[i].equals(usuario) && passwords[i].equals(pass)){
                isAuth = true;
                break;
            } */
        }

        if(isAuth){
            System.out.println("Bienvenido usuario".concat(usuario).concat("!"));
        }else{

            System.out.println("Nombre de usuario o contraseña incorrectos");

            System.out.println("ERROR: Se requiere autenticación.");
        }
    }
}
