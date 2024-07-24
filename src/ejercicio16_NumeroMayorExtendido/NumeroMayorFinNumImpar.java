package ejercicio16_NumeroMayorExtendido;

import java.util.Scanner;

public class NumeroMayorFinNumImpar {

//Ejercicio 16 Leer una secuencia de números y
// mostrar cuál de ellos es el mayor y el menor;
// el proceso finalizará cuando se introduzca
// un número impar.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Introduce un número (se termina con un número impar): ");
            numero = scanner.nextInt();

            if (numero % 2 != 0) {
                break; // Termina el bucle si el número es impar
            }

            if (numero > mayor) {
                mayor = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
    }

