/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bomberos;

/**
 *
 * @author Royer
 */
public class Carrera {
    String nom;
    PilaE p;

    public Carrera(String nom, PilaE p) {
        this.nom = nom;
        this.p = p;
    }
    
    void mostrar(){
        System.out.println(nom);
        p.mostrar();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public PilaE getP() {
        return p;
    }

    public void setP(PilaE p) {
        this.p = p;
    }
    
    
}
