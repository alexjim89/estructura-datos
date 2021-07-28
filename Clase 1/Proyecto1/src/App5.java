import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class App5 {

    public static void main(String args []){
        var archivo = "ejercicio.dat";
        try (var p1 = new ObjectOutputStream(
        new FileOutputStream(archivo))) {
            p1.writeObject(new Persona("deivy","31","hombre"));
            p1.writeObject(new Persona("jose","39", "hombra"));
        } catch (FileNotFoundException e) {
        System.out.println("¡El fichero no existe!");
        } catch (Exception e) {
        System.out.println(e.getMessage());
        }
    }
}