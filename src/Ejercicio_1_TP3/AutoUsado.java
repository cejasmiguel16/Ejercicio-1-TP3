package Ejercicio_1_TP3;

import java.util.ArrayList;
import java.util.Scanner;

public class AutoUsado extends Auto implements Alquiler, Venta {

    Scanner entrada=new Scanner(System.in);
    private ArrayList<Componente> componentes;
    
    public AutoUsado() {
        componentes=new ArrayList<Componente>();
    }

    public AutoUsado(String marca, String patente, Double precioBase) {
        super(marca, patente, precioBase);
        componentes=new ArrayList<Componente>();
    }
    
       public void IngresarComponentes(Componente componente){
        componentes.add(componente);
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

    @Override
    public void calcularPrecioVenta() {
         Double porcentaje, precio=getPrecioBase()+((50*getPrecioBase())/100);
            for(Componente i: componentes){
                if(i!=null){
                porcentaje= ((i.getPorcentaje()*getPrecioBase())/100);
                precio= precio + porcentaje;
                System.out.println("PRECIO: "+precio);
            }        
        }
    }
    
}
