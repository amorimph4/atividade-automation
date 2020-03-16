package pages;

import support.DriverQA;

public class SaveProcess {
    private DriverQA driver;

    public SaveProcess(DriverQA stepDriver){
        driver = stepDriver;
    }

    public void clickSave(String botao) {
        driver.click(botao);
    }
}
