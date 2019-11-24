package com.yang.cloud.weather.service;

import com.yang.cloud.weather.vo.WeatherResponse;

/**
 * @Author: Mu_Yi
 * @Date: 2019/11/24 22:55
 * @Version 1.0
 * @qq: 1411091515
 */
public interface WeatherDataService {

    /**
     * 根据城市ID查询
     * @param cityId
     * @return
     */
    WeatherResponse getDataByCityId(String cityId);

    /**
     * 根据城市名字查询
     * @param cityName
     * @return
     */
    WeatherResponse getDataByCityName(String cityName);

}
