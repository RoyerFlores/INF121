/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Periodico;

/**
 *
 * @author Royer
 */
public class NodoS {

    String nombre;
    LDobleN noti;
    LSimpleP pub;
    NodoS sig;

    public NodoS() {
        sig = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LDobleN getNoti() {
        return noti;
    }

    public void setNoti(LDobleN noti) {
        this.noti = noti;
    }

    public LSimpleP getPub() {
        return pub;
    }

    public void setPub(LSimpleP pub) {
        this.pub = pub;
    }

    public NodoS getSig() {
        return sig;
    }

    public void setSig(NodoS sig) {
        this.sig = sig;
    }
}
