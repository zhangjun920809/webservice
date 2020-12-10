package com.hongyi;

import javax.xml.ws.Endpoint;

/**
 * @author User
 * @date 2020/11/30 14:17
 */
public class WeatherServer {
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:12345/weather", new WeatherInterfaceImpl());
    }
}
