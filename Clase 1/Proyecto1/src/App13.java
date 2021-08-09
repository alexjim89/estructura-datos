package src;
import java.util.Scanner;
public class App13 {
    public static void main(String[] args){
        String nombre1 = "";
        String nombre2 = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer nombre: ");
        nombre1 = sc.nextLine();
        System.out.print("Ingresa el segundo nombre: ");
        nombre2 = sc.nextLine();

        if(nombre1.equalsIgnoreCase(nombre2)){
            System.out.println("Los nombres son iguales");
        }else{
            System.out.println("Los nombres no son iguales");
        }
        sc.close();
    }
}
