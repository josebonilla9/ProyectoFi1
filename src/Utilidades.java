
import java.awt.*;
import javax.swing.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;


public class Utilidades {
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
        
    public static void AgrandarBotones (JLabel botonLaunchers) {
        Dimension sizeBoton = botonLaunchers.getSize();
                
        int newWidth = (int) (sizeBoton.width * 1.3);
        int newHeight = (int) (sizeBoton.height * 1.3);
        botonLaunchers.setSize(newWidth, newHeight);
    }
    
    public static void ReducirBotones (JLabel botonLaunchers) {
        Dimension sizeBoton = botonLaunchers.getSize();
                
        int newWidth = (int) (sizeBoton.width / 1.3);
        int newHeight = (int) (sizeBoton.height / 1.3);
        botonLaunchers.setSize(newWidth, newHeight);
    }
    
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
    
    
    /*
    
//    Método para insertar JSON doonde se devolverá un array con las imágenes que queremos según el grado que necesitemos abrir
    
    private String[] insertarJSON() {
        
//        Crear swith para los nombres de las imágenes del carrusel según el grado que sean (Grado0, Grado1 ...)
    
        return [];
    }
    
    */
    
    
    public static void insertarJSON() {
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("grados.json")) {
            
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

                for (Map.Entry<String, JSONArray> entry : ((Map<String, JSONArray>) jsonObject).entrySet()) {
                    String claveGrado = entry.getKey();
                    JSONArray items = entry.getValue();

                    System.out.println("Clave: " + claveGrado);
                    for (Object item : items) {
                        System.out.println("  Elemento: " + item);
                }
            }

        } catch (IOException | ParseException e) {
        }
    }
    
    public static void SetJLabelCarruselCentralImg (JLabel jLabelFondo, int contador){
                
        //Crear bucle for para elegir la imagen según el contador
        
        ImageIcon image = new ImageIcon("src/images/Embarque" + contador + ".png");
                
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