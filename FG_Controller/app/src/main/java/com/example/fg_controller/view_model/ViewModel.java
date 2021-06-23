package com.example.fg_controller.view_model;

public class ViewModel {
    private String port = null;
    private String ip = null;
    private Double rudder = 0.0;
    private Double throttle  = 0.0;

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

    public void setRudder(Double rudder) {
        this.rudder = rudder;
    }

    public Double getRudder() {
        return rudder;
    }

    public void setThrottle(Double throttle) {
        this.throttle = throttle;
    }

    public Double getThrottle() {
        return throttle;
    }
}
