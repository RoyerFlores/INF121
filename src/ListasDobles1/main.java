/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasDobles1;

/**
 *
 * @author Royer
 */
public class main {

    public static void main(String[] args) {
        LDobleM A = new LDobleM();
        A.adiprincipio(1, "Centro", 25, 10000);
        A.adiprincipio(2, "Cotahuma", 50, 18000);
        A.adiprincipio(3, "Periferica", 73, 9000);
        A.adiprincipio(4, "Sur", 65, 13500);
        A.adiprincipio(5, "San Antonio", 35, 1500);
        A.adiprincipio(6, "Max Parédes", 43, 3500);
        A.adiprincipio(7, "Mallasa", 160, 1100);
        A.adiprincipio(8, "Hampaturi", 145, 10000);
        A.adiprincipio(9, "Zongo", 260, 10000);
        //1
        A.mostrar();

        //Lista de objetos zona (nro, nombre)
        LDobleZ B = new LDobleZ();
        B.adifinal(new Zona(1, "San Jorge"));
        B.adifinal(new Zona(1, "El Tejar"));
        B.adifinal(new Zona(2, "Tembladerani"));
        B.adifinal(new Zona(2, "Chisquipampa"));
        B.adifinal(new Zona(3, "Munaypata"));
        B.adifinal(new Zona(3, "San Jorge"));
        B.adifinal(new Zona(4, "El Tejar"));
        B.adifinal(new Zona(4, "Tembladerani"));
        B.adifinal(new Zona(4, "Chisquipampa"));
        B.adifinal(new Zona(5, "Munaypata"));
        B.adifinal(new Zona(6, "San Jorge"));
        B.adifinal(new Zona(6, "El Tejar"));

        //2
        B.mostrar();

        //3. Mostrar la superficie del macrodistrito X
        mostrarSuperficieX(A, "Sur");

        //4. Mostrar cada macrodistrito y sus zonas
        mostrarMZ(A, B);

        //5. Mostrar las zonas con macrodistrito de nombre X
        mostrarZMX(A, B, "Sur");
    }

    public static void mostrarSuperficieX(LDobleM A, String x) {
        NodoM r = A.getP();
        while (r != null) {
            if (r.getNombre().equals(x)) {
                System.out.println("Superficie del macrodistrito " + x + ": " + r.getKm2() + " Km2");
            }
            r = r.getSig();
        }
    }

    public static void mostrarMZ(LDobleM A, LDobleZ B) {
        NodoM r = A.getP();
        while (r != null) {
            System.out.println("<" + r.getNro() + " " + r.getKm2() + " " + r.getNombre() + " " + r.getNhabitantes());
            NodoZ s = B.getP();
            while (s != null) {
                if (s.getZ().getNro() == r.getNro()) {
                    System.out.println("\t" + s.getZ().getNro() + " " + s.getZ().getNombre());
                }
                s = s.getSig();
            }
            r = r.getSig();
        }
    }

    public static void mostrarZMX(LDobleM A, LDobleZ B, String x) {
        NodoM r = A.getP();
        while (r != null) {
            NodoZ s = B.getP();
            if (r.getNombre().equals(x)) {
                System.out.println("Zonas del macrodistrito " + r.getNombre() + ": ");
                while (s != null) {
                    if (s.getZ().getNro() == r.getNro()) {
                        System.out.println("\t" + s.getZ().getNro() + " " + s.getZ().getNombre());
                    }
                    s = s.getSig();
                }
            }
            r = r.getSig();
        }
    }
}
