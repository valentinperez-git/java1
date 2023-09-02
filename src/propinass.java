import java.util.Scanner;

public class propinass {
    public static void main(String[] args) {
        Scanner cargaDatos = new Scanner(System.in);

        System.out.println("ingrese el total de la cuenta: ");
        double precioOriginal = cargaDatos.nextDouble();
        System.out.println("ingrese el porcentaje de propina a agregar: ");
        double propina = cargaDatos.nextDouble();

        double precioFinal = precioOriginal + (precioOriginal * (propina / 100));
        System.out.println("el precio final con la propina es de: " + precioFinal);
    }
}
