package com.example.dp.weather;

/**
 * 觀察者介面
 */
public interface Observer {

    /**
     * 更新氣象資料
     *
     * @param temperature 溫度
     * @param humidity    濕度
     * @param pressure    壓力
     */
    void update(float temperature, float humidity, float pressure);
}
