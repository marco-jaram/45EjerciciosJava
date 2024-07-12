package ejercicio08_ProductoSuma;

import java.util.Scanner;

public class DosNumProducSumaDOWhile {
// 8. Leer dos números y realizar el producto mediante sumas.
public static void main(String[] args) {

    System.out.println("Utilizando un loop Do While");
    Scanner scanner= new Scanner(System.in);
    System.out.println("Dame el primer numero");
    int num1= scanner.nextInt();
    System.out.println("Dame el segundo numero");
    int num2= scanner.nextInt();
    int suma=0;
    int cont=1;
    do {
        suma = suma +num1;
        cont++;
    } while (cont <= num2);
        System.out.println("El producto es: "+suma);









}



}
