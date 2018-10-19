package Ejercicio_1_TP3;

import java.util.ArrayList;

public class AutoNuevo extends Auto implements Venta{
    
    private ArrayList <Componente> componentes;

    public AutoNuevo() {
        componentes= new ArrayList <Componente>();
    }

    public AutoNuevo(String marca, String patente, Double precioBase) {
        super(marca, patente, precioBase);
        componentes= new ArrayList <Componente>();
    }
    
    public void IngresarComponentes(Componente componente){
        componentes.add(componente);
    }
    
    @Override
    public void calcularPrecioVenta(){
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