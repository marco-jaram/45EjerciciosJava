package ejercicio08_ProductoSuma;

import java.util.Scanner;

public class DosNumProductoDeSuma {
// 8. Leer dos números y realizar el producto mediante sumas.

    public static void main(String[] args) {
        System.out.println("Utilizando un solo for");
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        System.out.println("Dame el primer numero");
        num1 = scanner.nextInt();
        System.out.println("Dame segundo numero");
        num2 = scanner.nextInt();

      int product=0;

        for (int i = 0; i < num2; i++) {
            product += num1;

        }

        System.out.println(product);
    }


}
