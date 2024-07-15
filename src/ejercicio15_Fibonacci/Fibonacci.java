package ejercicio15_Fibonacci;

import java.util.Scanner;

public class Fibonacci {

//    Ejercicio 15. Generar los N primeros términos
//    de la serie de Fibonacci. El valor N (entero
//    y positivo) deberá ser leído por el teclado.
//    En esta serie los dos primeros números son 1,
//    y el resto se obtiene sumando los dos
//    anteriores: 1, 1, 2, 3, 5, 8, 13, 21…
    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce el valor de N: ");
            int N = scanner.nextInt();

            // Verificar que N es positivo
            if (N <= 0) {
                System.out.println("El valor de N debe ser un entero positivo.");
                return;
            }

            // Imprimir los primeros N términos de la serie de Fibonacci
            for (int i = 1; i <= N; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }

        // Método recursivo para calcular el n-ésimo término de la serie de Fibonacci
        public static int fibonacci(int n) {
            if (n == 1 || n == 2) {
                return 1;
            }
            return fibonacci(n - 1) + fibonacci(n - 2);
        }



    }

