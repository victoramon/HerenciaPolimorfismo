package com.generation.animales;

public class Perro extends Animal implements Mascota, Mamiferos{

    private int patas;
    private boolean cola;
    private String raza;

    public Perro(String nombre) {
        super (nombre);
    }

    public void jugar () {
        System.out.println("Estoy jugando");
    }

    @Override
    public void dormir() {
        System.out.println("ZzZzZzZzzz");
    }

    @Override
    public void hablar() {
        System.out.println("Guaffff");
    }

    public void ladrar () {
        System.out.println("Goff");
    }

    @Override
    public void comer () {
        System.out.println("Comiendo croquetas");
    }

    @Override
    public void respirar() {
        System.out.println("Respirando por la nariz");
    }

    @Override
    public void gestacion() {
        System.out.println("Tiempo de 2 meses");
    }

    @Override
    public void ingestarLeche() {
        System.out.println("Estoy tomando leche");
    }

    @Override
    public void movilidad() {
        System.out.println("Camino en 4 patas");
    }
}
