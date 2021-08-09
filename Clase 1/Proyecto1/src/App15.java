package src;
import java.util.Scanner;
public class App15 {
    public static void main(String[] args){
        String cadenaoriginal = "", cadenasecundaria = "";
        int numcarac = 0, desde = 0, hasta = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa cadena de caracteres: ");
        cadenaoriginal = sc.nextLine();
        numcarac = cadenaoriginal.length();
        System.out.println("la cadena de caracteres " + cadenaoriginal + " posee " + numcarac + " caracteres.");
        System.out.print("Desde que caracter deseas obtener la nueva cadena: ");
        desde = sc.nextInt();
        System.out.print("Hasta que caracter deseas obtener la nueva cadena: ");
        hasta = sc.nextInt();
        cadenasecundaria = cadenaoriginal.substring(desde, hasta);
        System.out.println("la nueva cadena es " + cadenasecundaria);
        sc.close();
    }
}