package com.github.mikephil.charting.test;

import com.github.mikephil.charting.formatter.LargeValueFormatter;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by philipp on 06/06/16.
 */
public class LargeValueFormatterTest {


    // (-infinity, -trillion] (-infinity, -10^12]
    @Test
    public void PartitionNegativeInfinityToNegativeTrillionLowerBoundary() {
        LargeValueFormatter formatter = new LargeValueFormatter();
        String result = formatter.getFormattedValue(-998999999999999f, null);
        assertEquals("-999t", result);
    }

    @Test
    public void PartitionNegativeInfinityToNegativeTrillionRepresentativeValue() {
        LargeValueFormatter formatter = new LargeValueFormatter();
        String result = formatter.getFormattedValue(-6870000000000f, null);
        assertEquals("-6.8t", result);
    }

    @Test
    public void PartitionNegativeInfinityToNegativeTrillionUpperBoundary() {
        LargeValueFormatter formatter = new LargeValueFormatter();

        String result = formatter.getFormattedValue(-1000000000000f, null);
        assertEquals("-1t", result);
    }

    // (-Trillion, -Billion]  (-10^12, -10^9]
    @Test
    public void PartitionNegativeTrillionToNegativeBillionLowerBoundary() {
        LargeValueFormatter formatter = new LargeValueFormatter();

        String result = formatter.getFormattedValue(-999999999999f, null);
        assertEquals("-1t", result);
    }

    @Test
    public void PartitionNegativeTrillionToNegativeBillionRepresentativeValue() {
        LargeValueFormatter formatter = new LargeValueFormatter();
        String result = formatter.getFormattedValue(-22000000000f, null);
        assertEquals("-22b", result);
    }

    @Test
    public void PartitionNegativeTrillionToNegativeBillionUpperBoundary() {
        LargeValueFormatter formatter = new LargeValueFormatter();

        String result = formatter.getFormattedValue(-1000000000f, null);
        assertEquals("-1b", result);
    }

    // (-Billion, -Million] (-10^9, -10^6]
    @Test
    public void PartitionNegativeBillionToNegativeMillionLowerBoundary() {
        LargeValueFormatter formatter = new LargeValueFormatter();
        String result = formatter.getFormattedValue(-999999999f, null);
        assertEquals("-1b", result);
    }

    @Test
    public void PartitionNegativeBillionToNegativeMillionRepresentativeValue() {
        LargeValueFormatter formatter = new LargeValueFormatter();
        String result = formatter.getFormattedValue(-33000000f, null);
        assertEquals("-33m", result);
    }

    @Test
    public void PartitionNegativeBillionToNegativeMillionUpperBoundary() {
        LargeValueFormatter formatter = new LargeValueFormatter();
        String result = formatter.getFormattedValue(-1000000f, null);
        assertEquals("-1m", result);
    }

    // (-Million, -Thousand] (-10^6, -10^3]
    @Test
    public void PartitionNegativeMillionToNegativeThousandLowerBoundary() {
        LargeValueFormatter formatter = new LargeValueFormatter();
        String result = formatter.getFormattedValue(-999999f, null);
        assertEquals("-1m", result);
    }

    @Test
    public void PartitionNegativeMillionToNegativeThousandRepresentativeValue() {
        LargeValueFormatter formatter = new LargeValueFormatter();
        String result = formatter.getFormattedValue(-44000f, null);
        assertEquals("-44k", result);
    }

    @Test
    public void PartitionNegativeMillionToNegativeThousandUpperBoundary() {
        LargeValueFormatter formatter = new LargeValueFormatter();
        String result = formatter.getFormattedValue(-1000f, null);
        assertEquals("-1k", result);
    }

    // (-Thousand, Thousand) (-10^3, 10^3)
    @Test
    public void PartitionNegativeThousandToThousandLowerBoundary() {
        LargeValueFormatter formatter = new LargeValueFormatter();
        String result = formatter.getFormattedValue(-999f, null);
        assertEquals("-999", result);
    }

    @Test
    public void PartitionNegativeThousandToThousandRepresentativeValue() {
        LargeValueFormatter formatter = new LargeValueFormatter();
        String result = formatter.getFormattedValue(6f, null);
        assertEquals("6", result);
    }

    @Test
    public void PartitionNegativeThousandToThousandUpperBoundary() {
        LargeValueFormatter formatter = new LargeValueFormatter();
        String result = formatter.getFormattedValue(999f, null);
        assertEquals("999", result);
    }

    // [Thousand, Million) [10^3, 10^6)
    @Test
    public void PartitionThousandToMillionLowerBoundary() {
        LargeValueFormatter formatter = new LargeValueFormatter();
        String result = formatter.getFormattedValue(1000f, null);
        assertEquals("1k", result);
    }

    @Test
    public void PartitionThousandToMillionRepresentativeValue() {
        LargeValueFormatter formatter = new LargeValueFormatter();
        String result = formatter.getFormattedValue(44400f, null);
        assertEquals("44.4k", result);
    }

    @Test
    public void PartitionThousandToMillionUpperBoundary() {
        LargeValueFormatter formatter = new LargeValueFormatter();
        String result = formatter.getFormattedValue(999999f, null);
        assertEquals("1m", result);
    }

    // [Million, Billion) [10^6, 10^9)
    @Test
    public void PartitionNegativeMillionToBillionLowerBoundary() {
        LargeValueFormatter formatter = new LargeValueFormatter();
        String result = formatter.getFormattedValue(1000000, null);
        assertEquals("1m", result);
    }

    @Test
    public void PartitionNegativeMillionToBillionRepresentativeValue() {
        LargeValueFormatter formatter = new LargeValueFormatter();
        String result = formatter.getFormattedValue(33300000f, null);
        assertEquals("33.3m", result);
    }

    @Test
    public void PartitionNegativeMillionToBillionUpperBoundary() {
        LargeValueFormatter formatter = new LargeValueFormatter();
        String result = formatter.getFormattedValue(999999999, null);
        assertEquals("1b", result);
    }
//   [Billion, Trillion) [10^9, 10^12)

    @Test
    public void PartitionBillionToTrillionLowerBoundary() {
        LargeValueFormatter formatter = new LargeValueFormatter();
        String result = formatter.getFormattedValue(1000000000, null);
        assertEquals("1b", result);
    }

    @Test
    public void PartitionBillionToTrillionRepresentativeValue() {
        LargeValueFormatter formatter = new LargeValueFormatter();
        String result = formatter.getFormattedValue(22200000000f, null);
        assertEquals("22.2b", result);
    }

    @Test
    public void PartitionBillionToTrillionUpperBoundary() {
        LargeValueFormatter formatter = new LargeValueFormatter();
        String result = formatter.getFormattedValue(999999999999f, null);
        assertEquals("1t", result);
    }

//    [Trillion, infinity)

    @Test
    public void PartitionTrillionToInfinityLowerBoundary() {
        LargeValueFormatter formatter = new LargeValueFormatter();
        String result = formatter.getFormattedValue(1000000000000f, null);
        assertEquals("1t", result);
    }

    @Test
    public void PartitionTrillionToInfinityRepresentativeValue() {
        LargeValueFormatter formatter = new LargeValueFormatter();
        String result = formatter.getFormattedValue(6870000000000f, null);
        assertEquals("6.87t", result);
    }

    @Test
    public void PartitionTrillionToInfinityUpperBoundary() {
        LargeValueFormatter formatter = new LargeValueFormatter();
        String result = formatter.getFormattedValue(998999999999999f, null);
        assertEquals("999t", result);
    }

    @Test
    public void test() {

        LargeValueFormatter formatter = new LargeValueFormatter();

        String result = formatter.getFormattedValue(5f, null);
        assertEquals("5", result);

        result = formatter.getFormattedValue(5.5f, null);
        assertEquals("5.5", result);

        result = formatter.getFormattedValue(50f, null);
        assertEquals("50", result);

        result = formatter.getFormattedValue(50.5f, null);
        assertEquals("50.5", result);

        result = formatter.getFormattedValue(500f, null);
        assertEquals("500", result);

        result = formatter.getFormattedValue(1100f, null);
        assertEquals("1.1k", result);

        result = formatter.getFormattedValue(10000f, null);
        assertEquals("10k", result);

        result = formatter.getFormattedValue(10500f, null);
        assertEquals("10.5k", result);

        result = formatter.getFormattedValue(100000f, null);
        assertEquals("100k", result);

        result = formatter.getFormattedValue(1000000f, null);
        assertEquals("1m", result);

        result = formatter.getFormattedValue(1500000f, null);
        assertEquals("1.5m", result);

        result = formatter.getFormattedValue(9500000f, null);
        assertEquals("9.5m", result);

        result = formatter.getFormattedValue(22200000f, null);
        assertEquals("22.2m", result);

        result = formatter.getFormattedValue(222000000f, null);
        assertEquals("222m", result);

        result = formatter.getFormattedValue(1000000000f, null);
        assertEquals("1b", result);

        result = formatter.getFormattedValue(9900000000f, null);
        assertEquals("9.9b", result);

        result = formatter.getFormattedValue(99000000000f, null);
        assertEquals("99b", result);

        result = formatter.getFormattedValue(99500000000f, null);
        assertEquals("99.5b", result);

        result = formatter.getFormattedValue(999000000000f, null);
        assertEquals("999b", result);

        result = formatter.getFormattedValue(1000000000000f, null);
        assertEquals("1t", result);

        formatter.setSuffix(new String[]{"", "k", "m", "b", "t", "q"}); // quadrillion support
        result = formatter.getFormattedValue(1000000000000000f, null);
        assertEquals("1q", result);

        result = formatter.getFormattedValue(1100000000000000f, null);
        assertEquals("1.1q", result);

        result = formatter.getFormattedValue(10000000000000000f, null);
        assertEquals("10q", result);

        result = formatter.getFormattedValue(13300000000000000f, null);
        assertEquals("13.3q", result);

        result = formatter.getFormattedValue(100000000000000000f, null);
        assertEquals("100q", result);

    }


}
