import java.util.Scanner;
public class App10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1000;

        do{
            System.out.println(i + ", ");
            i -= 200;
        }while (i >= 0);
        sc.close();
    }
}