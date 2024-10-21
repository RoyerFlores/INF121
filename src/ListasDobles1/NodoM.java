/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasDobles1;

/**
 *
 * @author Royer
 */
public class NodoM {
    private int nro, km2, nhabitantes;
    private String nombre;
    private NodoM ant, sig;
    NodoM(){
        ant=sig=null;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public int getKm2() {
        return km2;
    }

    public void setKm2(int km2) {
        this.km2 = km2;
    }

    public int getNhabitantes() {
        return nhabitantes;
    }

    public void setNhabitantes(int nhabitantes) {
        this.nhabitantes = nhabitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoM getAnt() {
        return ant;
    }

    public void setAnt(NodoM ant) {
        this.ant = ant;
    }

    public NodoM getSig() {
        return sig;
    }

    public void setSig(NodoM sig) {
        this.sig = sig;
    }
}
