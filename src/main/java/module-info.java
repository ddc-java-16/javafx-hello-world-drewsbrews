module edu.cnm.deepdive.javafxhelloworld {
  requires javafx.controls;
  requires javafx.fxml;

  opens edu.cnm.deepdive.javafxhelloworld to javafx.fxml;
  exports edu.cnm.deepdive.javafxhelloworld;
}