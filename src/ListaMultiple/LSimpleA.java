/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaMultiple;

/**
 *
 * @author Royer
 */
public class LSimpleA {

    private NodoA p;

    public LSimpleA() {
        p = null;
    }

    public NodoA getP() {
        return p;
    }

    public void setP(NodoA p) {
        this.p = p;
    }

    public void adicion(String a, String b, double c) {
        NodoA nuevo = new NodoA();
        nuevo.setNom(a);
        nuevo.setTipo(b);
        nuevo.setTamano(c);
        if (getP() == null) {
            setP(nuevo);
        } else {
            NodoA r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
        }
    }

    public void mostrar() {
        NodoA w = getP();
        while (w != null) {
            System.out.print(w.getNom() + "." + w.getTipo() + ", tamaño: " + w.getTamano() + " > ");
            w = w.getSig();
        }
        System.out.println();
    }
}
