package org.example;
public class Main {
    public static void main(String[] args) {

        Perro sasha = new Perro("schauzer",6,"pequeño");
        //llamar metodos
        sasha.ladrar();
        sasha.comer();
        sasha.hacerSonido();

        System.out.println(sasha.toString());



    }
}