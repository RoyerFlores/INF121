/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bomberos;

/**
 *
 * @author Royer
 */
public class main {

    public static void main(String[] args) {
        ColaSC A = new ColaSC();

        PilaE e1 = new PilaE();
        e1.adicionar(new Estudiante(11, "Juan", "López", "Rioa", "2do Semestre"));
        e1.adicionar(new Estudiante(12, "Lucy", "Nina", "Soria", "5do Semestre"));

        A.adicionar(new Carrera("Informatica", e1));

        PilaE e2 = new PilaE();
        e2.adicionar(new Estudiante(11, "Luis", "Mita", "Quispe", "1do Semestre"));
        e2.adicionar(new Estudiante(12, "Pedro", "Loza", "Soza", "4do Semestre"));
        e2.adicionar(new Estudiante(12, "Maira", "Mendoza", "Nina", "3do Semestre"));

        A.adicionar(new Carrera("Medicina", e2));

        PilaE e3 = new PilaE();
        e3.adicionar(new Estudiante(55, "Fany", "Duran", "Jurado", "7do Semestre"));

        A.adicionar(new Carrera("Agronomía", e3));

        A.mostrar();

        CCircularT B = new CCircularT();
        B.adicionar("medicamento");
        B.adicionar("herramientas");
        B.adicionar("alimento");
        System.out.println("\n INSUMOS");
        B.mostrar();

        MultiPilaI C = new MultiPilaI();
        C.adicionar(new Insumo("Agua", "Sachet", 100), 1);
        C.adicionar(new Insumo("Papel", "Rollo", 20), 1);
        C.adicionar(new Insumo("Maiz", "lata", 40), 1);
        C.adicionar(new Insumo("Arroz", "quintal", 2), 2);
        C.adicionar(new Insumo("Agua", "botella", 40), 2);
        C.adicionar(new Insumo("Fideo", "bolsita", 8), 2);
        C.adicionar(new Insumo("Pollo", "vivo", 80), 2);
        C.adicionar(new Insumo("Azúcar", "kilo", 15), 3);
        C.adicionar(new Insumo("Aceite", "litro", 25), 3);
        C.adicionar(new Insumo("Café", "paquete", 12), 3);
        C.adicionar(new Insumo("Sal", "saco", 5), 4);
        C.adicionar(new Insumo("Frijoles", "lata", 30), 4);
        C.adicionar(new Insumo("Huevos", "docena", 50), 4);
        C.adicionar(new Insumo("Leche", "cartón", 60), 4);
        C.adicionar(new Insumo("Galletas", "paquete", 18), 1);
        C.adicionar(new Insumo("Detergente", "bolsa", 25), 1);
        C.adicionar(new Insumo("Atún", "lata", 45), 2);
        C.adicionar(new Insumo("Tomate", "caja", 20), 3);
        C.adicionar(new Insumo("Cebolla", "saco", 10), 4);
        C.adicionar(new Insumo("Zanahoria", "manojo", 35), 3);
        C.setN(4);
        System.out.println("\n");
        C.mostrar();
        System.out.println("\n- EJERCICIO");
        ejer(B, C, "alimento",15);
    }

    public static void ejer(CCircularT A, MultiPilaI B, String x, int y) {
        PilaI aux = new PilaI();
        int n = A.nroelem();
        for (int k = 1; k <= n; k++) {
            String t=A.eliminar();
            if(t.equals(x)){
                while(!B.esVacia(k)){
                    Insumo w=B.eliminar(k);
                    if (w.getCantidad()>y){
                        w.mostrar();
                    }
                    aux.adicionar(w);
                }
                B.vaciar(aux, k);
            }
            A.adicionar(t);
        }
    }
}
