/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buses;

/**
 *
 * @author Royer
 */
public class principal {

    public static void main(String[] args) {
        LDobleP p1 = new LDobleP();
        p1.adifinal("Moises", "1324", 20);
        p1.adifinal("Rick", "12341", 21);
        p1.adifinal("Axel", "352", 22);
        p1.adifinal("Charlie", "6345", 23);

        LDobleP p2 = new LDobleP();
        p2.adifinal("Jorge", "123", 20);
        p2.adifinal("Juan", "324", 21);
        p2.adifinal("Joel", "5345", 22);
        p2.adifinal("Yudith", "234", 23);

        LDobleP p3 = new LDobleP();
        p3.adifinal("Maria", "12453", 30);
        p3.adifinal("Marcos", "32344", 31);
        p3.adifinal("Mirtha", "53435", 32);
        p3.adifinal("Miguel", "23344", 33);
        p3.adifinal("Mireya", "2134", 34);

        LDobleB A = new LDobleB();
        A.adifinal(new Conductor("Katy", "B", 32), "aaa111", 35, p1);
        A.adifinal(new Conductor("Karina", "C", 30), "bbb222", 25, p2);
        A.adifinal(new Conductor("Wllson", "C", 35), "ccc333", 40, p3);

        A.mostrar();

        System.out.println("\n - LLevar -");
        llevar(A, 2);
        A.mostrar();

        System.out.println("\n - Mostrar Iésimo -");
        mostrarI(A, 2);

        System.out.println("\n - LLevar al primero -");
        llevarAlPrimero(A);
        A.mostrar();
    }

    public static void llevar(LDobleB A, int i) {
        NodoB nue = new NodoB();
        nue.setPlaca("xxx999");
        nue.setCapacidad(20);
        nue.setA(new Conductor("Wilder", "B", 40));

        NodoB r = A.getP();
        while (r != null) {
            NodoP ip = iesimo(r.getB(), i);
            if (ip != null) {
                adicion(nue.getB(), ip);
            }
            r = r.getSig();
        }
        r = A.getP();
        while (r.getSig() != null) {
            r = r.getSig();
        }
        r.setSig(nue);
        nue.setAnt(r);
    }

    public static NodoP iesimo(LDobleP a, int i) {
        NodoP w = a.getP();
        int c = 0;
        while (w != null) {
            c++;
            if (c == i) {
                if (i == 1) {
                    a.setP(w.getSig());
                    a.getP().setAnt(null);
                    w.setSig(null);
                } else {
                    NodoP p = w.getAnt();
                    NodoP b = w.getSig();
                    p.setSig(b);
                    if (b != null) {
                        b.setAnt(p);
                    }
                    w.setAnt(null);
                    w.setSig(null);
                }
                return w;
            }
            w = w.getSig();
        }
        return null;
    }

    public static void adicion(LDobleP a, NodoP ip) {
        NodoP w = a.getP();
        if (w == null) {
            a.setP(ip);
        } else {
            while (w.getSig() != null) {
                w = w.getSig();
            }
            w.setSig(ip);
            ip.setAnt(w);
        }
    }

    public static void llevarAlPrimero(LDobleB a) {
        NodoB p = a.getP();
        if (p != null && p.getSig() != null) {
            NodoB w = p.getSig();
            while (w != null) {
                if (w.getB().getP() != null) {
                    NodoP b = w.getB().getP();

                    w.getB().setP(b.getSig());
                    if (w.getB().getP().getSig() != null) {
                        w.getB().getP().setAnt(null);
                    }
                    b.setSig(null);
                    adicion(p.getB(), b);
                }
                w = w.getSig();
            }
        }
    }

    public static void mostrarI(LDobleB a, int i) {
        NodoB w = a.getP();
        int c = 0;
        while (w != null) {
            c++;
            if (c == i) {
                System.out.println("< " + w.getPlaca() + ", Conductor:  " + w.getA().getNom());
                w.getB().mostrar();
                w = w.getSig();
            }
            w = w.getSig();
        }
    }
}
