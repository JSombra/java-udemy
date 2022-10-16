package modulo11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataJava8 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 10:40:25");
        
        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());

        System.out.println("y1: " + sdf2.format(y1));
        System.out.println("y2: " + sdf2.format(y2));
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
    }
}
