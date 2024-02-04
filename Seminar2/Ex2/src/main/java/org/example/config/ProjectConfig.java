package org.example.config;

import org.example.domain.Car;
import org.example.domain.Engin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.domain")
public class ProjectConfig {

//    @Bean//редкоиспользуемая аннотация
//    Engin engin(){
//        Engin eng = new Engin();
//        return eng;
//    }
//    @Bean//редкоиспользуемая аннотация
//    Car car(){
//        Car obCar = new Car();
//        obCar.setCarEngin(engin());
//        obCar.setMade("X1");
//        obCar.setModel("bmw");
//        return obCar;
//    }

}
