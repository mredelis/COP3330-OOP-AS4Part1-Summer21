package ucf.assignments;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Edelis Molina
 */

import javafx.beans.property.SimpleStringProperty;

import java.awt.*;
import java.time.LocalDate;

public class Task {
    private SimpleStringProperty itemDescription;
    private LocalDate dueDate;
//    private Checkbox remark;

    public Task(String itemDescription, LocalDate dueDate) {
        this.itemDescription = new SimpleStringProperty(itemDescription);
        this.dueDate = dueDate;
//        this.remark = new Checkbox();

    }

    public String getItemDescription() {

        return itemDescription.get();
    }

    public void setItemDescription(String itemDes) {

        itemDescription.set(itemDes);
    }

    public LocalDate getDueDate() {

        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {

        this.dueDate = dueDate;
    }

//    public Checkbox getRemark(){
//        return remark;
//    }
//
//    public void setRemark(Checkbox remark){
//        this.remark = remark;
//    }

}
