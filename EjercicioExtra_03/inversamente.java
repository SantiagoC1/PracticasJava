package org.example.EjercicioExtra_03;

public class inversamente {
    public static void main(String[] args) {
        //Programa que verifica si los arreglos son inversamente iguales
        int[] arr1={0,1,2,3,4,5,6,7,8,9};
        int[] arr2={9,8,7,6,5,4,3,2,1,0};
        boolean esIgual=false;
        for (int i = 0; i <=9 ; i++) {
            esIgual=false;
            for (int j = 9; j >=0 ; j--) {
                if (i==j){
                    esIgual=true;
                    System.out.println("|"+i+"|"+" "+"|"+j+"|"+esIgual);
                }
            }
        }
        if (esIgual){
            System.out.println("los arreglos son inversamente iguales");
        }
    }
}
