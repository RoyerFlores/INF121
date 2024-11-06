/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaMultiple;

/**
 *
 * @author Royer
 */
public class principal {

    public static void main(String[] args) {
        //sea una lista de dueños, donde cada dueño tiene una lista de mascotas
        //(nombre,tipo,edad)
        //dueño(nombre,lista de mascotas)
        LDobleM m1 = new LDobleM();
        m1.adicion("toto", "loro", 10);
        m1.adicion("mila", "perro", 1);
        m1.adicion("pelusa", "gato", 8);
        m1.adicion("tato", "perro", 2);

        //m1.mostrar();
        LDobleM m2 = new LDobleM();
        m2.adicion("norberto", "perro", 3);
        m2.adicion("Juan", "caballo", 1);
        m2.adicion("lucas", "pato", 8);
        m2.adicion("wally", "ballena", 5);

        LDobleM m3 = new LDobleM();
        m3.adicion("donald", "pato", 4);
        m3.adicion("bruno", "burro", 6);
        m3.adicion("bicho", "perro", 8);
        m3.adicion("luna", "gato", 5);

        LSimpleD d = new LSimpleD();
        d.adicion("Lucy", m1);
        d.adicion("Pedro", m2);
        d.adicion("Juan", m3);
        d.mostrar();
        // 2. determinar el número de mascotas tipo x de cada dueño

        System.out.println(" - EJERCICIO 2 -");
        NumMascX(d, "perro");
        // 3. mostrar a las mascotas del dueño x

        System.out.println("\n - EJERCICIO 3 -");
        mostrarDueñoX(d, "Pedro");

        // 4.
        // CREAR UNA LISTA DE CARPETAS, DONDE
        //CADA CARPETA TIENE ARCHIVOS
        //ARCHIVO(NOM, TIPO, TAMAÑO)
        //CARPETA(NOM, LISTA DE ARCHIVOS)
        LSimpleA a1 = new LSimpleA();
        a1.adicion("tutorial", "pdf", 12.5);
        a1.adicion("video", "mp4", 32.9);
        a1.adicion("ejecutable", "exe", 70);

        LSimpleA a2 = new LSimpleA();
        a2.adicion("tabla_datos", "xlsx", 5);
        a2.adicion("presentacion", "pptx", 40.2);
        a2.adicion("tarea", "docx", 3.7);

        LSimpleA a3 = new LSimpleA();
        a3.adicion("app", "apk", 2.5);
        a3.adicion("readme", "text", 0.1);
        a3.adicion("cancion", "mp4", 7.3);

        LDobleC C = new LDobleC();
        C.adicion("asdf", a1);
        C.adicion("tareas", a2);
        C.adicion("proyecto", a3);

        System.out.println("\n - EJERCICIO 4 -");
        C.mostrar();

        System.out.println("\n - EJERCICIO 5 -");
        mostrarArchCarpX(C, "tareas");

        System.out.println("\n - EJERCICIO 6 -");
        contarArchTipoX(C, "mp4");
    }

    public static void NumMascX(LSimpleD A, String x) {
        NodoD w = A.getP();
        int c;
        while (w != null) {
            c = 0;
            NodoM n = w.getLm().getP();
            while (n != null) {
                if (n.getTipo().equals(x)) {
                    c++;
                }
                n = n.getSig();
            }
            System.out.println("Dueño '" + w.getNombre() + "' tiene " + c + " " + x + "s");
            w = w.getSig();
        }
    }

    public static void mostrarDueñoX(LSimpleD A, String x) {
        NodoD w = A.getP();
        while (w != null) {
            if (w.getNombre().equals(x)) {
                System.out.println("Dueño: " + w.getNombre() + ">");
                w.getLm().mostrar();
            }
            w = w.getSig();
        }
    }

    public static void mostrarArchCarpX(LDobleC C, String x) {
        NodoC w = C.getP();
        while (w != null) {
            if (w.getNombre().equals(x)) {
                System.out.println("Carpeta: " + w.getNombre() + "> ");
                w.getArchivos().mostrar();
            }
            w = w.getSig();
        }
    }

    public static void contarArchTipoX(LDobleC C, String x) {
        NodoC w = C.getP();
        int c = 0;
        while (w != null) {
            NodoA n = w.getArchivos().getP();
            while (n != null) {
                if (n.getTipo().equals(x)) {
                    c++;
                }
                n = n.getSig();
            }
            w = w.getSig();
        }
        System.out.println("Existen " + c + " archivos de tipo " + x);
    }
}
