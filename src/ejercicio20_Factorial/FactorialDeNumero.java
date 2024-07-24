package ejercicio20_Factorial;

import java.util.Scanner;

public class FactorialDeNumero {
//    Ejercicio 20 Leer un número y determinar su factorial.
public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Ingrese un número entero no negativo: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Error: El número debe ser no negativo.");
        } else {
            long factorial = calculateFactorial(number);
            System.out.println("El factorial de " + number + " es: " + factorial);
        }
    } catch (Exception e) {
        System.out.println("Error: Entrada inválida. Por favor, ingrese un número entero.");
    }
        }

        private static long calculateFactorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }

            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }

            return result;
        }
}

