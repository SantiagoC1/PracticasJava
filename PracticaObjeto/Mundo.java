package org.example.PracticaObjeto;

public class Mundo {
    public static void main(String[] args) {
        Mutante xavier = new Mutante();
        xavier.nombre="xavier";
        xavier.edad=50;
        xavier.energia=100;
        xavier.comer(50);
        xavier.entrenar(10,2);
        System.out.println(xavier.energia);
        Mutante magneto = new Mutante();
        //el uso de getters y setters me provee el encapsulamiento
        magneto.setNombre("Magneto");
        magneto.setEdad(67);
        magneto.setEnergia(200);
        magneto.comer(50);
        System.out.println(magneto.getEnergia());
        System.out.println(Mutante.EDAD_APARICION_MUTACION);

    }
}
