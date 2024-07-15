package ejercicio14_CalcularMedia;

import java.util.Scanner;

public class CalcularMediaDeSecuencia {

// 14. Calcular la media de una secuencia de números.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad de números: ");
        int n = scanner.nextInt();

        double[] numeros = new double[n];
        double suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
            suma += numeros[i];
        }

        double media = suma / n;

        System.out.println("La media de la secuencia de números es: " + media);

    }
}
