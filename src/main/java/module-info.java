module com.rafael.imgdownloader {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.rafael.imgdownloader to javafx.fxml;
    exports com.rafael.imgdownloader;
}