/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colasDeColas;

/**
 *
 * @author Royer
 */
public class Persona {

    private int ci;
    private String nombre;
    private PilaD pd;

    public Persona(int ci, String nombre, PilaD pd) {
        this.ci = ci;
        this.nombre = nombre;
        this.pd = pd;
    }

    @Override
    public String toString() {
        return "Persona: " + "ci= " + ci + ", nombre= " + nombre;
    }

    public void mostrar() {
        System.out.println(this);
        pd.mostrar();
        System.out.println("");
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PilaD getPd() {
        return pd;
    }

    public void setPd(PilaD pd) {
        this.pd = pd;
    }
}
