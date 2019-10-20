/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebPageCinema;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lopez
 */
public class Fecha {

    ArrayList<String> Fecha;
    String fecha;
    String hora;
    String nombrePelicula;

    public Fecha(String hora,String fecha,String nombrePelicula) {
        this.fecha = fecha;
        this.hora = hora;
        this.nombrePelicula = nombrePelicula;
    }

    public List<String> getFecha() {
        return Fecha;
    }

}
