package com.example.dp.beverage;

/**
 * 飲料的抽象類, 被裝飾者的抽象物件
 * 所有飲料都要繼承該類別
 */
public abstract class Beverage {
    String description = "抽象飲料";

    /**
     * 價格由外部實踐
     */
    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
