/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasEnListas;

/**
 *
 * @author Royer
 */
public class Principal {

    public static void main(String[] args) {
        ListaR r1 = new ListaR();
        r1.adicion("3/10/2024", "Pilas");
        r1.adicion("5/10/2024", "Colas");
        r1.adicion("5/10/2024", "Colas Circulares");

        ListaR r2 = new ListaR();
        r2.adicion("10/10/2024", "Listas");

        ListaE e1 = new ListaE();
        e1.adicion("2do Parcial", 15);
        e1.adicion("Examen Final", 17);
        e1.adicion("Ayudantía", 4);

        ListaE e2 = new ListaE();
        e2.adicion("1er Parcial", 10);
        e2.adicion("2do Parcial", 7);
        e2.adicion("Examen Final", 20);
        e2.adicion("Practicas ", 6);
        e2.adicion("Proyecto", 13);

        ListaA A = new ListaA();
        A.adicion("111", "Ana", "Perez", "Rios", r1.getP(), e2.getP());
        A.adicion("222", "Luis", "Nina", "Quiroga", null, null);
        A.adicion("333", "Pedro", "Torrez", "Salas", r2.getP(), e1.getP());

        //1
        A.mostrar();

        //2
        System.out.println("\n - NOTAS PRIMER PARCIAL - ");
        primerParcial(A);
        
        
        System.out.println("\n - LISTA DE APROBADOS - ");
        aprobados(A);

        //3
        System.out.println("\n - NOTA DE CADA ESTUDIANTE - ");
        notas(A);

        //5
        System.out.println("\n - Cantidad de tares de estudiante: Ana - ");
        contarEstX(A, "Ana");
    }

    public static void aprobados(ListaA A) {
        NodoA w = A.getP();
        while (w != null) {
            if (notaTotal(w.getD2()) >= 51) {
                System.out.println(w.getNombre() + " " + w.getPat() + " " + w.getMat());
            }
            w = w.getSig();
        }
    }

    public static void primerParcial(ListaA A) {
        NodoA w = A.getP();
        while (w != null) {
            System.out.println(w.getNombre() + " " + w.getPat() + " " + w.getMat());
            NodoE p = w.getD2();
            while (p != null) {
                if (p.getItem().equals("1er Parcial")) {
                    System.out.println("Nota: " + p.getNota());
                }
                p=p.getSig();
            }
            w = w.getSig();
        }
    }

    public static void notas(ListaA A) {
        NodoA w = A.getP();
        while (w != null) {
            {
                System.out.println(w.getNombre() + " " + w.getPat() + " " + w.getMat() + ": " + notaTotal(w.getD2()));
                w = w.getSig();
            }
        }
    }

    public static int notaTotal(NodoE d) {
        int t = 0;
        NodoE r = d;
        while (r != null) {
            t = (int) (t + r.getNota());
            r = r.getSig();
        }
        return t;
    }

    public static void contarEstX(ListaA a, String x) {
        int c = 0;
        NodoA p = a.getP();
        while (p != null) {
            if (p.getNombre().equals(x)) {
                NodoR w = p.getD1();
                while (w != null) {
                    c++;
                    w = w.getSig();
                }
            }
            p = p.getSig();
        }
        System.out.println("Total: " + c);
    }
}
