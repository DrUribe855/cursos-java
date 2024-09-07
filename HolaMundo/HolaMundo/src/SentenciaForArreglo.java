import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String [] nombres = {"Andres", "Pepe", "María", "Paco", "Lalo", "Bea"};

        for (int i = 0; i <= nombres.length-1; i++){
            if(nombres[i].equalsIgnoreCase("Andres") ||
                    nombres[i].equalsIgnoreCase("Pepa")){
                continue;
            }
            System.out.println(i + " - " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < nombres.length; i++) {
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
            }
        }

        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar +" fue encontrado!" );
        }else{
            JOptionPane.showMessageDialog(null, buscar +" no existe en el sistema!" );
        }

    }
}
