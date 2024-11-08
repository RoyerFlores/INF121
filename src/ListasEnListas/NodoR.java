/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasEnListas;

/**
 *
 * @author Royer
 */
public class NodoR {

    String fecha;
    String tema;
    NodoR sig;

    public NodoR() {
        sig = null;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public NodoR getSig() {
        return sig;
    }

    public void setSig(NodoR sig) {
        this.sig = sig;
    }
}
