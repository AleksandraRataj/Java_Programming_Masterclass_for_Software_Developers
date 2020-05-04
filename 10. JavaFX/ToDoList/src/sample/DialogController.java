package sample;

import datamodel.ToDoData;
import datamodel.ToDoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {

    @FXML
    private TextField titleField;

    @FXML
    private TextArea detailsArea;

    @FXML
    private DatePicker deadlinePicker;

    public ToDoItem processResults(){
        String title = titleField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadlineValue = deadlinePicker.getValue();
        ToDoItem newItem = new ToDoItem(title, details, deadlineValue);
        ToDoData.getInstance().addToDoItem(newItem);
        return newItem;
    }
}
