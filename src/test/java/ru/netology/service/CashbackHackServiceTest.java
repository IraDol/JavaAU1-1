package ru.netology.service;

import junit.framework.TestCase;

import static org.junit.Assert.*;
import junit.framework.TestCase;

public class CashbackHackServiceTest extends TestCase {

    @org.junit.Test
    public void shouldUnderBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        assertEquals(actual, expected);

    }
    @org.junit.Test
    public void shouldEqualBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);

    }
    @org.junit.Test
    public void shouldUpperBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1100);
        int expected = 900;
        assertEquals(actual, expected);

    }
    @org.junit.Test
    public void shouldSummerZero() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);

    }
    @org.junit.Test
    public void shouldAmountBigger() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(9000000);
        int expected = 0;
        assertEquals(actual, expected);

    }
}

