package listas1;

/**
 *
 * @author Royer
 */
public class main {

    public static void main(String[] args) {
        ColaM cm1 = new ColaM();
        ColaM cm2 = new ColaM();
        ColaM cm3 = new ColaM();
        ColaM cm4 = new ColaM();

        cm1.adicionar(new Mascota("Perro", "Rex", "Pastor Alemán", "Negro y Marrón", "Macho", 5, true));
        cm1.adicionar(new Mascota("Gato", "Misha", "Siamés", "Blanco y Gris", "Hembra", 3, false));
        cm1.adicionar(new Mascota("Perro", "Bunny", "Enano", "Blanco", "Macho", 2, true));
        cm1.adicionar(new Mascota("Perro", "Luna", "Golden Retriever", "Dorado", "Hembra", 4, false));
        cm1.adicionar(new Mascota("Gato", "Felix", "Angora", "Negro", "Macho", 1, true));

        cm2.adicionar(new Mascota("Perro", "Max", "Bulldog", "Blanco", "Macho", 6, false));
        cm2.adicionar(new Mascota("Gato", "Luna", "Persa", "Gris", "Hembra", 4, true));
        cm2.adicionar(new Mascota("Ave", "Paco", "Loro", "Verde", "Macho", 7, false));

        cm3.adicionar(new Mascota("Perro", "Bella", "Chihuahua", "Marrón", "Hembra", 3, true));
        cm3.adicionar(new Mascota("Gato", "Simba", "Bengala", "Anaranjado", "Macho", 5, false));
        cm3.adicionar(new Mascota("Conejo", "Nieve", "Cabeza de León", "Blanco", "Hembra", 2, true));

        cm4.adicionar(new Mascota("Perro", "Rocky", "Husky Siberiano", "Blanco y Negro", "Macho", 4, false));
        cm4.adicionar(new Mascota("Gato", "Chloe", "Maine Coon", "Atigrado", "Hembra", 3, true));
        cm4.adicionar(new Mascota("Perro", "Flash", "Mediterránea", "Verde", "Macho", 10, false));
        cm4.adicionar(new Mascota("Perro", "Rayo", "Roborovski", "Marrón y Blanco", "Macho", 1, true));

        MultiPilaP A = new MultiPilaP();

        A.adicionar(new Propietario("Nombre", "direccion", "Zona", "Celular", cm1), 1);
        A.adicionar(new Propietario("Juan Pérez", "Av. Siempre Viva 123", "Zona Norte", "71234567", cm2), 1);
        A.adicionar(new Propietario("María López", "Calle Falsa 456", "Zona Centro", "78901234", cm3), 1);
        A.adicionar(new Propietario("Carlos Gómez", "Av. Libertad 789", "Zona Sur", "74561234", cm4), 2);
        A.adicionar(new Propietario("Ana Martínez", "Calle Sol 101", "Zona Este", "76543210", cm1), 2);
        A.adicionar(new Propietario("Luis Fernández", "Av. Montaña 202", "Zona Oeste", "70123456", cm2), 3);
        A.setN(3);
        A.mostrar();

        ColaV cv1 = new ColaV();
        cv1.adicionar(new Vacunador("5-11-24", "Carlos Sánchez"));
        cv1.adicionar(new Vacunador("12-09-24", "María Fernández"));
        cv1.adicionar(new Vacunador("20-08-24", "José Rodríguez"));
        cv1.adicionar(new Vacunador("7-10-24", "Ana Gómez"));
        cv1.adicionar(new Vacunador("15-12-24", "Laura Pérez"));
        System.out.println("\nVacunadores");
        cv1.mostrar();
        
        System.out.println("\n-------------------------");
        System.out.println(" - EJERCICIO 2 -");
        conteoMascotasXVacunadorY(A, cv1, "Perro", "María Fernández");
        //A.mostrar();
        //cv1.mostrar();
        
         System.out.println("\n-------------------------");
        System.out.println(" - EJERCICIO 3 -");
        porcentajeCaninosYFelinos(A, cv1);
    }

    public static void conteoMascotasXVacunadorY(MultiPilaP A, ColaV B, String x, String y) {
        int c = 0;
        for (int i = 1; i <= A.getN(); i++) {
            PilaP aux = new PilaP();
            ColaV auxv = new ColaV();
            Vacunador v = B.eliminar();
            while (!A.esVacia(i)) {
                Propietario p = A.eliminar(i);
                ColaM aux2 = new ColaM();
                while (!p.getCola().esVacia()) {
                    Mascota m = p.getCola().eliminar();
                    if (m.getEspecie().equals(x) && v.getNombre().equals(y)) {
                        c++;
                    }
                    aux2.adicionar(m);
                }
                p.cola.vaciar(aux2);
                aux.adicionar(p);
            }
            auxv.adicionar(v);
            A.vaciar(aux, i);
            B.vaciar(auxv);
        }
        System.out.println("Cantidad de mascotas de especie " + x + " vacunadas por " + y + ": " + c);
    }
    
    public static void porcentajeCaninosYFelinos(MultiPilaP A, ColaV B) {
        int c = 0;
        int c2=0;
        int pe=0;
        int g=0;
        for (int i = 1; i <= A.getN(); i++) {
            PilaP aux = new PilaP();
            ColaV auxv = new ColaV();
            Vacunador v = B.eliminar();
            while (!A.esVacia(i)) {
                Propietario p = A.eliminar(i);
                ColaM aux2 = new ColaM();
                while (!p.getCola().esVacia()) {
                    Mascota m = p.getCola().eliminar();
                    if (m.getEspecie().equals("Perro") || m.getEspecie().equals("Gato")) {
                        c++;
                        if(m.getEspecie().equals("Perro")){
                            pe++;
                        }
                        if(m.getEspecie().equals("Gato")){
                            g++;
                        }
                    }
                    c2++;
                    aux2.adicionar(m);
                }
                p.cola.vaciar(aux2);
            }
            auxv.adicionar(v);
            A.vaciar(aux, i);
        }
        System.out.println(c2);
        
        int total=(c*100)/c2;
        int totalp=(pe*100)/c2;
        int totalg=(g*100)/c2;
        System.out.println("El porcentaje de Caninos y felinos es de: "+total+"%");
        System.out.println("Porcentaje gatos: "+totalg+"%");
        System.out.println("Porcentaje perros: "+totalp+"%");
        
       
    }
}
