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
        m2.adicion("norberto", "perro", 10);
        m2.adicion("Juan", "caballo", 1);
        m2.adicion("lucas", "pato", 8);
        m2.adicion("wally", "ballena", 2);

        LDobleM m3 = new LDobleM();
        m3.adicion("donald", "pato", 10);
        m3.adicion("bruno", "burro", 1);
        m3.adicion("bicho", "perro", 8);
        m3.adicion("luna", "gato", 2);

        LSimpleD d = new LSimpleD();
        d.adicion("Lucy", m1);
        d.adicion("Pedro", m2);
        d.adicion("Juan", m3);
        d.mostrar();
    }
}
