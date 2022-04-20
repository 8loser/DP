package com.example.dp.duck;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我會呱呱叫");
    }
}
