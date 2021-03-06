package ru.unn.agile.Stack.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import ru.unn.agile.Stack.viewmodel.ViewModel;

public class Stack {
    @FXML
    private ViewModel viewModel;
    @FXML
    private Button popbutton;
    @FXML
    private Button pushbutton;
    @FXML
    private Button topbutton;
    @FXML
    private Button printbutton;
    @FXML
    private TextField txtinput;
    @FXML
    private Button isemptybutton;

    @FXML
    void initialize() {
        txtinput.textProperty().bindBidirectional(viewModel.txtinputProperty());

        popbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                viewModel.pop();
            }
        });

        pushbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                viewModel.push();
            }
        });

        topbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                viewModel.top();
            }
        });

        isemptybutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                    viewModel.isEmpty();
            }
        });

        printbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                viewModel.print();
            }
        });
    }
}
