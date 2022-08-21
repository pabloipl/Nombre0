import java.util.Scanner;

public class Nombre {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba su nombre:");
        String nombre = teclado.nextLine();
        System.out.println("Su nombre es: " + nombre);

    }
}
