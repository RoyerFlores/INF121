/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DepartamentoProvincia;

/**
 *
 * @author Royer
 */
public class main {

    public static void main(String[] args) {
        CCircularP p1 = new CCircularP();
        p1.adicionar("Pacajes");
        p1.adicionar("Morillo");
        p1.adicionar("Aroma");

        CCircularP p2 = new CCircularP();
        p2.adicionar("Azurduy");
        p2.adicionar("Ooropeza");
        p2.adicionar("Tomina");

        CCircularP p3 = new CCircularP();
        p3.adicionar("Riveralta");
        p3.adicionar("Yacuma");
        p3.adicionar("Mojos");
        p3.adicionar("Antonio Vaca Diez");

        CCircularD Q = new CCircularD();
        Q.adicionar(new Departamento("La Paz", p1));
        Q.adicionar(new Departamento("Chuquisaca", p2));
        Q.adicionar(new Departamento("Beni", p3));
        Q.mostrar();
        
        System.out.println("\nEJERCICIO 1");
        ej1(Q, "Beni");
        System.out.println("\nEJERCICIO 2");
        ej2(Q);
    }

    public static void ej1(CCircularD a, String x) {
        int n = a.nroelem();
        for (int i = 1; i <= n; i++) {
            Departamento d = a.eliminar();
            if (d.nombre.equals(x)) {
                d.prov.mostrar();
            }
            a.adicionar(d);
        }
    }

    public static void ej2(CCircularD a) {
        int n = a.nroelem();
        int max = 0;
        for (int i = 1; i <= n; i++) {
            Departamento d = a.eliminar();
            if (d.getProv().nroelem() > max) {
                max = d.getProv().nroelem();
            }
            a.adicionar(d);
        }
        for (int i = 1; i <= n; i++) {
            Departamento d = a.eliminar();
            if (d.getProv().nroelem() == max) {
                System.out.println(d.getNombre());
            }
            a.adicionar(d);
        }
    }
}
