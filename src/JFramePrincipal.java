
import javax.swing.JLabel;

public class JFramePrincipal extends javax.swing.JFrame {

    public JFramePrincipal() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
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
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(jLabelFondo.getPreferredSize());

        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        content.add(botonLauncher0, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 83, 90));
        content.add(botonLauncher1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 83, 90));
        content.add(botonLauncher2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 83, 90));
        content.add(botonLauncher3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 83, 90));
        content.add(botonLauncher4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 90, 83, 90));
        content.add(botonLauncher5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 90, 83, 90));
        content.add(botonLauncher6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 90, 83, 90));
        content.add(botonLauncher7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 90, 83, 90));
        content.add(botonLauncher8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 90, 83, 90));
        content.add(botonLauncher9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 90, 83, 90));
        content.add(botonLauncher10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 90, 83, 90));
        content.add(botonLauncher11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 90, 83, 90));
        content.add(botonLauncher12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 90, 83, 90));
        content.add(botonLauncher13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1760, 90, 83, 90));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo base.png"))); // NOI18N
        jLabelFondo.setDisabledIcon(null);
        content.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }
    
    public void mostrarLauncherButtons(){
        for(int i = 0; i <= 13; i++){
                                
            Utilidades.SetButtonLauncherImage(botonLauncher[i]);
        }
        
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
    private javax.swing.JLabel jLabelFondo;
    // End of variables declaration//GEN-END:variables
}
