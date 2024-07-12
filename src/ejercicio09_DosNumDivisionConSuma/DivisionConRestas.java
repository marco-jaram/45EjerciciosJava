package ejercicio09_DosNumDivisionConSuma;

import java.util.Scanner;

public class DivisionConRestas {
    //   9. Leer dos números y realizar la división mediante restas mostrando el cociente y el resto.
    public static void main(String[] args) {
        int dividendo, divisor;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame el primer numero dividendo");
        dividendo = scanner.nextInt();

        System.out.println("Dame el segundo numero divisor ");
        divisor = scanner.nextInt();
        int cociente = 0;
        int resto = dividendo;
        while (resto >= divisor) {
            resto -= divisor;
            cociente++;
        }
        System.out.println("Cociente: "+cociente);
        System.out.println("Resto: "+resto);

    }
}
