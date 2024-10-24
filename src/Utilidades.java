
import java.awt.*;
import javax.swing.*;

public class Utilidades {
    public static void SetButtonLauncherImage (JLabel botonLaunchers, int contador){
        
        ImageIcon image = new ImageIcon("src/images/LauncherButton" + contador + ".png");
        
            int imgWidth = image.getIconWidth();
            int imgHeight = image.getIconHeight();

            int labelWidth = botonLaunchers.getWidth();
            int labelHeight = botonLaunchers.getHeight();
            
            if (imgWidth < imgHeight){
                float proporcionWidth = (float) labelWidth / imgWidth;
                int width = Math.round(proporcionWidth * imgWidth);
                int height = Math.round(proporcionWidth * imgHeight);   
                
                Icon icon = new ImageIcon (image.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
                botonLaunchers.setIcon(icon);
            } else {
                float proporcionHeight = (float) labelHeight / imgHeight;
                int width = Math.round(proporcionHeight * imgWidth);
                int height = Math.round(proporcionHeight * imgHeight);
                
                Icon icon = new ImageIcon (image.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
                botonLaunchers.setIcon(icon);
            }
            
            botonLaunchers.repaint();
        }
    
    public static void SetJLabelGradoImage (JLabel jLabelFondo, int contador){
        
        ImageIcon image = new ImageIcon("src/images/Grado" + contador + ".png");
                
            int width = image.getIconWidth();
            int height = image.getIconHeight();

            Icon icon = new ImageIcon (image.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
            jLabelFondo.setIcon(icon);
                
            jLabelFondo.repaint();
        }
    
    public static void SetJLabelCarruselCentralImg (JLabel jLabelFondo, int contador){
        
        ImageIcon image = new ImageIcon("src/images/Embarque" + contador + ".png");
                
        int width = image.getIconWidth();
        int height = image.getIconHeight();

        Icon icon = new ImageIcon (image.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
        jLabelFondo.setIcon(icon);

        jLabelFondo.repaint();
    }
    
    public static void CambiarImgPuntos(JLabel[] botonPunto, int contador) {
        for (int i = 0; i < botonPunto.length; i++) {
            ImageIcon imageEmpty = new ImageIcon("src/images/PuntoCarruselEmpty.png");
            int widthEmpty = imageEmpty.getIconWidth();
            int heightEmpty = imageEmpty.getIconHeight();
            Icon iconEmpty = new ImageIcon(imageEmpty.getImage().getScaledInstance(widthEmpty, heightEmpty, Image.SCALE_DEFAULT));
            botonPunto[i].setIcon(iconEmpty);
        }

        ImageIcon imageFilled = new ImageIcon("src/images/PuntoCarruselFilled.png");
        int widthFilled = imageFilled.getIconWidth();
        int heightFilled = imageFilled.getIconHeight();
        Icon iconFilled = new ImageIcon(imageFilled.getImage().getScaledInstance(widthFilled, heightFilled, Image.SCALE_DEFAULT));
        botonPunto[contador].setIcon(iconFilled);
    }
    
    public static void SetJLabelCarruselLateralImg (JLabel jLabelFondo){
        
        ImageIcon image = new ImageIcon("src/images/Cuadrado fondo enfocado.png");
                
        int width = image.getIconWidth();
        int height = image.getIconHeight();

        Icon icon = new ImageIcon (image.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
        jLabelFondo.setIcon(icon);

        jLabelFondo.repaint();
    }
}


