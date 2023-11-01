package activities;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class UpdateTaskScreen {
    public TextBox titleTaskTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public Button saveTaskButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
    public Button deleteTaskButton = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
}
