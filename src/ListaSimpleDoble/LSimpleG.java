/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaSimpleDoble;

/**
 *
 * @author Royer
 */
public class LSimpleG {

    private NodoG p;

    LSimpleG() {
        p = null;
    }

    public NodoG getP() {
        return p;
    }

    public void setP(NodoG p) {
        this.p = p;
    }

    public void adiprincipio(int a, String b) {
        NodoG nue = new NodoG();
        nue.setNroG(a);
        nue.setNomG(b);;
        if (getP() == null) {
            setP(nue);
        } else {
            nue.setSig(getP());
            setP(nue);
        }
    }
    
    public void adifinal(int a, String b) {
        NodoG nue = new NodoG();
        nue.setNroG(a);
        nue.setNomG(b);;
        if (getP() == null) {
            setP(nue);
        } else {
            NodoG r=getP();
            while(r.getSig()!=null){
                r=r.getSig();
            }
            r.setSig(nue);
        }
    }

    public void mostrar() {
        NodoG r = getP();
        System.out.println(" - Mostrando Municipios -");
        while (r != null) {
            System.out.println("<" + r.getNroG() + " " + r.getNomG());
            r = r.getSig();
        }
    }

    public NodoG eliPrincipio() {
        NodoG q = getP();
        if (q.getSig() == null) {
            setP(null);
        } else {
            setP(q.getSig());
            q.setSig(null);
        }
        return q;
    }
}
