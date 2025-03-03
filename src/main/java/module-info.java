module com.example.stockmarketapp1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.stockmarketapp1 to javafx.fxml;
    exports com.example.stockmarketapp1;
    exports com.example.stockmarketapp1.controller;
    opens com.example.stockmarketapp1.controller to javafx.fxml;
}