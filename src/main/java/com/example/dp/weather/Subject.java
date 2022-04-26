package com.example.dp.weather;

/**
 * 主題介面
 * 處理觀測者註冊、移除、通知
 */
public interface Subject {
    // 觀測者註冊
    void registerObserver(Observer o);

    // 觀測者移除
    void removerObserver(Observer o);

    // 通知所有觀測者
    void notifyObservers();
}
