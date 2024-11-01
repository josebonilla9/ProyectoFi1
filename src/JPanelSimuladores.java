
import javax.swing.*;

public final class JPanelSimuladores extends javax.swing.JPanel {

    public JPanelSimuladores() {
        initComponents();
        mostrarGradoButtons();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgGrado0 = new javax.swing.JLabel();
        imgGrado1 = new javax.swing.JLabel();
        imgGrado2 = new javax.swing.JLabel();
        imgGrado3 = new javax.swing.JLabel();
        imgGrado4 = new javax.swing.JLabel();
        imgGrado5 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgGrado0.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        imgGrado0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgGrado0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgGrado0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgGrado0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgGrado0MouseClicked(evt);
            }
        });
        add(imgGrado0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 450, 350));

        imgGrado1.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        imgGrado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgGrado1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgGrado1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(imgGrado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 450, 350));

        imgGrado2.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        imgGrado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgGrado2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgGrado2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(imgGrado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 40, 450, 350));

        imgGrado3.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        imgGrado3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgGrado3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgGrado3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(imgGrado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 450, 350));

        imgGrado4.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        imgGrado4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgGrado4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgGrado4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(imgGrado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 450, 350));

        imgGrado5.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        imgGrado5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgGrado5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgGrado5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(imgGrado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 430, 450, 350));
    }// </editor-fold>//GEN-END:initComponents

    private JFramePrincipal framePrincipal;

    public JPanelSimuladores(JFramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
        initComponents();
        mostrarGradoButtons();
    }
    
    private void imgGrado0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgGrado0MouseClicked
        JPanelCarrusel panelCarrusel = new JPanelCarrusel();
        framePrincipal.showCarrusel(panelCarrusel);
    }//GEN-LAST:event_imgGrado0MouseClicked
    
    public void mostrarGradoButtons() {
        JLabel[] botonGrados = {
            imgGrado0, imgGrado1, imgGrado2, imgGrado3, imgGrado4, imgGrado5
        };

        for (int i = 0; i < botonGrados.length; i++) {
            Utilidades.SetInfoCarruselCentralWithDelay(botonGrados[i], i, 10);
            final int index = i;

            botonGrados[i].addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    JPanelCarrusel panelCarrusel = new JPanelCarrusel();
                    framePrincipal.showCarrusel(panelCarrusel);
                    Utilidades.traerElementosJSONCarrusel(index);
                }
                @Override
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    Utilidades.SetJLabelGradoImageBig(botonGrados[index], index);
                }
                @Override
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    Utilidades.SetJLabelGradoImageSmall(botonGrados[index], index);
                }
                @Override
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    Utilidades.SetJLabelGradoImageSmall(botonGrados[index], index);
                }
                @Override
                public void mouseReleased(java.awt.event.MouseEvent evt) {
                    Utilidades.SetJLabelGradoImageBig(botonGrados[index], index);
                }
            });
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgGrado0;
    private javax.swing.JLabel imgGrado1;
    private javax.swing.JLabel imgGrado2;
    private javax.swing.JLabel imgGrado3;
    private javax.swing.JLabel imgGrado4;
    private javax.swing.JLabel imgGrado5;
    // End of variables declaration//GEN-END:variables
}
