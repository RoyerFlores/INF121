/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasRaras;

/**
 *
 * @author Royer
 */
public class ListaNE {
    
    NodoNom p;
    
    public ListaNE() {
        p = null;
    }
    
    public NodoNom getP() {
        return p;
    }
    
    public void setP(NodoNom p) {
        this.p = p;
    }
    
    public void adicion(String nom, int edad) {
        NodoNom nue = new NodoNom(nom);
        NodoEdad nue2 = new NodoEdad(edad);
        if (getP() == null) {
            setP(nue);
            getP().setSig(nue2);
        } else {
            NodoNom r1 = getP();
            NodoEdad r2 = r1.getSig();
            while (r2.getSig() != null) {
                r1 = r2.getSig();
                r2 = r1.getSig();
            }
            nue.setSig(nue2);
            r2.setSig(nue);
        }
    }
    
    public void mostrar() {
        NodoNom r1 = getP();
        NodoEdad r2 = null;
        while (r1 != null) {
            r2 = r1.getSig();
            System.out.println(r1.getNombre());
            System.out.println(r2.getEdad());
            r1 = r2.getSig();
        }
        
    }
}
