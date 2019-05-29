package com.gurwinder.hardware;

public class Mobile extends Computer {


    public Mobile()
    {

    }

    /**
     *
     * @param operationSystemName
     * @param canMakeCall
     * @param providerName
     */
    public Mobile(String operationSystemName, boolean canMakeCall, String providerName) {
        this.operationSystemName = operationSystemName;
        this.canMakeCall = canMakeCall;
        this.providerName = providerName;
    }

    /**
     *
     * @param id
     * @param manufacturerName
     * @param operationSystemName
     * @param canMakeCall
     * @param providerName
     */
    public Mobile(int id, String manufacturerName, String operationSystemName, boolean canMakeCall, String providerName) {
        super(id, manufacturerName);
        this.operationSystemName = operationSystemName;
        this.canMakeCall = canMakeCall;
        this.providerName = providerName;
    }

    private  String operationSystemName;
    private boolean canMakeCall;
    private String providerName; //rogers,Bell, Telus

    public String getOperationSystemName() {
        return operationSystemName;
    }

    public void setOperationSystemName(String operationSystemName) {
        this.operationSystemName = operationSystemName;
    }

    public boolean isCanMakeCall() {
        return canMakeCall;
    }

    public void setCanMakeCall(boolean canMakeCall) {
        this.canMakeCall = canMakeCall;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }


    @Override
    public void display() {

    }
}
