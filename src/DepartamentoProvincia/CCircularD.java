/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DepartamentoProvincia;

/**
 *
 * @author Royer
 */
public class CCircularD {

    private int max = 50;
    private Departamento v[] = new Departamento[max + 1];
    int ini, fin;

    public CCircularD() //Cola Vacia
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

    void adicionar(Departamento elem) {
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

    Departamento eliminar() {
        Departamento elem = null;
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
        CCircularD aux = new CCircularD();
        while (!esvacia()) {
            Departamento elem = eliminar();
            elem.mostrar();
            aux.adicionar(elem);
        }
        vaciar(aux);
    }

    void vaciar(CCircularD z) {
        while (!z.esvacia()) {
            adicionar(z.eliminar());
        }
    }
}
