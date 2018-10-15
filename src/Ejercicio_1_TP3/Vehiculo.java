package Ejercicio_1_TP3;

public class Vehiculo {
    private String marca;
    private String patente;
    private Double precioBase;
    private Boolean disponible;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String patente, Double precioBase) {
        this.marca = marca;
        this.patente = patente;
        this.precioBase = precioBase;
        disponible= true;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    
    
}
