package com.unicahiccpmp.alumnos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Modality;
import javafx.fxml.Initializable;
        
        
        

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.scene.Node;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static Scene modalScene;
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("alumnosList"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
 

    public static void main(String[] args) {
        launch();
    }
    
    /*
        1) Primero Cargagar el Loader con el nombre del fxml
        2) En controlador que lo llama extraer el Parent y el Controller
        3) Establecer los parametros en el controler adecuados
        4) Llamar a loadFXMLModal enviando el Parent
    */
    public static FXMLLoader getFXMLLoader(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader;
    }
    public static void loadFXMLModal(Parent fxmlToShow) throws IOException {
        modalScene = new Scene(fxmlToShow, 480,480);
        Stage modalStage = new Stage();
        modalStage.initModality(Modality.APPLICATION_MODAL);
        modalStage.setScene(modalScene);
        modalStage.showAndWait();
    }
    
    public static void closeForm(ActionEvent event){
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

}