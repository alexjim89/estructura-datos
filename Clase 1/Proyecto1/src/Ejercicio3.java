package Proyecto1.src;
import java.util.Scanner;
public class Ejercicio3 {
     
         public static void main(String arg[]) {
        Scanner sc = new Scanner (System.in);
        String nombre = "";
        System.out.println("Digita nombre del trabajador");
        nombre = sc.nextLine();
        System.out.println("Digita el numero de horas trabajadas este mes");
        int horas = sc.nextInt();
        int pago = (horas * 30000);
        System.out.println("El trabajador " + nombre + " recibe un salario de: " + pago);
        sc.close();
     } 
}