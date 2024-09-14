import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date fecha = format.parse("2020-01-05");
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();

            if(fecha.after(fecha2)){
                System.out.println("Fecha del usuario es después o mayor que la fecha2");
            }else if(fecha.before(fecha2)){
                System.out.println("Fecha es anterior que fecha2");
            }else if(fecha.equals(fecha2)){
                System.out.println("fecha es igual a fecha 2");
            }

            if(fecha.compareTo(fecha2) > 0){
                System.out.println("fecha1 (del usuario) es después que fecha2 (actual)");
            }else if(fecha.compareTo(fecha2) < 0){
                System.out.println("fecha es anterior que fecha2");
            }else if(fecha.compareTo(fecha2) == 0){
                System.out.println("fecha es igual a fecha2");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
