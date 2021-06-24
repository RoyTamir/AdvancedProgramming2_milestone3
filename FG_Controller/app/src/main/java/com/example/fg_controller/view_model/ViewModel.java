package com.example.fg_controller.view_model;

public class ViewModel {
    private String port = null;
    private String ip = null;
    private Integer rudder = 0;
    private Integer throttle = 0;

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

    public void setRudder(Integer rudder) {
        this.rudder = rudder;
    }

    public Integer getRudder() {
        return  rudder;
    }

    public void setThrottle(Integer throttle) {
        this.throttle = throttle;
    }

    public Integer getThrottle() { return throttle; }
}
