/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DepartamentoProvincia;

/**
 *
 * @author Royer
 */
public class Departamento {

    String nombre;
    CCircularP prov;

    public Departamento(String nombre, CCircularP prov) {
        this.nombre = nombre;
        this.prov = prov;
    }

    @Override
    public String toString() {
        return "Departamento: " + "nombre= " + nombre;
    }

    public void mostrar() {
        System.out.println(this);
        prov.mostrar();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CCircularP getProv() {
        return prov;
    }

    public void setProv(CCircularP prov) {
        this.prov = prov;
    }
}
