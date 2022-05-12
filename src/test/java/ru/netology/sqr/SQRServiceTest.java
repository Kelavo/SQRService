package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @Test
    void shouldCalculateMinValue() {
        SQRService service = new SQRService();

        int actual = service.countSquares(100, 100);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateMaxValue() {
        SQRService service = new SQRService();

        int actual = service.countSquares(100, 9801);
        int expected = 90;

        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateValue() {
        SQRService service = new SQRService();

        int actual = service.countSquares(200, 300);
        int expected = 3;

        assertEquals(actual, expected);

    }

}
