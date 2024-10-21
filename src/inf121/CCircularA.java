/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inf121;

/**
 *
 * @author Royer
 */
public class CCircularA {

    private int max = 50;
    Artesania v[] = new Artesania[max + 1];
    int ini, fin;

    public CCircularA() //Cola Vacia
    {
        ini = fin = 0;
    }

    int nroelem() {
        if (ini == 0 && fin == 0) {
            return 0;
        }
        if (fin > ini) {
            return fin - ini;
        }
        return max - ini + fin;
    }

    boolean esvacia() {
        if (nroelem() == 0) {
            return true;
        }
        return false;
    }

    boolean esllena() {
        if (nroelem() == max) {
            return true;
        }
        return false;
    }

    void adicionar(Artesania elem) {
        if (!esllena()) {
            if (fin == max) {
                fin = 1;
            } else {
                fin = fin + 1;
            }
            v[fin] = elem;
        } else {
            System.out.println("Cola llena");
        }
    }

    Artesania eliminar() {
        Artesania elem = null;
        if (!esvacia()) {
            ini = ini + 1;
            elem = v[ini];
            if (ini == max) {
                ini = 0;
            }
            if (ini == fin) {
                ini = fin = 0;
            }
        } else {
            System.out.println("cola vacia");
        }
        return elem;
    }

    void mostrar() {
        CCircularA aux = new CCircularA();
        while (!esvacia()) {
            Artesania elem = eliminar();
            elem.mostrar();
            aux.adicionar(elem);
        }
        vaciar(aux);
    }

    void vaciar(CCircularA z) {
        while (!z.esvacia()) {
            adicionar(z.eliminar());
        }
    }
}
