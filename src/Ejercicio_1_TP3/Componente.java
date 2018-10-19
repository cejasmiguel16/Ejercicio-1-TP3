/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1_TP3;

/**
 *
 * @author Miguel
 */
public class Componente {
     private Double porcentaje;
     private String nombre;

    public Componente(String nombre, Double porcentaje) {
        this.porcentaje = porcentaje;
        this.nombre = nombre;
    }

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     
    
     
}
