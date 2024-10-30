/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasRaras;

/**
 *
 * @author Royer
 */
public class NodoPa {
    private String fecha;
    private String hora;
    private int nroGolE1;
    private int nroGolE2;
    private NodoE1 sig;
    private NodoE1 ant;
    private NodoE2 ant2;

    public NodoPa() {
        sig=ant=null;
        ant2=null;
    }
    
    public NodoPa(String fecha, String hora, int nroGolE1, int nroGolE2, NodoE1 sig, NodoE1 ant, NodoE2 ant2) {
        this.fecha = fecha;
        this.hora = hora;
        this.nroGolE1 = nroGolE1;
        this.nroGolE2 = nroGolE2;
        this.sig = sig;
        this.ant = ant;
        this.ant2 = ant2;
    }

    @Override
    public String toString() {
        return "NodoPa{" + "fecha=" + fecha + ", hora=" + hora + '}';
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

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getNroGolE1() {
        return nroGolE1;
    }

    public void setNroGolE1(int nroGolE1) {
        this.nroGolE1 = nroGolE1;
    }

    public int getNroGolE2() {
        return nroGolE2;
    }

    public void setNroGolE2(int nroGolE2) {
        this.nroGolE2 = nroGolE2;
    }

    public NodoE1 getSig() {
        return sig;
    }

    public void setSig(NodoE1 sig) {
        this.sig = sig;
    }

    public NodoE1 getAnt() {
        return ant;
    }

    public void setAnt(NodoE1 ant) {
        this.ant = ant;
    }

    public NodoE2 getAnt2() {
        return ant2;
    }

    public void setAnt2(NodoE2 ant2) {
        this.ant2 = ant2;
    }
}
