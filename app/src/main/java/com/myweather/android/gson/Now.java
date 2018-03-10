package com.myweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ErioSyu on 2018/3/9.
 */

public class Now {
    @SerializedName("tmp")
    public String temprature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
