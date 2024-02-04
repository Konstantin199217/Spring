package org.example.config;

import org.example.domain.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean//редкоиспользуемая аннотация
    Car car(){
        Car obCar = new Car();
        obCar.setMade("X1");
        obCar.setModel("bmw");
        return obCar;
    }

}
