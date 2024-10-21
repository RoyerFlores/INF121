/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasDobles1;

/**
 *
 * @author Royer
 */
public class LDobleZ {

    private NodoZ p;

    LDobleZ() {
        p = null;
    }

    public NodoZ getP() {
        return p;
    }

    public void setP(NodoZ p) {
        this.p = p;
    }

    public void adiprincipio(int a, String b) {
        NodoZ nue = new NodoZ();
        nue.getZ().setNro(a);
        nue.getZ().setNombre(b);
        if (getP() == null) {
            setP(nue);
        } else {
            nue.setSig(getP());
            getP().setAnt(nue);
            setP(nue);
        }
    }

    public void mostrar() {
        NodoZ r = getP();
        System.out.println(" - Mostrando Zonas -");
        while (r != null) {
            System.out.println("<" + r.getZ().getNro() + " " + r.getZ().getNombre());
            r = r.getSig();
        }
    }

    public void adifinal(Zona a) {
        NodoZ nue = new NodoZ();
        nue.setZ(a);
        if (getP() == null) {
            setP(nue);
        } else {
            NodoZ w = getP();
            while (w.getSig() != null) {
                w = w.getSig();
            }
            w.setSig(nue);
            nue.setAnt(w);
        }
    }

}
