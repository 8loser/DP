package com.example.dp.pizza;

import java.util.ArrayList;

/**
 * 抽象 pizza
 * 每個 pizza 都要繼承該類別
 */
public abstract class Pizza {
    // Pizza 名稱
    String name;
    // 麵團
    String dough;
    // 醬汁
    String sauce;
    // 配料
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("準備製造 " + name);
        System.out.println("製作麵團..");
        System.out.println("加入醬料..");
        System.out.println("加入配料:");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("  " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("烘烤 25 分鐘");
    }

    void cut() {
        System.out.println("切割 pizza");
    }

    void box() {
        System.out.println("把 pizza 裝盒");
    }

    public String getName() {
        return name;
    }
}
