
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONArray;
import org.json.JSONObject;


public class Utilidades {
    
// Desde aquí código del JFramePrincipal 
    
    // Método para establecer la imagen pequeña en el ButtonLauncher
    public static void SetButtonLauncherImageSmall (JLabel botonLaunchers, int contador){
        
        // Carga la imagen desde el directorio especificado y la escala a 85x85 píxeles
        ImageIcon image = new ImageIcon("src/images/LauncherButton" + contador + ".png");
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(85, 85, Image.SCALE_SMOOTH));
        
        // Establece el ícono del botón
        botonLaunchers.setIcon(icon);
    }
    
    // Método para establecer la imagen grande en el ButtonLauncher
    public static void SetButtonLauncherImageBig (JLabel botonLaunchers, int contador){
        
        // Carga la imagen desde el directorio especificado
        ImageIcon image = new ImageIcon("src/images/LauncherButton" + contador + ".png");
        
        // Obtiene las dimensiones de la imagen
        int imgWidth = image.getIconWidth();
        int imgHeight = image.getIconHeight();

        // Obtiene las dimensiones del JLabel
        int labelWidth = botonLaunchers.getWidth();
        int labelHeight = botonLaunchers.getHeight();

        // Compara el ancho y alto de la imagen para determinar la proporción adecuada
        if (imgWidth < imgHeight) {
            float proporcionWidth = (float) labelWidth / imgWidth;
            int width = Math.round(proporcionWidth * imgWidth);
            int height = Math.round(proporcionWidth * imgHeight);   

            Icon icon = new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
            botonLaunchers.setIcon(icon);
        } else {
            float proporcionHeight = (float) labelHeight / imgHeight;
            int width = Math.round(proporcionHeight * imgWidth);
            int height = Math.round(proporcionHeight * imgHeight);
            
            Icon icon = new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
            botonLaunchers.setIcon(icon);
        }
        
        // Redibuja el botón
        botonLaunchers.repaint();
    }

// Desde aquí código del JPanelSimuladores
    
    // Método para establecer una imagen pequeña en un JLabel de fondo
    public static void SetInfoCarruselCentralWithDelay(JLabel jLabelFondo, int contador, int delay) {
        // Crea un Timer para ejecutar la acción después de un retardo
        Timer timer = new Timer(delay, (ActionEvent e) -> {
            SetJLabelGradoImageSmall(jLabelFondo, contador);
        });
        timer.setRepeats(false); // Evita que el Timer se repita
        timer.start(); // Inicia el Timer
    }
    
    public static void SetJLabelGradoImageSmall (JLabel jLabelFondo, int contador) {
        
        // Carga la imagen y ajusta su tamaño al de la imagen original
        ImageIcon image = new ImageIcon("src/images/" + grados[contador] + ".png");
        int width = image.getIconWidth();
        int height = image.getIconHeight();
        
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        jLabelFondo.setIcon(icon);
        
        // Redibuja el JLabel
        jLabelFondo.repaint();
    }
    
    // Método para establecer una imagen grande en un JLabel de fondo
    public static void SetJLabelGradoImageBig (JLabel jLabelFondo, int contador) {
                
        // Carga la imagen desde el directorio especificado
        ImageIcon image = new ImageIcon("src/images/" + grados[contador] + ".png");
        int labelWidth = jLabelFondo.getWidth();
        int labelHeight = jLabelFondo.getHeight();

        // Ajusta la imagen al tamaño del JLabel
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH));
        jLabelFondo.setIcon(icon);
        
        // Redibuja el JLabel
        jLabelFondo.repaint();
    }
    
    private static final String[] grados = new String[6];
    
    // Método para leer elementos de un archivo JSON
    public static String[] traerElementosJSONSimuladores(int index) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("src/grados.json")));
            
            JSONObject jsonObject = new JSONObject(content);
            
            // Obtiene los elementos del JSON
            JSONArray escudoArray = jsonObject.getJSONArray("Escudos").getJSONObject(index).getJSONArray("Simuladores");
                    
            for (int i = 0; i < grados.length; i++) {
                JSONObject item = escudoArray.getJSONObject(i);
                grados[i] = item.getString("grado");
            }
                                     
        } catch (IOException e) {
            System.out.println("Error al leer el archivo JSON."); // Maneja errores al leer el archivo
        } catch (org.json.JSONException e) {
            System.out.println("Error al analizar el archivo JSON."); // Maneja errores internos del archivo
        }
        
        // Devuelve el array de grados
        return grados;
    }
    
    
// Desde aquí código del JPanelCarrusel
    
    // Array para almacenar elementos de un JSON
    private static final String[] elementos = new String[3];
    public static int indexEscudo;
    
    // Método para leer elementos de un archivo JSON
    public static String[] traerElementosJSONCarrusel(int index) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("src/grados.json")));
            
            JSONObject jsonObject = new JSONObject(content);
            
            // Obtiene los elementos del JSON
            JSONObject escudoArray = jsonObject.getJSONArray("Escudos").getJSONObject(indexEscudo).getJSONArray("Simuladores").getJSONObject(index);
            
                    // Almacena los valores en el array `elementos`
                    elementos[0] = escudoArray.getString("img");
                    elementos[1] = escudoArray.getString("titulo");
                    elementos[2] = escudoArray.getString("texto");
                    return elementos; // Devuelve inmediatamente al encontrar el grado
                                                                    
        } catch (IOException e) {
            System.out.println("Error al leer el archivo JSON."); // Maneja errores al leer el archivo
        } catch (org.json.JSONException e) {
            System.out.println("Error al analizar el archivo JSON."); // Maneja errores internos del archivo
        }
        
        // Devuelve el array de elementos
        return elementos;
    }
    
    // Método para establecer información en un carrusel con retraso
    public static void SetInfoCarruselCentralWithDelay(JLabel jLabelFondo, JLabel titulo, JTextArea texto, int contador, int delay) {
        // Crea un Timer para ejecutar la acción después de un retardo
        Timer timer = new Timer(delay, (ActionEvent e) -> {
            SetJInfoCarruselCentral(jLabelFondo, titulo, texto, contador);
        });
        timer.setRepeats(false); // Evita que el Timer se repita
        timer.start(); // Inicia el Timer
    }
        
    // Método para establecer información en el carrusel central
    public static void SetJInfoCarruselCentral (JLabel jLabelFondo, JLabel titulo, JTextArea texto, int contador) {
        // Carga la imagen correspondiente al contador y la establece en el JLabel de fondo
        ImageIcon image = new ImageIcon("src/images/" + elementos[0] + contador + ".png");
                
        int width = image.getIconWidth();
        int height = image.getIconHeight();

        Icon icon = new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        jLabelFondo.setIcon(icon);

        // Redibuja el JLabel de fondo
        jLabelFondo.repaint();

        // Establece el texto del título y del área de texto
        titulo.setText(elementos[1]);
        texto.setText(elementos[2]);
    }
    
    // Método para cambiar la imagen de los puntos en un carrusel
    public static void CambiarImgPuntos(JLabel[] botonPunto, int contador) {
        // Cambia todos los botones a la imagen de "vacío"
        for (JLabel botonPunto1 : botonPunto) {
            ImageIcon botonVacio = new ImageIcon("src/images/PuntoCarruselEmpty.png");
            int widthVacio = botonVacio.getIconWidth();
            int heightVacio = botonVacio.getIconHeight();
            Icon iconVacio = new ImageIcon(botonVacio.getImage().getScaledInstance(widthVacio, heightVacio, Image.SCALE_SMOOTH));
            botonPunto1.setIcon(iconVacio);
        }

        // Cambia el botón del contador a la imagen de "llenado"
        ImageIcon botonLleno = new ImageIcon("src/images/PuntoCarruselFilled.png");
        int widthRelleno = botonLleno.getIconWidth();
        int heightRelleno = botonLleno.getIconHeight();
        Icon iconRelleno = new ImageIcon(botonLleno.getImage().getScaledInstance(widthRelleno, heightRelleno, Image.SCALE_SMOOTH));
        botonPunto[contador].setIcon(iconRelleno);
    }
    
    // Método para establecer una imagen lateral en un JLabel
    public static void SetJLabelCarruselLateralImg (JLabel jLabelFondo) {
        
        // Carga y establece una imagen en el JLabel de fondo
        ImageIcon image = new ImageIcon("src/images/Cuadrado fondo enfocado.png");
        int width = image.getIconWidth();
        int height = image.getIconHeight();

        Icon icon = new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        jLabelFondo.setIcon(icon);

        // Redibuja el JLabel de fondo
        jLabelFondo.repaint();
    }
    
    // Método para establecer una imagen pequeña en un botón
    public static void SetButtonsCarruselSmall (JLabel jLabelComenzar, String name) {
        
        // Carga y establece una imagen pequeña en el botón
        ImageIcon image = new ImageIcon("src/images/" + name + ".png");
        int width = image.getIconWidth();
        int height = image.getIconHeight();

        Icon icon = new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        jLabelComenzar.setIcon(icon);

        // Redibuja el botón
        jLabelComenzar.repaint();
    }
    
    // Método para establecer una imagen grande en un botón
    public static void SetButtonsCarruselBig (JLabel jLabelButtons, String name) {
        
        // Carga la imagen y ajusta su tamaño al de las dimensiones del botón
        ImageIcon image = new ImageIcon("src/images/" + name + ".png");
        
        int imgWidth = image.getIconWidth();
        int imgHeight = image.getIconHeight();

        int labelWidth = jLabelButtons.getWidth();
        int labelHeight = jLabelButtons.getHeight();
        
        // Ajusta el tamaño basado en las proporciones
        if (imgWidth < imgHeight) {
            float proporcionWidth = (float) labelWidth / imgWidth;
            int width = Math.round(proporcionWidth * imgWidth);
            int height = Math.round(proporcionWidth * imgHeight);   
            
            Icon icon = new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
            jLabelButtons.setIcon(icon);
        } else {
            float proporcionHeight = (float) labelHeight / imgHeight;
            int width = Math.round(proporcionHeight * imgWidth);
            int height = Math.round(proporcionHeight * imgHeight);
            
            Icon icon = new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
            jLabelButtons.setIcon(icon);
        }
        
        // Redibuja el botón
        jLabelButtons.repaint();
    }
    
}