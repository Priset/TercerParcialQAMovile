package activities;

import control.Button;
import org.openqa.selenium.By;

public class PrincipalScreen {
    public Button addTaskButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
    public Button taskItem(String taskName){
        return new Button(By.xpath("//android.widget.TextView[@text='"+taskName+"']"));
    }
}
