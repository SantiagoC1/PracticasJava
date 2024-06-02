package org.example.EjercicioExtra_02;

import java.util.Scanner;

public class etapaDeVida {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        byte edad;
        edad= teclado.nextByte();
        if (edad>-1&& edad<=2){
            System.out.println("La etapa en la que estas es de bebe");
        }else if (edad>2 && edad<=8){
            System.out.println("La etapa en la que estas es de ninio");
        } else if (edad>9 && edad<=13) {
            System.out.println("La etapa en la que estas es de pre adolecente");
        } else if (edad>13&&edad<18) {
            System.out.println("La etapa en la que estas es de adolecente");
        } else if (edad>=18 && edad<60) {
            System.out.println("La etapa en la que estas es de adulto");
        } else if (edad>=60) {
            System.out.println("La etapa en la que estas es de adulto mayor");
        }
    }
}
