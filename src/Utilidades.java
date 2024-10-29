
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONArray;
import org.json.JSONObject;


public class Utilidades {
    
// Desde aquí código del JFramePrincipal 
    
    public static void SetButtonLauncherImageSmall (JLabel botonLaunchers, int contador){
        
        ImageIcon image = new ImageIcon("src/images/LauncherButton" + contador + ".png");
                        
        Icon icon = new ImageIcon (image.getImage().getScaledInstance(85, 85, Image.SCALE_SMOOTH));
        botonLaunchers.setIcon(icon);
    }
    
    public static void SetButtonLauncherImageBig (JLabel botonLaunchers, int contador){
        
        ImageIcon image = new ImageIcon("src/images/LauncherButton" + contador + ".png");
        
            int imgWidth = image.getIconWidth();
            int imgHeight = image.getIconHeight();

            int labelWidth = botonLaunchers.getWidth();
            int labelHeight = botonLaunchers.getHeight();
            
            if (imgWidth < imgHeight){
                float proporcionWidth = (float) labelWidth / imgWidth;
                int width = Math.round(proporcionWidth * imgWidth);
                int height = Math.round(proporcionWidth * imgHeight);   
                
                Icon icon = new ImageIcon (image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
                botonLaunchers.setIcon(icon);
            } else {
                float proporcionHeight = (float) labelHeight / imgHeight;
                int width = Math.round(proporcionHeight * imgWidth);
                int height = Math.round(proporcionHeight * imgHeight);
                
                Icon icon = new ImageIcon (image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
                botonLaunchers.setIcon(icon);
            }
            
            botonLaunchers.repaint();
        }

// Desde aquí código del JPanelSimuladores
    
    public static void SetJLabelGradoImageSmall (JLabel jLabelFondo, int contador){
        
        ImageIcon image = new ImageIcon("src/images/Grado" + contador + ".png");
                
            int width = image.getIconWidth();
            int height = image.getIconHeight();

            Icon icon = new ImageIcon (image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
            jLabelFondo.setIcon(icon);
                
            jLabelFondo.repaint();
        }
    
    public static void SetJLabelGradoImageBig (JLabel jLabelFondo, int contador){
        
        ImageIcon image = new ImageIcon("src/images/Grado" + contador + ".png");

            int labelWidth = jLabelFondo.getWidth();
            int labelHeight = jLabelFondo.getHeight();

            Icon icon = new ImageIcon (image.getImage().getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH));
            jLabelFondo.setIcon(icon);
            
            jLabelFondo.repaint();
    }
    
    
// Desde aquí código del JPanelCarrusel
    private static String elementoSinNum = "";
    
    public static String mostrarMensajeConsola(int index) {
                
        try {
            String content = new String(Files.readAllBytes(Paths.get("src/images/grados.json")));
            
            JSONObject jsonObject = new JSONObject(content);

                JSONArray items = jsonObject.getJSONArray("Grado" + index);
                String elemento = items.getString(0);
                elementoSinNum = elemento.substring(0, elemento.length() - 1);
                
        } catch (IOException e) {
            System.out.println("Error al leer el archivo JSON.");
        } catch (org.json.JSONException e) {
            System.out.println("Error al analizar el archivo JSON.");
        }
        
        return elementoSinNum;
    }
    
    public static void SetJLabelCarruselCentralImgWithDelay(JLabel jLabelFondo, int contador, int delay) {
        Timer timer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetJLabelCarruselCentralImg(jLabelFondo, contador);
            }
        });
        timer.setRepeats(false);
        timer.start();
    }
        
    public static void SetJLabelCarruselCentralImg (JLabel jLabelFondo, int contador){
        ImageIcon image = new ImageIcon("src/images/" + elementoSinNum + contador + ".png");
                
        int width = image.getIconWidth();
        int height = image.getIconHeight();

        Icon icon = new ImageIcon (image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        jLabelFondo.setIcon(icon);

        jLabelFondo.repaint();
    }
    
    public static void CambiarImgPuntos(JLabel[] botonPunto, int contador) {
        for (JLabel botonPunto1 : botonPunto) {
            ImageIcon botonVacio = new ImageIcon("src/images/PuntoCarruselEmpty.png");
            int widthVacio = botonVacio.getIconWidth();
            int heightVacio = botonVacio.getIconHeight();
            Icon iconVacio = new ImageIcon(botonVacio.getImage().getScaledInstance(widthVacio, heightVacio, Image.SCALE_SMOOTH));
            botonPunto1.setIcon(iconVacio);
        }

        ImageIcon botonLleno = new ImageIcon("src/images/PuntoCarruselFilled.png");
        int widthRelleno = botonLleno.getIconWidth();
        int heightRelleno = botonLleno.getIconHeight();
        Icon iconRelleno = new ImageIcon(botonLleno.getImage().getScaledInstance(widthRelleno, heightRelleno, Image.SCALE_SMOOTH));
        botonPunto[contador].setIcon(iconRelleno);
    }
    
    public static void SetJLabelCarruselLateralImg (JLabel jLabelFondo){
        
        ImageIcon image = new ImageIcon("src/images/Cuadrado fondo enfocado.png");
                
        int width = image.getIconWidth();
        int height = image.getIconHeight();

        Icon icon = new ImageIcon (image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        jLabelFondo.setIcon(icon);

        jLabelFondo.repaint();
    }
    
    public static void SetButtonsCarruselSmall (JLabel jLabelComenzar, String name){
        
        ImageIcon image = new ImageIcon("src/images/" + name + ".png");
                
        int width = image.getIconWidth();
        int height = image.getIconHeight();

        Icon icon = new ImageIcon (image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        jLabelComenzar.setIcon(icon);

        jLabelComenzar.repaint();
    }
    
    public static void SetButtonsCarruselBig (JLabel jLabelButtons, String name){
        
        ImageIcon image = new ImageIcon("src/images/" + name + ".png");
        
            int imgWidth = image.getIconWidth();
            int imgHeight = image.getIconHeight();

            int labelWidth = jLabelButtons.getWidth();
            int labelHeight = jLabelButtons.getHeight();
            
            if (imgWidth < imgHeight){
                float proporcionWidth = (float) labelWidth / imgWidth;
                int width = Math.round(proporcionWidth * imgWidth);
                int height = Math.round(proporcionWidth * imgHeight);   
                
                Icon icon = new ImageIcon (image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
                jLabelButtons.setIcon(icon);
            } else {
                float proporcionHeight = (float) labelHeight / imgHeight;
                int width = Math.round(proporcionHeight * imgWidth);
                int height = Math.round(proporcionHeight * imgHeight);
                
                Icon icon = new ImageIcon (image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
                jLabelButtons.setIcon(icon);
            }
            
            jLabelButtons.repaint();
    }
    
}