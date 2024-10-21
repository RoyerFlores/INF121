/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiplesPC;

/**
 *
 * @author Royer
 */
public class Estudiante {
    private String nombre;
    private int nota;

    public Estudiante(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    public void mostrar(){
        System.out.println("Nombre: "+nombre+", Nota: "+nota);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
