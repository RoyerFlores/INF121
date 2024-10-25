/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioLCircular;

/**
 *
 * @author Royer
 */
public class Provincia {
    int idDpto;
    String nombreProv;

    @Override
    public String toString() {
        return idDpto + " - " + nombreProv;
    }
    
    public void mostrar(){
        System.out.println(this);
    }

    public Provincia(int idDpto, String nombreProv) {
        this.idDpto = idDpto;
        this.nombreProv = nombreProv;
    }

    public int getIdDpto() {
        return idDpto;
    }

    public void setIdDpto(int idDpto) {
        this.idDpto = idDpto;
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }
}
