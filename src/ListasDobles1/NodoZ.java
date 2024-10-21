/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasDobles1;

/**
 *
 * @author Royer
 */
public class NodoZ {
    private Zona z;
    private NodoZ ant, sig;
    NodoZ(){
        ant=sig=null;
    }

    public Zona getZ() {
        return z;
    }

    public void setZ(Zona z) {
        this.z = z;
    }

    
    public NodoZ getAnt() {
        return ant;
    }

    public void setAnt(NodoZ ant) {
        this.ant = ant;
    }

    public NodoZ getSig() {
        return sig;
    }

    public void setSig(NodoZ sig) {
        this.sig = sig;
    }
}
