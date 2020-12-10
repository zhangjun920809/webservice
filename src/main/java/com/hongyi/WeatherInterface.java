package com.hongyi;

/**
 * @author User
 * @date 2020/11/30 14:10
 */
//1.  编写SEI(Service Endpoint Interface)，SEI在webservice中称为portType，在java中就是普通接口

public interface WeatherInterface {
     String queryWeather(String cityName);
}
