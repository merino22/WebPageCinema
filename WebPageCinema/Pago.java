/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebPageCinema;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lopez
 */
public class Pago extends javax.swing.JFrame {

    String asientos;
    String pagoTotal;
    String horaFecha;
    String sala,hora,fecha;
    String fechaExp = "";
    String peliName;
    int peli1Counter,peli2Counter,peli3Counter;
    int recog;
    boolean verif = false;
    ArrayList<Tarjetas>tarjetas;
    ArrayList<PeliculasGuardadas>peliculas;
    ArrayList<Funciones>funciones;
    ArrayList<Fecha>fechas;
    
    public Pago(ArrayList<Fecha>fechas,ArrayList<Funciones>funciones,ArrayList<PeliculasGuardadas>peliculas,ArrayList<Tarjetas>tarjetas,String asientos,String pagoTotal,String horaFecha,String sala,String hora,String fecha,int recog,String peliName) {
        initComponents();
        this.peliculas = peliculas;
        this.tarjetas = tarjetas;
        this.asientos = asientos;
        this.pagoTotal = pagoTotal;
        this.horaFecha = horaFecha;
        this.sala = sala;
        this.hora = hora;
        this.fecha = fecha;
        this.recog = recog;
        this.peliName = peliName;
        this.funciones = funciones;
        this.fechas = fechas;
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comprarBtn = new javax.swing.JButton();
        correoTxtF = new javax.swing.JTextField();
        nombreTarjetaTxtF = new javax.swing.JTextField();
        numeroTarjetaTxtF = new javax.swing.JTextField();
        mesCombo = new javax.swing.JComboBox<>();
        anoCombo = new javax.swing.JComboBox<>();
        codigoTarjetaTxtF = new javax.swing.JTextField();
        tipoTarjetaCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Correo Electronico");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre del Tarjetahabiente");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Numero de Tarjeta");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Fecha de Vencimiento");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Codigo de Seguridad de Tarjeta");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Tipo de Tarjeta");

        comprarBtn.setBackground(new java.awt.Color(255, 255, 255));
        comprarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comprarBtn.setText("COMPRAR");
        comprarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarBtnActionPerformed(evt);
            }
        });

        mesCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MES", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        anoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AÑO", "19", "20", "21", "22", "23", "24" }));

        tipoTarjetaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una por favor", "VISA", "MasterCard", "American Express" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(correoTxtF)
                            .addComponent(nombreTarjetaTxtF)
                            .addComponent(numeroTarjetaTxtF)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(codigoTarjetaTxtF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mesCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, 80, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(anoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tipoTarjetaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(comprarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(453, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correoTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nombreTarjetaTxtF)
                        .addGap(8, 8, 8)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroTarjetaTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoTarjetaTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoTarjetaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(comprarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comprarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarBtnActionPerformed
        fechaExp = mesCombo.getSelectedItem().toString() + "/" + anoCombo.getSelectedItem().toString();
        for (int i = 0; i < tarjetas.size(); i++) {
            if(nombreTarjetaTxtF.getText().equals(tarjetas.get(i).nombreTarjetaHabiente)){
                if(numeroTarjetaTxtF.getText().equals(tarjetas.get(i).numeroTarjeta)){
                    if(fechaExp.equals(tarjetas.get(i).fechaVencimiento)){
                        if(codigoTarjetaTxtF.getText().equals(tarjetas.get(i).codigoSeguridad)){
                            verif = true;
                        }
                    }
                }
                
            }
        }
        if(verif == true){
            JOptionPane.showMessageDialog(null, "Orden Procesada!");
            System.out.println(fecha + " " + hora + " " + pagoTotal + " " + asientos);
            
                if(peliName.equals(peliculas.get(0).nombrePelicula)){
                    peliculas.get(0).counter++;
                }else if(peliName.equals(peliculas.get(1).nombrePelicula)){
                    peliculas.get(1).counter++;
                }else if(peliName.equals(peliculas.get(2).nombrePelicula)){
                    peliculas.get(2).counter++;
                }
                
                for (int i = 0; i < peliculas.size(); i++) {
                if(peliName.equals(peliculas.get(i).nombrePelicula)){
                    peliculas.get(i).counter++;
                }
            }
                
                for (int i = 0; i < funciones.size(); i++) {
                if(horaFecha.equals(funciones.get(i).horario)){
                    funciones.get(i).counter += 1;
                }
            }
            
            HojaConfirmacion hf = new HojaConfirmacion(peliculas,fechas,funciones,tarjetas,fecha,hora,pagoTotal,asientos,correoTxtF.getText(),peliName,sala);
                hf.setVisible(true);
                this.dispose();
        }else if(verif == false){
            JOptionPane.showMessageDialog(null, "Datos no coinciden, chequee los datos que ingreso!");
        }
    }//GEN-LAST:event_comprarBtnActionPerformed
    
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> anoCombo;
    private javax.swing.JTextField codigoTarjetaTxtF;
    private javax.swing.JButton comprarBtn;
    private javax.swing.JTextField correoTxtF;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> mesCombo;
    private javax.swing.JTextField nombreTarjetaTxtF;
    private javax.swing.JTextField numeroTarjetaTxtF;
    private javax.swing.JComboBox<String> tipoTarjetaCombo;
    // End of variables declaration//GEN-END:variables
}
