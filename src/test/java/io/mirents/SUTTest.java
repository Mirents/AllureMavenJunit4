package io.mirents;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import junit.framework.Assert;
import org.junit.Test;

public class SUTTest {
    
    @Test
    @Description("Some detailed test description")
    public void shouldEqualsSpeedTest() {
        Allure.step("Создание экземпляра класса");
        SystemUnderTest sut = new SystemUnderTest(7);
        
        Allure.step("Проверка состояния");
        Assert.assertEquals("Соответствие параметра", 7, sut.getSpeed());
    }
    
    @Test
    @Description("Some detailed test description")
    public void shouldNotEqualsSpeedTest() {
        Allure.step("Создание экземпляра класса");
        SystemUnderTest sut = new SystemUnderTest(8);
        
        Allure.step("Проверка состояния");
        Assert.assertEquals("Соответствие параметра", 7, sut.getSpeed());
    }
}
