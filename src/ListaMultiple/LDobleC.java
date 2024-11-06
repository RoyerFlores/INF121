/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaMultiple;

/**
 *
 * @author Royer
 */
public class LDobleC {

    private NodoC p;

    public LDobleC() {
        p = null;
    }

    public NodoC getP() {
        return p;
    }

    public void setP(NodoC p) {
        this.p = p;
    }

    public void adicion(String a, LSimpleA b) {
        NodoC nuevo = new NodoC();
        nuevo.setNombre(a);
        nuevo.setArchivos(b);
        if (getP() == null) {
            setP(nuevo);
        } else {
            NodoC r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
            nuevo.setAnt(r);
        }
    }

    public void mostrar() {
        NodoC w = getP();
        while (w != null) {
            System.out.println("Carpeta: " + w.getNombre() + "> ");
            w.getArchivos().mostrar();
            w = w.getSig();
        }
        System.out.println();
    }
}
