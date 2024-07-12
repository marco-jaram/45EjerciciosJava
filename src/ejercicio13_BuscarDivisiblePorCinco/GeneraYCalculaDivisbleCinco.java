package ejercicio13_BuscarDivisiblePorCinco;

public class GeneraYCalculaDivisbleCinco {
//  Ejercicio 13.  Generar enteros de 3 en 3 comenzando por 2 hasta el valor
//    máximo menor que 30. Calcular la suma de los enteros generados
//    que sean divisibles por 5.

    public static void main(String[] args) {
        int start = 2;
        int end = 30;
        int sum = 0;

        for (int i = start; i < end; i += 3) {
            System.out.println("Número generado: " + i);
            if (i % 5 == 0) {
                sum += i;
            }
        }

        // Imprime la suma de los números divisibles por 5
        System.out.println("La suma de los números generados que son divisibles por 5 es: " + sum);
    }
}




