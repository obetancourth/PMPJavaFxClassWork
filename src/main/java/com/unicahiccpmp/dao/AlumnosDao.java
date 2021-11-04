/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicahiccpmp.dao;

import com.unicahiccpmp.alumnos.Alumnos;
import java.util.ArrayList;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author obetancourth
 */

public class AlumnosDao {
    private ArrayList _alumnoItems;
    
    public AlumnosDao(){
        this._alumnoItems = new ArrayList<Alumnos>();
    }
    
    public ArrayList<Alumnos> getAlumnoItems(){
        return this.getAlumnoItems(false);
    }
    
    public void tableInitialize(){
        String sqlCreate = "CREATE TABLE IF NOT EXISTS ALUMNOS"
                        + " (CUENTA TEXT PRIMARY KEY NOT NULL,"
                        + " NOMBRE TEXT NOT NULL,"
                        + " GENERO TEXT NOT NULL,"
                        + " CORREO TEXT NOT NULL,"
                        + " TELEFONO TEXT NOT NULL"
                        + ")";
       
        try {
            Statement comando = Conexion.getConexion().createStatement();
            int resultado = comando.executeUpdate(sqlCreate);
            comando.close();
        } catch( Exception ex){
            System.err.println(ex.getMessage());
        }
    }
    
    public ArrayList<Alumnos> getAlumnoItems(boolean forceLoad){
        try {
           if (forceLoad) {
                Statement comando =  Conexion.getConexion().createStatement();
                ResultSet misRegistro = comando.executeQuery("SELECT * from ALUMNOS;");
                this._alumnoItems.clear();
                while (misRegistro.next()) {
                    Alumnos registro = new Alumnos();
                    registro.setCuenta(misRegistro.getString("CUENTA"));
                    registro.setNombre(misRegistro.getString("NOMBRE"));
                    registro.setGenero(misRegistro.getString("GENERO"));
                    registro.setCorreo(misRegistro.getString("CORREO"));
                    registro.setTelefono(misRegistro.getString("TELEFONO"));
                    
                    this._alumnoItems.add(registro);
                }
                comando.close();
           }
           return this._alumnoItems;
        } catch(Exception ex){
            System.err.println(ex.getMessage());
            return this._alumnoItems;
        }   
    }
    
    public Alumnos getAlumnoItemByCuenta(String cuenta){
        try {
            String SQLGetByID = "SELECT * FROM ALUMNOS WHERE CUENTA = ?;";
            PreparedStatement comando =  Conexion.getConexion().prepareStatement(SQLGetByID);
            comando.setString(1, cuenta);
            ResultSet misRegistro = comando.executeQuery();
            Alumnos registro = new Alumnos();
            while (misRegistro.next()) {
                registro.setCuenta(misRegistro.getString("CUENTA"));
                registro.setNombre(misRegistro.getString("NOMBRE"));
                registro.setGenero(misRegistro.getString("GENERO"));
                registro.setCorreo(misRegistro.getString("CORREO"));
                registro.setTelefono(misRegistro.getString("TELEFONO"));
                break;
            }
            comando.close();

            return registro;
        } catch(Exception ex){
            System.err.println(ex.getMessage());
            return null;
        }   
    }
    
    public int updateAlumnoItem(Alumnos ItemToUpdate) {
        try {
            String SQLUpdate = "UPDATE ALUMNOS set NOMBRE=?, CORREO=?, GENERO=?, TELEFONO=? where CUENTA=?;";
            PreparedStatement comando = Conexion.getConexion().prepareStatement(SQLUpdate);
            
            comando.setString(1, ItemToUpdate.getNombre());
            comando.setString(2, ItemToUpdate.getCorreo());
            comando.setString(3, ItemToUpdate.getGenero());
            comando.setString(4, ItemToUpdate.getTelefono());
            comando.setString(5, ItemToUpdate.getCuenta());
            
            int registrAfectado = comando.executeUpdate();
            comando.close();
            return registrAfectado;
            
        } catch( Exception ex) {
            System.err.println(ex.getMessage());
            return 0;
        }
    }
     public int insertAlumnoItem(Alumnos ItemToInsert) {
        try {
            //                                                                      1, 2, 3
            String SQLInsert = "INSERT INTO ALUMNOS (CUENTA, NOMBRE, GENERO, CORREO, TELEFONO) values (?, ?, ?, ?, ?);";
            PreparedStatement comando = Conexion.getConexion().prepareStatement(SQLInsert);
            
            comando.setString(1, ItemToInsert.getCuenta()); // ? 
            comando.setString(2, ItemToInsert.getNombre());
            comando.setString(3, ItemToInsert.getGenero());
            comando.setString(4, ItemToInsert.getCorreo());
            comando.setString(5, ItemToInsert.getTelefono());
            
            int registrAfectado = comando.executeUpdate();
            comando.close();
            return registrAfectado;
            
        } catch( Exception ex) {
            System.err.println(ex.getMessage());
            return 0;
        }
    }
     
    public int deleteAlumnoItem(Alumnos ItemToDelete) {
        try {
            String SQLDelete = "DELETE FROM ALUMNOS WHERE CUENTA = ?;";
            PreparedStatement comando = Conexion.getConexion().prepareStatement(SQLDelete);
            
            comando.setString(1, ItemToDelete.getCuenta());
            
            int registrAfectado = comando.executeUpdate();
            comando.close();
            return registrAfectado;
            
        } catch( Exception ex) {
            System.err.println(ex.getMessage());
            return 0;
        }
    }
}
