/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasEnListas;

/**
 *
 * @author Royer
 */
public class ListaE {

    private NodoE p;

    public NodoE getP() {
        return p;
    }

    public void setP(NodoE p) {
        this.p = p;
    }

    public void adicion(String a, double b) {
        NodoE nue = new NodoE();
        nue.setItem(a);
        nue.setNota(b);

        if (getP() == null) {
            setP(nue);
        } else {
            NodoE p = getP();
            while (p.getSig() != null) {
                p = p.getSig();
            }
            p.setSig(nue);
        }
    }

    public void mostrar() {
        NodoE p = getP();
        while (p != null) {
            System.out.println(p.getItem() + " " + p.getNota());
            p = p.getSig();
        }
    }
}
