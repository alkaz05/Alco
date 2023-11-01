module ipap.alco {
    requires javafx.controls;
    requires javafx.fxml;


    opens ipap.alco to javafx.fxml;
    exports ipap.alco;
}