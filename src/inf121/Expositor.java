/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inf121;

/**
 *
 * @author Royer
 */
class Expositor {
    int ci;
    String nombre;
    int fono;
    int nroPuesto;

    public Expositor(int ci, String nombre, int fono, int nroPuesto) {
        this.ci = ci;
        this.nombre = nombre;
        this.fono = fono;
        this.nroPuesto = nroPuesto;
    }
    
    public void mostrar(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ci=" + ci + ", nombre=" + nombre + ", fono=" + fono + ", nroPuesto=" + nroPuesto + '}';
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

    public int getFono() {
        return fono;
    }

    public void setFono(int fono) {
        this.fono = fono;
    }

    public int getNroPuesto() {
        return nroPuesto;
    }

    public void setNroPuesto(int nroPuesto) {
        this.nroPuesto = nroPuesto;
    }
}
