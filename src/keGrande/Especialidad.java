/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keGrande;

/**
 *
 * @author Royer
 */
public class Especialidad {
    int idEsp,monto,nroPremios;
    String nomEsp;

    public Especialidad(int idEsp, int monto, int nroPremios, String nomEsp) {
        this.idEsp = idEsp;
        this.monto = monto;
        this.nroPremios = nroPremios;
        this.nomEsp = nomEsp;
    }
    
    void mostrar(){
        System.out.println(nomEsp);
    }

    public int getIdEsp() {
        return idEsp;
    }

    public void setIdEsp(int idEsp) {
        this.idEsp = idEsp;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getNroPremios() {
        return nroPremios;
    }

    public void setNroPremios(int nroPremios) {
        this.nroPremios = nroPremios;
    }

    public String getNomEsp() {
        return nomEsp;
    }

    public void setNomEsp(String nomEsp) {
        this.nomEsp = nomEsp;
    }
    
}
