package ejercicio07_Secuencias;

import java.util.Scanner;

public class HastaIntroNumNegativo {
    //   7. Leer una secuencia de números, hasta que se introduce un
//    número negativo y mostrar la suma de dichos números.
    public static void main(String[] args) {
        int num = 0;
        int suma = 0;
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("Introduce un numero");
            num = scanner.nextInt();
            if (num < 0) {
                break;

            }
            suma += num;
        } while (num > 0);

        System.out.println("la suma es : " + suma);

    }

}



