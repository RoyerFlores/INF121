/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiplesPC;

/**
 *
 * @author Royer
 */
public class main {

    public static void main(String[] args) {
        MultiPilaPe A = new MultiPilaPe();
        A.adicionar(new Persona("Maria", 5), 1);
        A.adicionar(new Persona("Lucy", 9), 1);
        A.adicionar(new Persona("Pedro", 2), 1);
        A.adicionar(new Persona("Luis", 7), 1);

        A.adicionar(new Persona("Jorge", 10), 2);
        A.adicionar(new Persona("Rocio", 8), 2);

        A.adicionar(new Persona("Nora", 11), 3);
        A.adicionar(new Persona("Saul", 6), 3);
        A.adicionar(new Persona("Rene", 10), 3);

        A.adicionar(new Persona("Fanny", 5), 4);
        A.adicionar(new Persona("Roberto", 9), 4);
        A.setN(4);

        A.mostrar();

        //2 LLevar al último de cada pila a una nueva pila en las multipilas
        System.out.println("\n - EJERCICIO 2");
        llevar(A);

        A.mostrar();

        //3 Llevar el primero al último de la siguiente pila
        System.out.println("\n - EJERCICIO 3");
        primeroAlUltimo(A);
        A.mostrar();
    }

    public static void llevar(MultiPilaPe a) {
        for (int i = 1; i <= a.getN(); i++) {
            a.adicionar(a.eliminar(i), a.getN() + 1);
        }
        a.setN(a.getN() + 1);
    }

    public static void primeroAlUltimo(MultiPilaPe a) {
        PilaPe paux = new PilaPe();
        for (int i = 1; i <= a.getN(); i++) {
            while (!a.esVacia(i)) {
                paux.adicionar(a.eliminar(i));
            }
            Persona p = paux.eliminar();
            if (i == a.getN()) {
                a.adicionar(p, 1);
            } else {
                a.adicionar(p, i + 1);
            }
            a.vaciar(paux, i);
        }
    }

}
