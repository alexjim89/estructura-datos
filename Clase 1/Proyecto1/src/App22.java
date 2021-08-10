package Proyecto1.src;

import java.util.Locale;
import java.util.Scanner;
public class App22 {
         public static void main(String arg[]) {
        Scanner sc = new Scanner (System.in).useLocale(Locale.US);
        String genero = "h";
        System.out.println("Digita genero de la persona h/m");
        genero = sc.nextLine();
        
        if (genero == "h"){
            System.out.println("Digita el peso de la persona en kilos");
            float peso = sc.nextFloat();
            System.out.println("Digita la altura de la persona en centimetros");
            float altura = sc.nextFloat();
            float ideal = (altura - 110);
            System.out.println("Tu peso ideal es " + ideal);
            System.out.println("Tu peso actual es " + peso);
            
        }else {
            System.out.println("Digita el peso de la persona en kilos");
            float peso = sc.nextFloat();
            System.out.println("Digita la altura de la persona en centimetros");
            float altura = sc.nextFloat();
            float ideal = (altura - 120);
            System.out.println("Tu peso ideal es " + ideal);
            System.out.println("Tu peso actual es " + peso);
        } sc.close();
        
     }
}