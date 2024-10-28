
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
        jPanel1 = new javax.swing.JPanel();
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

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 14));

        botonLauncher0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLauncher0.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(botonLauncher0);

        botonLauncher1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLauncher1.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(botonLauncher1);

        botonLauncher2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLauncher2.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(botonLauncher2);

        botonLauncher3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLauncher3.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(botonLauncher3);

        botonLauncher4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLauncher4.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(botonLauncher4);

        botonLauncher5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLauncher5.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(botonLauncher5);

        botonLauncher6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLauncher6.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(botonLauncher6);

        botonLauncher7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLauncher7.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(botonLauncher7);

        botonLauncher8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLauncher8.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(botonLauncher8);

        botonLauncher9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLauncher9.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(botonLauncher9);

        botonLauncher10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLauncher10.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(botonLauncher10);

        botonLauncher11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLauncher11.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(botonLauncher11);

        botonLauncher12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLauncher12.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(botonLauncher12);

        botonLauncher13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLauncher13.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(botonLauncher13);

        fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 1550, 130));

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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new JFramePrincipal().setVisible(true);
        });
    }
                
    public void mostrarLauncherButtons() {
        JFramePrincipal frame = this;

        JLabel[] botonLaunchers = {
            botonLauncher0, botonLauncher1, botonLauncher2, botonLauncher3, botonLauncher4,
            botonLauncher5, botonLauncher6, botonLauncher7, botonLauncher8, botonLauncher9,
            botonLauncher10, botonLauncher11, botonLauncher12, botonLauncher13
        };

        for (int i = 0; i < botonLaunchers.length; i++) {
            Utilidades.SetButtonLauncherImageSmall(botonLaunchers[i], i % 14);
            final int index = i;

            botonLaunchers[i].addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    JPanelSimuladores panelSimuladores = new JPanelSimuladores(frame);
                    showPanel(panelSimuladores);
                }
                @Override
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    Utilidades.SetButtonLauncherImageBig(botonLaunchers[index], index % 14);
                }
                @Override
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    Utilidades.SetButtonLauncherImageSmall(botonLaunchers[index], index % 14);
                }
                @Override
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    Utilidades.SetButtonLauncherImageSmall(botonLaunchers[index], index % 14);
                }
                @Override
                public void mouseReleased(java.awt.event.MouseEvent evt) {
                    Utilidades.SetButtonLauncherImageBig(botonLaunchers[index], index % 14);
                }
            });
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
