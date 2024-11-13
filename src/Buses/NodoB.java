/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buses;

/**
 *
 * @author Royer
 */
public class NodoB {

    private Conductor a;
    private String placa;
    private int capacidad;
    private LDobleP b;
    private NodoB ant;
    private NodoB sig;

    public NodoB() {
        ant = sig = null;
        b = new LDobleP();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public LDobleP getB() {
        return b;
    }

    public void setB(LDobleP b) {
        this.b = b;
    }

    public Conductor getA() {
        return a;
    }

    public void setA(Conductor a) {
        this.a = a;
    }

    public NodoB getAnt() {
        return ant;
    }

    public void setAnt(NodoB ant) {
        this.ant = ant;
    }

    public NodoB getSig() {
        return sig;
    }

    public void setSig(NodoB sig) {
        this.sig = sig;
    }
}
