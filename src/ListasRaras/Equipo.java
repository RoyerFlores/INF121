/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasRaras;

/**
 *
 * @author Royer
 */
public class Equipo {

    private String nombre;
    private int numJugTit;
    private int numJugSup;

    public Equipo(String nombre, int numJugTit, int numJugSup) {
        this.nombre = nombre;
        this.numJugTit = numJugTit;
        this.numJugSup = numJugSup;
    }

    @Override
    public String toString() {
        return "- " + nombre;
    }

    public void mostrar() {
        System.out.println(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumJugTit() {
        return numJugTit;
    }

    public void setNumJugTit(int numJugTit) {
        this.numJugTit = numJugTit;
    }

    public int getNumJugSup() {
        return numJugSup;
    }

    public void setNumJugSup(int numJugSup) {
        this.numJugSup = numJugSup;
    }
}
