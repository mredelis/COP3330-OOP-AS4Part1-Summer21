package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Edelis Molina
 */

class ToDoListMasterControllerTest {

    @Test
    // Instead of testing addNewListButtonClicked(), test createEmptyList()
    void createEmptyListTest() {
        // make a new ToDoListMasterController
        // call createEmptyListTest()
        // assert that the ToDoList instance is blank (null)
    }

    @Test
    // Instead of testing editListButtonClicked(), test createNonEmptyList()
    void createNonEmptyListTest() {
        // make a new ToDoListMasterController
        // set the value of listView to a known ToDoList object
        // get the value of listView -> expected
        // call createNonEmptyListTest() ->actual
        // assert that expected is equal to actual
    }

    @Test
    // Instead of testing openMenuItemClicked(), test reader(String path) {
    void readerTest() {
        // make a new TodoListMasterController
        // call reader() method and pass the absolutePath of a test.txt file -> actual
        // create an ObservableList<ToDoList> of the expected ToDoList objects -> expected
        // assert that the expected is equal to actual
    }

    @Test
    // Testing to handle saveAllMenuItemClicked() and saveMenuItemClicked()
    // Test the writer(String absolutePath, ObservableList<ToDoList> list) instead
    void writerTest() {
        // make a new TodoListMasterController

        // create a test.txt file
        // create an ObservableList literal of a ToDoList Object

        // Call the writer() method and pass the absolutePath of the test.txt file and the literal

        // Call the reader() method and pass the absolutePath of the file

        // assert that the read Object is equal to the literal

    }


}