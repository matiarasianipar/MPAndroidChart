package com.github.mikephil.charting.test;

import com.github.mikephil.charting.utils.Utils;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class UtilsTest {
    @Test
    public void formatNumberTestOnZero() {
        String number = Utils.formatNumber(0.0f, 0, true);
        assertEquals("0", number);
    }

    @Test
    public void formatNumberTestOnLessThanOne() {
        String number = Utils.formatNumber(0.01f, 2, true);
        assertEquals("0,01", number);
    }

    @Test
    public void formatNumberTestOnTooMuchDecimal() {
        String number = Utils.formatNumber(2f, 11, true);
        assertEquals("2,000000000", number);
    }

    @Test
    public void formatNumberTestOnNegative() {
        String number = Utils.formatNumber(-2f, 0, true);
        assertEquals("-2", number);
    }

    @Test
    public void formatNumberTestOnNumberOverThousand() {
        String number = Utils.formatNumber(2000f, 2, true);
        assertEquals("2.000,00", number);
    }

    @Test
    public void formatNumberTestOnNumberOverThousand2() {
        String number = Utils.formatNumber(22367670.004f, 0, true);
        assertEquals("22.367.670", number);
    }
}
