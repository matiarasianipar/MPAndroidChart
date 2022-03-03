package com.github.mikephil.charting.test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.renderer.XAxisRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;

import org.junit.Test;

public class XAxisRendererTest {


    @Test
    public void mockXAxis() {
        XAxis xAxisMock = mock(XAxis.class);
        ViewPortHandler viewPortHandler = new ViewPortHandler();
        XAxisRenderer renderer = new XAxisRenderer(viewPortHandler, xAxisMock, null);
        when(xAxisMock.getLongestLabel()).thenReturn(".....");

        renderer.computeAxis(0, 0, false);
        verify(xAxisMock).getLongestLabel();
    }
}
