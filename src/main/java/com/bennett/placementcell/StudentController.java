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

class PassedData {
    boolean showAll = false;

    StudentData studentData = new StudentData();
}

public class StudentController {
    @FXML
    protected TextField enrollmentNumInput;

    @FXML
    protected  TextField marksInput;

    @FXML
    protected TextField skillAssetInput;

    @FXML
    protected void onFindButtonClick(ActionEvent event) throws IOException {
        System.out.println("onFindButtonClick");

        Stage stage;
        Parent root;
        stage=(Stage) ((Button)(event.getSource())).getScene().getWindow();

        PassedData data = new PassedData();
        data.studentData.setEnrollmentNum(enrollmentNumInput.getText());
        data.studentData.setMarks(Integer.parseInt(marksInput.getText()));
        data.studentData.setSkillAsset(skillAssetInput.getText());

        stage.setUserData(data);

        root = FXMLLoader.load(getClass().getResource("company-suggestions.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onSeeAllButtonClick(ActionEvent event) throws IOException {
        System.out.println("onSeeAllButtonClick");

        Stage stage;
        Parent root;
        stage=(Stage) ((Button)(event.getSource())).getScene().getWindow();

        PassedData data = new PassedData();
        data.showAll = true;

        stage.setUserData(data);

        root = FXMLLoader.load(getClass().getResource("company-suggestions.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
