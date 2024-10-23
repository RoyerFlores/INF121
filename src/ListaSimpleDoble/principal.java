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
        nuevoDespuesDeX(A,"GGG", 2);
        A.mostrar();
    }

    public static void nuevoDespuesDeX(LSimpleG b,String c, int i) {
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
}
