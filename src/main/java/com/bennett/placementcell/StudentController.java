package com.bennett.placementcell;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;

public class StudentController {
    @FXML
    protected TextField enrollmentNumInput;

    @FXML
    protected  TextField marksInput;

    @FXML
    protected TextField skillAssetInput;

    @FXML
    protected void onFindButtonClick(ActionEvent event) {
        System.out.println("onFindButtonClick");

        Connection connection = DBUtilities.getConnection();
        System.out.println(connection);
    }

    public void onSeeAllButtonClick(ActionEvent event) throws IOException {
        System.out.println("onSeeAllButtonClick");

        Stage stage;
        Parent root;
        stage=(Stage) ((Button)(event.getSource())).getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("company-suggestions.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
