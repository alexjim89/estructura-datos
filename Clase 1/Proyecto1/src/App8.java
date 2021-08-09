package Proyecto1.src;
import java.util.Scanner;
public class App8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el numero de vueltas");
        for (int i = 0; i <= 100; i+=10){
            System.out.println(i + ", ");
        }
        sc.close();
    }
}