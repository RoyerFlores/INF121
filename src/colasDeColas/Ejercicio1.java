/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colasDeColas;

/**
 *
 * @author Royer
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        PilaD a1 = new PilaD();
        a1.adicionar(new Documento(2, "carta"));
        a1.adicionar(new Documento(6, "planilla"));
        a1.adicionar(new Documento(9, "informe"));
        a1.adicionar(new Documento(4, "certificado"));

        PilaD a2 = new PilaD();
        a2.adicionar(new Documento(10, "proyecto"));
        a2.adicionar(new Documento(13, "listado"));
        a2.adicionar(new Documento(12, "reporte"));

        PilaD a3 = new PilaD();
        a3.adicionar(new Documento(24, "proyecto"));
        a3.adicionar(new Documento(26, "carta"));
        a3.adicionar(new Documento(21, "reporte"));

        CSimpleP Q = new CSimpleP();
        Q.adicionar(new Persona(11, "Lucy", a1));
        Q.adicionar(new Persona(22, "Jorge", a2));
        Q.adicionar(new Persona(33, "Maria", a3));

        Q.mostrar();
        //mostrar el nombre de las personas que tienen el tipo de documento x
        System.out.println("NOMBRE X");
        tipoX(Q, "carta");
        //LLevar a la persona con el nombre x, adelante
        System.out.println("\nLLEVAR ADELANTE JORGE");
        adelante(Q, "Jorge");
        Q.mostrar();
        //implementar de la cola de departamentos y provin
    }

    public static void tipoX(CSimpleP a, String x) {
        CSimpleP aux = new CSimpleP();
        PilaD paux = new PilaD();
        while (!a.esVacia()) {
            Persona px = a.eliminar();
            boolean sw = false;
            while (!px.getPd().esvacia()) {
                Documento d = px.getPd().eliminar();
                if (d.getTipo().equals(x)) {
                    sw = true;
                }
                paux.adicionar(d);
            }
            px.getPd().vaciar(paux);
            if (sw) {
                System.out.println(px.getNombre());
            }
            aux.adicionar(px);
        }
        a.vaciar(aux);
    }

    public static void adelante(CSimpleP a, String x) {
        CSimpleP aux = new CSimpleP();
        Persona nomx = null;
        boolean sw = false;
        while (!a.esVacia()) {
            Persona px = a.eliminar();
            if (px.getNombre().equals(x)) {
                nomx = px;
                sw=true;
            } else {
                aux.adicionar(px);
            }
        }
        if (sw) {
            a.adicionar(nomx);
            a.vaciar(aux);
        } else {
            System.out.println("No existe " + x);
            a.vaciar(aux);
        }
        a.vaciar(aux);
    }
}
