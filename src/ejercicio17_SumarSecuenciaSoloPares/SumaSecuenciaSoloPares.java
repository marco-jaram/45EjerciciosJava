package ejercicio17_SumarSecuenciaSoloPares;

import java.util.Scanner;

public class SumaSecuenciaSoloPares {

//Ejercicio 17. Leer una secuencia de números y
// sumar solo los pares mostrando el resultado del proceso.
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int numero, sumaPares = 0;

            System.out.println("Introduce números (termina con un número negativo):");

            while (true) {
                numero = scanner.nextInt();

                if (numero < 0) {
                    break;
                }

                if (numero % 2 == 0) {
                    sumaPares += numero;
                }
            }

            System.out.println("La suma de los números pares es: " + sumaPares);

            scanner.close();

    }
}
