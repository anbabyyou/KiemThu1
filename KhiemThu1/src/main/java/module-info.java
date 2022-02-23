module com.mycompany.khiemthu1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.khiemthu1 to javafx.fxml;
    exports com.mycompany.khiemthu1;
}
