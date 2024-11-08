/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasEnListas;

/**
 *
 * @author Royer
 */
public class NodoA {

    private String ci;
    private String nombre;
    private String pat;
    private String mat;
    private NodoA sig;

    private NodoR d1;
    private NodoE d2;

    public NodoA() {
        sig = null;
        d1 = null;
        d2 = null;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPat() {
        return pat;
    }

    public void setPat(String pat) {
        this.pat = pat;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public NodoA getSig() {
        return sig;
    }

    public void setSig(NodoA sig) {
        this.sig = sig;
    }

    public NodoR getD1() {
        return d1;
    }

    public void setD1(NodoR d1) {
        this.d1 = d1;
    }

    public NodoE getD2() {
        return d2;
    }

    public void setD2(NodoE d2) {
        this.d2 = d2;
    }

}
