package com.example.fg_controller.view_model;

import com.example.fg_controller.model.Model;

public class ViewModel {
    private String port = null;
    private String ip = null;
    private Integer rudder = 0;
    private Integer throttle = 0;
    private Double a = 0.0;
    private Double elevator = 0.0;
    private Model model = new Model();

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
        Double r = ((double) rudder - 1000) / 1000;
        model.sendToFG("set /controls/flight/rudder " + r.toString() + "\r\n");
    }

    public Integer getRudder() {
        return  rudder;
    }

    public void setThrottle(Integer throttle) {
        this.throttle = throttle;
        Double t = ((double) throttle) / 1000;
        model.sendToFG("set /controls/flight/throttle " + t.toString() + "\r\n");
    }

    public Integer getThrottle() { return throttle; }

    public void setA(Double a) {
        this.a = a;
        Double al = ((double) a - 1000) / 1000;
        model.sendToFG("set /controls/flight/aeliron " + al.toString() + "\r\n");
    }

    public Double getA() { return a; }

    public void setElevator(Double elevator) {
        this.elevator = elevator;
        Double e = ((double) elevator - 1000) / 1000;
        model.sendToFG("set /controls/flight/elevator " + e.toString() + "\r\n");
    }

    public Double getElevator() { return elevator; }

    public void connect() {
        model.connect(port, ip);
    }
}
