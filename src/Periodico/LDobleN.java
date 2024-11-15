/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Periodico;

/**
 *
 * @author Royer
 */
public class LDobleN {

    NodoN p;

    public LDobleN() {
        p = null;
    }

    public NodoN getP() {
        return p;
    }

    public void setP(NodoN p) {
        this.p = p;
    }

    public void adicion(String a, String b, String c, String d) {
        NodoN nuevo = new NodoN();
        nuevo.setTitulo(a);
        nuevo.setTexto(b);
        nuevo.setHoraPublicacion(c);
        nuevo.setAutor(d);
        if (getP() == null) {
            setP(nuevo);
        } else {
            NodoN r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
            nuevo.setAnt(r);
        }
    }

    public void mostrar() {
        NodoN w = getP();
        while (w != null) {
            System.out.println("Noticia: " + w.getTitulo() + ", Autor: " + w.getAutor() + "> ");
            w = w.getSig();
        }
        System.out.println();
    }
}
