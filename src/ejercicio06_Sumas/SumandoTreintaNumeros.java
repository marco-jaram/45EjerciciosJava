package ejercicio06_Sumas;

import java.util.Scanner;

public class SumandoTreintaNumeros {

    //    6. Leer una secuencia de 30 números y mostrar la suma y el producto de ellos.
    public static void main(String[] args) {

        int suma = 0;
        int producto = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros enteros que va a ingresar");
        int cantidadNums = scanner.nextInt();
        int[] vector = new int[cantidadNums];

        for (int i = 0; i < vector.length; i++) {

            System.out.println("Ingrese su numero");
            vector[i] = scanner.nextInt();
            System.out.println("numero ingresado: " + vector[i]);
            suma = vector[i] + suma;
            producto = producto * vector[i];
        }


        System.out.println("La suma es: " + suma);
        System.out.println("El producto es: " + producto);
    }
}
