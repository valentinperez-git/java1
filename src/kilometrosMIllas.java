import java.util.Scanner;

public class kilometrosMIllas {
    public static void main(String[] args) {
        Scanner cargaDatos = new Scanner(System.in);
        //kilometros a millas
        System.out.println("Ingrese los kilometros a pasar a millas");
        int kilometros = cargaDatos.nextInt();
        double millas = kilometros / 1.609344;
        System.out.println("la cantidad de millas totales es de " + millas);
    }
}
