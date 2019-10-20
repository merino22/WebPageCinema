/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebPageCinema;

import java.awt.GridLayout;
import java.util.ArrayList;

/**
 *
 * @author lopez
 */
public class VentasDisplay extends javax.swing.JFrame {

    String counterPeli1, counterPeli2, counterPeli3;
    ArrayList<PeliculasGuardadas> peliculas;
    int xx = 0;

    public VentasDisplay(ArrayList<PeliculasGuardadas> peliculas) {
        initComponents();
        this.peliculas = peliculas;
        setAsteriscs();
        counter1.setText(counterPeli1);
        counter2.setText(counterPeli2);
        counter3.setText(counterPeli3);
    }

    public void setAsteriscs() {
        for (int i = 0; i < peliculas.size(); i++) {
            if (xx <= 0) {
                for (int j = 0; j < peliculas.get(i).counter - 1; j++) {
                    counterPeli1 += "* ";
                    xx = 1;
                }
            } else if (xx > 0 && xx < 2) {
                for (int j = 0; j < peliculas.get(i).counter - 1; j++) {
                    counterPeli2 += "* ";
                    xx = 2;
                }
            } else if (xx > 1 && xx < 3) {
                for (int j = 0; j < peliculas.get(i).counter - 1; j++) {
                    counterPeli3 += "* ";
                    xx = 3;
                }
            }
        }
    }
    
    public void setLabels(){
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        peli1Lbl = new javax.swing.JLabel();
        peli2Lbl = new javax.swing.JLabel();
        peli3Lbl = new javax.swing.JLabel();
        counter1 = new javax.swing.JLabel();
        counter2 = new javax.swing.JLabel();
        counter3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1069, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("VentasPorSala", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        peli1Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        peli1Lbl.setForeground(new java.awt.Color(255, 255, 255));
        peli1Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        peli2Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        peli2Lbl.setForeground(new java.awt.Color(255, 255, 255));
        peli2Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        peli3Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        peli3Lbl.setForeground(new java.awt.Color(255, 255, 255));
        peli3Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        counter1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        counter1.setForeground(new java.awt.Color(255, 255, 255));

        counter2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        counter2.setForeground(new java.awt.Color(255, 255, 255));

        counter3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        counter3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(peli1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(counter1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(peli2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(peli3Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(counter2, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(counter3, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(peli1Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(counter1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(counter2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(counter3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(peli2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(peli3Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(338, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("VentasPorPelicula", jPanel2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1069, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("VentasPorHorario", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel counter1;
    private javax.swing.JLabel counter2;
    private javax.swing.JLabel counter3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel peli1Lbl;
    private javax.swing.JLabel peli2Lbl;
    private javax.swing.JLabel peli3Lbl;
    // End of variables declaration//GEN-END:variables
}
