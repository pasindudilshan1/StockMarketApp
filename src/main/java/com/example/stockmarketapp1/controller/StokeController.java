package com.example.stockmarketapp1.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class StokeController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}