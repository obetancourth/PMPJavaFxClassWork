/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicahiccpmp.alumnos;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
/**
 * FXML Controller class
 *
 * @author obetancourth
 */
public class AlumnosListController implements Initializable {


    @FXML
    private TableView<Alumnos> tblAlumnos;
    @FXML
    private TableColumn clmCuenta;
    @FXML
    private TableColumn clmNombre;
    @FXML
    private TableColumn clmGenero;
    @FXML
    private TableColumn clmCorreo;
    @FXML
    private TableColumn clmTelefono;
    @FXML
    private Button btnNuevo;
    @FXML
    private Button btnEditar;
    @FXML
    private Button btnMostrar;
    @FXML
    private Button btnEliminar;
    /**
     * Initializes the controller class.
     */
        private ObservableList<Alumnos> dataset = FXCollections.emptyObservableList();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        clmCuenta.setCellValueFactory(
                new PropertyValueFactory<Alumnos, String>("cuenta")
        );
        clmNombre.setCellValueFactory(
                 new PropertyValueFactory<>("nombre")
        );
        clmGenero.setCellValueFactory(
                 new PropertyValueFactory<>("genero")
        );
        clmCorreo.setCellValueFactory(
                 new PropertyValueFactory<>("correo")
        );
        clmTelefono.setCellValueFactory(
                new PropertyValueFactory<>("telefono")
        );
        
        Alumnos a1 = new Alumnos();
        a1.setCuenta("1");
        a1.setNombre("Nombre");
        a1.setTelefono("22222222");
        a1.setGenero("Masculino");
        a1.setCorreo("unCorreo@unicah.edu");
        //tblAlumnos.
        tblAlumnos.getItems().add(a1);
        
        Alumnos a2 = new Alumnos();
        a2.setCuenta("2");
        a2.setNombre("Nombre 2");
        a2.setTelefono("22222222");
        a2.setGenero("Femenino");
        a2.setCorreo("unCorreo@unicah.edu");
        //tblAlumnos.
        tblAlumnos.getItems().add(a2);
    }    
    
}
