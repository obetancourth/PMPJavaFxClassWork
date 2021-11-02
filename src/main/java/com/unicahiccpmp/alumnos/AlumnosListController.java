/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicahiccpmp.alumnos;

import com.unicahiccpmp.dao.AlumnosDao;

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
    
    private AlumnosDao AlumnosModel;
    /**
     * Initializes the controller class.
     */
    private ObservableList<Alumnos> dataset;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        clmCuenta.setCellValueFactory(
                new PropertyValueFactory<>("cuenta")
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
       this.AlumnosModel = new AlumnosDao();
       this.AlumnosModel.tableInitialize();
       
       dataset = FXCollections.observableArrayList(AlumnosModel.getAlumnoItems(true));
       tblAlumnos.getItems().addAll(dataset);
    }    
    
}
