/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colasDeColas;

/**
 *
 * @author Royer
 */
public class Documento {
    private int cod;
    private String tipo;

    public Documento(int cod, String tipo) {
        this.cod = cod;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Documento{" + "cod=" + cod + ", tipo=" + tipo + '}';
    }
    
    public void mostrar(){
        System.out.println(this);
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
