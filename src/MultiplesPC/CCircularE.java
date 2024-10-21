/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiplesPC;

/**
 *
 * @author Royer
 */
public class CCircularE {

    private int max = 50;
    Estudiante v[] = new Estudiante[max + 1];
    int ini, fin;

    public CCircularE() //Cola Vacia
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

    void adicionar(Estudiante elem) {
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

    Estudiante eliminar() {
        Estudiante elem = null;
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
        CCircularE aux = new CCircularE();
        while (!esvacia()) {
            Estudiante elem = eliminar();
            elem.mostrar();
            aux.adicionar(elem);
        }
        vaciar(aux);
    }

    void vaciar(CCircularE z) {
        while (!z.esvacia()) {
            adicionar(z.eliminar());
        }
    }
}
