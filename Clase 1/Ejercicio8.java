import java.util.Scanner;
public class Ejercicio8 {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int compu = (int)(Math.random() * 3) + 1;
      System.out.println("La computadora ya escogio...");
      System.out.println("Indique su eleccion 1: Piedra, 2: Papel, 3: Tijera:");
      int Usuario = sc.nextInt();
      System.out.println("La computadora habia escogido:");
      switch (compu){
         case 1:
            System.out.println("Piedra");
            switch (Usuario){
               case 1: System.out.println("Empate!"); break;
               case 2: System.out.println("Usted gana!"); break;
               case 3: System.out.println("La computadora gana!"); break;
            }
            break;
         case 2:
            System.out.println("Papel");
            switch (Usuario){
               case 1: System.out.println("La computadora gana!"); break;
               case 2: System.out.println("Empate!"); break;
               case 3: System.out.println("Usted gana!"); break;
            }
            break;
         case 3:
            System.out.println("Tijera");
            switch (Usuario){
               case 1: System.out.println("Usted gana!"); break;
               case 2: System.out.println("La computadora gana!"); break;
               case 3: System.out.println("Empate!"); break;
            }
            break;
        }
      }
   }