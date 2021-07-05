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

import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;

public class ToDoListController implements Initializable {

    @FXML
    private TextField ListNameTextFiled;
    @FXML
    private Label errorLabel;

    // Table config
    @FXML
    private TableView<Item> tableView;
    @FXML
    private TableColumn<Item, String> itemDescriptionColumn;
    @FXML
    private TableColumn<Item, LocalDate> dueDateColumn;
    @FXML
    private TableColumn<Item, String> statusColumn;

    // Instance variables to create new task
    @FXML
    private TextField descriptionTextField;
    @FXML
    private DatePicker dueDatePicker;
    @FXML
    private ComboBox<String> statusComboBox;

    @FXML
    private Button addButton;
    @FXML
    private Button clearButton;
    @FXML
    private Button removeButton;
    @FXML
    private Button submitButton;

    @FXML
    private MenuItem viewAllTasksMenuItem;
    @FXML
    private MenuItem viewCompletedTasksMenuItem;
    @FXML
    private MenuItem viewUncompletedTasksMenuItem;

    // Initialize controller class
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Create an Observable List of String (Completed, Uncompleted) and add to the ComboBox for user
        // selection of tasks status
        // Set up the columns of tableView
        // Update table to allow item description and due date columns to be editable.
        // Set tableView to be editable for user to edit description, due date and status
        // Set tableView selectionMode to select MULTIPLE rows. will be use with the remove method

    }

    public void addButtonClicked() {
        // get current value of descriptionTextField, dueDatePicker and statusComboBox
        // create an instance of a new Item object with those (pass those values to an Item constructor)
        // add newItem to tableView

        // For junit testing
        Item testItem = getItem();
    }

    public void clearButtonClicked() {
        // clear the descriptionTextField
        // clear dueDatePicker or set to today's date
        // clear statusComboBox (set to null)
    }

    public void updateItemDescriptionCellEvent() {
        // When user double clicked on a cell, get the selected Item Object
        // get the new item description
        // call method setItemDescription from the Item Object and pass the new description

    }

    public void updateDueDateCellEvent() {
        // When user double clicked on a cell, get the selected Item Object
        // get the new due date
        // validate format, this case the user is not selecting from a datePicker
        // call method setDueDate from the Item Object and pass the new due date
    }

    public void updateStatusCellEvent() {
        // When user double clicked on a cell, get the selected Item Object
        // get the new status (completed or uncompleted)
        // validate String entered. User shall enter "Completed" or "Uncompleted", this case the user is not selecting from a ComboBox
        // call method setStatus from the Item Object and pass the new status
    }

    public void removeButtonClicked() {
        // Get an ObservableList of all items on tableView
        // Get an ObservableList of the selected item(s) in tableView
        // Delete from allItems list the selectedItems (for loop to iterate)
    }

    // Method to go back to the ListManager Scene
    public ToDoList submitButtonClicked() {
        // Get name of ToDoList from ListNameTextFiled
        // Get an ObservableList of all items on tableView
        // Return an instance of ToDoList object
         return getToDoList();
    }


    public void viewAllTasksMenuItemClicked() {

    }

    public void viewCompletedTasksMenuItemClicked() {

    }

    public void viewUncompletedTasksMenuItemClicked() {

    }


    /*
    Creating a literal of Item type
     */
    public Item getItem() {

        // Per the instructions, return a literal.
        ObservableList<Item> item = FXCollections.observableArrayList();
        item.add(new Item("Flight to Cuzco", LocalDate.of(2021, Month.AUGUST, 15), "Incomplete"));

        return (Item) item;
    }

    /*
    Creating a literal of ToDoList type
    */
    public ToDoList getToDoList() {

        // Per the instructions, return a literal.
        String name = "Machu Picchu Trip";
        ObservableList<Item> item = FXCollections.observableArrayList();
        item.add(new Item("Flight to Lima", LocalDate.of(2021, Month.AUGUST, 13), "Complete"));
        ObservableList<ToDoList> singleList = (ObservableList<ToDoList>) new ToDoList(name, item);

        return (ToDoList) singleList;
    }

}
