package com.example.fg_controller.view_model;

public class ViewModel {
    private String port = null;
    private String ip = null;
    private int rudder = 500;
    private int throttle = 1000;

    // member function
    public void setPort(String port) {
        this.port = port;
    }

    public String getPort() {
        return port;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setRudder(int rudder) {
        this.rudder = rudder;
    }

    public Integer getRudder() {
        return rudder;
    }

    public void setThrottle(int throttle) {
        this.rudder = throttle;
    }

    public Integer getThrottle() {
        return  throttle;
    }
}
