/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bomberos;

/**
 *
 * @author Royer
 */
public class PilaE {
    private int max = 20;
    private Estudiante v[] = new Estudiante[max + 1];
    private int tope;

    public PilaE() {
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

    void adicionar(Estudiante d) {
        if (!esllena()) {
            tope++;
            v[tope] = d;
        } else {
            System.out.println("Pila llena");
        }
    }

    void mostrar() {
        PilaE aux = new PilaE();
        while (!esvacia()) {
            Estudiante d = eliminar();
            d.mostrar();
            aux.adicionar(d);
        }
        vaciar(aux);
    }

    Estudiante eliminar() {
        Estudiante elem = null;
        if (!esvacia()) {
            elem = v[tope];
            tope--;
        } else {
            System.out.println("Pila Vacía");
        }
        return elem;
    }

    void vaciar(PilaE p) {
        while (!p.esvacia()) {
            adicionar(p.eliminar());
        }
    }
}
