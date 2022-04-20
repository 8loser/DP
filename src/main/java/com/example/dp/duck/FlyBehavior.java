package com.example.dp.duck;

/**
 * 使用 interface 方便擴充其他飛行行為，也不會影響到 Duck 原本的機制
 */
public interface FlyBehavior {
    void fly();
}
