/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buses;

/**
 *
 * @author Royer
 */
public class LDobleB {

    private NodoB p;

    public LDobleB() {
        p = null;
    }

    public NodoB getP() {
        return p;
    }

    public void setP(NodoB p) {
        this.p = p;
    }

    public void adifinal(Conductor a, String placa, int capacidad, LDobleP b) {
        NodoB nue = new NodoB();
        nue.setA(a);
        nue.setPlaca(placa);
        nue.setCapacidad(capacidad);
        nue.setB(b);
        if (getP() == null) {
            setP(nue);
        } else {
            NodoB w = getP();
            while (w.getSig() != null) {
                w = w.getSig();
            }
            w.setSig(nue);
            nue.setAnt(w);
        }
    }

    public void mostrar() {
        NodoB r = getP();
        while (r != null) {
            System.out.println("< " + r.getPlaca() + ", Conductor:  " + r.getA().getNom());
            r.getB().mostrar();
            r = r.getSig();
        }
    }
}
