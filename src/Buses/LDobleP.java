/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buses;

/**
 *
 * @author Royer
 */
public class LDobleP {

    private NodoP p;

    LDobleP() {
        p = null;
    }

    public NodoP getP() {
        return p;
    }

    public void setP(NodoP p) {
        this.p = p;
    }

    public void adiprincipio(String a, String b, int c) {
        NodoP nue = new NodoP();
        nue.setNombre(a);
        nue.setCi(b);
        nue.setEdad(c);
        if (getP() == null) {
            setP(nue);
        } else {
            nue.setSig(getP());
            getP().setAnt(nue);
            setP(nue);
        }
    }

    public void mostrar() {
        NodoP r = getP();
        while (r != null) {
            System.out.println(" - " + r.getNombre() + " " + r.getEdad());
            r = r.getSig();
        }
    }

    public void adifinal(String nombre, String ci, int edad) {
        NodoP nue = new NodoP();
        nue.setNombre(nombre);
        nue.setEdad(edad);
        nue.setCi(ci);
        if (getP() == null) {
            setP(nue);
        } else {
            NodoP w = getP();
            while (w.getSig() != null) {
                w = w.getSig();
            }
            w.setSig(nue);
            nue.setAnt(w);
        }
    }
}
