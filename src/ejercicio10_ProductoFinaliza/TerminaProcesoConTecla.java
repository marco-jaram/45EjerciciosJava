package ejercicio10_ProductoFinaliza;

import java.util.Scanner;

public class TerminaProcesoConTecla {
    //    Leer una secuencia de números y mostrar
//    su producto, el proceso finalizará cuando
//    el usuario pulse la tecla F.
    public static void main(String[] args) {


        int producto = 1;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("introduce un numero");
          String  input = scanner.next();
            if (input.equals("f")) {
                break;
            }
           int num = Integer.parseInt(input);
            producto= num*producto;
        }
        System.out.println("Este es el producto "+ producto);
    }
}