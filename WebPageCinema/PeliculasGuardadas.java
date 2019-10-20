/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebPageCinema;

import java.util.*;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author lopez
 */
public class PeliculasGuardadas {

    String nombrePelicula;
    String sala;
    String edades;
    String formato;
    String duracion;
    String idioma;
    String genero;
    int precio;
    int precioNino;
    int precioTerEdad;
    String sinopsis;
    String url;
    int counter = 0;

    public PeliculasGuardadas() {

    }

    public PeliculasGuardadas(String nombrePelicula,String sala, String edades, String formato, String duracion, String idioma, String genero, int precio, int precioNino, int precioTerEdad, String sinopsis, String url,int counter) {
        this.nombrePelicula = nombrePelicula;
        this.sala = sala;
        this.edades = edades;
        this.formato = formato;
        this.duracion = duracion;
        this.idioma = idioma;
        this.genero = genero;
        this.precio = precio;
        this.precioNino = precioNino;
        this.precioTerEdad = precioTerEdad;
        this.sinopsis = sinopsis;
        this.url = url;
        this.counter = counter;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public String getSala() {
        return sala;
    }

    public String getEdades() {
        return edades;
    }

    public String getFormato() {
        return formato;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getGenero() {
        return genero;
    }

    public int getPrecio() {
        return precio;
    }

    public int getPrecioNino() {
        return precioNino;
    }

    public int getPrecioTerEdad() {
        return precioTerEdad;
    }

    public String getSinopsis() {
        return sinopsis;
    }

   

}
