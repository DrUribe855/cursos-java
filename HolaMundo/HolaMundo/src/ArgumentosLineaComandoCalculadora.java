public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("Por favor ingresar una operación (suma, resta, div o multi) y dos números");
            System.exit(-1);
        }
        String operacion = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado = 0;

        switch(operacion){
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a-b;
                break;
            case "multiplicacion":
                resultado = a * b;
                break;
            case "division":
                if(b == 0){
                    System.out.println("No se puede dividir por cero");
                    System.exit(-1);
                }
                resultado = (double)a / b;
                break;
            default:
                resultado = a + b;
        }

        System.out.println("Resultado de la operación " + operacion + " es: " + resultado);
    }
}
