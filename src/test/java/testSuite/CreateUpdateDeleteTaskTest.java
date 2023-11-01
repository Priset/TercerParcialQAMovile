package testSuite;

import activities.AddTaskScreen;
import activities.PopUpConfirmDelete;
import activities.PrincipalScreen;
import activities.UpdateTaskScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.util.Date;

public class CreateUpdateDeleteTaskTest {
    PrincipalScreen principalScreen = new PrincipalScreen();
    AddTaskScreen addTaskScreen = new AddTaskScreen();
    UpdateTaskScreen updateTaskScreen = new UpdateTaskScreen();
    PopUpConfirmDelete popUpConfirmDelete = new PopUpConfirmDelete();
    String taskName = "Testing Movile QA" + new Date().getTime();
    String updateTaskName = "Final Testing QA" + new Date().getTime();
    @Test
    public void verifyCreateUpdateDeleteTask(){
        //Create Task
        principalScreen.addTaskButton.click();
        addTaskScreen.titleTaskTextBox.setText(taskName);
        addTaskScreen.saveTaskButton.click();
        Assertions.assertTrue(principalScreen.taskItem(taskName).isControlDisplayed(), "ERROR! La tarea no fue creada exitosamente.");

        //Update Task
        principalScreen.taskItem(taskName).click();
        updateTaskScreen.titleTaskTextBox.setText(updateTaskName);
        updateTaskScreen.saveTaskButton.click();
        Assertions.assertTrue(principalScreen.taskItem(updateTaskName).isControlDisplayed(), "ERROR! La tarea no se actualizo correctamente");

        //Delete Task
        principalScreen.taskItem(updateTaskName).click();
        updateTaskScreen.deleteTaskButton.click();
        popUpConfirmDelete.confirmDeleteButton.click();
        Assertions.assertFalse(principalScreen.taskItem(updateTaskName).isControlDisplayed(), "ERROR! La tarea no se elimino correctamente");
    }

    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }
}
