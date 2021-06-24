package com.example.fg_controller.view_model;

public class ViewModel {
    private String port = null;
    private String ip = null;
<<<<<<< HEAD
    private Integer rudder = 0;
    private Integer throttle = 0;
=======
    private int rudder = 500;
    private int throttle = 1000;
>>>>>>> cdec91ff01f4d15640d5bd79f19a98d38ae189b5

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

<<<<<<< HEAD
    public void setRudder(Integer rudder) {
=======
    public void setRudder(int rudder) {
>>>>>>> cdec91ff01f4d15640d5bd79f19a98d38ae189b5
        this.rudder = rudder;
    }

    public Integer getRudder() {
<<<<<<< HEAD
        return  rudder;
    }

    public void setThrottle(Integer throttle) {
        this.throttle = throttle;
    }

    public Integer getThrottle() { return throttle; }
=======
        return rudder;
    }

    public void setThrottle(int throttle) {
        this.rudder = throttle;
    }

    public Integer getThrottle() {
        return  throttle;
    }
>>>>>>> cdec91ff01f4d15640d5bd79f19a98d38ae189b5
}
