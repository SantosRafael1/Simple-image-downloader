package com.rafael.imgdownloader;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class Controller {
    public javafx.scene.control.Button button_download_img;
    @FXML
    private TextField link_field;

    @FXML
    public void handleButtonClick(javafx.event.ActionEvent actionEvent) {
        String linkStr = link_field.getText();

        try {
            URL url = new URL(linkStr);
            BufferedImage img = ImageIO.read(url);
            File file = new File("/home/rafa/Downloads/image.jpg"); //linux directory
            ImageIO.write(img, "jpg", file);
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
}