/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaSimpleDoble;

/**
 *
 * @author Royer
 */
public class principal {

    public static void main(String[] args) {
        LSimpleG A = new LSimpleG();
        A.adiprincipio(1, "aa");
        A.adiprincipio(2, "bb");
        A.adiprincipio(3, "cc");
        A.adiprincipio(4, "dd");
        A.adiprincipio(5, "ee");
        System.out.println("\nLISTA DE GRUPOS");
        A.mostrar();
        A.eliPrincipio();
        System.out.println("\nLISTA DE GRUPOS");
        A.mostrar();

        LDobleI B = new LDobleI();
        B.adifinal("Lucy", 3);
        B.adifinal("Pedro", 1);
        B.adifinal("Maria", 5);
        B.adifinal("Luis", 3);
        B.adifinal("Jorge", 3);
        B.adifinal("Ana", 4);
        B.adifinal("Mery", 1);
        B.adifinal("Sucy", 3);
        B.adifinal("Rene", 2);
        B.adifinal("Sara", 5);
        B.adifinal("XXX", 3);
        System.out.println("\nLISTA DE INTEGRANTES");
        B.mostrar();
        B.elifinal();
        System.out.println("\nLISTA DE INTEGRANTES");
        B.mostrar();

        System.out.println("NUEVO GRUPO");
        nuevoDespuesDeX(A, "GGG", 2);
        A.mostrar();

        //eliminar al grupo con el nro x
        eliminarX(A, 2);
        A.mostrar();

        //eliminar a los integrantes de grupo con el nro x
        eliminaI(B, 3);
        System.out.println("ELIMINA INTEGRANTES");
        B.mostrar();

        //5 mostrar a los grupo y sus integrantes
        System.out.println("MOSTRAR GRUPOS E INTEGRANTES");
        GruposI(A, B);
    }

    public static void nuevoDespuesDeX(LSimpleG b, String c, int i) {
        NodoG nue = new NodoG();
        nue.setNroG(i);
        nue.setNomG(c);
        NodoG w = b.getP();
        while (w != null) {
            if (w.getNroG() == i) {
                NodoG w2 = w.getSig();
                w.setSig(nue);
                nue.setSig(w2);
            }
            w = w.getSig();
        }
    }

    public static void eliminarX(LSimpleG A, int x) {
        NodoG w = A.getP();
        NodoG anterior = null; // Para mantener el nodo anterior

        // Recorrer la lista
        while (w != null) {
            if (w.getNroG() == x) {
                if (anterior == null) {
                    // Eliminar el primer nodo
                    A.setP(w.getSig());
                } else {
                    // Eliminar cualquier otro nodo
                    anterior.setSig(w.getSig());
                }
                return; // Salimos después de eliminar el nodo
            }
            anterior = w; // Actualizar el nodo anterior
            w = w.getSig(); // Avanzar al siguiente nodo
        }
    }

    public static void eliminaI(LDobleI A, int x) {
        NodoI w = A.getP();
        NodoI w2, w3;
        w2 = w3 = null;
        while (w != null) {
            if (w.getNroG() == x) {//eliminar
                if (w == A.getP()) {
                    A.setP(w.getSig());
                    A.getP().setAnt(null);
                    w = A.getP();
                } else {
                    w2 = w.getAnt();
                    w3 = w.getSig();
                    w2.setSig(w3);
                    w3.setAnt(w2);
                    w = w3;
                }
            } else {
                w = w.getSig();
            }
        }
    }

    public static void GruposI(LSimpleG a, LDobleI b) {
        NodoG r1 = a.getP();
        while (r1 != null) {
            System.out.println("GRUPO: " + r1.getNomG());
            NodoI r2 = b.getP();
            while (r2 != null) {
                if (r2.getNroG() == r1.getNroG()) {
                    System.out.println("\t" + r2.getNom());
                }
                r2 = r2.getSig();
            }
            r1 = r1.getSig();
        }
    }
}
