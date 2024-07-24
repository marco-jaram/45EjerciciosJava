package ejercicio18_SecuenciaMostrarPrimeroPares;

import java.util.Scanner;

public class SecuencaNumMostrarPrimerosTreintaPaares {
//Ejercicio 18 Leer una secuencia de números y
// mostrar los 5 primeros pares leídos.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorPares = 0;

        System.out.println("Ingrese números (ingrese un número " +
                "negativo para terminar):");

        while (contadorPares < 5) {
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero % 2 == 0) {
                System.out.println("numero par -->"+numero);
                contadorPares++;
            }
        }

        scanner.close();
    }





    }

