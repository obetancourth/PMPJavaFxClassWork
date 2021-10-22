/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicahiccpmp.alumnos;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.*;

/**
 * FXML Controller class
 *
 * @author obetancourth
 */
public class PrincipalController  {

    @FXML private Button btnClickMe;
    
    private Integer clicksOnApp = 0;
    
    @FXML private void ClickMe_onclick() throws IOException{
        clicksOnApp += 1;
        btnClickMe.setText("Click Me Again ( " + clicksOnApp.toString() + " )");
    }
}
