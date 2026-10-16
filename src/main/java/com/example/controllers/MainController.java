package com.example.controllers;

import java.util.List;

import com.example.models.FileDataSource;
import com.example.models.Task;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class MainController {

    @FXML
    private RadioButton answer1Radio;

    @FXML
    private RadioButton answer2Radio;

    @FXML
    private RadioButton answer3Radio;

    @FXML
    private RadioButton answer4Radio;

    @FXML
    private ToggleGroup answers;

    @FXML
    private TextField idField;

    @FXML
    private TextField questionField;

    List<Task> taskList;

    @FXML 
    void initialize() {
        System.out.println("Betölt");
    }

    void loadData() {
        FileDataSource file = new FileDataSource();
        taskList = file.readData();
        loadTask(0);
    }

    void loadTask(int index) {
        Task task = taskList.get(index);
        idField.setText(task.getId());
        questionField.setText(task.getQuestion());
    }

    @FXML
    private Label titleLabel;

    @FXML
    void onClickNextButton(ActionEvent event) {

    }

    @FXML
    void onClickPreviousButton(ActionEvent event) {

    }

    @FXML
    void onClickSaveButton(ActionEvent event) {

    }

}
