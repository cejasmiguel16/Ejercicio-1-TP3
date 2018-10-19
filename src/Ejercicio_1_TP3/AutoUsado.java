package Ejercicio_1_TP3;

import java.util.ArrayList;
import java.util.Scanner;

public class AutoUsado extends Auto implements Alquiler, Venta {

    Scanner entrada=new Scanner(System.in);
    private ArrayList<Componente> componentes;
    private Double precioBasePorDia;
    
    public AutoUsado() {
        componentes=new ArrayList<Componente>();
    }

    public AutoUsado(String marca, String patente, Double precioBase, Integer plazas) {
        super(marca, patente, precioBase, plazas);
        componentes=new ArrayList<Componente>();
        precioBasePorDia=50.;
    }
    
       public void IngresarComponentes(Componente componente){
        componentes.add(componente);
    }
    
    
    @Override
    public void calcularPrecioAlquiler() {
        Double precioTotal;
        Double dias;
        System.out.println("Cuantos dias piensa alquilar el auto? :");
        dias = entrada.nextDouble();
        precioTotal=(getPlazas()*50.)+(dias*precioBasePorDia);
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
                //componentes.remove(i);
            }        
        }
        System.out.println("EL PRECIO DE SU NUEVO AUTO USADO ES: "+precio);
    }
    
}
