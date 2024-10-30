/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasRaras;

/**
 *
 * @author Royer
 */
public class ListaP {

    NodoE1 p;

    public ListaP() {
        p = null;
    }

    public NodoE1 getP() {
        return p;
    }

    public void setP(NodoE1 p) {
        this.p = p;
    }

    public void adicionar(Equipo a, Equipo b, String c, String d, int e, int f) {
        NodoE1 nue1 = new NodoE1(a);
        NodoE2 nue2 = new NodoE2(b);
        NodoPa nueP = new NodoPa();
        nueP.setFecha(c);
        nueP.setHora(d);
        nueP.setNroGolE1(e);
        nueP.setNroGolE2(f);

        nue1.setSig(nueP);
        nue1.setAba(nue2);
        nue2.setSig(nueP);
        nueP.setAnt(nue1);
        nueP.setAnt2(nue2);

        if (getP() == null) {
            setP(nue1);
        } else {
            NodoE1 r1 = getP();
            NodoPa r2 = r1.getSig();
            while (r2.getSig() != null) {
                r1 = r2.getSig();
                r2 = r1.getSig();
            }
            r2.setSig(nue1);
        }
    }

    public void mostrar() {
        NodoE1 r1 = getP();
        while (r1 != null) {
            NodoE2 r2 = r1.getAba();
            NodoPa r3 = r1.getSig();
            r1.getE1().mostrar();
            r2.getE2().mostrar();
            System.out.println("PARTIDO: " + r3.getFecha() + " " + r3.getHora() + " " + r3.getNroGolE1() + " " + r3.getNroGolE2());
            r1 = r3.getSig();
        }
    }
}
