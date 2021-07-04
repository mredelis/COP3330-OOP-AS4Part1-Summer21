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
    private Button updateButton;
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
        // ComboBox Items
        statusComboBox.getItems().removeAll(statusComboBox.getItems());
        statusComboBox.getItems().addAll("Complete", "Incomplete");


        // set up the columns
        itemDescriptionColumn.setCellValueFactory(new PropertyValueFactory<>("itemDescription"));
        dueDateColumn.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));


        // load dummy tasks for testing
        tableView.setItems(getTasks());

        // Update table to allow item description and due date columns to be editable.
        // The status (complete or incomplete) will be done via pushedButton
        tableView.setEditable(true);

        // Allow multiple tasks selection at one
        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


//        itemDescriptionColumn.setCellFactory(TextFieldTableCell.forTableColumn());

    }

    // Method to create a Task Object and add it to the table
    public void addButtonClicked() {
        errorLabel.setText("");

        if (descriptionTextField.getText().isEmpty()) {
            errorLabel.setText("Enter item description!");
        } else {
            Item newItem = new Item(descriptionTextField.getText(), dueDatePicker.getValue(), statusComboBox.getValue());

            // Get all the items as a list, then add the new task to the list
            tableView.getItems().add(newItem);
        }
    }

    // Method to clear data from Item Description, Date Picker and Combo Box
    public void clearButtonClicked() {
        descriptionTextField.clear();
        dueDatePicker.getEditor().clear();
        statusComboBox.valueProperty().set(null);
    }

    // Method to double click on a cell and update item description
    public void updateButtonClicked() {

    }


    // Method to remove selected row(s) from the table
    public void removeButtonClicked() {

        errorLabel.setText("");

        ObservableList<Item> allItems = null, selectedRows;

        try {
            allItems = tableView.getItems();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        selectedRows = tableView.getSelectionModel().getSelectedItems();

        for (Item item : selectedRows) {
            allItems.remove(item);
        }
    }

    // Method to go back to the ListManager Scene
    public void submitButtonClicked() {

    }


    public void viewAllTasksMenuItemClicked() {

    }

    public void viewCompletedTasksMenuItemClicked() {

    }

    public void viewUncompletedTasksMenuItemClicked() {

    }


    // Method to return an ObservableList of Task Objects
    public ObservableList<Item> getTasks() {
        ObservableList<Item> item = FXCollections.observableArrayList();
        item.add(new Item("Flight to Lima", LocalDate.of(2021, Month.AUGUST, 13), "Complete"));
        item.add(new Item("Flight to Cuzco", LocalDate.of(2021, Month.AUGUST, 15), "Incomplete"));
        item.add(new Item("Train to Machu Picchu", LocalDate.of(2021, Month.AUGUST, 16), "Complete"));
        item.add(new Item("Tour to Rainbow Mountain", LocalDate.of(2021, Month.AUGUST, 18), "Complete"));

        return item;
    }

}
