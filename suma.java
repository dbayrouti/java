package Tareas;

import java.util.Scanner;

public class suma {
    //static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int primerNumero;
        int segundoNumero;

        System.out.println("Ingresa el primero número");
        Scanner num1 = new Scanner (System.in);
        primerNumero = num1.nextInt();
        System.out.println("Ingresa el segundo número");
        Scanner num2 = new Scanner (System.in);
        segundoNumero = num1.nextInt();
        int suma = primerNumero + segundoNumero;

        System.out.println("La suma de los dos número es: " + suma);
    }


}


