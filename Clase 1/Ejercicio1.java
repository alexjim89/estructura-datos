import java.util.Locale;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String arg[]){
        Scanner in = new Scanner (System.in).useLocale(Locale.US);
        String nombre = "";
        System.out.println("Elija 1: para suma, 2: para resta, 3: para multiplicacion y 4: para divicion");
        float operacion = 0, num1 = 0, num2 = 0, resultado = 0;
        System.out.println("Digita tu nombre");
        nombre = in.nextLine();
        System.out.println("Escoge tu operacion con los numeros del 1 al 4");
        operacion = in.nextInt();
        if(operacion == 1){
            System.out.println("Digita el primer numero");
            num1 = in.nextFloat();
            System.out.println("Digita el segundo numero");
            num2 = in.nextFloat();
            resultado = num1 + num2;
            System.out.println("Hola " + nombre + " el resultado de su suma es: " + resultado);
        } else if(operacion == 2){
            System.out.println("Digita el primer numero");
            num1 = in.nextFloat();
            System.out.println("Digita el segundo numero");
            num2 = in.nextFloat();
            resultado = num1 - num2;
            System.out.println("Hola " + nombre + " el resultado de su resta es: " + resultado);
        } else if(operacion == 3){
            System.out.println("Digita el primer numero");
            num1 = in.nextInt();
            System.out.println("Digita el segundo numero");
            num2 = in.nextInt();
            resultado = num1 * num2;
            System.out.println("Hola " + nombre + " el resultado de su multiplicacion es: " + resultado);
        } else if(operacion == 4){
            System.out.println("Digita el primer numero");
            num1 = in.nextInt();
            System.out.println("Digita el segundo numero");
            num2 = in.nextInt();
            resultado = num1 / num2;
            System.out.println("Hola " + nombre + " el resultado de su divicion es: " + resultado);
        } else {
            System.out.println("La opcion seleccionada no existe");
        }
    }
}
