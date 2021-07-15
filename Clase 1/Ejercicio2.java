import java.util.Locale;
import java.util.Scanner;
public class Ejercicio2 {
     
         public static void main(String arg[]){
        Scanner sc = new Scanner (System.in).useLocale(Locale.US);
        String nombre = "";
        System.out.println("Digita nombre del alumno");
        nombre = sc.nextLine();
        System.out.println("Digita resultado de matematicas");
        float matematicas = sc.nextFloat();
        System.out.println("Digita resultado de ingles");
        float ingles = sc.nextFloat();
        System.out.println("Digita resultado de sociales");
        Float sociales = sc.nextFloat();
        float promedio = (matematicas + ingles + sociales) / 3;
        
        if (promedio >= 3.0){
            System.out.println("El alumno " + nombre + " aprobo con promedio de: " + promedio);
        } else {
            System.out.println("El alumno " + nombre + " reprobo con promedio de: " + promedio);
        }
          }
}