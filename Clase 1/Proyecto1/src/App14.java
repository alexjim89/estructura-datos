import java.util.Scanner;
public class App14 {
    public static void main(String[] args){
        String usuario = "";
        String password = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa nombre de usuario: ");
        usuario = sc.nextLine();
        System.out.print("Ingresa contraseña: ");
        password = sc.nextLine();
        if(usuario.equals("alex") && password.equals("123456")){
            System.out.println("Datos correctos");
        }else{
            System.out.println("Datos incorrectos");
        }
        sc.close();
    }
}