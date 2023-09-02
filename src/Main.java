import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner cargaDatos = new Scanner(System.in);

        //INDICE DE MASA CORPORAL
        System.out.println("Ingrese su peso en KG: ");
        double peso = cargaDatos.nextDouble();
        System.out.println("Ingrese su altura en metros: ");
        double altura = cargaDatos.nextDouble();
        double indiceMasaCorporal = peso/(altura * altura);
        System.out.println("Tu indice de masa corporal es de " + indiceMasaCorporal);

        //Mayor a 30 obecidad
        if (indiceMasaCorporal >= 30){
            System.out.println("ESTAS MORBIDAMENTE OBESO, BAJE LOS FLANES");
        }
        //25 y 30 sobrepeso
        if (indiceMasaCorporal >=25 && indiceMasaCorporal <= 30){
            System.out.println("ESTAS CON SOBREPESO, QUE NO TE SORPRENDA EL COLESTEROL ALTO");
        }

        //18 y 25 normal
        if (indiceMasaCorporal >= 18 && indiceMasaCorporal <= 25){
            System.out.println("Voçe time um peso normal pana");
        }
        //menor a 18 delgades
        if (indiceMasaCorporal <= 18){
            System.out.println("Voçe sufre anorexia pana");
        }
        /*
        System.out.println("Ingrese su edad: ");
        Scanner cargaDatos = new Scanner(System.in);
        Integer edad = cargaDatos.nextInt();


        if(edad >= 18) {
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("Es menor de edad");
        }
        */

        //Peso en KG / altura (metros) al cuadrado
        

    }
}