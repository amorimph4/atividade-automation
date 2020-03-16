package pages;

import support.DriverQA;

public class IncludeProcess {
    private DriverQA driver;

    public IncludeProcess(DriverQA stepDriver) {
        driver = stepDriver;
    }

    public void FillField(String campo, String valor) {
        driver.sendKeys(valor, campo);
    }

    public void selectUrgencia(String valor) {
        driver.selectByText(valor, "processo_urgente");
    }

    public void clickFieldArbitramento(String valor) {
        driver.click( "processo_arbitramento_s");
    }
}
