package Ejercicio_1_TP3;

import java.util.Scanner;

public class Camion extends VehiculoCarga implements Alquiler{
    
    Scanner entrada= new Scanner(System.in);
    
    
    public Camion() {
    }

    public Camion(String marca, String patente, Double precioBase) {
        super(marca, patente, precioBase);
    }

    @Override
    public void calcularPrecioAlquiler() {
        Double precioTotal;
        Double kilometros;
        System.out.println("Cuantos kilometros piensa recorrer con nuestro camion? :");
        kilometros = entrada.nextDouble();
        if(kilometros<50){
            precioTotal= 300.0 + 200.0;
            System.out.println("Trato hecho");
            System.out.println("El precio de tu alquiler es de :"+precioTotal);
        }else{
            precioTotal=((kilometros*20)+200)+(getPrecioBase()*0.35)+getPrecioBase();
            System.out.println("Trato hecho");
            System.out.println("El precio de tu alquiler es de :"+precioTotal);
        }
    }
    
}
