/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioLCircular;

/**
 *
 * @author Royer
 */
public class LSCircularD {

    private NodoD p;

    LSCircularD() {
        p = null;
    }

    public NodoD getP() {
        return p;
    }

    public void setP(NodoD p) {
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
    public void adifinal(int a, String b) {
        NodoD nue = new NodoD();
        nue.setIdDpto(a);
        nue.setNomDpto(b);;
        if (getP() == null) {
            setP(nue);
            nue.setSig(nue);
        } else {
            NodoD r = getP();
            while (r.getSig() != getP()) {
                r = r.getSig();
            }
            r.setSig(nue);
            nue.setSig(getP());
        }
    }

    public void mostrar() {
        NodoD r = getP();
        System.out.println(" - Mostrando DEPARTAMENTOS -");
        if (r != null) {
            while (r.getSig() != getP()) {
                System.out.println("<" + r.getIdDpto() + " " + r.getNomDpto());
                r = r.getSig();
            }
            System.out.println("<" + r.getIdDpto() + " " + r.getNomDpto());
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
