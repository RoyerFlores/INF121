/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas1;

/**
 *
 * @author Royer
 */
public class Mascota {
    String especie,nombre,raza,color,sexo;
    int edad;
    boolean esterilizado;

    @Override
    public String toString() {
        return "especie=" + especie + ", nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", sexo=" + sexo + ", edad=" + edad + ", esterilizado=" + esterilizado + '}';
    }
    
    public void mostrar(){
        System.out.println(this);
    }

    public Mascota(String especie, String nombre, String raza, String color, String sexo, int edad, boolean esterilizado) {
        this.especie = especie;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.sexo = sexo;
        this.edad = edad;
        this.esterilizado = esterilizado;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }
}
