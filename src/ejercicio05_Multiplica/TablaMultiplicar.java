package ejercicio05_Multiplica;

import java.util.Scanner;

public class TablaMultiplicar {
// 5. Leer un número y mostrar su tabla de multiplicar.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero entero para realizar su table de multiplicar");
        int num = scanner.nextInt();
        int filas = 10;
        for (int i = 0; i <= 10; i++) {
            int multiplica = num * i;
            System.out.println(num + " x " + i + "= " + multiplica);
        }

    }


}

