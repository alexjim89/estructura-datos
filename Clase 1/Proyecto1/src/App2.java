import java.util.Scanner;
public class App2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int filas = 0, contador = 1, columnas = 0;
        System.out.println("Cuantas filas desea crear");
        filas = sc.nextInt();
        System.out.println("Cuantas columnas desea crear");
        columnas = sc.nextInt();
        int numeros[][] = new int[filas][columnas];
        for (int j = 0; j < filas; j++) {
            for (int i = 0; i < columnas; i++) {
                numeros[j][i] = contador;
                contador++;
                System.out.print("[" + numeros[j][i] + "]");
               
            }System.out.println("");
        } sc.close();
    }
}
