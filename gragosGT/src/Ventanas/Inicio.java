package Ventanas;

import Clases.DatosGraficos;
import Clases.PintanrDibujos;
import Clases.AlgoritmoDijkstra;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;


public class Inicio extends javax.swing.JFrame {

    private int Numerotope = 0;//Numero de nodos 
    
    DatosGraficos arboles = new DatosGraficos();

    public static void PintarFiguras(int tope, DatosGraficos arboles) {//pinta lo q esta antes en el panel 
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                if (arboles.getmAdyacencia(j, k) == 1) {
                    PintanrDibujos.pinta_Linea(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getCordeX(k), arboles.getCordeY(k), arboles.getmCoeficiente(j, k));
                }
            }
        }
        for (int j = 0; j < tope; j++) {
            PintanrDibujos.pinta_Circulo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getNombre(j));
        }

    }

    public Inicio() {
        initComponents();
        EleccionDestino.setEnabled(false);
        EleccionOrigen.setEnabled(false);
        BuscarCamino.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JLabel();
        MostrarCaminos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        colorOrigen = new javax.swing.JLabel();
        txtColorOrigen = new javax.swing.JLabel();
        colorDestino = new javax.swing.JLabel();
        txtColorDestino = new javax.swing.JLabel();
        colorNodoVisitado = new javax.swing.JLabel();
        txtColorNodoRecorrido = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JButton();
        ImgMapa = new javax.swing.JLabel();
        BuscarCamino = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKMAcumulados = new javax.swing.JTextArea();
        kmRecorridos = new javax.swing.JLabel();
        kmRecorridos1 = new javax.swing.JLabel();
        LateralSuperior = new javax.swing.JLabel();
        LateralSuperior1 = new javax.swing.JLabel();
        kmRecorridos2 = new javax.swing.JLabel();
        EleccionOrigen = new javax.swing.JComboBox<>();
        txtOrigen = new javax.swing.JLabel();
        EleccionDestino = new javax.swing.JComboBox<>();
        txtDestino = new javax.swing.JLabel();
        LateralSuperior2 = new javax.swing.JLabel();

        Fondo.setBackground(new java.awt.Color(255, 255, 153));
        Fondo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.jpg"))); // NOI18N
        Fondo.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MostrarCaminos.setBackground(new java.awt.Color(255, 255, 204));
        MostrarCaminos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MostrarCaminos.setForeground(new java.awt.Color(0, 0, 204));
        MostrarCaminos.setText("Mostrar Caminos");
        MostrarCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarCaminosActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarCaminos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 220, 50));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        colorOrigen.setBackground(new java.awt.Color(255, 0, 0));
        colorOrigen.setOpaque(true);
        jPanel1.add(colorOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 20, 20));

        txtColorOrigen.setBackground(new java.awt.Color(255, 255, 102));
        txtColorOrigen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtColorOrigen.setForeground(new java.awt.Color(51, 0, 204));
        txtColorOrigen.setText("Origen--------------->");
        txtColorOrigen.setOpaque(true);
        jPanel1.add(txtColorOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 190, 40));

        colorDestino.setBackground(new java.awt.Color(51, 255, 51));
        colorDestino.setOpaque(true);
        jPanel1.add(colorDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 20, 20));

        txtColorDestino.setBackground(new java.awt.Color(255, 255, 102));
        txtColorDestino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtColorDestino.setForeground(new java.awt.Color(51, 0, 204));
        txtColorDestino.setText("Destino-------------->");
        txtColorDestino.setOpaque(true);
        jPanel1.add(txtColorDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 190, 30));

        colorNodoVisitado.setBackground(new java.awt.Color(0, 51, 255));
        colorNodoVisitado.setOpaque(true);
        jPanel1.add(colorNodoVisitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 20, 20));

        txtColorNodoRecorrido.setBackground(new java.awt.Color(255, 255, 102));
        txtColorNodoRecorrido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtColorNodoRecorrido.setForeground(new java.awt.Color(51, 0, 204));
        txtColorNodoRecorrido.setText("Nodo Recorrido ---->");
        txtColorNodoRecorrido.setOpaque(true);
        jPanel1.add(txtColorNodoRecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 190, 40));

        BotonSalir.setBackground(new java.awt.Color(255, 51, 51));
        BotonSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("X");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 50, 50));

        ImgMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/suchisss.jpg"))); // NOI18N
        jPanel1.add(ImgMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 5, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 850, 730));

        BuscarCamino.setBackground(new java.awt.Color(0, 153, 51));
        BuscarCamino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BuscarCamino.setForeground(new java.awt.Color(51, 0, 204));
        BuscarCamino.setText("Buscar Camino mas corto");
        BuscarCamino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCaminoActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarCamino, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 300, 60));

        txtKMAcumulados.setColumns(20);
        txtKMAcumulados.setRows(5);
        jScrollPane1.setViewportView(txtKMAcumulados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 510, 70));

        kmRecorridos.setBackground(new java.awt.Color(255, 255, 102));
        kmRecorridos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kmRecorridos.setForeground(new java.awt.Color(0, 0, 153));
        kmRecorridos.setOpaque(true);
        getContentPane().add(kmRecorridos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 390, 40));

        kmRecorridos1.setBackground(new java.awt.Color(255, 255, 102));
        kmRecorridos1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kmRecorridos1.setForeground(new java.awt.Color(0, 0, 153));
        kmRecorridos1.setOpaque(true);
        getContentPane().add(kmRecorridos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 140, 40));

        LateralSuperior.setBackground(new java.awt.Color(255, 255, 102));
        LateralSuperior.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior.setForeground(new java.awt.Color(0, 0, 153));
        LateralSuperior.setOpaque(true);
        getContentPane().add(LateralSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 730));

        LateralSuperior1.setBackground(new java.awt.Color(255, 255, 102));
        LateralSuperior1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior1.setForeground(new java.awt.Color(0, 0, 153));
        LateralSuperior1.setOpaque(true);
        getContentPane().add(LateralSuperior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 700, 560, 30));

        kmRecorridos2.setBackground(new java.awt.Color(255, 255, 102));
        kmRecorridos2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kmRecorridos2.setForeground(new java.awt.Color(0, 0, 153));
        kmRecorridos2.setText("                         Kilometros recorridos:");
        kmRecorridos2.setOpaque(true);
        getContentPane().add(kmRecorridos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 510, 30));

        EleccionOrigen.setBackground(new java.awt.Color(0, 153, 51));
        EleccionOrigen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EleccionOrigen.setForeground(new java.awt.Color(0, 0, 153));
        EleccionOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1. Pueblo Nuevo", "2. San Francisco Zapotitlan", "3. Zunilito", "4. Mazatenango", "5. Cuyotenango ", "6. San Lorenzo", "7. Santo Domingo", "8. San Gabriel", "9. San Benardino", "10. Samayac", "11. San Pablo Jocopilas", "12. Santo Tomas La Union", "13. Chicacao", "14. San Antonio Suchitepequez", "15. San Jose El Idolo", "16. San Miguel Panan", "17. Rio Bravo", "18. Santa Barbara", "19. San Juan Bautista", "20. Patulul", " " }));
        EleccionOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleccionOrigenActionPerformed(evt);
            }
        });
        getContentPane().add(EleccionOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 370, 50));

        txtOrigen.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtOrigen.setForeground(new java.awt.Color(255, 255, 255));
        txtOrigen.setText("¿En dondé te Encuentras?");
        getContentPane().add(txtOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 340, 40));

        EleccionDestino.setBackground(new java.awt.Color(0, 153, 51));
        EleccionDestino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EleccionDestino.setForeground(new java.awt.Color(0, 0, 153));
        EleccionDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1. Pueblo Nuevo", "2. San Francisco Zapotitlan", "3. Zunilito", "4. Mazatenango", "5. Cuyotenango ", "6. San Lorenzo", "7. Santo Domingo", "8. San Gabriel", "9. San Benardino", "10. Samayac", "11. San Pablo Jocopilas", "12. Santo Tomas La Union", "13. Chicacao", "14. San Antonio Suchitepequez", "15. San Jose El Idolo", "16. San Miguel Panan", "17. Rio Bravo", "18. Santa Barbara", "19. San Juan Bautista", "20. Patulul" }));
        EleccionDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleccionDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(EleccionDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 370, 50));

        txtDestino.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtDestino.setForeground(new java.awt.Color(255, 255, 255));
        txtDestino.setText("¿Para que lugar te dirijes?");
        getContentPane().add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 370, 40));

        LateralSuperior2.setBackground(new java.awt.Color(0, 0, 0));
        LateralSuperior2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        LateralSuperior2.setForeground(new java.awt.Color(255, 255, 255));
        LateralSuperior2.setText("BIENVENIDOS A LA RED VIAL DE SUCHITEPEQUEZ");
        LateralSuperior2.setOpaque(true);
        getContentPane().add(LateralSuperior2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 500, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarCaminosActionPerformed
        //jMenuItem2.setEnabled(false);
        EleccionOrigen.setEnabled(true);
        MostrarCaminos.setEnabled(false);
        MostrarCaminos.setVisible(false);
        txtKMAcumulados.setEnabled(false);

        jPanel1.paint(jPanel1.getGraphics());
        
        int Matriz[][] = {
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1,},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0},
           
        };

        double coe[][] = {
            //1
            {0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            //2
            {9, 0, 7, 8, 20.7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            //3
            {0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            //4
            {0, 8, 0, 0, 8, 0, 8, 3, 6.5, 8.3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            //5
            {0, 20, 0, 17, 0, 13, 0, 14.6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            //6
            {0, 0, 0, 0, 13, 0, 13, 22.6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            //7
            {0, 0, 0, 8, 0, 13, 0, 10.7, 11.6, 0, 0, 0, 0, 16, 9.8, 0, 0, 0, 0, 0},
            //8
            {0, 0, 0, 3, 14.6, 22.6, 10.7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            //9
            {0, 0, 0, 6.5, 0, 0, 11.6, 0, 0, 3.2, 0, 0, 0, 6.3, 0, 0, 0, 0, 0, 0},
            //10
            {0, 0, 0, 8.3, 0, 0, 0, 0, 3.2, 0, 2.8, 0, 0, 11.3, 0, 0, 0, 0, 0, 0},
            //11
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 2.8, 0, 3.2, 4.7, 4.2, 0, 0, 0, 0, 0, 0},
            //12
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3.2, 0, 4.6, 0, 0, 0, 0, 0, 0, 0},
            //13
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4.7, 4.6, 0, 4.4, 46.9, 5.1, 49.7, 39.4, 0, 0},
            //14
            {0, 0, 0, 0, 0, 0, 16, 0, 6.3, 11.3, 4.2, 0, 4.4, 0, 33.2, 11.5, 0, 0, 0, 0},
            //15
            {0, 0, 0, 0, 0, 0, 9.8, 0, 0, 0, 0, 0, 0, 33.2, 0, 39.9, 53.4, 0, 0, 0},
            //16
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5.1, 11.5, 39.9, 0, 0, 0, 0, 0},
            //17
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 49.7, 0, 53.4, 0, 0, 24.7, 0, 35.7},
            //18
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 39.4, 0, 0, 0, 24.7, 0, 27.6, 39.8},
            //19
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 27.6, 0, 27.8,},
            //20
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 35.7, 39.8, 27.8, 0},
            };

        int xx1[] = {287, 285, 310, 310, 230, 275, 317, 300, 343, 330, 365, 370, 425, 380, 360, 420, 450, 510, 547, 557, 200};
        int yy1[] = {87, 150, 120, 190, 385, 455, 313, 210, 190, 160, 145, 118, 158, 210, 285, 216, 290, 235, 270, 327, 510};
        String nom[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
      
        for (int j = 0; j < 20; j++) {
            arboles.setCordeX(j, xx1[j]);
            arboles.setCordeY(j, yy1[j]);
            arboles.setNombre(j, nom[j]);

        }
        for (int j = 0; j < 20; j++) {
            for (int k = 0; k < 20; k++) {
                arboles.setmAdyacencia(j, k, Matriz[j][k]);
                arboles.setmCoeficiente(j, k, coe[j][k]);
            }
        }
        Numerotope = 20;
        PintarFiguras(Numerotope, arboles);
    }//GEN-LAST:event_MostrarCaminosActionPerformed

    private void EleccionDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleccionDestinoActionPerformed
        BuscarCamino.setEnabled(true);
    }//GEN-LAST:event_EleccionDestinoActionPerformed

    private void EleccionOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleccionOrigenActionPerformed
        EleccionDestino.setEnabled(true);
    }//GEN-LAST:event_EleccionOrigenActionPerformed

    private void BuscarCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCaminoActionPerformed
        int origen = 0, destino = 0;
        String nombreOrigen, nombreDestino;
        nombreOrigen = (String) EleccionOrigen.getSelectedItem();
        nombreDestino = (String) EleccionDestino.getSelectedItem();

        if ("Pueblo Nuevo".equals(nombreOrigen)) {
            origen = 0;
        }
        if ("San Francisco Zapotitlan".equals(nombreOrigen)) {
            origen = 1;
        }
        if ("Zunilito".equals(nombreOrigen)) {
            origen = 2;
        }
        if ("Mazatenango".equals(nombreOrigen)) {
            origen = 3;
        }
        if ("Cuyotenango".equals(nombreOrigen)) {
            origen = 4;
        }
        if ("San Lorenzo".equals(nombreOrigen)) {
            origen = 5;
        }
        if ("Santo Domingo Schitepequez".equals(nombreOrigen)) {
            origen = 6;
        }
        if ("San Gabriel".equals(nombreOrigen)) {
            origen = 7;
        }
        if ("San Benardino".equals(nombreOrigen)) {
            origen = 8;
        }
        if ("Samayac".equals(nombreOrigen)) {
            origen = 9;
        }
        if ("San Pablo Jocopilas".equals(nombreOrigen)) {
            origen = 10;
        }
        if ("Santo Tomás La Unión".equals(nombreOrigen)) {
            origen = 11;
        }
        if ("Chicacao".equals(nombreOrigen)) {
            origen = 12;
        }
        if ("San Antonio Suchitepequez".equals(nombreOrigen)) {
            origen = 13;
        }
        if ("San Jose El Idolo".equals(nombreOrigen)) {
            origen = 14;
        }
        if ("San Miguel Panan".equals(nombreOrigen)) {
            origen = 15;
        }
        if ("Rio Bravo".equals(nombreOrigen)) {
            origen = 16;
        }
        if ("Santa Barbara".equals(nombreOrigen)) {
            origen = 17;
        }
        if ("San Juan Bautista".equals(nombreOrigen)) {
            origen = 18;
        }
        if ("Patulul".equals(nombreOrigen)) {
            origen = 19;
        }

       
        

        if ("Pueblo Nuevo".equals(nombreDestino)) {
            destino = 0;
        }
        if ("San Francisco Zapotitlan".equals(nombreDestino)) {
            destino = 1;
        }
        if ("Zunilito".equals(nombreDestino)) {
            destino = 2;
        }
        if ("Mazatenango".equals(nombreDestino)) {
            destino = 3;
        }
        if ("Cuyotenango".equals(nombreDestino)) {
            destino = 4;
        }
        if ("San Lorenzo".equals(nombreDestino)) {
            destino = 5;
        }
        if ("Santo Domingo Suchitepequez".equals(nombreDestino)) {
            destino = 6;
        }
        if ("San Gabriel".equals(nombreDestino)) {
            destino = 7;
        }
        if ("San Benardino".equals(nombreDestino)) {
            destino = 8;
        }
        if ("Samayac".equals(nombreDestino)) {
            destino = 9;
        }
        if ("San Pablo Jocopilas".equals(nombreDestino)) {
            destino = 10;
        }
        if ("Santo Tomás La Unión".equals(nombreDestino)) {
            destino = 11;
        }
        if ("Chicacao".equals(nombreDestino)) {
            destino = 12;
        }
        if ("San Antonio Suchitepéquez".equals(nombreDestino)) {
            destino = 13;
        }
        if ("San Jose El Idolo".equals(nombreDestino)) {
            destino = 14;
        }
        if ("San Miguel Panan".equals(nombreDestino)) {
            destino = 15;
        }
        if ("Rio Bravo".equals(nombreDestino)) {
            destino = 16;
        }
        if ("Santa Barbara".equals(nombreDestino)) {
            destino = 17;
        }
        if ("San Juan Bautista".equals(nombreDestino)) {
            destino = 18;
        }
        if ("Patulul".equals(nombreDestino)) {
            destino = 19;
        }
 
        

        if (origen == destino) {
            Font fuente = new Font("Arial", Font.BOLD, 18);
            txtKMAcumulados.setFont(fuente);
            JOptionPane.showMessageDialog(null, "Estas en:" + nombreOrigen);
            txtKMAcumulados.setText("Intenta de nuevo!!");
            txtKMAcumulados.setEnabled(false);
            txtKMAcumulados.setForeground(Color.RED);

        } else {
            AlgoritmoDijkstra Dijkstra = new AlgoritmoDijkstra(arboles, Numerotope, origen, destino);
            Dijkstra.dijkstra();

            Font fuente = new Font("Arial", Font.BOLD, 18);
            txtKMAcumulados.setFont(fuente);
            txtKMAcumulados.setText("No hay ningun error :)");
            txtKMAcumulados.setForeground(Color.BLUE);
            txtKMAcumulados.setEnabled(false);
            
            kmRecorridos.setText(Dijkstra.getAcumulado() + " KM");
        }


    }//GEN-LAST:event_BuscarCaminoActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSalirActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Inicio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BuscarCamino;
    private javax.swing.JComboBox<String> EleccionDestino;
    private javax.swing.JComboBox<String> EleccionOrigen;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel ImgMapa;
    private javax.swing.JLabel LateralSuperior;
    private javax.swing.JLabel LateralSuperior1;
    private javax.swing.JLabel LateralSuperior2;
    private javax.swing.JButton MostrarCaminos;
    private javax.swing.JLabel colorDestino;
    private javax.swing.JLabel colorNodoVisitado;
    private javax.swing.JLabel colorOrigen;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kmRecorridos;
    private javax.swing.JLabel kmRecorridos1;
    private javax.swing.JLabel kmRecorridos2;
    private javax.swing.JLabel txtColorDestino;
    private javax.swing.JLabel txtColorNodoRecorrido;
    private javax.swing.JLabel txtColorOrigen;
    private javax.swing.JLabel txtDestino;
    private javax.swing.JTextArea txtKMAcumulados;
    private javax.swing.JLabel txtOrigen;
    // End of variables declaration//GEN-END:variables
}
