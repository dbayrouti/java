package Tareas;

import java.util.Scanner;

public class formulario {

    public static void main(String[] args) {
        String nombre;
        String apellido;
        String direccion;
        int edad;

        System.out.println("Ingrese su nombre");
        Scanner nombre1 = new Scanner(System.in);
        nombre = nombre1.next();

        System.out.println("Ingrese su apellido");
        Scanner apellido1 = new Scanner(System.in);
        apellido = apellido1.next();

        System.out.println("Ingrese su dirección");
        Scanner direccion1 = new Scanner(System.in);
        direccion = direccion1.next();

        System.out.println("Ingrese su edad");
        Scanner edad1 = new Scanner(System.in);
        edad = edad1.nextInt();

        String formulario = nombre +" "+ apellido + " " + direccion + " " + edad;
        System.out.println("Los datos del formulario son " + formulario);

    }
}


