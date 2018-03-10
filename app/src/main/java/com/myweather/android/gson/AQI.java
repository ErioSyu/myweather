package com.myweather.android.gson;

/**
 * Created by ErioSyu on 2018/3/9.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
