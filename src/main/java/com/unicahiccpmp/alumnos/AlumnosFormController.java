/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicahiccpmp.alumnos;

import com.unicahiccpmp.dao.AlumnosDao;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;



/**
 * FXML Controller class
 *
 * @author obetancourth
 */
public class AlumnosFormController implements Initializable {

    private String _mode;
    private Alumnos alumno;
    private AlumnosDao almDao;
    
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
    
    
    public AlumnosFormController(){
        this.almDao = new AlumnosDao();
    }
    
    @FXML
    private void btnGuardar_onclick(ActionEvent event) {
        if (this._mode == "new") {
            Alumnos newAlumno = new Alumnos();
            newAlumno.setCuenta(txtCuenta.getText());
            newAlumno.setNombre(txtNombre.getText());
            newAlumno.setGenero(txtGenero.getText());
            newAlumno.setCorreo(txtCorreo.getText());
            newAlumno.setTelefono(txtTelefono.getText());
            
            almDao.insertAlumnoItem(newAlumno);
            App.closeForm(event);
        }
        
        if (this._mode == "upd") {
            Alumnos newAlumno = new Alumnos();
            newAlumno.setCuenta(this.alumno.getCuenta());
            newAlumno.setNombre(txtNombre.getText());
            newAlumno.setGenero(txtGenero.getText());
            newAlumno.setCorreo(txtCorreo.getText());
            newAlumno.setTelefono(txtTelefono.getText());
            
            almDao.updateAlumnoItem(newAlumno);
            App.closeForm(event);
        }
        if (this._mode == "del") {
            almDao.deleteAlumnoItem(this.alumno);
            App.closeForm(event);
        }
    }

    @FXML
    private void btnCancelar_onclick(ActionEvent event) {
        App.closeForm(event) ;  
    }
    
    public void setMode(String mode) {
        this._mode = mode;
    }
    
    public void setAlumno(String cuenta){
        this.alumno = this.almDao.getAlumnoItemByCuenta(cuenta);
    }
    
    private void setDataToFxml(){
        txtCuenta.setText(this.alumno.getCuenta());
        txtNombre.setText(this.alumno.getNombre());
        txtGenero.setText(this.alumno.getGenero());
        txtCorreo.setText(this.alumno.getCorreo());
        txtTelefono.setText(this.alumno.getTelefono());
    }
    
    private void readOnlyFxml(){
        txtCuenta.setEditable(false);
        txtNombre.setEditable(false);
        txtGenero.setEditable(false);
        txtCorreo.setEditable(false);
        txtTelefono.setEditable(false);
    }
    public void setVIEW(){
        switch(this._mode){
            case "new":
                btnGuardar.setText("Crear");
                break;
            case "upd":
                btnGuardar.setText("Actualizar");
                this.setDataToFxml();
                break;
            case "dsp":
                btnGuardar.setVisible(false);
                this.setDataToFxml();
                this.readOnlyFxml();
                break;
            case "del":
                btnGuardar.setText("Eliminar");
                this.setDataToFxml();
                this.readOnlyFxml();
                break;
        }
    }
    

}
