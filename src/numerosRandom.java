import java.util.Scanner;

public class numerosRandom {
    public static void main(String[] args) {

    //imput de usuario
    Scanner entrada = new Scanner(System.in);
    int intentosRestantes = 3;
    double numeroDeseado = Math.floor(Math.random()*100);

    while (intentosRestantes > 0) {
        Scanner cargaDatos = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        double numeroUsuario = cargaDatos.nextDouble();
        if (numeroUsuario < numeroDeseado){
            System.out.println("el numero es menor.");
        }else {
            intentosRestantes--;
            System.out.println("Número incorrecto. Intentos restantes: " + intentosRestantes);
            break;
        }
        if (numeroUsuario > numeroDeseado){
            System.out.println("el numero es mayor.");
        }else {
            intentosRestantes--;
            System.out.println("Número incorrecto. Intentos restantes: " + intentosRestantes);
        }
        if (numeroUsuario == numeroDeseado) {
            System.out.println("¡Correcto! Has adivinado el número.");
            break; // Sale del bucle si adivina el número.
        } else {
            intentosRestantes--;
            System.out.println("Número incorrecto. Intentos restantes: " + intentosRestantes);
            break;
        }
    }

        if (intentosRestantes == 0) {
            System.out.println("Te has quedado sin intentos. El número era " + numeroDeseado);
        }

        entrada.close();
    }
}

