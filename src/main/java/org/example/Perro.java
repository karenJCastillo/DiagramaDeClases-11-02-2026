package org.example;

public class Perro extends Animal{
    private String tamaño;

    public Perro() {
    }

    public Perro(String raza, double peso, String tamaño) {
        super(raza, peso);
        this.tamaño = tamaño;
    }
    public void ladrar (){
        System.out.println("wof wof");
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tamaño: " + tamaño;
    }
}
