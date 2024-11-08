/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasEnListas;

/**
 *
 * @author Royer
 */
public class ListaA {

    private NodoA p;

    public ListaA() {
        p = null;
    }

    public NodoA getP() {
        return p;
    }

    public void setP(NodoA p) {
        this.p = p;
    }

    public void adicion(String a, String b, String c, String d, NodoR e, NodoE f) {
        NodoA nue = new NodoA();
        nue.setCi(a);
        nue.setNombre(b);
        nue.setPat(c);
        nue.setMat(d);
        nue.setD1(e);
        nue.setD2(f);

        if (getP() == null) {
            setP(nue);
        } else {
            NodoA p = getP();
            while (p.getSig() != null) {
                p = p.getSig();
            }
            p.setSig(nue);
        }
    }

    public void mostrar() {
        NodoA p = getP();
        while (p != null) {
            System.out.println("\n" + p.getCi() + " " + p.getNombre() + " " + p.getPat() + " " + p.getMat());

            System.out.println("\n - LISTA REPASOS -");
            ListaR aux1 = new ListaR();
            aux1.setP(p.getD1());
            aux1.mostrar();

            System.out.println("\n - LISTA EVALUACIONES -");
            ListaE aux2 = new ListaE();
            aux2.setP(p.getD2());
            aux2.mostrar();
            p = p.getSig();
        }
    }
}
