/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colasDeColas;

/**
 *
 * @author Royer
 */
public class PilaD {

    private int max = 20;
    private Documento v[] = new Documento[max + 1];
    private int tope;

    public PilaD() {
        tope = 0;
    }

    boolean esvacia() {
        if (tope == 0) {
            return true;
        }
        return false;
    }

    boolean esllena() {
        return tope == max;
    }

    int nroelem() {
        return tope;
    }

    void adicionar(Documento d) {
        if (!esllena()) {
            tope++;
            v[tope] = d;
        } else {
            System.out.println("Pila llena");
        }
    }

    void mostrar() {
        PilaD aux = new PilaD();
        while (!esvacia()) {
            Documento d = eliminar();
            System.out.println(d);
            aux.adicionar(d);
        }
        vaciar(aux);
    }

    Documento eliminar() {
        Documento elem = null;
        if (!esvacia()) {
            elem = v[tope];
            tope--;
        } else {
            System.out.println("Pila Vacía");
        }
        return elem;
    }

    void vaciar(PilaD p) {
        while (!p.esvacia()) {
            adicionar(p.eliminar());
        }
    }
}
