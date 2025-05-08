package kitae.fx.cardealer;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    public MenuBar menuBar;

    @FXML
    public Menu menuAddNewVehicle;

    @FXML
    public MenuItem menuItemAddNewVehicle;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        menuItemAddNewVehicle.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("================================Add New Vehicle");
                FXMLLoader fxmlLoader = new FXMLLoader(AddNewVehicle.class.getResource("AddNewVehicle.fxml"));
                try {
                    Parent root = fxmlLoader.load();
                    Stage stage = (Stage) menuBar.getScene().getWindow();
                    stage.setScene(new Scene(root, 1200, 900));
                    stage.setMaxHeight(900);
                    stage.setMaxWidth(1200);
                    stage.setTitle("Add New Vehicle");
                    stage.show();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}