package com.yang.cloud.weather.vo;

import java.io.Serializable;

/**
 * @Author: Mu_Yi
 * @Date: 2019/11/24 22:53
 * @Version 1.0
 * @qq: 1411091515
 */
public class WeatherResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 消息数据
     */
    private Weather data;

    /**
     * 消息状态
     */
    private String status;

    /**
     * 消息描述
     */
    private String desc;

    public Weather getData() {
        return data;
    }

    public void setData(Weather data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
