package ru.yandex.praktikum;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CalculatorTest {
    private final int firstNumber;
    private final int secondNumber;
    private final int expected; // создали поля тестового класса

    public CalculatorTest(int firstNumber, int secondNumber, int expected) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expected = expected; // создали конструктор тестового класса
    }

    @Parameterized.Parameters
    public static Object[] getMultiplicationData() {
        return new Object[][] {
                { 2, 1, 2},
                { 2, 2, 4},
                { 1, 0, 0},
                { 0, 0, 0},
                { -1, 0, 0},
                { -1, 2, -2}, // передали тестовые данные
        };
    }

    @Test
    public void shouldBeMultiplication() {
        Calculator calculator = new Calculator();
        int actual = calculator.mult(firstNumber, secondNumber); // обратились к полям тестового класса
        assertEquals(expected, actual); // сравнили ожидаемый и фактический результат
    }

    /*
    @Parameterized.Parameters
    public static Object[] getSumData() {
        return new Object[][] {
                { 1, 9, 10},
                { 1, 0, 1}, // передали тестовые данные
        };
    }

    @Test
    public void shouldBeSum() {
        Calculator calculator = new Calculator();
        int actual = calculator.sum(firstNumber, secondNumber); // обратились к полям тестового класса
        assertEquals(expected, actual); // сравнили ожидаемый и фактический результат
    }
     */




}