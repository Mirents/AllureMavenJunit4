package io.mirents;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SUTTest {
    
    @Test
    @Description("Some detailed test description")
    public void shouldEqualsSpeedTest() {
        Allure.step("Создание экземпляра класса");
        SystemUnderTest sut = new SystemUnderTest(7);
        System.out.println("shouldEqualsSpeedTest");
        Allure.step("Проверка состояния");
        Assertions.assertEquals(7, sut.getSpeed(), "Соответствие параметра");
    }
    
    @Test
    @Description("Some detailed test description")
    public void shouldNotEqualsSpeedTest() {
        Allure.step("Создание экземпляра класса");
        SystemUnderTest sut = new SystemUnderTest(8);
        System.out.println("shouldNotEqualsSpeedTest");
        Allure.step("Проверка состояния");
        Assertions.assertEquals(8, sut.getSpeed(), "Соответствие параметра");
    }
}
