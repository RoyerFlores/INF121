/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas1;

/**
 *
 * @author Royer
 */
public class Vacunador {
    String fecha,nombre;

    public Vacunador(String fecha, String nombre) {
        this.fecha = fecha;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "fecha=" + fecha + ", nombre=" + nombre + '}';
    }
    
    public void mostrar(){
        System.out.println(this);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
