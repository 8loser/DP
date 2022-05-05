package com.example.dp.beverage;

/**
 * 被裝飾者
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        // 單純 Espresso 的價格，不含配料
        return 1.99;
    }
}
