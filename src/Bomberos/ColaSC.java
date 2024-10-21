/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bomberos;

/**
 *
 * @author Royer
 */
public class ColaSC {
    
    private int max = 50;
    private Carrera v[] = new Carrera[max + 1];
    private int ini;
    private int fin;

    //constructor
    public ColaSC() {
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

    void adicionar(Carrera x) {
        if (!esLlena()) {
            v[fin + 1] = x;
            fin++;
        } else {
            System.out.println("Cola llena");
        }
    }

    Carrera eliminar() {
        Carrera elem = null;
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
        ColaSC aux = new ColaSC();
        System.out.println(" - COLA PERSONAS -");
        while (!esVacia()) {
            Carrera x = eliminar();
            x.mostrar();
            aux.adicionar(x);
        }
        vaciar(aux);
    }

    void vaciar(ColaSC aux) {
        while (!aux.esVacia()) {
            adicionar(aux.eliminar());
        }
    }
}
