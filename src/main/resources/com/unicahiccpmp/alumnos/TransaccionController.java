/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicahiccpmp.alumnos;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
/**
 * FXML Controller class
 *
 * @author obetancourth
 */
public class TransaccionController implements Initializable {


    @FXML
    private TextField mntoOrigen;
    @FXML
    private ComboBox<String> cbOrigen;
    @FXML
    private TextField mntoResultado;
    @FXML
    private ComboBox<String> cmbResultado;
    
    private float fOrigen  = 1f;
    private float fResultado = 1.2f;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cbOrigen.getItems().add("Dolar");
        cbOrigen.getItems().add("Euro");
        cbOrigen.getItems().add("Yen");
        cbOrigen.getItems().add("BitCoin");
        cbOrigen.setValue("Dolar");
        
        cmbResultado.getItems().add("Dolar");
        cmbResultado.getItems().add("Euro");
        cmbResultado.getItems().add("Yen");
        cmbResultado.getItems().add("BitCoin");
        cmbResultado.setValue("Euro");
        
        mntoOrigen.setText(String.valueOf(fOrigen));
        mntoResultado.setText(String.valueOf(fResultado));
    }    
    

    @FXML
    private void mntoOrigen_change(InputMethodEvent event) {
        
    }
    
}
