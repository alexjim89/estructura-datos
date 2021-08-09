package src;
import java.util.Scanner;
public class App7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione 1 para suma, 2 para resta, 3 para multiplicacion o 4 para divicion.");
        int parametro = sc.nextInt();
        System.out.println("Elige tu primer numero");
        int num1 = sc.nextInt();
        System.out.println("Elige tu segundo numero");
        int num2 = sc.nextInt();
        int resultado = 0;
        
        switch(parametro){
            case 1: resultado = num1 + num2;
            System.out.println("el resultado de su suma es " + resultado); 
            break;
            case 2: resultado = num1 - num2;
            System.out.println("el resultado de su resta es " + resultado); 
            break;
            case 3: resultado = num1 * num2;
            System.out.println("el resultado de su multiplicacion es " + resultado); 
            break;
            case 4: resultado = num1 / num2;
            System.out.println("el resultado de su divicion es " + resultado); 
            break;
            default: System.out.println("Error, la opcion no existe");
            break;
        }sc.close();
    }
}