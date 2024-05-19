package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Programa que muestra parte entero y decimal de un numero de tipo float ingresado por le usuario

        System.out.println("Ingrese un numero float");
        float numeroUsuario = teclado.nextFloat();

        // Descomponer el numero
            //Parte entera
        int parteEntera=(int) numeroUsuario;
            //Parte decimal
        float parteDecimal= numeroUsuario - parteEntera;
        // Muestra en pantalla
        System.out.println("El numero ingresado "+ numeroUsuario);
        System.out.println("parte entera: "+parteEntera);
        System.out.println("parte decimal: "+parteDecimal);


        }
    }
