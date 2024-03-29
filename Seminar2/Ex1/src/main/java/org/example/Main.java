package org.example;

import org.example.config.ProjectConfig;
import org.example.domain.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Car bmw = new Car();
//        bmw.setMade("X1");
//        bmw.setMade("bmw");
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Car simpleCar = context.getBean(Car.class);
        System.out.println(simpleCar.getMade()+" "+simpleCar.getModel());
    }
}