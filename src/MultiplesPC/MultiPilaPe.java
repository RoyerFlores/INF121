/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiplesPC;

/**
 *
 * @author Royer
 */
public class MultiPilaPe {

    private PilaPe v[] = new PilaPe[40];
    private int n;

    public MultiPilaPe() {
        for (int i = 1; i <= 39; i++) {
            v[i] = new PilaPe();
        }
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    boolean esVacia(int i) {
        return v[i].esvacia();
    }

    boolean esLlena(int i) {
        return v[i].esllena();
    }

    int nroElem(int i) {
        return v[i].nroelem();
    }

    void adicionar(Persona p, int i) {
        v[i] .adicionar(p);
    }

    Persona eliminar(int i) {
        return v[i].eliminar();
    }

    void mostrar(int i) {
        v[i].mostrar();
    }

    void mostrar() {
        for (int i = 1; i <= getN(); i++) {
            System.out.println("Pila "+i+": ");
            v[i].mostrar();
        }
    }
    
    void vaciar(PilaPe Z, int i){
        v[i].vaciar(Z);
    }
    
    void vaciar(int i, int j){
        v[i].vaciar(v[j]);
    }
}
