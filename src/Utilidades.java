
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Utilidades {
    public static void SetButtonLauncherImage (JLabel jLabelFondo){
            ImageIcon image = new ImageIcon("src/images/LauncherButton0.png");
            
            int imgWidth = image.getIconWidth();
            int imgHeight = image.getIconHeight();

            int labelWidth = jLabelFondo.getWidth();
            int labelHeight = jLabelFondo.getHeight();
            
            if (imgWidth < imgHeight){
                float proporcionWidth = (float) labelWidth / imgWidth;
                int width = Math.round(proporcionWidth * imgWidth);
                int height = Math.round(proporcionWidth * imgHeight);   
                
                Icon icon = new ImageIcon (image.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
                jLabelFondo.setIcon(icon);
            } else {
                float proporcionHeight = (float) labelHeight / imgHeight;
                int width = Math.round(proporcionHeight * imgWidth);
                int height = Math.round(proporcionHeight * imgHeight);
                
                Icon icon = new ImageIcon (image.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
                jLabelFondo.setIcon(icon);
            }
            
            jLabelFondo.repaint();
        }    
}
