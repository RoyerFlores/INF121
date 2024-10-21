/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas1;

/**
 *
 * @author Royer
 */
public class Propietario {
    String nombre,direccion,zona,celular;
    ColaM cola;

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", direccion=" + direccion + ", zona=" + zona + ", celular=" + celular;
    }
    
    public void mostrar(){
        System.out.println(this);
        cola.mostrar();
    }

    public Propietario(String nombre, String direccion, String zona, String celular, ColaM cola) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.zona = zona;
        this.celular = celular;
        this.cola = cola;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public ColaM getCola() {
        return cola;
    }

    public void setCola(ColaM cola) {
        this.cola = cola;
    }
}
