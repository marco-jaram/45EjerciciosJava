package ejercicio11_SecuenciaNumeroMayor;

import java.util.Scanner;

public class SecuenciaNumDeterminaMayor {
    //Leer una secuencia de números y determinar
// cuál es el mayor de ellos.
    public static void main(String[] args) {

        int mayor = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos numero quieres leer?");
        int numALeer = scanner.nextInt();

        for (int i = 0; i < numALeer; i++) {
            System.out.println("Introduce un numero");
            int num = scanner.nextInt();
            if (num > mayor) {
                mayor = num;
            }
            System.out.println("El numero mayor es: "+mayor);
        }


    }
}
