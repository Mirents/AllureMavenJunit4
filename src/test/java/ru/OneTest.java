package ru;

import io.qameta.allure.Allure;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Raven
 */
public class OneTest {
    
    @Test
    public void reTest() {
        Allure.step("Шаг гагаю");
        Assert.assertTrue(true);
        System.out.println(">>>>>>>>>>>>");
    }
}
