/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaMultiple;

/**
 *
 * @author Royer
 */
public class LDobleM {

    NodoM p;

    public LDobleM() {
        p = null;
    }

    public NodoM getP() {
        return p;
    }

    public void setP(NodoM p) {
        this.p = p;
    }

    public void adicion(String a, String b, int c) {
        NodoM nuevo = new NodoM();
        nuevo.setNombre(a);
        nuevo.setTipo(b);
        nuevo.setEdad(c);
        if (getP() == null) {
            setP(nuevo);
        } else {
            NodoM r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
            nuevo.setAnt(r);
        }
    }

    public void mostrar() {
        NodoM w = getP();
        while (w != null) {
            System.out.print(w.getNombre() + ", " + w.getTipo() + ", " + w.getEdad()+"> ");
            w = w.getSig();
        }
        System.out.println();
    }
}
