/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasDobles1;

/**
 *
 * @author Royer
 */
public class Zona {
    private int nro;
    private String nombre;

    public Zona(int nro, String nombre) {
        this.nro = nro;
        this.nombre = nombre;
    }
    
    public void mostrar(){
        System.out.println("{ "+nro+" "+nombre+" }");
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
