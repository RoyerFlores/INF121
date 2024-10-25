/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioLCircular;

/**
 *
 * @author Royer
 */
public class LDCircularP {

    private NodoP p;

    LDCircularP() {
        p = null;
    }

    public NodoP getP() {
        return p;
    }

    public void setP(NodoP p) {
        this.p = p;
    }

    /*public void adiprincipio(int a, String b) {
        NodoG nue = new NodoG();
        nue.setNroG(a);
        nue.setNomG(b);;
        if (getP() == null) {
            setP(nue);
        } else {
            nue.setSig(getP());
            setP(nue);
        }
    }*/
    public void adifinal(Provincia x) {
        NodoP nue = new NodoP();
        nue.setB(x);
        if (getP() == null) {
            setP(nue);
            nue.setSig(getP());
            nue.setAnt(nue);
        } else {
            NodoP w = getP().getAnt();
            w.setSig(nue);
            nue.setAnt(w);
            nue.setSig(getP());
            getP().setAnt(nue);
        }
    }

    public void mostrar() {
        NodoP r = getP();
        if (r != null) {
            System.out.println("\n - Mostrando provincias -");
            while (r.getSig() != getP()) {
                r.getB().mostrar();
                r = r.getSig();
            }
            r.getB().mostrar();
        }
    }

    /*public NodoG eliPrincipio() {
        NodoG q = getP();
        if (q.getSig() == null) {
            setP(null);
        } else {
            setP(q.getSig());
            q.setSig(null);
        }
        return q;
    }*/
}
