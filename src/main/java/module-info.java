module lk.ijse.exam.git_exam {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires javafx.graphics;
    requires mysql.connector.java;
    requires java.sql;

    opens lk.ijse.exam.git_exam to javafx.fxml;
    exports lk.ijse.exam.git_exam;
    exports lk.ijse.exam.git_exam.controller;
    opens lk.ijse.exam.git_exam.controller to javafx.fxml;
}