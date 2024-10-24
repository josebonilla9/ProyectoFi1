
import javax.swing.*;


public final class JPanelCarrusel extends javax.swing.JPanel {

    int numImgInicial = 0;
    
    public JPanelCarrusel() {
        initComponents();
        Utilidades.SetJLabelCarruselLateralImg(imgLateral1);
        Utilidades.SetJLabelCarruselLateralImg(imgLateral2);
        
        mostrarImgCentral();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgCentral = new javax.swing.JLabel();
        imgLateral1 = new javax.swing.JLabel();
        imgLateral2 = new javax.swing.JLabel();
        flechaIzquierda = new javax.swing.JLabel();
        flechaDerecha = new javax.swing.JLabel();
        panelPuntosCarrusel = new javax.swing.JPanel();
        puntoCarrusel0 = new javax.swing.JLabel();
        puntoCarrusel1 = new javax.swing.JLabel();
        puntoCarrusel2 = new javax.swing.JLabel();
        puntoCarrusel3 = new javax.swing.JLabel();
        puntoCarrusel4 = new javax.swing.JLabel();
        panelTexto = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        barraAislada = new javax.swing.JLabel();
        botonComenzar = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1510, 780));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgCentral.setFont(new java.awt.Font("Roboto Light", 0, 48)); // NOI18N
        imgCentral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(imgCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 891, 525));

        imgLateral1.setFont(new java.awt.Font("Roboto Light", 0, 48)); // NOI18N
        imgLateral1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(imgLateral1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 785, 470));

        imgLateral2.setFont(new java.awt.Font("Roboto Light", 0, 48)); // NOI18N
        imgLateral2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(imgLateral2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 785, 470));

        flechaIzquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Flecha izquierda.png"))); // NOI18N
        flechaIzquierda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        flechaIzquierda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flechaIzquierdaMouseClicked(evt);
            }
        });
        add(flechaIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 22, 35));

        flechaDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Flecha derecha.png"))); // NOI18N
        flechaDerecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        flechaDerecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flechaDerechaMouseClicked(evt);
            }
        });
        add(flechaDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 250, 22, 35));

        panelPuntosCarrusel.setOpaque(false);

        puntoCarrusel0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PuntoCarruselEmpty.png"))); // NOI18N
        panelPuntosCarrusel.add(puntoCarrusel0);

        puntoCarrusel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PuntoCarruselEmpty.png"))); // NOI18N
        panelPuntosCarrusel.add(puntoCarrusel1);

        puntoCarrusel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PuntoCarruselEmpty.png"))); // NOI18N
        panelPuntosCarrusel.add(puntoCarrusel2);

        puntoCarrusel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PuntoCarruselEmpty.png"))); // NOI18N
        panelPuntosCarrusel.add(puntoCarrusel3);

        puntoCarrusel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PuntoCarruselEmpty.png"))); // NOI18N
        panelPuntosCarrusel.add(puntoCarrusel4);

        add(panelPuntosCarrusel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, 230, 30));

        panelTexto.setOpaque(false);
        panelTexto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Embarque y desembarque en helicoptero");
        panelTexto.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 10, 440, -1));

        barraAislada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Barrita aislada descripción.png"))); // NOI18N
        panelTexto.add(barraAislada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        add(panelTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 760, 230));

        botonComenzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Comenzar.png"))); // NOI18N
        botonComenzar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(botonComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 770, 260, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void flechaDerechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechaDerechaMouseClicked
        flechaDerechaMouseClick();
    }//GEN-LAST:event_flechaDerechaMouseClicked

    private void flechaIzquierdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechaIzquierdaMouseClicked
        flechaIzquierdaMouseClick();
    }//GEN-LAST:event_flechaIzquierdaMouseClicked

    private void flechaDerechaMouseClick() {                                           
        numImgInicial++;
        if (numImgInicial >= 5) {
            numImgInicial = 0;
        }
        mostrarImgCentral();
    }
    
    private void flechaIzquierdaMouseClick() {                                           
        numImgInicial--;
        if (numImgInicial < 0) {
            numImgInicial = 4;
        }
        mostrarImgCentral();
    }
    
    public void mostrarImgCentral(){        
        Utilidades.SetJLabelCarruselCentralImg(imgCentral, numImgInicial);
        
        JLabel[] botonPunto = {
            puntoCarrusel0, puntoCarrusel1, puntoCarrusel2, puntoCarrusel3, puntoCarrusel4
        };
        
        Utilidades.CambiarImgPuntos(botonPunto, numImgInicial);
    }

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barraAislada;
    private javax.swing.JLabel botonComenzar;
    private javax.swing.JLabel flechaDerecha;
    private javax.swing.JLabel flechaIzquierda;
    private javax.swing.JLabel imgCentral;
    private javax.swing.JLabel imgLateral1;
    private javax.swing.JLabel imgLateral2;
    private javax.swing.JPanel panelPuntosCarrusel;
    private javax.swing.JPanel panelTexto;
    private javax.swing.JLabel puntoCarrusel0;
    private javax.swing.JLabel puntoCarrusel1;
    private javax.swing.JLabel puntoCarrusel2;
    private javax.swing.JLabel puntoCarrusel3;
    private javax.swing.JLabel puntoCarrusel4;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}