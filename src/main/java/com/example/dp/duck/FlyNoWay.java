package com.example.dp.duck;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我不會飛");
    }
}
