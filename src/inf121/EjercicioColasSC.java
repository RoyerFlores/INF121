/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inf121;

/**
 *
 * @author Royer
 */
public class EjercicioColasSC {

    public static void main(String[] args) {
        CSimpleE A = new CSimpleE();

        A.adicionar(new Expositor(3, "Luis", 33, 10));
        A.adicionar(new Expositor(2, "Pedro", 22, 11));
        A.adicionar(new Expositor(4, "María", 44, 1));
        A.adicionar(new Expositor(3, "Lucy", 22, 1));
        A.mostrar();

        CCircularA B = new CCircularA();
        B.adicionar(new Artesania(3, "alcancia", "madera", 5));
        B.adicionar(new Artesania(2, "florero", "madera", 20));
        B.adicionar(new Artesania(4, "gorra", "lana", 10));
        B.adicionar(new Artesania(4, "poncho", "lana", 30));
        B.adicionar(new Artesania(2, "plato", "madera", 40));
        B.adicionar(new Artesania(1, "adorno", "arcilla", 30));
        B.adicionar(new Artesania(4, "tapete", "hilo", 10));
        B.adicionar(new Artesania(2, "vaso", "madera", 30));
        B.adicionar(new Artesania(4, "chompa", "lana", 40));
        B.mostrar();

        //1. Mostrar a cada expositor con sus artesanías
        System.out.println(" - PROBLEMA 1 -");
        Problema1(A, B);
        //2. Del expositor con nombre X mostrar los nombre de sus artesanías
        System.out.println(" - PROBLEMA 2 - ");
        Problema2(A, B, "María");
        //3. Las artesanías del expositor con nombre X, llevar al final
        System.out.println(" - PROBLEMA 3 -");
        B.mostrar();
        Problema3(A, B, "María");
        //4. MOSTRAR LA(S) ARTESANÍA(S) CON MAYOR PRECIO
        System.out.println(" - PROBLEMA 4 -");
        Problema4(B);
        B.mostrar();
        //PROPUESTO DE CADA EXPOSITOR MOSTRAR LA ARTESANÍA(S) CON MAYOR PRECIO
    }

    public static void Problema1(CSimpleE a, CCircularA b) {
        CSimpleE aa = new CSimpleE();
        int n = b.nroelem();
        while (!a.esvacia()) {
            Expositor ex = a.eliminar();
            System.out.print("\nEXPOSITOR: ");
            ex.mostrar();
            System.out.println("\nARTESANIAS: ");
            for (int i = 1; i <= n; i++) {
                Artesania ar = b.eliminar();
                if (ex.getCi() == ar.getCi()) {
                    ar.mostrar();
                }
                b.adicionar(ar);
            }
            aa.adicionar(ex);
        }
        a.vaciar(aa);
    }

    public static void Problema2(CSimpleE a, CCircularA b, String c) {
        CSimpleE aa = new CSimpleE();
        while (!a.esvacia()) {
            Expositor ex = a.eliminar();
            if (ex.getNombre().equals(c)) {
                System.out.println("\nARTESANIAS DE " + c);
                int n = b.nroelem();
                for (int i = 1; i <= n; i++) {
                    Artesania ar = b.eliminar();
                    if (ar.getCi() == ex.getCi()) {
                        ar.mostrar();
                    }
                    b.adicionar(ar);
                }
            }
            aa.adicionar(ex);
        }
        a.vaciar(aa);
    }

    public static void Problema3(CSimpleE a, CCircularA b, String c) {
        CSimpleE aa = new CSimpleE();
        CCircularA bb = new CCircularA();
        while (!a.esvacia()) {
            Expositor ex = a.eliminar();
            if (ex.getNombre().equals(c)) {
                int n = b.nroelem();
                for (int i = 1; i <= n; i++) {
                    Artesania ar = b.eliminar();
                    if (ar.getCi() == ex.getCi()) {
                        bb.adicionar(ar);
                    } else {
                        b.adicionar(ar);
                    }
                }
                b.vaciar(bb);
            }
            aa.adicionar(ex);
        }
        a.vaciar(aa);

    }

    public static void Problema4(CCircularA b) {
        int n = b.nroelem();
        double max = 0;
        Artesania ar;
        for (int i = 1; i <= n; i++) {
            ar = b.eliminar();
            b.adicionar(ar);
            if (ar.getPrecio() > max) {
                max = ar.getPrecio();
            }
        }
        for (int i = 1; i <= n; i++) {
            ar = b.eliminar();
            b.adicionar(ar);
            if (ar.getPrecio() == max) {
                ar.mostrar();
            }
        }
    }

}
