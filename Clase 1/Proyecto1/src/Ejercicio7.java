package Proyecto1.src;

import java.util.Locale;
import java.util.Scanner;
public class Ejercicio7{
    public static void main(String argm[]){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int seguir = 1;
        float contador,I,numero;

        while (seguir == 1){
            System.out.println("Ingresa un numero:");
            numero = sc.nextFloat();
            contador = 0;
            for(I = 1; I <= numero; I++){
                if((numero % I) == 0){
                    contador++;
                }
            } if(contador <= 2){
                System.out.println("El numero es primo");
                System.out.println("Deseas comprobar otro numero 1: si 0: no");
                seguir = sc.nextInt();
            } else{
                System.out.println("El numero no es primo");
                System.out.println("Deseas comprobar otro numero 1: si 0: no");
                seguir = sc.nextInt();
                } 
        } 
    }
}
