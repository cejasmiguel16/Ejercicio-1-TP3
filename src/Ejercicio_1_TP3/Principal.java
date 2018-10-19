package Ejercicio_1_TP3;

/**
 *
 * @author Miguel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Flota flota= new Flota();
        Vehiculo v= new AutoNuevo("Toyota", "XTZ200", 2000.);
        AutoNuevo autoNuevo = (AutoNuevo) v;
        Componente c1= new Componente("Aire", 2.0);
        autoNuevo.IngresarComponentes(c1);
        autoNuevo.IngresarComponentes(new Componente("LevantaCristales", 5.0));
        flota.ingresarVehiculo(v);
        //flota.comprarAutoNuevo("XTZ200");
        
        
        flota.ingresarVehiculo(new Camion("Iveco", "TYO567", 400.));
        flota.ingresarVehiculo(new Camioneta("Toyota","TGB500", 500.));
        //flota.alquilarCamioneta("TGB500");
        //flota.alquilarCamion("TYO560");
        
        
       flota.ingresarVehiculo(new AutoUsado("Renault","PFD405", 600., 4));
       flota.ingresarVehiculo(new Minibus("Ferrari", "TORASV", 9));
       //flota.alquilarAutoUsado("PFD405");
       //flota.comprarAutoUsado("PFD405");
       flota.alquilarMinibus("TORASV");
    }
    
}
