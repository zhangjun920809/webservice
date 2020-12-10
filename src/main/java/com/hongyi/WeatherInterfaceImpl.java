package com.hongyi;

import javax.jws.WebService;

/**
 * @author User
 * @date 2020/11/30 14:10
 */
@WebService
//@WebService表示该类是一个服务类，需要发布其中的public的方法
public class WeatherInterfaceImpl implements WeatherInterface {


    public String queryWeather(String cityName) {
        System.out.println("获取城市名"+cityName);
        String weather="晴天";
        return weather;
    }

}
