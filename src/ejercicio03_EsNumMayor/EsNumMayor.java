package ejercicio03_EsNumMayor;

import java.util.Scanner;

public class EsNumMayor {
//    3. **Leer 2 números y determinar el mayor de ellos.**
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce nuemro entero");
        int num1=scanner.nextInt();
        System.out.println("Introduce un segundo mumero entero");
        int num2=scanner.nextInt();


        if (num1 >num2) {
            System.out.println("El primer numero es mayor: " +num1);

        }else if (num1< num2) {
            System.out.println("El primer numero es mayor: "+num2);
        }else {
            System.out.println("Los numeros on iguales ");

        }


    }
}
