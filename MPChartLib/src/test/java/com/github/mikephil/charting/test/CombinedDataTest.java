package com.github.mikephil.charting.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

import android.graphics.Paint;
import android.os.Environment;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import com.github.mikephil.charting.utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class CombinedDataTest {
    private LineData lineData;
    private CombinedData combinedData;
    private Utils myUtil;

    Entry myEntry = new Entry(1f,2f);
    LineDataSet mySet = new LineDataSet(Arrays.asList(myEntry), "label");
    @Spy
    LineData myLineData = new LineData(mySet);



    @Before
    public void setup(){
        combinedData = mock(CombinedData.class);
        myUtil = mock(Utils.class);

    }


//    @Test
//   public void firstTest(){
//        combinedData.setData(myLineData);
//        doCallRealMethod().when(combinedData).notifyDataChanged();
////        Assert.assertThat(combinedData.notifyDataChanged());
//        combinedData.notifyDataChanged();
//        verify(myLineData,times(1)).notifyDataChanged();
//
//    }



//    @Test
//    public void SecondTest(){
//        YAxis my = new YAxis();
//        YAxis spy = spy(my);
//        Paint p = new Paint();
//        AxisBase myBase = mock(AxisBase.class);
//        when(myBase.getLongestLabel()).thenReturn(".......");
//      System.out.println(my.getRequiredHeightSpace(p));
//      verify(myBase).getLongestLabel();
//
//        System.out.println(spy.getRequiredHeightSpace(p));
////        verify(myBase).getLongestLabel();
//    }

    @Spy
    YAxis mySpy = new YAxis();
    @Test
    public void ThirdTest(){
        Paint p = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.LINEAR_TEXT_FLAG);

        YAxis mine = mock(YAxis.class);
        YAxis my = new YAxis();
        YAxis my2 = Mockito.spy(my);
        when(my2.getLongestLabel()).thenReturn(".......");

        System.out.println(my2.getRequiredHeightSpace(p));
        verify(my2).getLongestLabel();
//        mySpy.getRequiredHeightSpace(p);
//        mySpy.getRequiredHeightSpace(p);
//        verify(mine,times(1)).getRequiredHeightSpace(p);




//        CombinedDataProvider my = mock(CombinedDataProvider.class);
//        List<BarLineScatterCandleBubbleData> myList = new ArrayList<>();
//        when(my.getCombinedData().getAllData()).thenReturn(myList);
//        myHighlight.getHighlightsAtXValue(1f,1f,1f);


//        verify(myBase).getLongestLabel();


    }


}
