package com.example.ap2_ex3.ViewModel

class ViewModel {

    private var port: Int = 0
    private var ip: String? = null
    private var rudder: Double = 0.0
    private var throttle: Double = 0.0

    // member function
    fun setPort(p: Int) {
        port = p
    }
    fun getPort(): Int {
        return port
    }
    fun setIP(s: String) {
        ip = s
    }
    fun getIP(): String? {
        return ip
    }
    fun setRudder(x: Double) {
        rudder = x
    }
    fun getRudder(): Double {
        return rudder
    }
    fun setThrottle(x: Double) {
        throttle = x
    }
    fun getThrottle(): Double {
        return throttle
    }
}
