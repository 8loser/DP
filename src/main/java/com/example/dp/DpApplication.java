package com.example.dp;

import com.example.dp.beverage.Beverage;
import com.example.dp.beverage.Espresso;
import com.example.dp.beverage.HouseBlend;
import com.example.dp.beverage.Mocha;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DpApplication {

    public static void main(String[] args) {

        SpringApplication.run(DpApplication.class, args);
//        Duck
//        Duck mallard = new MallardDuck();
//        mallard.display();
//        mallard.performFly();
//        mallard.performQuack();
//        -----------
//        WeatherData
//        WeatherData weatherData = new WeatherData();
//        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
//        weatherData.setMeasurements(80, 65, 30.4f);
//        -----------
//        Beverage
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ", " + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        System.out.println(beverage2.getDescription() + "," + beverage2.cost());
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + "," + beverage2.cost());
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + "," + beverage2.cost());
    }
}
