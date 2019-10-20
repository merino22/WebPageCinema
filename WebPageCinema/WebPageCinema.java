/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebPageCinema;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author lopez
 */
public class WebPageCinema extends javax.swing.JFrame {

    ArrayList<PeliculasGuardadas> peliculas;
    ArrayList<Fecha>fechas;
    ArrayList<Funciones>funciones;
    ArrayList<Tarjetas>tarjetas;
    
    String url;
    int recog;

    public WebPageCinema(){
        
    }
    
    public WebPageCinema(ArrayList<PeliculasGuardadas> peliculas,ArrayList<Fecha>fechas,ArrayList<Funciones>funciones,ArrayList<Tarjetas>tarjetas) {
        this.fechas = fechas;
        this.peliculas = peliculas;
        this.funciones = funciones;
        this.tarjetas = tarjetas;
        initComponents();
        setWebPage();
    }

    public void setWebPage() {
        for (int i = 0; i < peliculas.size(); i++) {
            if (i == 0) {
                peliNombre1Lbl.setText(peliculas.get(i).nombrePelicula);
            } else if (i == 1) {
                peliNombre2Lbl.setText(peliculas.get(i).nombrePelicula);
            } else if (i == 2) {
                peliNombre3Lbl.setText(peliculas.get(i).nombrePelicula);
            }
            try {
                BufferedImage img = ImageIO.read(new File(peliculas.get(i).url));
                ImageIcon icon = new ImageIcon(img);
                if (i == 0) {
                    peliPic1Lbl.setIcon(icon);
                } else if (i == 1) {
                    img = ImageIO.read(new File(peliculas.get(i).url));
                    icon = new ImageIcon(img);
                    peliPic2Lbl.setIcon(icon);
                } else if (i == 2) {
                    img = ImageIO.read(new File(peliculas.get(i).url));
                    icon = new ImageIcon(img);
                    peliPic3Lbl.setIcon(icon);
                }
            } catch (IOException ex) {
                Logger.getLogger(ModificarPeliculas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        jPanel1.updateUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        peliPic1Lbl = new javax.swing.JLabel();
        peliNombre1Lbl = new javax.swing.JLabel();
        peliPic2Lbl = new javax.swing.JLabel();
        peliPic3Lbl = new javax.swing.JLabel();
        peliNombre2Lbl = new javax.swing.JLabel();
        peliNombre3Lbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        peliPic1Lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        peliPic1Lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peliPic1LblMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                peliPic1LblMousePressed(evt);
            }
        });

        peliNombre1Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        peliNombre1Lbl.setForeground(new java.awt.Color(255, 255, 255));
        peliNombre1Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        peliNombre1Lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        peliPic2Lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        peliPic2Lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peliPic2LblMouseClicked(evt);
            }
        });

        peliPic3Lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        peliPic3Lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peliPic3LblMouseClicked(evt);
            }
        });

        peliNombre2Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        peliNombre2Lbl.setForeground(new java.awt.Color(255, 255, 255));
        peliNombre2Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        peliNombre2Lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        peliNombre3Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        peliNombre3Lbl.setForeground(new java.awt.Color(255, 255, 255));
        peliNombre3Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        peliNombre3Lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(peliNombre1Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(peliPic1Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(146, 146, 146)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(peliPic2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peliNombre2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(peliPic3Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peliNombre3Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(peliPic3Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(peliPic2Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(peliPic1Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(peliNombre1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peliNombre2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peliNombre3Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(211, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CARTELERA");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(410, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void peliPic1LblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peliPic1LblMousePressed

    }//GEN-LAST:event_peliPic1LblMousePressed

    private void peliPic1LblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peliPic1LblMouseClicked
        recog = 1;
        Horarios horarios = new Horarios(peliculas, recog,fechas,funciones,tarjetas);
        horarios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_peliPic1LblMouseClicked

    private void peliPic2LblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peliPic2LblMouseClicked
        recog = 2;
        Horarios horarios = new Horarios(peliculas, recog,fechas,funciones,tarjetas);
        horarios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_peliPic2LblMouseClicked

    private void peliPic3LblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peliPic3LblMouseClicked
        recog = 3;
        Horarios horarios = new Horarios(peliculas, recog,fechas,funciones,tarjetas);
        horarios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_peliPic3LblMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu menu = new Menu(peliculas,fechas,funciones,tarjetas);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

        /**
         * @param args the command line arguments
         */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel peliNombre1Lbl;
    private javax.swing.JLabel peliNombre2Lbl;
    private javax.swing.JLabel peliNombre3Lbl;
    private javax.swing.JLabel peliPic1Lbl;
    private javax.swing.JLabel peliPic2Lbl;
    private javax.swing.JLabel peliPic3Lbl;
    // End of variables declaration//GEN-END:variables
}
