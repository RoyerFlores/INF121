/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasRaras;

/**
 *
 * @author Royer
 */
public class principal {

    public static void main(String[] args) {
        ListaP A = new ListaP();
        A.adicionar(new Equipo("aa", 10, 10), new Equipo("bb", 11, 11), "01-01-2024", "10:00", 1, 0);
        A.adicionar(new Equipo("cc", 12, 5), new Equipo("dd", 11, 7), "01-01-2024", "10:00", 2, 2);
        A.adicionar(new Equipo("dd", 11, 6), new Equipo("aa", 10, 5), "01-01-2024", "10:00", 2, 4);
        //1
        A.mostrar();

        //2. Mostrar los datos de los partido empatados por el equipo con nombre x
        System.out.println("\n - Ejercicio 2 -");
        solucion1(A, "cc");

        //3. Cuantos partidos ha jugado el equipo con nombre x
        System.out.println("\n - Ejercicio 3 -");
        solucion2(A, "dd");

        //4. Crear y mostrar la lista de nombre y edad
        System.out.println("\n - Ejercicio 4 -");
        ListaNE B = new ListaNE();
        B.adicion("Juan", 20);
        B.adicion("Moises", 21);
        B.adicion("Charlie", 22);
        B.adicion("Alex", 20);

        B.mostrar();

        //5. Mostrar los nombres que tienen la edad x
        System.out.println("\n - Ejercicio 5 -");
        solucion4(B, 20);

    }

    public static void solucion1(ListaP a, String x) {
        NodoE1 r1 = a.getP();
        while (r1 != null) {
            NodoE2 r2 = r1.getAba();
            NodoPa r3 = r1.getSig();

            //.******
            if (r3.getNroGolE1() == r3.getNroGolE2()) {
                if (r1.getE1().getNombre().equals(x)
                        || r2.getE2().getNombre().equals(x)) {
                    System.out.println("Datos:" + r3.getFecha() + " " + r3.getHora());
                }
            }
            r1 = r3.getSig();
        }
    }

    public static void solucion2(ListaP a, String x) {
        NodoE1 r1 = a.getP();
        int c = 0;
        while (r1 != null) {
            NodoE2 r2 = r1.getAba();
            NodoPa r3 = r1.getSig();
            //.******
            if (r1.getE1().getNombre().equals(x)
                    || r2.getE2().getNombre().equals(x)) {
                c++;
            }
            r1 = r3.getSig();
        }
        System.out.println("Partidos jugados por " + x + ": " + c);
    }

    public static void solucion3(ListaP a, String x) {
        NodoE1 r1 = a.getP();
        int c = 0;
        while (r1 != null) {
            NodoE2 r2 = r1.getAba();
            NodoPa r3 = r1.getSig();
            //.******
            if (r1.getE1().getNombre().equals(x)
                    || r2.getE2().getNombre().equals(x)) {
                c++;
            }
            r1 = r3.getSig();
        }
        System.out.println("Partidos jugados por " + x + ": " + c);
    }

    public static void solucion4(ListaNE a, int x) {
        NodoNom r1 = a.getP();
        NodoEdad r2 = null;
        while (r1 != null) {
            r2 = r1.getSig();
            if (r2.getEdad() == x) {
                System.out.println(r1.getNombre());
            }
            r1 = r2.getSig();
        }

    }
}
