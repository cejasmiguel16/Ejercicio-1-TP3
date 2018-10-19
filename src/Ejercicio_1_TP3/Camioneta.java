package Ejercicio_1_TP3;

import java.util.Scanner;

public class Camioneta extends VehiculoCarga implements Alquiler{
    
    Scanner entrada= new Scanner(System.in);
    
    
    public Camioneta() {
    }

    public Camioneta(String marca, String patente, Double precioBase) {
        super(marca, patente, precioBase);
    }

    @Override
    public void calcularPrecioAlquiler() {
        Double precioTotal;
        Double kilometros;
        System.out.println("Cuantos kilometros piensa recorrer con nuestra camion?eta :");
        kilometros = entrada.nextDouble();
        if(kilometros<50){
            precioTotal= 300.0 + 200.0;
            System.out.println("Trato hecho");
            System.out.println("El precio de tu alquiler es de :"+precioTotal);
        }else{
            precioTotal=getPrecioBase()+((kilometros*20))+(getPrecioBase()*0.35);
            System.out.println("Trato hecho");
            System.out.println("El precio de tu alquiler es de :"+precioTotal);
        }
    }
    
    
}
