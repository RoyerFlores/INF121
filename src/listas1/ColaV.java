/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas1;

/**
 *
 * @author Royer
 */
public class ColaV {
    
    private int max = 50;
    private Vacunador v[] = new Vacunador[max + 1];
    private int ini;
    private int fin;

    //constructor
    public ColaV() {
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

    void adicionar(Vacunador x) {
        if (!esLlena()) {
            v[fin + 1] = x;
            fin++;
        } else {
            System.out.println("Cola llena");
        }
    }

    Vacunador eliminar() {
        Vacunador elem = null;
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
        ColaV aux = new ColaV();
        System.out.println(" - COLA VACUNADORES -");
        while (!esVacia()) {
            Vacunador x = eliminar();
            x.mostrar();
            aux.adicionar(x);
        }
        vaciar(aux);
    }

    void vaciar(ColaV aux) {
        while (!aux.esVacia()) {
            adicionar(aux.eliminar());
        }
    }
}
