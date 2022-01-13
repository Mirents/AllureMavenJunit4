package io.mirents;

import io.mirents.SystemUnderTest;
import io.qameta.allure.Allure;
import org.junit.Assert;
import org.junit.Test;

/**
 * Демонстрационный набор тестов класса SystemUnderTest
 * @author Raven
 */
public class SUTTest {
    
    @Test
    public void shouldEqualsSpeedTest() {
        Allure.step("Создание экземпляра класса");
        SystemUnderTest sut = new SystemUnderTest(7);
        
        Allure.step("Проверка состояния");
        Assert.assertEquals("Соответствие параметра", 7, sut.getSpeed());
    }
    
    @Test
    public void shouldNotEqualsSpeedTest() {
        Allure.step("Создание экземпляра класса");
        SystemUnderTest sut = new SystemUnderTest(7);
        
        Allure.step("Проверка состояния");
        Assert.assertEquals("Соответствие параметра", 8, sut.getSpeed());
    }
}
