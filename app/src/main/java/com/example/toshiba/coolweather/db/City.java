package com.example.toshiba.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Toshiba on 2017/9/14.
 */

public class City extends DataSupport {
    private int id;
    private String cityNanme;
    private int cityCode;
    private int provinceCodeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityNanme() {
        return cityNanme;
    }

    public void setCityNanme(String cityNanme) {
        this.cityNanme = cityNanme;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceCodeId() {
        return provinceCodeId;
    }

    public void setProvinceCodeId(int provinceCodeId) {
        this.provinceCodeId = provinceCodeId;
    }
}
