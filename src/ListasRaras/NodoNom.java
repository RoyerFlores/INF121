/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasRaras;

/**
 *
 * @author Royer
 */
public class NodoNom {

    String nombre;
    NodoEdad sig;

    public NodoNom(String nombre) {
        this.nombre = nombre;
        sig = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoEdad getSig() {
        return sig;
    }

    public void setSig(NodoEdad sig) {
        this.sig = sig;
    }
}
