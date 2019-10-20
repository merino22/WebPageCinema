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
public class Ventas {
    
    int ventaTotalPorSala,ventaTotalPorHorario,ventaTotalPorPelicula;
    int counterVentaPorSala,counterVentaPorHorario,counterVentaPorPelicula;
    
    public Ventas(int ventaTotalPorSala,int ventaTotalPorHorario,int ventaTotalPorPelicula,int cVPS,int cVPH,int cVPP){
        this.ventaTotalPorSala = ventaTotalPorSala;
        this.ventaTotalPorHorario = ventaTotalPorHorario;
        this.ventaTotalPorPelicula = ventaTotalPorPelicula;
        counterVentaPorSala = cVPS;
        counterVentaPorHorario = cVPH;
        counterVentaPorPelicula = cVPP;
    }
    
    
}
