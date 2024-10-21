/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inf121;

/**
 *
 * @author Royer
 */
public class CSimpleE {

    private int max = 50;
    private Expositor v[] = new Expositor[max + 1];
    private int ini, fin;

    CSimpleE() {
        ini = fin = 0;
    }

    boolean esvacia() {
        if (ini == 0 && fin == 0) {
            return true;
        }
        return false;
    }
    
    boolean esVacia(){
        return ini==0 && fin==0;
    }

    boolean esllena() {
        if (fin == max) {
            return true;
        }
        return false;
    }

    int nroelem() {
        return fin - ini;
    }

    void adicionar(Expositor m) {
        if (!esllena()) {
            v[fin + 1] = m;
            fin++;
        } else {
            System.out.println("Cola llena");
        }
    }

    Expositor eliminar() {
        Expositor m = null;
        if (!esvacia()) {
            m = v[ini + 1];
            ini++;
            if (ini == fin) {
                ini = fin = 0;
            }
        } else {
            System.out.println("Cola vacia");
        }
        return m;
    }

    void mostrar() {
        CSimpleE aux = new CSimpleE();
        while (!esvacia()) {
            Expositor m = eliminar();
            m.mostrar();
            aux.adicionar(m);
        }
        vaciar(aux);
    }

    void vaciar(CSimpleE z) {
        while (!z.esvacia()) {
            adicionar(z.eliminar());
        }
    }
}
