package Ejercicio_1_TP3;

import java.util.Scanner;

public class AutoNuevo extends Auto{
    
    Scanner entrada= new Scanner(System.in);

    public AutoNuevo() {
    }

    public AutoNuevo(String marca, String patente, Double precioBase) {
        super(marca, patente, precioBase);
    }
    
    public void CalcularPrecioVenta(){
        Double precioTotal, aire, levantaCristales, alarma, adicional, plazas; 
        String opc;
        adicional=getPrecioBase()*0.5;
        System.out.println("Desea agregar aire acondicionado a su nuevo auto ? : S/N");
        opc = entrada.nextLine();
        if("S".equals(opc) || "s".equals(opc)){
            aire=getPrecioBase()*0.02;
            System.out.println("AGREGADO");
        }else{
            aire=0.0;
        }
        System.out.println("Desea levanta cristales electricos ? : S/N");
        opc = entrada.nextLine();
        if("S".equals(opc) || "s".equals(opc)){
            levantaCristales=getPrecioBase()*0.05;
            System.out.println("AGREGADO");
        }else{
            levantaCristales=0.0;
        }
        System.out.println("Desea agregar alarma a su nuevo auto ? : S/N");
        opc= entrada.nextLine();
        if("S".equals(opc) || "s".equals(opc)){
            alarma=getPrecioBase()*0.02;
            System.out.println("AGREGADO");
        }else{
            alarma=0.0;
        }
        precioTotal=getPrecioBase()+aire+levantaCristales+alarma+adicional;
        System.out.println("El precio de su nuevo Auto es de "+precioTotal);
       
    }
    
    public void mostrarDatos(){
        
            System.out.println("marca : "+getMarca());
            System.out.println("patente : "+getPatente());
            System.out.println("precio base : "+getPrecioBase());
        
    }
    
}
