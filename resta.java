package Tareas;

import java.util.Scanner;

public class resta {

    public static void main(String[] args) {
        int numero1;
        int numero2;

        System.out.println("Ingrese el primer número");
        Scanner num1 = new Scanner(System.in);
        numero1 = num1.nextInt();
        System.out.println("Ingrese el segundo número");
        Scanner num2 = new Scanner(System.in);
        numero2 = num2.nextInt();
        int resta = numero1 - numero2;
        System.out.println("La resta de los dos números es: " + resta);
    }
}
