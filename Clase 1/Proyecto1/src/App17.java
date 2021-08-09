package src;
import java.util.Scanner;
public class App17 {
    public static void main(String[] args){
        int longi = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("cuantos numeros desea ingresar: ");
        longi =sc.nextInt();
        int nums[] = new int[longi];
        for(int i = 0; i < nums.length; i++){
            System.out.print("dame el valor # " + (i+1) + ": ");
            nums [i] = sc.nextInt();
        }for (int i = 0; i < nums.length; i++){
            System.out.print("[" + nums[i] + "]");
        }
        sc.close();
    }
}
