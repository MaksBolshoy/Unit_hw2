module com.example.unit_hw2 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.unit_hw2 to javafx.fxml;
    exports com.example.unit_hw2;
}