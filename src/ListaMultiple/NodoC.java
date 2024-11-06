/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaMultiple;

/**
 *
 * @author Royer
 */
public class NodoC {

    private String nombre;
    private LSimpleA archivos;
    private NodoC ant, sig;

    public NodoC() {
        ant = sig = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LSimpleA getArchivos() {
        return archivos;
    }

    public void setArchivos(LSimpleA archivos) {
        this.archivos = archivos;
    }

    public NodoC getAnt() {
        return ant;
    }

    public void setAnt(NodoC ant) {
        this.ant = ant;
    }

    public NodoC getSig() {
        return sig;
    }

    public void setSig(NodoC sig) {
        this.sig = sig;
    }
}
