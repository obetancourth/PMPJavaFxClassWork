/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicahiccpmp.alumnos;

import javafx.fxml.FXML;
import java.io.IOException;
import javafx.scene.control.*;

/**
 * FXML Controller class
 *
 * @author obetancourth
 */
public class CalculadoraController  {

  @FXML private TextField txtOperador1;
  @FXML private TextField txtOperador2;
  @FXML private Button    btnAdd;
  @FXML private Button    btnSub;
  @FXML private Button    btnMul;
  @FXML private Button    btnDiv;
  @FXML private Label     lblResult;
  
  @FXML
  private void sumas() throws IOException {
      float operador1 = Float.parseFloat(txtOperador1.getText());
      float operador2 = Float.parseFloat(txtOperador2.getText());
      float resultado = operador1 + operador2;
      lblResult.setText(String.valueOf(resultado));
  }
  
  @FXML
  private void restas() throws IOException {
      float operador1 = Float.parseFloat(txtOperador1.getText());
      float operador2 = Float.parseFloat(txtOperador2.getText());
      float resultado = operador1 - operador2;
      lblResult.setText(String.valueOf(resultado));
  }
    
}
