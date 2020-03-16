package pages;

import support.DriverQA;

public class EditProcess {

    private DriverQA driver;

    public EditProcess(DriverQA stepDriver) {
        driver = stepDriver;
    }

    public void clickEdit(String id) {
        driver.click("btn-edit_" + id);
    }
}
