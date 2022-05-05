package com.example.dp.beverage;

/**
 * 配料抽象類, 裝飾者的抽象類
 * 繼承 Beverage 使型態相符
 */
public abstract class CondimentDecorator extends Beverage {
    // 所有配料都要重新實踐該方法
    public abstract String getDescription();
}
