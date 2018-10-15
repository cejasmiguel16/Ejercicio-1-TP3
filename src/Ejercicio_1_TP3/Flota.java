package Ejercicio_1_TP3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Flota {
    
    List<AutoNuevo> autosnuevos= new ArrayList<>();
    Iterator<AutoNuevo> itnuevos= autosnuevos.iterator();
    List<AutoUsado> autosusados= new ArrayList<>();
    Iterator<AutoUsado> itusados= autosusados.iterator();
    List<Camioneta> camionetas= new ArrayList<>();
    Iterator<Camioneta> itcamionetas= camionetas.iterator();
    List<Camion> camiones= new ArrayList<>();
    Iterator<Camion> itcamiones= camiones.iterator();
    
    Scanner entrada= new Scanner(System.in);
   
    public void BuscarAutoNuevo(){
        String patente;  
        System.out.println("Ingrese la patente del vehiculo : ");
        patente=entrada.nextLine();
        for (AutoNuevo i : autosnuevos) {
            if(itnuevos.next().getPatente().equals(patente)){
                System.out.println("Vehiculo Encontrado");
                itnuevos.next().mostrarDatos();
                itnuevos.next().CalcularPrecioVenta();
            }
            else{
                System.out.println("Vehiculo no encontrado");
            }
        }       
    }
    
    public void BuscarAutousado(){
        String patente;  
        System.out.println("Ingrese la patente del vehiculo : ");
        patente=entrada.nextLine();
        for (AutoUsado i : autosusados) {
            if(itusados.next().getPatente().equals(patente)){
                System.out.println("Vehiculo Encontrado");
                itusados.next().calcularPrecioAlquiler();
            }
            else{
                System.out.println("Vehiculo no encontrado");
            }
        }       
    }
    
    public void BuscarCamioneta(){
        String patente;  
        System.out.println("Ingrese la patente del vehiculo : ");
        patente=entrada.nextLine();
        for (Camioneta i : camionetas) {
            if(itcamionetas.next().getPatente().equals(patente)){
                System.out.println("Vehiculo Encontrado");
                itcamionetas.next().calcularPrecioAlquiler();
            }
            else{
                System.out.println("Vehiculo no encontrado");
            }
        }       
    }
    
    public void BuscarCamiones(){
        String patente;  
        System.out.println("Ingrese la patente del vehiculo : ");
        patente=entrada.nextLine();
        for (Camion i : camiones) {
            if(itcamiones.next().getPatente().equals(patente)){
                System.out.println("Vehiculo Encontrado");
                itcamiones.next().calcularPrecioAlquiler();
            }
            else{
                System.out.println("Vehiculo no encontrado");
            }
        }       
    }
    
    /*List <Vehiculo> vehiculos= new ArrayList<>();
    Iterator<Vehiculo> it= vehiculos.iterator();
    
    Scanner entrada= new Scanner(System.in);
    
    public AutoNuevo BuscarAutoNuevo(){
        int x = 0;
        String patente;  
        System.out.println("Ingrese la patente del vehiculo : ");
        patente=entrada.nextLine();
        for(int i = 0;i<vehiculos.size();i++){
            if(it.next().getPatente().equals(patente)){
            System.out.println("Vehiculo Encontrado");
            x=i;
            }
            else{
                System.out.println("Vehiculo no encontrado");
            }
            
        }       
    return (AutoNuevo) vehiculos.get(x);
    }
    */
    
    
    public static void main(String[] args) {
            Flota flota= new Flota();
            /*flota.autosnuevos.add(new AutoNuevo("Toyota","TC417", 2000.45 ));
            //BUSCAR UN AUTO NUEVO Y CALCULAR SU PRECIO
            flota.BuscarAutoNuevo();*/
            
            //AGREGAMOS UNA CAMIONETA
            flota.camionetas.add((new Camioneta("Ford", "ARG123", 123.45)));
            flota.BuscarCamioneta();
            
            //A MI PARECER NO FUNCIONA LA COMPARACION CON EL EQUALS EN LA BUSQUEDA POR ESO NO FUNCIONA EL PROGRAMA
            
            
            
    }
    
}
