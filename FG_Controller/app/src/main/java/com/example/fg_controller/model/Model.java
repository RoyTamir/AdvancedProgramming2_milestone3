package com.example.fg_controller.model;

import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Model {
    private ExecutorService es;
    private java.net.Socket fg;
    private PrintWriter out;

    public Model() {
        es = Executors.newFixedThreadPool(1);
    }

    public void connect(String port, String ip) {
        es.execute(() -> {
            try {
                fg = new java.net.Socket(ip, Integer.parseInt(port));
                out = new PrintWriter(fg.getOutputStream(), true);
            } catch (Exception e) {
                System.out.println("connection failed");
            }
            sendToFG("set /controls/flight/aileron (-1…1)");
            sendToFG("set /controls/flight/elevator (-1…1)");
            sendToFG("set /controls/flight/rudder (-1…1)");
            sendToFG("set /controls/engines/current-engine/throttle (0…1)");
        });
    }

    public void sendToFG(String s) {
        es.execute(() -> {
           out.print(s);
           out.flush();
        });
    }
}
