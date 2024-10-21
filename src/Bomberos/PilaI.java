/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bomberos;

/**
 *
 * @author Royer
 */
public class PilaI {
    private int max = 20;
    private Insumo v[] = new Insumo[max + 1];
    private int tope;

    public PilaI() {
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

    void adicionar(Insumo d) {
        if (!esllena()) {
            tope++;
            v[tope] = d;
        } else {
            System.out.println("Pila llena");
        }
    }

    void mostrar() {
        PilaI aux = new PilaI();
        while (!esvacia()) {
            Insumo d = eliminar();
            d.mostrar();
            aux.adicionar(d);
        }
        vaciar(aux);
    }

    Insumo eliminar() {
        Insumo elem = null;
        if (!esvacia()) {
            elem = v[tope];
            tope--;
        } else {
            System.out.println("Pila Vacía");
        }
        return elem;
    }

    void vaciar(PilaI p) {
        while (!p.esvacia()) {
            adicionar(p.eliminar());
        }
    }
}
