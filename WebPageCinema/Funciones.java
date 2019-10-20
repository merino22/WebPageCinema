/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebPageCinema;

import javax.swing.JButton;

/**
 *
 * @author lopez
 */
public class Funciones {
    
    JButton filaA[][];
    JButton filaB[][];
    JButton filaC[][];
    JButton filaD[][];
    JButton filaE[][];
    JButton filaF[][];
    JButton filaG[][];
    JButton filaH[][];
    JButton filaI[][];
    JButton filaJ[][];
    String horario;
    String hora;
    String fecha;
    int counter;
    
    public Funciones(){
        
    }
    public Funciones(JButton filaA[][],JButton filaB[][],JButton filaC[][],JButton filaD[][],JButton filaE[][],JButton filaF[][],JButton filaG[][],JButton filaH[][],JButton filaI[][],JButton filaJ[][],String horario,String hora,String fecha,int counter){
       this.filaA = filaA;
       this.filaB = filaB;
       this.filaC = filaC;
       this.filaD = filaD;
       this.filaE = filaE;
       this.filaF = filaF;
       this.filaG = filaG;
       this.filaH = filaH;
       this.filaI = filaI;
       this.filaJ = filaJ;
       this.horario = horario;
       this.hora = hora;
       this.fecha = fecha;
       this.counter =counter;
    }
}
