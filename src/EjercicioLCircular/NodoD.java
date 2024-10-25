/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioLCircular;

/**
 *
 * @author Royer
 */
public class NodoD {

    int idDpto;
    String nomDpto;
    NodoD sig;

    @Override
    public String toString() {
        return idDpto + " - " + nomDpto;
    }

    public void mostrar() {
        System.out.println(this);
    }

    public int getIdDpto() {
        return idDpto;
    }

    public void setIdDpto(int idDpto) {
        this.idDpto = idDpto;
    }

    public String getNomDpto() {
        return nomDpto;
    }

    public void setNomDpto(String nomDpto) {
        this.nomDpto = nomDpto;
    }

    public NodoD getSig() {
        return sig;
    }

    public void setSig(NodoD sig) {
        this.sig = sig;
    }
}
