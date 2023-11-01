package activities;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class AddTaskScreen {
    public TextBox titleTaskTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public Button saveTaskButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
}
