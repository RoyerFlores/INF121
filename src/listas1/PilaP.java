/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas1;

/**
 *
 * @author Royer
 */
public class PilaP {
    
    private int max = 20;
    private Propietario v[] = new Propietario[max + 1];
    private int tope;

    public PilaP() {
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

    void adicionar(Propietario d) {
        if (!esllena()) {
            tope++;
            v[tope] = d;
        } else {
            System.out.println("Pila llena");
        }
    }

    void mostrar() {
        PilaP aux = new PilaP();
        while (!esvacia()) {
            Propietario d = eliminar();
            d.mostrar();
            aux.adicionar(d);
        }
        vaciar(aux);
    }

    Propietario eliminar() {
        Propietario elem = null;
        if (!esvacia()) {
            elem = v[tope];
            tope--;
        } else {
            System.out.println("Pila Vacía");
        }
        return elem;
    }

    void vaciar(PilaP p) {
        while (!p.esvacia()) {
            adicionar(p.eliminar());
        }
    }
}
