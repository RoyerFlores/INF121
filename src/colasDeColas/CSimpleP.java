/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colasDeColas;

/**
 *
 * @author Royer
 */
public class CSimpleP {

    private int max = 50;
    private Persona v[] = new Persona[max + 1];
    private int ini;
    private int fin;

    //constructor
    public CSimpleP() {
        ini = fin = 0;
    }

    boolean esVacia() {
        if (ini == 0 && fin == 0) {
            return true;
        }
        return false;
    }

    boolean esLlena() {
        if (fin == max) {
            return true;
        }
        return false;
    }

    int nroElem() {
        return fin - ini;
    }

    void adicionar(Persona x) {
        if (!esLlena()) {
            v[fin + 1] = x;
            fin++;
        } else {
            System.out.println("Cola llena");
        }
    }

    Persona eliminar() {
        Persona elem = null;
        if (!esVacia()) {
            elem = v[ini + 1];
            ini++;
            if (ini == fin) {
                ini = fin = 0;
            }
        } else {
            System.out.println("Cola vacía");
        }
        return elem;
    }

    void mostrar() {
        CSimpleP aux = new CSimpleP();
        System.out.println(" - COLA PERSONAS -");
        while (!esVacia()) {
            Persona x = eliminar();
            x.mostrar();
            aux.adicionar(x);
        }
        vaciar(aux);
    }

    void vaciar(CSimpleP aux) {
        while (!aux.esVacia()) {
            adicionar(aux.eliminar());
        }
    }
}