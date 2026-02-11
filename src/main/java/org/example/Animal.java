package org.example;

public class Animal {
    // atributos
    private String raza;
    private double peso;
    //metodos
    // contructores


    public Animal() {
    }

    public Animal(String raza, double peso) {
        this.raza = raza;
        this.peso = peso;
    }

    public void comer(){
        System.out.println("esta comiendo");
    }

    public void hacerSonido(){
        System.out.println("esta haciendo un sonido");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "raza='" + raza + '\'' +
                ", peso=" + peso +
                "kilos";
    }
}
