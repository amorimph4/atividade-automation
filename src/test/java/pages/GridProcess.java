package pages;

import support.DriverQA;

public class GridProcess {

    private DriverQA driver;

    public GridProcess(DriverQA stepDriver){
        driver = stepDriver;
    }

    public void clickNovoProcesso() {
       driver.click("btn-novo");
    }

    public boolean existText(String message) {
        return driver.getTextAllPage(message);
    }
}
