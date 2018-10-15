package Ejercicio_1_TP3;

import java.util.Scanner;

public class AutoUsado extends Auto implements Alquiler{

    Scanner entrada=new Scanner(System.in);
    
    public AutoUsado() {
    }

    public AutoUsado(String marca, String patente, Double precioBase) {
        super(marca, patente, precioBase);
    }

    @Override
    public void calcularPrecioAlquiler() {
        Double precioTotal;
        Integer plazas;
        Integer dias;
        System.out.println("Cuantos dias piensa alquilar el auto? :");
        dias = entrada.nextInt();
        System.out.println("Con cuantas plazas desea su auto? :");
        plazas = entrada.nextInt();
        precioTotal=(plazas*50)+(dias*50)+(getPrecioBase()*0.35)+getPrecioBase();
        System.out.println("Trato hecho");
        System.out.println("El precio de tu alquiler es de :"+precioTotal);
    }
    
}
