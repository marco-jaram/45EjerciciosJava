package ejercicio12_MostrarBinario;

import java.util.Scanner;

public class BinarioDeNumero {
    //  12  Dado un número, mostrar su valor en binario.
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("Menu de opciones");
                System.out.println("1. Convertir a Binario");
                System.out.println("2. Convertir a Hexadecimal");
                System.out.println("3. Convertir a Octal");
                System.out.println("4. Salir");
                System.out.println("Por favor elige tu opcion del 1 al 4");

                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Dame un numero entero");
                        int numBinario = scanner.nextInt();
                        String binario = Integer.toBinaryString(numBinario);
                        System.out.println("El valor en binario es: " + binario);
                        break;
                    case 2:
                        System.out.println("Dame un numero entero");
                        int numHex = scanner.nextInt();
                        String hexadecimal = Integer.toHexString(numHex);
                        System.out.println("El valor en hexadecimal es: " + hexadecimal);
                        break;
                    case 3:
                        System.out.println("Dame un numero entero");
                        int numOctal = scanner.nextInt();
                        String octal = Integer.toOctalString(numOctal);
                        System.out.println("El valor en octal es: " + octal);
                        break;
                    case 4:
                        System.out.println("Saliendo del programa.");
                        break;
                    default:
                        System.out.println("Opcion no valida. Por favor elige una opcion del 1 al 4.");
                        break;
                }
            } while (opcion != 4);

            scanner.close();
        }
    }