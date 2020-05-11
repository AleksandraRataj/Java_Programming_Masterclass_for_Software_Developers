module JavaFXChallenge {

    requires javafx.fxml;
    requires javafx.controls;
    requires jlfgr;
    requires java.desktop;
    requires javafx.web;

    opens sample;
    opens sample.datamodel;
}