package ejercicio01_esPar;

public class EsPar {

//1. Leer un número y mostrar por la salida estándar si dicho número es o no es par.
//    es por si el residuo de dividir entre 2 es 0
    public static void main(String[] args) {
        int num=5;
        if ((num % 2) == 0)
            System.out.println("El numero introducido es PAR");
        else
            System.out.println("El numero introducido es IMPAR");
    }

}

