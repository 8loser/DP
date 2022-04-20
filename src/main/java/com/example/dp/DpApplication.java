package com.example.dp;

import com.example.dp.duck.Duck;
import com.example.dp.duck.MallardDuck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DpApplication {

    public static void main(String[] args) {

        SpringApplication.run(DpApplication.class, args);
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
    }
}
