/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebPageCinema;

/**
 *
 * @author lopez
 */
public final class Tarjetas {
    
    String nombreTarjetaHabiente;
    String numeroTarjeta;
    String fechaVencimiento;
    String codigoSeguridad;
    
    public Tarjetas(){
        
    }
    
    public Tarjetas(String nombreTarjetaHabiente,String numeroTarjeta,String fechaVencimiento,String codigoSeguridad){
        this.nombreTarjetaHabiente = nombreTarjetaHabiente;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.codigoSeguridad = codigoSeguridad;
    }
    
    
}
