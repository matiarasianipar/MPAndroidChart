package com.github.mikephil.charting.test;

import static junit.framework.Assert.assertEquals;

//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.verifyNoMoreInteractions;
//import static org.mockito.Mockito.when;

import android.graphics.Paint;

import com.github.mikephil.charting.components.YAxis;

import org.junit.Assert;
import org.junit.Test;
//import org.mockito.Mockito;

public class YAxisTest {
    //  calculate the offset between boarder of graph and the graph itself.
    @Test
    public void testComputeAxisValues() {
        YAxis yAxis = new YAxis();
        Paint p = new Paint();
        Float widthSpace = yAxis.getRequiredWidthSpace(p);
        assertEquals(10f, widthSpace);

        yAxis.setMinWidth(10f);
        yAxis.setMaxWidth(11f);
        widthSpace = yAxis.getRequiredWidthSpace(p);
        assertEquals(10f, widthSpace);

    }

    @Test
    public void YAxisCalculate() {
        YAxis yAxis = new YAxis();
        YAxis yAxis2 = new YAxis();

        // range zero
        yAxis.calculate(0, 0);
        Float axisMinimum = yAxis.getAxisMinimum();
        Float axisMaximum = yAxis.getAxisMaximum();
        Float range = Math.abs(axisMinimum - axisMaximum);
        assertEquals(2.4f, range);

        // neither are true
        yAxis.calculate(10, 2);
        axisMinimum = yAxis.getAxisMinimum();
        axisMaximum = yAxis.getAxisMaximum();
        range = Math.abs(axisMinimum - axisMaximum);
        assertEquals(6.3999996f, range);

        // CustomAxisMinmum is true
        yAxis.setAxisMinimum(10f);
        yAxis.calculate(10, 2);

        axisMinimum = yAxis.getAxisMinimum();
        axisMaximum = yAxis.getAxisMaximum();
        range = Math.abs(axisMinimum - axisMaximum);
        assertEquals(5.5f, range);

        // both CustomaxisMinimum and CustomaxisMaximum are true
        yAxis.setAxisMaximum(2f);
        yAxis.calculate(10, 2);
        axisMinimum = yAxis.getAxisMinimum();
        axisMaximum = yAxis.getAxisMaximum();
        range = Math.abs(axisMinimum - axisMaximum);
        assertEquals(8f, range);

        // only CustomaxisMaximum is true
        yAxis2.setAxisMaximum(11f);
        yAxis2.calculate(10, -2);
        Float axisMinimum2 = yAxis2.getAxisMinimum();
        Float axisMaximum2 = yAxis2.getAxisMaximum();
        Float range2 = Math.abs(axisMinimum2 - axisMaximum2);
        assertEquals(14.1f, range2);

    }



//    @Test
//    public void mockGetLongestLabelInRequiredHeightSpace(){
//        Paint p = new Paint();
//
//        YAxis yAxisMock = mock(YAxis.class);
//        YAxis spy = Mockito.spy(new YAxis());
//        when(spy.getLongestLabel()).thenReturn(".......");
//
//        float output = spy.getRequiredHeightSpace(p);
//        verify(spy).getLongestLabel();
//        verifyNoMoreInteractions(yAxisMock);
//
//        Assert.assertEquals(0.0, output,0);
//
//    }

}

