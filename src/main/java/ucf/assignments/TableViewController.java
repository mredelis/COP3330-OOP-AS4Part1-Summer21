package ucf.assignments;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Edelis Molina
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;

public class TableViewController implements Initializable {

    // Table config
    @FXML private TableView<Task> tableView;
    @FXML private TableColumn<Task, String> itemDescriptionColumn;
    @FXML private TableColumn<Task, LocalDate> dueDateColumn;
//    @FXML private TableColumn<?, ?> completeColumn;

    // Instance var to create new task
    @FXML private TextField descriptionTextField;
    @FXML private DatePicker datePicker;

    // Unused for now
//    @FXML private TextField nameTextField;
//    @FXML private Button addButton;


    // Initialize controller class
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        // set up the columns
        itemDescriptionColumn.setCellValueFactory(new PropertyValueFactory<>("itemDescription"));
        dueDateColumn.setCellValueFactory(new PropertyValueFactory<>("dueDate"));

        // load dummy tasks for testing
//        tableView.setItems(getTasks());

        // Update table to allow item description and due date columns to be editable
        tableView.setEditable(true);
        itemDescriptionColumn.setCellFactory(TextFieldTableCell.forTableColumn());
//        dueDateColumn.setCellFactory(TextFieldTableCell.forTableColumn());
    }


    // Method to double click on a cell and update item description

    // Method to create a Task Object and add it to the table
    public void addButtonClicked(){
        Task newTask = new Task(descriptionTextField.getText(), datePicker.getValue());

        // Get all the items as a list, then add the new task to the list
        tableView.getItems().add(newTask);
    }


    // Method to return an ObservableList of Task Objects
    public ObservableList<Task> getTasks(){
        ObservableList<Task> task = FXCollections.observableArrayList();
        task.add(new Task("Flight to Lima", LocalDate.of(2021, Month.AUGUST, 13)));
        task.add(new Task("Flight to Cuzco", LocalDate.of(2021, Month.AUGUST, 15)));
        task.add(new Task("Train to Machu Picchu", LocalDate.of(2021, Month.AUGUST, 16)));
        task.add(new Task("Tour to Rainbow Mountain", LocalDate.of(2021, Month.AUGUST, 18)));

        return task;
    }

}
