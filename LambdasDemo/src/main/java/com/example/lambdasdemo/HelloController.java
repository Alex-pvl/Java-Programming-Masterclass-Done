package com.example.lambdasdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloController {
    @FXML
    private Button clickMeButton;

    public void initialize() {
        clickMeButton.setOnAction(event -> System.out.println("Hello from Acer!"));
    }
}