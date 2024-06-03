package org.example.PracticaObjeto;

public class Mutante {
    protected String nombre;
    protected int edad;
    protected int energia;
    protected String poder;
    static final int EDAD_APARICION_MUTACION =12;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    void comer (int valor){
        energia=energia+valor;
    }

    void entrenar (int valor1,int cantidad){
        energia=energia-valor1*cantidad;

    }
}
