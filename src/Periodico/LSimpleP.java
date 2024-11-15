/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Periodico;

/**
 *
 * @author Royer
 */
public class LSimpleP {

    private NodoP p;

    public LSimpleP() {
        p = null;
    }

    public NodoP getP() {
        return p;
    }

    public void setP(NodoP p) {
        this.p = p;
    }

    public void adifinal(String a, String b, String c, String d) {
        NodoP nue = new NodoP();
        nue.setTitulo(a);
        nue.setEnlace(b);
        nue.setHoraPublicacion(c);
        if (getP() == null) {
            setP(nue);
            nue.setSig(nue);
        } else {
            NodoP r = getP();
            while (r.getSig() != getP()) {
                r = r.getSig();
            }
            r.setSig(nue);
            nue.setSig(getP());
        }
    }

    public void mostrar() {
        NodoP r = getP();
        if (r != null) {
            while (r.getSig() != getP()) {
                System.out.println("<" + r.getTitulo() + " ");
                r = r.getSig();
            }
            System.out.println("<" + r.getTitulo() + " ");
        }
    }
}
