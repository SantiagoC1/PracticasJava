package org.example.ListarPersonas;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Se declara la clase para ordenar la lista alfabeticamente por nombre
class CompararPorNombre implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.getNombre().compareTo(p2.getNombre());
    }
}
//Se declara la clase para ordenar la lista alfabeticamente por apellido
class CompararPorApellido implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.getApellido().compareTo(p2.getApellido());
    }
}
//Se declara la clase para ordenar la lista alfabeticamente inversa por apellido
class CompararPorApellidoInv implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        return p2.getApellido().compareTo(p1.getApellido());
    }
}


public class Test {
    public static void main(String[] args) {
        //Crear un arraylist de objetos persona
        ArrayList<Persona> personas =new ArrayList<>();
        personas.add(new Persona("Lara","Dominguez"));
        personas.add(new Persona("Juan","Antonino"));
        personas.add(new Persona("Benicio","Bormida"));
        personas.add(new Persona("Joaquin","Alvarez"));
        personas.add(new Persona("Salvador","Maydana"));


        System.out.println("------------------------");
        System.out.println("POR NOMBRE");
        //ordenar la lista por nombre
        Collections.sort(personas,new CompararPorNombre());
        //Imprimir de la lista ordenada alfabeticamente por nombre
        for (Persona pers:personas) {
            System.out.println(pers.getNombre() + " " + pers.getApellido());
        }
        System.out.println("------------------------");
        System.out.println("POR APELLIDO");
        //ordenar la lista por apellido
        Collections.sort(personas,new CompararPorApellido());
        //Imprimir de la lista alfabeticamente por apellido
        for (Persona pers:personas){
            System.out.println(pers.getApellido()+" "+pers.getNombre());
        }
        System.out.println("------------------------");
        System.out.println("POR APELLIDO INVERSO");
        //ordenar la lista por apellido de forma inversa
        Collections.sort(personas,new CompararPorApellidoInv());
        //Imprimir de la lista afabeticamente inversa por apellido
        for (Persona pers:personas){
            System.out.println(pers.getApellido()+" "+pers.getNombre());
        }

    }
}
