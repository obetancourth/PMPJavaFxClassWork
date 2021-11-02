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

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.scene.Node;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author obetancourth
 */
public class AlumnosFormController implements Initializable {


    @FXML
    private TextField txtCuenta;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtGenero;
    @FXML
    private TextField txtCorreo;
    @FXML
    private TextField txtTelefono;
    @FXML
    private Button btnGuardar;
    @FXML
    private Button btnCancelar;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void btnGuardar_onclick(ActionEvent event) {
    }

    @FXML
    private void btnCancelar_onclick(ActionEvent event) {
        App.closeForm(event) ;  
    }
    
    

}
