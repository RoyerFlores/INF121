/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioLCircular;

/**
 *
 * @author Royer
 */
public class principal {

    public static void main(String[] args) {
        //SEA UNA LISTA DE DESPARTAMENTOS DEL PAIS (idDpto, nombreDpto)
        //SEA UNA LISTA DE PROVINCIAS DEL PAIS(iddpto, nomProv)
        LSCircularD A = new LSCircularD();
        A.adifinal(1, "LA PAZ");
        A.adifinal(2, "SANTA CRUZ");
        A.adifinal(3, "COCHABAMBA");
        A.adifinal(4, "PANDO");
        A.adifinal(5, "BENI");
        A.adifinal(6, "TARIJA");
        A.adifinal(7, "ORURO");
        A.adifinal(8, "CHUQUISACA");
        A.adifinal(9, "POTOSÍ");
        A.mostrar();

        LDCircularP B = new LDCircularP();
        B.adifinal(new Provincia(1, "Murillo"));
        B.adifinal(new Provincia(1, "Iturralde"));
        B.adifinal(new Provincia(2, "Cercado"));
        B.adifinal(new Provincia(2, "punata"));
        B.adifinal(new Provincia(3, "Gran Chaco"));
        B.mostrar();

        System.out.println(" - Mostrando Departamentos con provincias");
        DptoProv(A, B);

        System.out.println("\n - Mostrando Departamento con la pronvicia de nombre Murillo");
        mostrarNombreX(A, B, "Murillo");

        System.out.println("\n - Mostrando provincias por departamento");
        provinciasPorDpto(A, B);

        System.out.println("\n - Mostrando provincias departamento Santa Cruz");
        mostrarPronviciasDptoX(A, B, "SANTA CRUZ");
    }

    public static void DptoProv(LSCircularD A, LDCircularP B) {
        NodoD r = A.getP();
        if (r != null) {
            System.out.println("");
            while (r.getSig() != A.getP()) {
                System.out.println("<" + r.getIdDpto() + " - " + r.getNomDpto());
                NodoP w = B.getP();
                if (w != null) {
                    while (w.getSig() != B.getP()) {
                        if (r.getIdDpto() == w.getB().getIdDpto()) {
                            System.out.println("\t- " + w.getB().getNombreProv());
                        }
                        w = w.getSig();
                    }
                    if (r.getIdDpto() == w.getB().getIdDpto()) {
                        w.getB().mostrar();
                    }
                }
                r = r.getSig();
            }
            System.out.println("<" + r.getIdDpto() + " - " + r.getNomDpto());
            NodoP w = B.getP();
            if (w != null) {
                while (w.getSig() != B.getP()) {
                    if (r.getIdDpto() == w.getB().getIdDpto()) {
                        System.out.println("\t- " + w.getB().getNombreProv());
                    }
                    w = w.getSig();
                }
                if (r.getIdDpto() == w.getB().getIdDpto()) {
                    w.getB().mostrar();
                }
            }
            r = r.getSig();
        }
    }

    public static void mostrarNombreX(LSCircularD A, LDCircularP B, String x) {
        NodoD r = A.getP();
        if (r != null) {
            System.out.println("");
            while (r.getSig() != A.getP()) {
                NodoP w = B.getP();
                if (w != null) {
                    while (w.getSig() != B.getP()) {
                        if (w.getB().getNombreProv().equals(x)
                                && w.getB().getIdDpto() == r.idDpto) {
                            r.mostrar();
                        }
                        w = w.getSig();
                    }
                    if (w.getB().getNombreProv().equals(x)) {
                        r.mostrar();
                    }
                }
                r = r.getSig();
            }
            NodoP w = B.getP();
            if (w != null) {
                while (w.getSig() != B.getP()) {
                    if (w.getB().getNombreProv().equals(x)
                            && w.getB().getIdDpto() == r.idDpto) {
                        r.mostrar();
                    }
                    w = w.getSig();
                }
                if (w.getB().getNombreProv().equals(x)) {
                    r.mostrar();
                }
            }
            r = r.getSig();
        }
    }

    public static void provinciasPorDpto(LSCircularD A, LDCircularP B) {
        NodoD r = A.getP();
        int c;
        if (r != null) {
            System.out.println("");
            while (r.getSig() != A.getP()) {
                NodoP w = B.getP();
                c = 0;
                if (w != null) {
                    while (w.getSig() != B.getP()) {
                        if (w.getB().getIdDpto() == r.idDpto) {
                            c++;
                        }
                        w = w.getSig();
                    }
                    if (w.getB().getIdDpto() == r.idDpto) {
                        c++;
                    }
                    System.out.println(r.getNomDpto() + ":\t" + c);
                }
                r = r.getSig();
            }
            NodoP w = B.getP();
            c = 0;
            if (w != null) {
                while (w.getSig() != B.getP()) {
                    if (w.getB().getIdDpto() == r.idDpto) {
                        c++;
                    }
                    w = w.getSig();
                }
                if (w.getB().getIdDpto() == r.idDpto) {
                    c++;
                }
                System.out.println(r.getNomDpto() + ":\t" + c);
            }
        }
    }

    public static void mostrarPronviciasDptoX(LSCircularD A, LDCircularP B, String x) {
        NodoD r = A.getP();
        if (r != null) {
            while (r.getSig() != A.getP()) {
                if (r.getNomDpto().equals(x)) {
                    NodoP w = B.getP();
                    if (w != null) {
                        while (w.getSig() != B.getP()) {
                            if (w.getB().getIdDpto() == r.idDpto) {
                                System.out.println("\t- " + w.getB().getNombreProv());
                            }
                            w = w.getSig();
                        }
                        if (w.getB().getIdDpto() == r.idDpto) {
                            System.out.println("\t- " + w.getB().getNombreProv());
                        }
                    }
                }
                r = r.getSig();
            }
            if (r.getNomDpto().equals(x)) {
                NodoP w = B.getP();
                if (w != null) {
                    while (w.getSig() != B.getP()) {
                        if (w.getB().getIdDpto() == r.idDpto) {
                            System.out.println("\t- " + w.getB().getNombreProv());
                        }
                        w = w.getSig();
                    }
                    if (w.getB().getIdDpto() == r.idDpto) {
                        System.out.println("\t- " + w.getB().getNombreProv());
                    }
                }
            }
        }
    }
}
