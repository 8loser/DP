package com.example.dp.weather;

import java.util.ArrayList;

/**
 * 氣象資料主題
 * implement Subject
 */
public class WeatherData implements Subject {

    private final ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    /**
     * 測量值變更時，執行的動作
     * 通知所有註冊的觀察者
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 設定測量值後，執行測量值變更的動作
     *
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    /**
     * 加入到觀察者清單
     *
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 從觀察者清單移除
     *
     * @param o
     */
    @Override
    public void removerObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    /**
     * 所有註冊的觀察者執行 update()
     */
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }
}
