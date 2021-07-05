package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Edelis Molina
 */

class ToDoListControllerTest {

    @Test
    // Instead of testing addButtonClicked(), test getItem()
    void getItemTest() {
        // set descriptionTextField, dueDatePicker and statusComboBox to known values -> expected value
        // get the values from descriptionTextField, dueDatePicker and statusComboBox
        // call the getItemTest() function -> actual value
        // assert that the expected value is equal to the actual value
    }

    @Test
    void clearButtonClicked() {
        // make a new ToDoListController
        // initialize descriptionTextField to non-blank value
        // initialize dueDatePicker to non-blank value
        // initialize statusComboBox to non-blank value
        // call the clearButtonClicked() function
        // assert that the 3 new values are blank
    }

    @Test
    void removedTest() {
        // make a new ToDoListController
        // Get the selected Item in tableview
        // Get all the Items in tableView
        // Set expected value to a know tableView of Item

        // call remove() method -> actual
        // assert that actual list is equal to expected
    }

    @Test
    // Instead of testing submitButtonClicked(), test getToDoList()
    void getToDoListTest() {
        // set ListNameTextFiled to a known String value
        // set tableView to a known Item value
        // expected value is an Instance of ToDoList object with the above values

        // get the value of ListNameTextField and tableview
        // call the getToDoList() function ->actual value

        // assert that the expected value is equal to the actual value
    }

    @Test
    void filter(){
        // make a new ToDoListController
        // Create dummy ObservableList of Items
        // Create a dummy ObservableList of filtered Items from the above List -> expected

        // Call filter() method with a searchText String for the Status Column -> actual
        // assert that the expected value is equal to the actual value
    }

}