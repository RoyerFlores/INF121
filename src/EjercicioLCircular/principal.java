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

        DptoProv(A, B);
    }

    public static void DptoProv(LSCircularD A, LDCircularP B) {
        NodoD r = A.getP();
        if (r != null) {
            System.out.println("");
            while (r.getSig() != A.getP()) {
                System.out.println("< " + r.getIdDpto() + " - " + r.getNomDpto());
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
            System.out.println("< " + r.getIdDpto() + " - " + r.getNomDpto());
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
}
