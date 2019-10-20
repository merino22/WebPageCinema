
package WebPageCinema;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author lopez
 */
public class AdminPlatform extends javax.swing.JFrame {

    ArrayList<Fecha> fechas;
    ArrayList<PeliculasGuardadas> peliculas;
    ArrayList<Funciones> funciones;
    ArrayList<Tarjetas> tarjetas;
    String url = "";
    PeliculasGuardadas pg;
    int check = 0;

    JButton filaA[][] = new JButton[1][20];
    JButton filaB[][] = new JButton[1][20];
    JButton filaC[][] = new JButton[1][20];
    JButton filaD[][] = new JButton[1][20];
    JButton filaE[][] = new JButton[1][20];
    JButton filaF[][] = new JButton[1][20];
    JButton filaG[][] = new JButton[1][20];
    JButton filaH[][] = new JButton[1][20];
    JButton filaI[][] = new JButton[1][20];
    JButton filaJ[][] = new JButton[1][20];

    /**
     * Creates new form AdminWindow
     *
     * @param peliculas
     */
    public AdminPlatform(ArrayList<PeliculasGuardadas> peliculas, ArrayList<Fecha> fechas, ArrayList<Funciones> funciones, ArrayList<Tarjetas> tarjetas) {
        initComponents();
        AddFilaA();
        AddFilaB();
        AddFilaC();
        AddFilaD();
        AddFilaE();
        AddFilaF();
        AddFilaG();
        AddFilaH();
        AddFilaI();
        AddFilaJ();
        salasCombo();
        this.peliculas = peliculas;
        this.fechas = fechas;
        this.funciones = funciones;
        this.tarjetas = tarjetas;
    }

    public void AddFilaA() {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 20; j++) {
                filaA[i][j] = new JButton("[" + (j + 1) + "]");
            }
        }
    }

    public void AddFilaB() {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 20; j++) {
                filaB[i][j] = new JButton("[" + (j + 1) + "]");
            }
        }
    }

    public void AddFilaC() {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 20; j++) {
                filaC[i][j] = new JButton("[" + (j + 1) + "]");
            }
        }
    }

    public void AddFilaD() {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 20; j++) {
                filaD[i][j] = new JButton("[" + (j + 1) + "]");
            }
        }
    }

    public void AddFilaE() {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 20; j++) {
                filaE[i][j] = new JButton("[" + (j + 1) + "]");
            }
        }
    }

    public void AddFilaF() {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 20; j++) {
                filaF[i][j] = new JButton("[" + (j + 1) + "]");
            }
        }
    }

    public void AddFilaG() {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 20; j++) {
                filaG[i][j] = new JButton("[" + (j + 1) + "]");
            }
        }
    }

    public void AddFilaH() {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 20; j++) {
                filaH[i][j] = new JButton("[" + (j + 1) + "]");
            }
        }
    }

    public void AddFilaI() {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 20; j++) {
                filaI[i][j] = new JButton("[" + (j + 1) + "]");
            }
        }
    }

    public void AddFilaJ() {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 20; j++) {
                filaJ[i][j] = new JButton("[" + (j + 1) + "]");
            }
        }
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        nombrePeliculaLbl = new javax.swing.JLabel();
        nombrePelicula = new javax.swing.JTextField();
        horarioLbl = new javax.swing.JLabel();
        salaLbl = new javax.swing.JLabel();
        SalasCmbBox = new javax.swing.JComboBox<>();
        edadesLbl = new javax.swing.JLabel();
        EdadesCmbBox = new javax.swing.JComboBox<>();
        formatoLbl = new javax.swing.JLabel();
        FormatoCmbBox = new javax.swing.JComboBox<>();
        duracionLbl = new javax.swing.JLabel();
        DuracionTxtF = new javax.swing.JTextField();
        sinopsisLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SinopsisTxtArea = new javax.swing.JTextArea();
        idiomaLbl = new javax.swing.JLabel();
        IdiomasCmbBox = new javax.swing.JComboBox<>();
        imagenLbl = new javax.swing.JLabel();
        espacioImgLbl = new javax.swing.JLabel();
        agregarImgBtn = new javax.swing.JButton();
        agregarPeliculaBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        generoCmbBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        precioTxtF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        precioNinoTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        precio3edadTxt = new javax.swing.JTextField();
        Hora = new javax.swing.JTextField();
        Fecha = new javax.swing.JTextField();
        Anadir = new javax.swing.JButton();
        nombrePeliculaLbl1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setForeground(new java.awt.Color(102, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PLATAFORMA DE ADMINISTRADOR");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(309, 309, 309))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        nombrePeliculaLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombrePeliculaLbl.setForeground(new java.awt.Color(255, 255, 255));
        nombrePeliculaLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrePeliculaLbl.setText("Nombre Pelicula:");

        nombrePelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePeliculaActionPerformed(evt);
            }
        });

        horarioLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        horarioLbl.setForeground(new java.awt.Color(255, 255, 255));
        horarioLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        horarioLbl.setText("Horario:");

        salaLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        salaLbl.setForeground(new java.awt.Color(255, 255, 255));
        salaLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salaLbl.setText("Sala:");

        SalasCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------------", "Sala 1", "Sala 2", "Sala 3" }));

        edadesLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edadesLbl.setForeground(new java.awt.Color(255, 255, 255));
        edadesLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edadesLbl.setText("Edades");

        EdadesCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------------", "Todo Publico", "Mayores de 12", "Mayores de 15", "Mayores de 18" }));
        EdadesCmbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdadesCmbBoxActionPerformed(evt);
            }
        });

        formatoLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        formatoLbl.setForeground(new java.awt.Color(255, 255, 255));
        formatoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formatoLbl.setText("Formato");

        FormatoCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------------", "2D", "3D" }));

        duracionLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        duracionLbl.setForeground(new java.awt.Color(255, 255, 255));
        duracionLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        duracionLbl.setText("Duracion");

        sinopsisLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sinopsisLbl.setForeground(new java.awt.Color(255, 255, 255));
        sinopsisLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sinopsisLbl.setText("Sinopsis");

        SinopsisTxtArea.setColumns(20);
        SinopsisTxtArea.setRows(5);
        jScrollPane1.setViewportView(SinopsisTxtArea);

        idiomaLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        idiomaLbl.setForeground(new java.awt.Color(255, 255, 255));
        idiomaLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idiomaLbl.setText("Idioma");

        IdiomasCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------------", "Doblada al Español", "Ingles", "Ingles,subtitulado español" }));

        imagenLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        imagenLbl.setForeground(new java.awt.Color(255, 255, 255));
        imagenLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagenLbl.setText("Imagen");

        espacioImgLbl.setText("jLabel11");
        espacioImgLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        agregarImgBtn.setText("Imagen");
        agregarImgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarImgBtnActionPerformed(evt);
            }
        });

        agregarPeliculaBtn.setText("Agregar Pelicula");
        agregarPeliculaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPeliculaBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Genero");

        generoCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------------", "Accion", "Drama", "Comedia", "Terror", "Suspenso", "Romance", "Comedia-Romance", "Aventura", "Ciencia FIccion" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Precio");

        precioTxtF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio Niño");

        precioNinoTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio 3era Edad");

        precio3edadTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Anadir.setText("Añadir Hora y Fecha");
        Anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnadirActionPerformed(evt);
            }
        });

        nombrePeliculaLbl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombrePeliculaLbl1.setForeground(new java.awt.Color(255, 255, 255));
        nombrePeliculaLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrePeliculaLbl1.setText("Fecha");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(horarioLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nombrePeliculaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(salaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edadesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(formatoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(duracionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(idiomaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nombrePeliculaLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sinopsisLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(generoCmbBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IdiomasCmbBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 184, Short.MAX_VALUE)
                            .addComponent(nombrePelicula, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SalasCmbBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EdadesCmbBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FormatoCmbBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DuracionTxtF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precioTxtF)
                            .addComponent(Hora, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fecha, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(agregarImgBtn)
                                .addGap(181, 181, 181))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Anadir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(espacioImgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(precioNinoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(precio3edadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(51, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(imagenLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(128, 128, 128))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(agregarPeliculaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombrePeliculaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombrePelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombrePeliculaLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Fecha)
                                        .addGap(4, 4, 4)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(horarioLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(Anadir)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SalasCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edadesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EdadesCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(formatoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FormatoCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(duracionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DuracionTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idiomaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdiomasCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(imagenLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(espacioImgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(agregarImgBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generoCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precioNinoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precio3edadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(sinopsisLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(agregarPeliculaBtn)))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EdadesCmbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdadesCmbBoxActionPerformed
        if (EdadesCmbBox.getSelectedItem().toString().equals("Mayores de 18")) {
            precioNinoTxt.setEnabled(false);
        } else {
            precioNinoTxt.setEnabled(true);
        }
    }//GEN-LAST:event_EdadesCmbBoxActionPerformed

    private void agregarImgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarImgBtnActionPerformed
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        int returnValue = jfc.showOpenDialog(null);
        // int returnValue = jfc.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
        }
        url = jfc.getSelectedFile().getAbsolutePath();
        ImageIcon img = new ImageIcon(url);
        espacioImgLbl.setIcon(img);

    }//GEN-LAST:event_agregarImgBtnActionPerformed

    private void agregarPeliculaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPeliculaBtnActionPerformed

        if (nombrePeliculaLbl.getText() != null && !"-------------".equals(SalasCmbBox.getSelectedItem().toString()) && !"-------------".equals(EdadesCmbBox.getSelectedItem().toString()) && !"-------------".equals(FormatoCmbBox.getSelectedItem().toString()) && DuracionTxtF.getText() != null && !"-------------".equals(IdiomasCmbBox.getSelectedItem().toString()) && !"-------------".equals(generoCmbBox.getSelectedItem().toString()) && precioTxtF.getText() != null && SinopsisTxtArea.getText() != null) {
            peliculas.add(new PeliculasGuardadas(nombrePelicula.getText(), SalasCmbBox.getSelectedItem().toString(), EdadesCmbBox.getSelectedItem().toString(), FormatoCmbBox.getSelectedItem().toString(), DuracionTxtF.getText(), IdiomasCmbBox.getSelectedItem().toString(), generoCmbBox.getSelectedItem().toString(), Integer.parseInt(precioTxtF.getText()), Integer.parseInt(precioNinoTxt.getText()), Integer.parseInt(precio3edadTxt.getText()), SinopsisTxtArea.getText(), url, 0));
            JOptionPane.showMessageDialog(null, "Pelicula Agregada exitosamente!");
            AdminMenu menu = new AdminMenu(peliculas, fechas, funciones, tarjetas);
            check = 1;
            menu.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo agregar la pelicula!");
        }
        System.out.println("----------------------");
        for (int i = 0; i < fechas.size(); i++) {
            System.out.println(fechas.get(i).fecha + " " + fechas.get(i).hora);
        }

    }//GEN-LAST:event_agregarPeliculaBtnActionPerformed


    private void nombrePeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePeliculaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdminMenu menu = new AdminMenu(peliculas, fechas, funciones, tarjetas);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnadirActionPerformed
        fechas.add(new Fecha(Hora.getText(), Fecha.getText(), nombrePelicula.getText()));
        funciones.add(new Funciones(filaA, filaB, filaC, filaD, filaE, filaF, filaG, filaH, filaI, filaJ, Hora.getText() + ", " + Fecha.getText(), Hora.getText(), Fecha.getText(), 0));
        for (int i = 0; i < fechas.size(); i++) {
            System.out.println(fechas.get(i).hora + " " + fechas.get(i).fecha);
            System.out.println(funciones.get(i).horario);
        }
    }//GEN-LAST:event_AnadirActionPerformed

    public void salasCombo() {
        if (check == 1) {
            for (int i = 0; i < peliculas.size(); i++) {
                if (peliculas.get(i).sala.equals("Sala 1")) {
                    SalasCmbBox.removeItem(1);
                    SalasCmbBox.updateUI();
                } else if (peliculas.get(i).sala.equals("Sala 2")) {
                    SalasCmbBox.remove(2);
                } else if (peliculas.get(i).sala.equals("Sala 3")) {
                    SalasCmbBox.remove(3);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anadir;
    private javax.swing.JTextField DuracionTxtF;
    private javax.swing.JComboBox<String> EdadesCmbBox;
    private javax.swing.JTextField Fecha;
    private javax.swing.JComboBox<String> FormatoCmbBox;
    private javax.swing.JTextField Hora;
    private javax.swing.JComboBox<String> IdiomasCmbBox;
    private javax.swing.JComboBox<String> SalasCmbBox;
    private javax.swing.JTextArea SinopsisTxtArea;
    private javax.swing.JButton agregarImgBtn;
    private javax.swing.JButton agregarPeliculaBtn;
    private javax.swing.JLabel duracionLbl;
    private javax.swing.JLabel edadesLbl;
    private javax.swing.JLabel espacioImgLbl;
    private javax.swing.JLabel formatoLbl;
    private javax.swing.JComboBox<String> generoCmbBox;
    private javax.swing.JLabel horarioLbl;
    private javax.swing.JLabel idiomaLbl;
    private javax.swing.JLabel imagenLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombrePelicula;
    private javax.swing.JLabel nombrePeliculaLbl;
    private javax.swing.JLabel nombrePeliculaLbl1;
    private javax.swing.JTextField precio3edadTxt;
    private javax.swing.JTextField precioNinoTxt;
    private javax.swing.JTextField precioTxtF;
    private javax.swing.JLabel salaLbl;
    private javax.swing.JLabel sinopsisLbl;
    // End of variables declaration//GEN-END:variables
}
