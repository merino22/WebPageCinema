/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebPageCinema;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author lopez
 */
public class Asientos extends JButton implements ActionListener{
    
    byte valor = 0;
    Asientos asientos;
    public Asientos(String num){
        this.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        valor++;
        valor%=2;
        
        switch(valor){
            case 0:
                setText(asientos.getText());
                break;
                
            case 1:
                setText("nd");
                break;
        }
    }
}
