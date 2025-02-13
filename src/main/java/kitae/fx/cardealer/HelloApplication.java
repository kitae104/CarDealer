package kitae.fx.cardealer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 900);
        stage.setTitle("Welcome!");
        stage.setMaxHeight(900);
        stage.setMaxWidth(1200);
        stage.setX(2500);
        stage.getIcons().add(new Image(getClass().getResource("/images/symbols/deal.png").toExternalForm()));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}