/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas1;

/**
 *
 * @author Royer
 */
public class ColaM {
    
    private int max = 50;
    private Mascota v[] = new Mascota[max + 1];
    private int ini;
    private int fin;

    //constructor
    public ColaM() {
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

    void adicionar(Mascota x) {
        if (!esLlena()) {
            v[fin + 1] = x;
            fin++;
        } else {
            System.out.println("Cola llena");
        }
    }

    Mascota eliminar() {
        Mascota elem = null;
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
        ColaM aux = new ColaM();
        System.out.println(" - COLA MASCOTAS -");
        while (!esVacia()) {
            Mascota x = eliminar();
            x.mostrar();
            aux.adicionar(x);
        }
        vaciar(aux);
    }

    void vaciar(ColaM aux) {
        while (!aux.esVacia()) {
            adicionar(aux.eliminar());
        }
    }
}
