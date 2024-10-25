/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioLCircular;

/**
 *
 * @author Royer
 */
public class Departamento {
    int idDpto;
    String nomDpto;

    @Override
    public String toString() {
        return idDpto + " - " + nomDpto;
    }
    
    public void mostrar(){
        System.out.println(this);
    }

    public Departamento(int idDpto, String nomDpto) {
        this.idDpto = idDpto;
        this.nomDpto = nomDpto;
    }

    public int getIdDpto() {
        return idDpto;
    }

    public void setIdDpto(int idDpto) {
        this.idDpto = idDpto;
    }

    public String getNomDpto() {
        return nomDpto;
    }

    public void setNomDpto(String nomDpto) {
        this.nomDpto = nomDpto;
    }
}
