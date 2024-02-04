package org.example.domain;

import org.springframework.stereotype.Component;

@Component
public class GasolinEngin implements iEngin{
    @Override
    public void startEngin() {
        System.out.println("Запущен Бензин");
    }
}
