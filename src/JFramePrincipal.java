
import java.awt.*;
import javax.swing.*;


public final class JFramePrincipal extends javax.swing.JFrame {

    public JFramePrincipal() {
        initComponents();
        mostrarLauncherButtons();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        botonLauncher0 = new javax.swing.JLabel();
        botonLauncher1 = new javax.swing.JLabel();
        botonLauncher2 = new javax.swing.JLabel();
        botonLauncher3 = new javax.swing.JLabel();
        botonLauncher4 = new javax.swing.JLabel();
        botonLauncher5 = new javax.swing.JLabel();
        botonLauncher6 = new javax.swing.JLabel();
        botonLauncher7 = new javax.swing.JLabel();
        botonLauncher8 = new javax.swing.JLabel();
        botonLauncher9 = new javax.swing.JLabel();
        botonLauncher10 = new javax.swing.JLabel();
        botonLauncher11 = new javax.swing.JLabel();
        botonLauncher12 = new javax.swing.JLabel();
        botonLauncher13 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonLauncher0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLauncher0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonLauncherMouseClicked(evt);
            }
        });
        fondo.add(botonLauncher0, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 83, 90));

        botonLauncher1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(botonLauncher1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 83, 90));

        botonLauncher2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(botonLauncher2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 83, 90));

        botonLauncher3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(botonLauncher3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 83, 90));

        botonLauncher4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(botonLauncher4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 90, 83, 90));

        botonLauncher5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(botonLauncher5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 90, 83, 90));

        botonLauncher6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(botonLauncher6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 90, 83, 90));

        botonLauncher7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(botonLauncher7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 90, 83, 90));

        botonLauncher8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(botonLauncher8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 90, 83, 90));

        botonLauncher9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(botonLauncher9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 90, 83, 90));

        botonLauncher10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(botonLauncher10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 90, 83, 90));

        botonLauncher11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(botonLauncher11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 90, 83, 90));

        botonLauncher12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(botonLauncher12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 90, 83, 90));

        botonLauncher13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(botonLauncher13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1760, 90, 83, 90));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setOpaque(false);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1510, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );

        fondo.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 1510, 830));

        jLabelFondo.setBackground(new java.awt.Color(255, 4, 4));
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo base.png"))); // NOI18N
        jLabelFondo.setDisabledIcon(null);
        jLabelFondo.setOpaque(true);
        fondo.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonLauncherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLauncherMouseClicked
        JPanelSimuladores panelSimuladores = new JPanelSimuladores(this);
        showPanel(panelSimuladores);
    }//GEN-LAST:event_botonLauncherMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }
    
    public void mostrarLauncherButtons() {
        JLabel[] botonLaunchers = {
            botonLauncher0, botonLauncher1, botonLauncher2, botonLauncher3, botonLauncher4, botonLauncher5,
            botonLauncher6, botonLauncher7, botonLauncher8, botonLauncher9, botonLauncher10, botonLauncher11,
            botonLauncher12, botonLauncher13
        };

        for (int i = 0; i < botonLaunchers.length; i++) {
            Utilidades.SetButtonLauncherImage(botonLaunchers[i], i);
        }
    }
        
    public void showPanel(JPanel p) {
        p.setSize(1510, 830);
        p.setLocation(0, 0);
        
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    public void showCarrusel(JPanelCarrusel panelCarrusel) {
        showPanel(panelCarrusel);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonLauncher0;
    private javax.swing.JLabel botonLauncher1;
    private javax.swing.JLabel botonLauncher10;
    private javax.swing.JLabel botonLauncher11;
    private javax.swing.JLabel botonLauncher12;
    private javax.swing.JLabel botonLauncher13;
    private javax.swing.JLabel botonLauncher2;
    private javax.swing.JLabel botonLauncher3;
    private javax.swing.JLabel botonLauncher4;
    private javax.swing.JLabel botonLauncher5;
    private javax.swing.JLabel botonLauncher6;
    private javax.swing.JLabel botonLauncher7;
    private javax.swing.JLabel botonLauncher8;
    private javax.swing.JLabel botonLauncher9;
    private javax.swing.JPanel content;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabelFondo;
    // End of variables declaration//GEN-END:variables
}
