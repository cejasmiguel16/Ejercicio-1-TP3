package Ejercicio_1_TP3;

import java.util.Scanner;

public class Minibus extends VehiculoPasajero implements Alquiler{

    Scanner entrada = new Scanner(System.in);
    private Double precioBasePorDia;
    
    public Minibus() {
    }

    public Minibus(String marca, String patente, Integer plazas) {
        super(marca, patente, 0., plazas);
        precioBasePorDia= 50.;
    }

    @Override
    public void calcularPrecioAlquiler() {
        Double precioTotal;
        Integer plazas;
        Integer dias;
        System.out.println("Cuantos dias piensa alquilar el minibus? :");
        dias = entrada.nextInt();
        precioTotal=(getPlazas()*250)+(dias*precioBasePorDia);
        System.out.println("Trato hecho");
        System.out.println("El precio de tu alquiler es de :"+precioTotal);
        }
    }
    


    
