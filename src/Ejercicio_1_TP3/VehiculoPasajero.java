package Ejercicio_1_TP3;

public class VehiculoPasajero extends Vehiculo {
    private Integer plazas;
    
    public VehiculoPasajero() {
    }

    public VehiculoPasajero(String marca, String patente, Double precioBase, Integer plazas) {
        super(marca, patente, precioBase);
        this.plazas=plazas;
    }

    public Integer getPlazas() {
        return plazas;
    }

    public void setPlazas(Integer plazas) {
        this.plazas = plazas;
    }
}
