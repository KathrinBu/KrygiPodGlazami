module com.example.krygipodglazami {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.krygipodglazami to javafx.fxml;
    exports com.example.krygipodglazami;
}