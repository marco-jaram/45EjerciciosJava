package ejercicio04_EsMayor;

import java.util.Scanner;

public class EsMayorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer nuemro");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa el segundo numero");
        int num2 = scanner.nextInt();
        System.out.println("Ingresa el tercer numero");
        int num3 = scanner.nextInt();
//1,2,3

        int mayor;
        if (num1 > num2) {
            mayor = num1;
        } else {
            mayor=num2;
        }
        if (mayor > num3) {
            System.out.println("el numero mayor que me diste es: "+mayor);
        }else {
            System.out.println("el numero mayor es el "+ num3);
        }



    }

}
