package Ejercicio_1_TP3;

import java.util.ArrayList;

public class Flota {
    private ArrayList <Vehiculo> vehiculos;

    public Flota() {
        vehiculos = new ArrayList<Vehiculo>();
    }
    
    public void ingresarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    
    public void comprarAutoNuevo(String patente){
        for(Vehiculo i: vehiculos){
            if(i.getPatente().equals(patente)){
                if(i instanceof AutoNuevo){
                AutoNuevo autoNuevo = (AutoNuevo) i;
                ((AutoNuevo) i).calcularPrecioVenta();
                System.out.println("AUTO ENCONTRADO");
                vehiculos.remove(i);
                } 
            }else{
                System.out.println("Vehiculo no escontrado");
            }
        }
    }
    
     public void alquilarCamioneta(String patente){
        for(Vehiculo i: vehiculos){
            if(i.getPatente().equals(patente)){
                if(i instanceof Camioneta){
                Camioneta c = (Camioneta) i;
                ((Camioneta) i).calcularPrecioAlquiler();
                System.out.println("AUTO ENCONTRADO");
                vehiculos.remove(i);
                } 
            }else{
                System.out.println("Vehiculo no escontrado");
            }
        }
    }
    
    public void alquilarCamion(String patente){
        for(Vehiculo i: vehiculos){
            if(i.getPatente().equals(patente)){
                System.out.println("VEHICULO ENCONTRADO");
                if(i instanceof Camion){
                Camion c = (Camion) i;
                ((Camion) i).calcularPrecioAlquiler();
                vehiculos.remove(i);
                } 
            }else{
                System.out.println("Vehiculo no escontrado");
            }
        }
    }
    
}
