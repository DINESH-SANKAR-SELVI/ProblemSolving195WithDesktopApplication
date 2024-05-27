module com.dinesh.problemsolving195withdesktopapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dinesh.problemsolving195withdesktopapplication to javafx.fxml;
    exports com.dinesh.problemsolving195withdesktopapplication;
}