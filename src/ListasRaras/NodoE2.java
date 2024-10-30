/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasRaras;

/**
 *
 * @author Royer
 */
public class NodoE2 {
    private Equipo e2;
    private NodoPa sig;

    public NodoE2(Equipo e2) {
        this.e2 = e2;
        sig=null;
    }

    @Override
    public String toString() {
        return e2.toString();
    }
    
    public void mostrar(){
        System.out.println(this);
    }

    public Equipo getE2() {
        return e2;
    }

    public void setE2(Equipo e2) {
        this.e2 = e2;
    }

    public NodoPa getSig() {
        return sig;
    }

    public void setSig(NodoPa sig) {
        this.sig = sig;
    }
}
