package ucf.assignments;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Edelis Molina
 */

import com.sun.javafx.collections.ObservableListWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;

import java.time.LocalDate;
import java.time.Month;

public class ToDoListMasterController {

    @FXML
    private MenuItem openMenuItem;
    @FXML
    private MenuItem saveMenuItem;
    @FXML
    private MenuItem saveAllMenuItem;

    @FXML
    private ListView<ToDoList> listView;

    @FXML
    private Button addNewListButton;
    @FXML
    private Button editListButton;

    public void addNewListButtonClicked() {

        // Create empty/null ToDoList Object and pass it to the ToDoListController
        // Change scene to the ToDoListController (When this class receives a null object,
        // its initialize method sets the ToDoList Name and tableView to null values
        // Add the returned ToDoList Object to the listView

        // For testing
        ToDoList emptyList = createEmptyList();
    }

    public void editListButtonClicked() {
        // Get the selected ToDoList Object in the listView and pass it to the ToDoListController
        // Change scene to the ToDoListController (The initializer method of ToDoListController
        // loads the name of the ToDoList and tableView into the scene)
        // Update the listView row/Object with the returned ToDoList Object

        // For testing
        ToDoList nonEmptyList = createNonEmptyList();
    }

    public void openMenuItemClicked() {
        // Create a file chooser object. Optional set the title
        // Create a file class to show open dialog
        // Get the absolutePath

        // Call reader(absolutePath) method to read in the serialized Object(s).
        // For loop to add Observable<ToDoList> listArray to the listView
    }

    public void saveAllMenuItemClicked() {
        // Get All ToDoList Object from the Listview
        // Get the name of the file to write to
        // Append the name of the file to the current location

        // For loop to call write() method for each ToDoList Object
            // Call writer(absolutePath, toDoList) method to write the serialized Object
    }

    public void saveMenuItemClicked() {
        // Get the selected row (ToDoList)
        // Get the name of the file to write to
        // Append the name of the file to the current location
        // Call writer(absolutePath, toDoList) method to write the serialized Object
    }

    /*
    Creating an empty ToDoList for testing
     */
    public ToDoList createEmptyList(){
        return null;
    }

    public ToDoList createNonEmptyList(){
        // set the value of listView to a nonEmpty ToDoList object

        // Reusing method from ToDoListController to return a ToDoList
        ToDoListController singleList = new ToDoListController();
        return singleList.getToDoList();
    }

    public ObservableList<ToDoList> reader(String path) {
        // Get the path to the txt from the caller method
        // Read in ToDoList Objects

        // Create dummy array of ToDoList Objects. Per assignment, a method with return value should simply return a literal.
        String name1 = "Machu Picchu Trip";
        String name2 = "Packing List";

        ObservableList<Item> item1 = FXCollections.observableArrayList();
        ObservableList<Item> item2 = FXCollections.observableArrayList();

        item1.add(new Item("Hike 7 Rainbow Mountain", LocalDate.of(2021, Month.AUGUST, 17), "Incomplete"));
        ObservableList<ToDoList> singleList1 = (ObservableList<ToDoList>) new ToDoList(name1, item1);

        item2.add(new Item("First Aid Kit", LocalDate.of(2021, Month.AUGUST, 5), "Incomplete"));
        ObservableList<ToDoList> singleList2 = (ObservableList<ToDoList>) new ToDoList(name2, item2);

        ObservableList<ToDoList> multipleLists = null;
        multipleLists.add((ToDoList) singleList1);
        multipleLists.add((ToDoList) singleList2);

        return multipleLists;
    }

    public void writer(String absolutePath, ObservableList<ToDoList> list) {
        // Create FileOutputStream f
        // Create ObjectOutputStream o = new ObjectOutputStream(f)

        // Write/Append Object to file
    }

}
