/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inf121;

/**
 *
 * @author Royer
 */
public class Artesania {
    int ci;
    String nomArt;
    String material;
    double precio;

    public Artesania(int ci, String nomArt, String material, double precio) {
        this.ci = ci;
        this.nomArt = nomArt;
        this.material = material;
        this.precio = precio;
    }
    
    public void mostrar(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ci=" + ci + ", nomArt=" + nomArt + ", material=" + material + ", precio=" + precio + '}';
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNomArt() {
        return nomArt;
    }

    public void setNomArt(String nomArt) {
        this.nomArt = nomArt;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
