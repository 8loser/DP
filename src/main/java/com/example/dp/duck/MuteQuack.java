package com.example.dp.duck;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("..(我不會叫)..");
    }
}
