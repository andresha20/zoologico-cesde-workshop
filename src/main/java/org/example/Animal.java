package org.example;

public class Animal {

    private String nombre;
    private String genero;
    private Double peso;
    private Animal pareja;

    public Animal() {
    }

    public Animal(String nombre, String genero, double peso) {
        this.nombre = nombre;
        this.peso = peso;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Animal getPareja() {
        return pareja;
    }

    public void encontrarPareja(Animal pareja){
        this.pareja = pareja;
    }
}
