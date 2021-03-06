package edu.proyectodual.pasapalabra;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static String usuario;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"));
        stage.setTitle("Pasapalabra");
       stage.getIcons().add(new Image(App.class.getResourceAsStream("/edu/proyectodual/pasapalabra/static/img/logo.jpg")));
        stage.setScene(scene);
        stage.show();

    }

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        App.usuario = usuario;
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}