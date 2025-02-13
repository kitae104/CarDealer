module kitae.fx.cardealer {
    requires javafx.controls;
    requires javafx.fxml;


    opens kitae.fx.cardealer to javafx.fxml;
    exports kitae.fx.cardealer;
}