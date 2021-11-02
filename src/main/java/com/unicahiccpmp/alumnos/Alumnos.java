/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicahiccpmp.alumnos;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author obetancourth
 */
public class Alumnos {

    /**
     * @return the _cuenta
     */
    public String getCuenta() {
        return cuenta.get();
    }

    /**
     * @param _cuenta the _cuenta to set
     */
    public void setCuenta(String _cuenta) {
        this.cuenta.set(_cuenta);
    }

    /**
     * @return the _nombre
     */
    public String getNombre() {
        return nombre.get();
    }

    /**
     * @param _nombre the _nombre to set
     */
    public void setNombre(String _nombre) {
        this.nombre.set(_nombre);
    }

    /**
     * @return the _genero
     */
    public String getGenero() {
        return genero.get();
    }

    /**
     * @param _genero the _genero to set
     */
    public void setGenero(String _genero) {
        this.genero.set(_genero);
    }

    /**
     * @return the _correo
     */
    public String getCorreo() {
        return correo.get();
    }

    /**
     * @param _correo the _correo to set
     */
    public void setCorreo(String _correo) {
        this.correo.set(_correo);
    }

    /**
     * @return the _telefono
     */
    public String getTelefono() {
        return telefono.get();
    }

    /**
     * @param _telefono the _telefono to set
     */
    public void setTelefono(String _telefono) {
        this.telefono.set(_telefono);
    }
    
    public Alumnos(){
        this.cuenta = new SimpleStringProperty("");
        this.nombre = new SimpleStringProperty("");
        this.genero = new SimpleStringProperty("");
        this.correo = new SimpleStringProperty("");
        this.telefono = new SimpleStringProperty("");
    }
    
    public Alumnos(String cuenta, String nombre, String genero, String correo, String telefono) {
        this.cuenta = new SimpleStringProperty(cuenta);
        this.nombre = new SimpleStringProperty(nombre);
        this.genero = new SimpleStringProperty(genero);
        this.correo = new SimpleStringProperty(correo);
        this.telefono = new SimpleStringProperty(telefono);
    }
   
    
    private SimpleStringProperty cuenta;
    private SimpleStringProperty nombre;
    private SimpleStringProperty genero;
    private SimpleStringProperty correo;
    private SimpleStringProperty telefono;
    
}
