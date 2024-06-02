package org.example.EjercicioExtra_04;

import java.util.Scanner;

public class arregloCliente {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        byte tam;
        System.out.println("Ingrese la cantidad de elementos del arreglo");
        tam=teclado.nextByte();
        //Inicializacion de los arreglos con el tamanio especifico
        int[] arr1 = new int[tam];
        int[] arr2 = new int[tam];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum1 = 0,sum2=0;
        byte aMax=0,aMin=0;
        //carga de los arreglos
        for (int i = 0; i <tam; i++) {
            int aux;
            System.out.println("ingrese el numero para el arr1");
            aux= teclado.nextInt();
            sum1=sum1+aux;
            arr1[i]=aux;
            System.out.println("ingrese el numero para el arr2");
            aux= teclado.nextInt();
            sum2=sum2+aux;
            arr2[i]=aux;
        }
        //recorrido y comparacion para encontrar max y min
        for (int i = 0; i < tam; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
                aMax = 1;
            }
            if (arr2[i] > max) {
                max = arr2[i];
                aMax = 2;
            }

            if (arr1[i] < min) {
                min = arr1[i];
                aMin = 1;
            }
            if (arr2[i] < min) {
                min = arr2[i];
                aMin = 2;
            }
        }
        //Impresion
        System.out.println("la sumatoria del arr1 es: "+sum1);
        System.out.println("la sumatoria del arr2 es: "+sum2);
        if (aMax==1){
            System.out.println("el arreglo con el valor maximo es el primero, con el valor de: "+max);
        }else {
            System.out.println("el arreglo con el valor maximo es el segundo, con el valor de: "+max);
        }
        if (aMin==1){
            System.out.println("el arreglo con el valor minimo es el primero" +
                    ", con el valor de: "+min);
        }else {
            System.out.println("el arreglo con el valor maximo" +
                    " es el segundo, con el valor de: "+min);

        }

    }
}
