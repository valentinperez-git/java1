import java.util.Scanner;

public class descuento {
    public static void main(String[] args) {
        //pedirle usuario que ingrese el precio original de un producto
        //pedirle que ingrese el porcentaje de descuento
        //calcular el precio final precioFinal = (precioOriginal * descuento)/100
        Scanner cargaDatos = new Scanner(System.in);
        //descuento del 10%
        System.out.println("ingrese el precio original: ");
        double precioOriginal = cargaDatos.nextDouble();
        System.out.println("ingrese el descuento: ");
        double descuento = cargaDatos.nextDouble();

        double precioFinal = precioOriginal - (precioOriginal * (descuento / 100));
        System.out.println("el precio final con el descuento es de: " + precioFinal);
    }
}
