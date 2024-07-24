package ejercicio19_SecuenciaYSuma;

import java.util.Scanner;

public class SecuenciaSumaPrimerosCincoNumPar {
//    Ejercicio 19. Leer una secuencia de números y
//    mostrar la suma de los 30 números que ocupan
//    posiciones de lectura par.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        System.out.println("Introduce la secuencia de números (30 números):");

        // Leer 30 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();

            // Verificar si la posición es par
            if (i % 2 == 0) {
                suma += numero;
            }
        }

        System.out.println("La suma de los números en posiciones pares es: " + suma);
        scanner.close();
    }
}
