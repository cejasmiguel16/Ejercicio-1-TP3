package Ejercicio_1_TP3;

import java.util.Scanner;

public class Minibus extends VehiculoPasajero implements Alquiler{

    Scanner entrada = new Scanner(System.in);
    
    public Minibus() {
    }

    public Minibus(String marca, String patente, Double precioBase) {
        super(marca, patente, precioBase);
    }

    @Override
    public void calcularPrecioAlquiler() {
        Double precioTotal;
        Integer plazas;
        Integer dias;
        System.out.println("Cuantos dias piensa alquilar el minibus? :");
        dias = entrada.nextInt();
        System.out.println("Con cuantas plazas desea su minibus? :");
        plazas = entrada.nextInt();
        precioTotal=(plazas*300)+(dias*50)+(getPrecioBase()*0.35)+getPrecioBase();
        System.out.println("Trato hecho");
        System.out.println("El precio de tu alquiler es de :"+precioTotal);
        }
    }
    


    
