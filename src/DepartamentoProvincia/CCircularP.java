/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DepartamentoProvincia;

/**
 *
 * @author Royer
 */
public class CCircularP {

    private int max = 50;
    private String v[] = new String[max + 1];
    int ini, fin;

    public CCircularP() //Cola Vacia
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

    void adicionar(String elem) {
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

    String eliminar() {
        String elem = null;
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
        CCircularP aux = new CCircularP();
        while (!esvacia()) {
            String elem = eliminar();
            System.out.println(elem);
            aux.adicionar(elem);
        }
        vaciar(aux);
    }

    void vaciar(CCircularP z) {
        while (!z.esvacia()) {
            adicionar(z.eliminar());
        }
    }
}
