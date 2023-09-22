package edu.cnm.deepdive.javafxhelloworld;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

  @FXML
  private Label clickCount;
  @FXML
  private Label welcomeText;
  private int count;

  @FXML
  protected void onHelloButtonClick() {
    welcomeText.setText("i want food!");
    count++;
    clickCount.setText(String.valueOf(count));
  }
}