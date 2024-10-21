/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiplesPC;

/**
 *
 * @author Royer
 */
public class PilaPe {
    private int max = 20;
    private Persona v[] = new Persona[max + 1];
    private int tope;

    public PilaPe() {
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

    void adicionar(Persona d) {
        if (!esllena()) {
            tope++;
            v[tope] = d;
        } else {
            System.out.println("Pila llena");
        }
    }

    void mostrar() {
        PilaPe aux = new PilaPe();
        while (!esvacia()) {
            Persona d = eliminar();
            d.mostrar();
            aux.adicionar(d);
        }
        vaciar(aux);
    }

    Persona eliminar() {
        Persona elem = null;
        if (!esvacia()) {
            elem = v[tope];
            tope--;
        } else {
            System.out.println("Pila Vacía");
        }
        return elem;
    }

    void vaciar(PilaPe p) {
        while (!p.esvacia()) {
            adicionar(p.eliminar());
        }
    }
}
