/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaMultiple;

/**
 *
 * @author Royer
 */
public class LSimpleD {

    private NodoD p;

    public LSimpleD() {
        p = null;
    }

    public NodoD getP() {
        return p;
    }

    public void setP(NodoD p) {
        this.p = p;
    }

    public void adicion(String a, LDobleM b) {
        NodoD nuevo = new NodoD();
        nuevo.setNombre(a);
        nuevo.setLm(b);
        if (getP() == null) {
            setP(nuevo);
        } else {
            NodoD r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
        }
    }

    public void mostrar() {
        NodoD w = getP();
        while (w != null) {
            System.out.println("Dueño: "+w.getNombre() +">");
            w.getLm().mostrar();
            w = w.getSig();
        }
        System.out.println();
    }
}
