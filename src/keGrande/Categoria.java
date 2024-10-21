/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keGrande;

/**
 *
 * @author Royer
 */
public class Categoria {

    int idCat;
    String nomCat;
    CSimpleE cs;

    public Categoria(int idCat, String nomCat, CSimpleE cs) {
        this.idCat = idCat;
        this.nomCat = nomCat;
        this.cs = cs;
    }
    
    public void mostrar(){
        System.out.println(nomCat);
    }

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public String getNomCat() {
        return nomCat;
    }

    public void setNomCat(String nomCat) {
        this.nomCat = nomCat;
    }

    public CSimpleE getCs() {
        return cs;
    }

    public void setCs(CSimpleE cs) {
        this.cs = cs;
    }
}
