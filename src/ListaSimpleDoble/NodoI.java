/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaSimpleDoble;

/**
 *
 * @author Royer
 */
public class NodoI {
    String nom;
    int nroG;
    NodoI sig;
    NodoI ant;

    public NodoI getAnt() {
        return ant;
    }

    public void setAnt(NodoI ant) {
        this.ant = ant;
    }

    public int getNroG() {
        return nroG;
    }

    public void setNroG(int nroG) {
        this.nroG = nroG;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nomG) {
        this.nom = nomG;
    }

    public NodoI getSig() {
        return sig;
    }

    public void setSig(NodoI sig) {
        this.sig = sig;
    }
}
