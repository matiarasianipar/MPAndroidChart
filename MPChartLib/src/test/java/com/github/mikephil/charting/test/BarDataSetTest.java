package com.github.mikephil.charting.test;

import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BarDataSetTest {
    @Test
    public void testNewCalcStackSizePublicMethod(){
        List<BarEntry> listofBarEntries = new ArrayList<>();
        float x = 2f;
        float[] vals ={1f,2f};
        float x2 = 2f;
        float[] vals2 = {1f};
        BarEntry barEntry1 = new BarEntry(x,vals);
        BarEntry barEntry2 = new BarEntry(x,vals);
        listofBarEntries.add(barEntry1);
        listofBarEntries.add(barEntry2);
        BarDataSet myBarDataSet = new BarDataSet(listofBarEntries,null);

        myBarDataSet.dummyCalcStackSize(listofBarEntries);
//      call getter
        int stackSize = myBarDataSet.getStackSize();

        Assert.assertEquals(2,stackSize);

    }
}
