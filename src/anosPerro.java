import java.util.Scanner;
public class anosPerro {

    public static void main(String[] args) {
        Scanner cargaDatos = new Scanner(System.in);
        //años perro
        System.out.println("Ingrese su edad");
        int edad = cargaDatos.nextInt();
        int anosPerro = edad * 7;
        System.out.println("Tu edad en años perro es de " + anosPerro);
    }
}
