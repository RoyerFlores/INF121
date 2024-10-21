/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keGrande;

/**
 *
 * @author Royer
 */
public class PilaM {
    
    private int max = 20;
    private Municipio v[] = new Municipio[max + 1];
    private int tope;

    public PilaM() {
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

    void adicionar(Municipio d) {
        if (!esllena()) {
            tope++;
            v[tope] = d;
        } else {
            System.out.println("Pila llena");
        }
    }

    void mostrar() {
        PilaM aux = new PilaM();
        while (!esvacia()) {
            Municipio d = eliminar();
            System.out.println(d);
            aux.adicionar(d);
        }
        vaciar(aux);
    }

    Municipio eliminar() {
        Municipio elem = null;
        if (!esvacia()) {
            elem = v[tope];
            tope--;
        } else {
            System.out.println("Pila Vacía");
        }
        return elem;
    }

    void vaciar(PilaM p) {
        while (!p.esvacia()) {
            adicionar(p.eliminar());
        }
    }
}
