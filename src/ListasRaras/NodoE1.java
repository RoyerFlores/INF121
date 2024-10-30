/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasRaras;

/**
 *
 * @author Royer
 */
public class NodoE1 {

    private Equipo e1;
    private NodoPa sig;
    private NodoE2 aba;

    public NodoE1(Equipo e1) {
        this.e1 = e1;
        sig = null;
        aba = null;
    }

    @Override
    public String toString() {
        return e1.toString();
    }
    
    public void mostrar(){
        System.out.println(this);
    }

    public Equipo getE1() {
        return e1;
    }

    public void setE1(Equipo e1) {
        this.e1 = e1;
    }

    public NodoPa getSig() {
        return sig;
    }

    public void setSig(NodoPa sig) {
        this.sig = sig;
    }

    public NodoE2 getAba() {
        return aba;
    }

    public void setAba(NodoE2 aba) {
        this.aba = aba;
    }
}
