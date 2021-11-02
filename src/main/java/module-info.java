module com.unicahiccpmp.alumnos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    
    opens com.unicahiccpmp.alumnos to javafx.fxml;
    exports com.unicahiccpmp.alumnos;
}
