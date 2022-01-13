package com.github.mirents;

/**
 * Демонстрационный класс для запуска тестов
 * @author Raven
 */
public class SystemUnderTest {
    private int speed = 0;
    
    SystemUnderTest(int speed) {
        this.speed = speed;
    }
    
    public int getSpeed() {
        return speed;
    }
}
