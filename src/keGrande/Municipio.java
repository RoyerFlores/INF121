/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keGrande;

/**
 *
 * @author Royer
 */
public class Municipio {
    int idNom;
    String nomMun;
    
    public void mostrar(){
        System.out.println(nomMun);
    }

    public Municipio(int idNom, String nomMun) {
        this.idNom = idNom;
        this.nomMun = nomMun;
    }

    public int getIdNom() {
        return idNom;
    }

    public void setIdNom(int idNom) {
        this.idNom = idNom;
    }

    public String getNomMun() {
        return nomMun;
    }

    public void setNomMun(String nomMun) {
        this.nomMun = nomMun;
    }
}
