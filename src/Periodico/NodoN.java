/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Periodico;

/**
 *
 * @author Royer
 */
public class NodoN {

    String titulo, texto, horaPublicacion, autor;
    NodoN ant, sig;

    public NodoN() {
        ant = sig = null;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getHoraPublicacion() {
        return horaPublicacion;
    }

    public void setHoraPublicacion(String horaPublicacion) {
        this.horaPublicacion = horaPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public NodoN getAnt() {
        return ant;
    }

    public void setAnt(NodoN ant) {
        this.ant = ant;
    }

    public NodoN getSig() {
        return sig;
    }

    public void setSig(NodoN sig) {
        this.sig = sig;
    }
}
