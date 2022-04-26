package com.example.dp.weather;

/**
 * 佈告欄
 * 實踐 Observer, 可以從 WeatherData 取得資料
 * 實踐 DisplayElement, 所有佈告欄都需要實踐該介面
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    // Subject 儲存起來, 之後 remove 還會用到
    private final Subject weatherData;
    private float temperature;
    private float humidity;

    /**
     * 建構式 new CurrentConditionsDisplay() 後執行
     *
     * @param weatherData 氣象資料 Subject
     */
    public CurrentConditionsDisplay(Subject weatherData) {
        // 使用依賴注入, Subject 由外部提供
        this.weatherData = weatherData;
        // new 之後向 Subject 註冊
        weatherData.registerObserver(this);
    }

    /**
     * 每個 DisplayElement 都要實踐 display
     * 不同佈告欄會有不同的 display 邏輯
     */
    @Override
    public void display() {
        System.out.println("溫度: " + temperature + " F");
        System.out.println("濕度: " + humidity + " %");
    }


    /**
     * 每個 Observer 都要實踐 update
     * 不同的佈告欄需要的資料不一樣
     *
     * @param temperature 溫度
     * @param humidity    濕度
     * @param pressure    壓力
     */
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
