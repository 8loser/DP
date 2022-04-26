package com.example.dp;

import com.example.dp.weather.CurrentConditionsDisplay;
import com.example.dp.weather.WeatherData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DpApplication {

    public static void main(String[] args) {

        SpringApplication.run(DpApplication.class, args);
//        Duck mallard = new MallardDuck();
//        mallard.display();
//        mallard.performFly();
//        mallard.performQuack();
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        
    }
}
