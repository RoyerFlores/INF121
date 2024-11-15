/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Periodico;

/**
 *
 * @author Royer
 */
public class LSimpleS {

    private NodoS p;

    public LSimpleS() {
        p = null;
    }

    public NodoS getP() {
        return p;
    }

    public void setP(NodoS p) {
        this.p = p;
    }

    public void adicion(String a, LDobleN b, LSimpleP c) {
        NodoS nuevo = new NodoS();
        nuevo.setNombre(a);
        nuevo.setNoti(b);
        nuevo.setPub(c);
        if (getP() == null) {
            setP(nuevo);
        } else {
            NodoS r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
        }
    }

    public void mostrar() {
        NodoS w = getP();
        while (w != null) {
            System.out.println("\n" + w.getNombre() + " > ");
            w.getNoti().mostrar();
            w.getPub().mostrar();
            w = w.getSig();
        }
        System.out.println();
    }
}
