package org.example.domain;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DiselEngin implements iEngin{
    @Override
    public void startEngin() {
        System.out.println("Запущен Дизель");
    }
}
