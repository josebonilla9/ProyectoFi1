
import javax.swing.*;


public final class JPanelCarrusel extends javax.swing.JPanel {

    int numImgInicial = 0;
    
    public JPanelCarrusel() {
        initComponents();
        Utilidades.SetJLabelCarruselLateralImg(imgLateral1);
        Utilidades.SetJLabelCarruselLateralImg(imgLateral2);
        mostrarButtons();
        mostrarImgCentral();
        
        textArea.setOpaque(false);
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
        textArea = new javax.swing.JTextArea();
        botonComenzar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
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

        flechaIzquierda.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        flechaIzquierda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(flechaIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 30, 50));

        flechaDerecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(flechaDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 250, 30, 50));

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
        panelTexto.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 10, 730, 30));

        barraAislada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Barrita aislada descripción.png"))); // NOI18N
        panelTexto.add(barraAislada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textArea.setForeground(new java.awt.Color(255, 255, 255));
        textArea.setLineWrap(true);
        textArea.setRows(5);
        textArea.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        textArea.setEnabled(false);
        textArea.setFocusable(false);
        textArea.setOpaque(false);
        panelTexto.add(textArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 730, 220));

        add(panelTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 780, 280));

        botonComenzar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(botonComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 760, 300, 50));
    }// </editor-fold>//GEN-END:initComponents

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
        
        Utilidades.SetInfoCarruselCentralWithDelay(imgCentral, titulo, textArea, numImgInicial,10);
        
        JLabel[] botonPunto = {
            puntoCarrusel0, puntoCarrusel1, puntoCarrusel2, puntoCarrusel3, puntoCarrusel4
        };
        
        Utilidades.CambiarImgPuntos(botonPunto, numImgInicial);
    }
    
    public void mostrarButtons() {
        JLabel[] botonesJLabel = {
            botonComenzar, flechaIzquierda, flechaDerecha
        };
        
        String[] etiquetas = {"Comenzar", "Flecha izquierda", "Flecha derecha"};
        
        for (int i = 0; i < botonesJLabel.length; i++) {
            Utilidades.SetButtonLauncherImageSmall(botonesJLabel[i], i % 3);
            final int index = i;
           
            Utilidades.SetButtonsCarruselSmall(botonesJLabel[index], etiquetas[index]);

            botonesJLabel[i].addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    if (index == 1) {
                        flechaIzquierdaMouseClick();                        
                    } else if (index == 2){
                        flechaDerechaMouseClick();
                    }
                }
                @Override
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    Utilidades.SetButtonsCarruselBig(botonesJLabel[index], etiquetas[index]);
                }
                @Override
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    Utilidades.SetButtonsCarruselSmall(botonesJLabel[index], etiquetas[index]);
                }
                @Override
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    Utilidades.SetButtonsCarruselSmall(botonesJLabel[index], etiquetas[index]);
                }
                @Override
                public void mouseReleased(java.awt.event.MouseEvent evt) {
                    Utilidades.SetButtonsCarruselBig(botonesJLabel[index], etiquetas[index]);
                }
            });
        }
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
    private javax.swing.JTextArea textArea;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
