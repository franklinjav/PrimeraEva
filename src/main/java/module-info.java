module com.example.primeraeva {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.primeraeva to javafx.fxml;
    exports com.example.primeraeva;
}