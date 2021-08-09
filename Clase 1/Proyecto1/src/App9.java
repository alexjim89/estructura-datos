package src;
import java.util.Scanner;
public class App9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 10){
            System.out.println(i + ", ");
            i += 2;
        }
        sc.close();
    }
}