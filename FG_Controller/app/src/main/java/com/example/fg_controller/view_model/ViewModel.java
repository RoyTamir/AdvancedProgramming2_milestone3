package com.example.fg_controller.view_model;

public class ViewModel {
    private String port = null;
    private String ip = null;
    private Double rudder = 0.5;
    private Double throttle = 0.5;

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
        this.rudder = (double) rudder / 2000;
    }

    public Integer getRudder() {
        return  (int) (rudder * 2000);
    }

    public void setThrottle(int throttle) {
        this.rudder = (double) throttle / 1000;
    }

    public Integer getThrottle() {
        return  (int) (throttle * 1000);
    }
}
