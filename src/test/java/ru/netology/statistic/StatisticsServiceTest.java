package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxIfMinus() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {0, -1, -2, -3, -4, -5, -6, -7, -8, 1, 0};
        long expected = 1;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);

    }
}