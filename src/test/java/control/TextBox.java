package control;

import org.openqa.selenium.By;

public class TextBox extends AppiumControl{
    public TextBox(By locator) {
        super(locator);
    }

    public void setText(String value){
        findControl();
        control.sendKeys(value);
    }

    public void clearSetText(String value){
        findControl();
        control.clear();
        control.sendKeys(value);
    }
}
