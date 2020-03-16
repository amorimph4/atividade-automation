package pages;

import support.DriverQA;

public class DeleteProcess {

    private DriverQA driver;

    public DeleteProcess(DriverQA stepDriver) {
        driver = stepDriver;
    }

    public void clickDelete(String id) {
        driver.click("btn-delete_" + id);
        driver.ChooseOkOnNextConfirmation();
        driver.ChooseCancelOnNextConfirmation();
    }
}
