package com.gurwinder.hardware;

public class Desktop extends Computer {


    private String keyboardCompanyName;
    private String screenType;

    public Desktop() {

        System.out.println(" DesktopConstructor");
    }

    /**
     *
     * @param keyboardCompanyName
     * @param screenType
     */
    public Desktop(String keyboardCompanyName, String screenType) {
        super();
        this.keyboardCompanyName = keyboardCompanyName;
        this.screenType = screenType;
        System.out.println("Desktop D2");
    }

    /**
     *
     * @param id
     * @param manufacturerName
     * @param keyboardCompanyName
     * @param screenType
     */
    public Desktop(int id, String manufacturerName, String keyboardCompanyName, String screenType) {

        super(id, manufacturerName);
        this.keyboardCompanyName = keyboardCompanyName;
        this.screenType = screenType;
    }

    public String getKeyboardCompanyName() {
        return keyboardCompanyName;
    }

    public void setKeyboardCompanyName(String keyboardCompanyName) {
        this.keyboardCompanyName = keyboardCompanyName;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }


    @Override
    public void display() {

    }
}
