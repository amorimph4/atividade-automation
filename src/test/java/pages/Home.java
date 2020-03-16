package pages;

import support.DriverQA;

public class Home {

    private DriverQA driver;

    public Home(DriverQA stepDriver){
        driver = stepDriver;
    }

    public void open() {
        String url = "http://agapito-server.herokuapp.com/";
        driver.openURL(url);
    }
}
