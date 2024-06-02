package org.example.EjercicioExtra_01;

import java.util.Scanner;



public class mayorDeEdad {
    //Programa que determina si una persona es mayor de edad
    public static void main(String[] args) {
        //creo un objeto de scarnner para poder leer datos del usuario
        Scanner teclado = new Scanner(System.in);
        byte edad;
        System.out.println("Ingrese la edad de la persona");
        edad= teclado.nextByte();
        String texto = edad>=18 ? "es mayor de edad": "Es menor de edad";
        System.out.println(texto);
    }
}
