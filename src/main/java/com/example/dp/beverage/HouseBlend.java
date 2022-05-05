package com.example.dp.beverage;

/**
 * 被裝飾者
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        // 單純 House Blend 的價格，不含配料
        return .89;
    }
}
