package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class weekendServiceTest {
    @Test

    public void showWeekend1() {
        weekendService service = new weekendService();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void showWeekend2() {
        weekendService service = new weekendService();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }

    public void testWithCSVFile(int income, int expense, int threshold, int expected) {

        weekendService service = new weekendService();


        int actual = service.calculate(income,expense,threshold);

        Assertions.assertEquals(expected, actual);
    }

}
