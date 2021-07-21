import java.util.Scanner;
public class App3 {
    public static void main(String[] args) {
        System.out.println("ingrese un animal");
        Scanner sc = new Scanner(System.in);
        String animal = sc.nextLine();
        switch (animal){
            case "perro":
                System.out.println("Woof");
                break;
            case "gato":
                System.out.println("Meaw");
                break;
            case "loro":
                System.out.println("quere cacao?");
                break;
            default:
                System.out.println("no se encontro animal");
        } sc.close();
    }
}
