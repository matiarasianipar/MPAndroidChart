package com.github.mikephil.charting.test;

import com.github.mikephil.charting.components.LimitLine;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LimitLineTest {
    @Test
    public void LimitLineFSMTestInitialConstruction() {
        LimitLine limitLine = new LimitLine(0);
        assertEquals(LimitLine.LimitLabelPosition.RIGHT_TOP, limitLine.getLabelPosition());
    }

    //    right top -> right Top
    @Test
    public void LimitLineFSMTestRightTopToRightTop() {
        LimitLine limitLine = new LimitLine(0);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.RIGHT_TOP);
        assertEquals(LimitLine.LimitLabelPosition.RIGHT_TOP, limitLine.getLabelPosition());
    }
    // right top -> left top
    @Test
    public void LimitLineFSMTestRightTopToLeftTop() {
        LimitLine limitLine = new LimitLine(0);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.LEFT_TOP);
        assertEquals(LimitLine.LimitLabelPosition.LEFT_TOP, limitLine.getLabelPosition());
    }
    // left top -> right top
    @Test
    public void LimitLineFSMLeftTopToRightTop() {
        LimitLine limitLine = new LimitLine(0);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.LEFT_TOP);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.RIGHT_TOP);
        assertEquals(LimitLine.LimitLabelPosition.RIGHT_TOP, limitLine.getLabelPosition());
    }

    // right top -> left bottom
    @Test
    public void LimitLineFSMRightTopLeftBottom() {
        LimitLine limitLine = new LimitLine(0);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.LEFT_BOTTOM);
        assertEquals(LimitLine.LimitLabelPosition.LEFT_BOTTOM, limitLine.getLabelPosition());
    }
    //    Left Bottom -> Right Top
    @Test
    public void LimitLineFSMLeftBottomToRightTop() {
        LimitLine limitLine = new LimitLine(0);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.LEFT_BOTTOM);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.RIGHT_TOP);
        assertEquals(LimitLine.LimitLabelPosition.RIGHT_TOP, limitLine.getLabelPosition());
    }

    @Test
    // right top -> right bottom
    public void LimitLineFSMRightTopToRightBottom() {
        LimitLine limitLine = new LimitLine(0);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.RIGHT_BOTTOM);
        assertEquals(LimitLine.LimitLabelPosition.RIGHT_BOTTOM, limitLine.getLabelPosition());
    }
    //  right bottom -> right top
    @Test
    public void LimitLineFSMRightBottomToRightTop() {
        LimitLine limitLine = new LimitLine(0);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.RIGHT_BOTTOM);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.RIGHT_TOP);
        assertEquals(LimitLine.LimitLabelPosition.RIGHT_TOP, limitLine.getLabelPosition());
    }

    // right bottom -> right bottom
    @Test
    public void LimitLineFSMRightBottomToRightBottom() {
        LimitLine limitLine = new LimitLine(0);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.RIGHT_BOTTOM);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.RIGHT_BOTTOM);
        assertEquals(LimitLine.LimitLabelPosition.RIGHT_BOTTOM, limitLine.getLabelPosition());
    }


    // left top -> right bottom
    @Test
    public void LimitLineFSMLeftTopToRightBottom() {
        LimitLine limitLine = new LimitLine(0);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.LEFT_TOP);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.RIGHT_BOTTOM);
        assertEquals(LimitLine.LimitLabelPosition.RIGHT_BOTTOM, limitLine.getLabelPosition());
    }

    // right bottom -> left bottom
    @Test
    public void LimitLineFSMRightBottomToLeftBottom() {
        LimitLine limitLine = new LimitLine(0);
        // right bottom -> left bottom
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.RIGHT_BOTTOM);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.LEFT_BOTTOM);
        assertEquals(LimitLine.LimitLabelPosition.LEFT_BOTTOM, limitLine.getLabelPosition());
    }

    // left bottom -> right Bottom
    @Test
    public void LimitLineFSMLeftBottomToRightBottom() {
        LimitLine limitLine = new LimitLine(0);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.LEFT_BOTTOM);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.RIGHT_BOTTOM);
        assertEquals(LimitLine.LimitLabelPosition.RIGHT_BOTTOM, limitLine.getLabelPosition());
    }

    //  right Bottom -> left top
    @Test
    public void LimitLineFSMRightBottomToLeftTop() {
        LimitLine limitLine = new LimitLine(0);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.RIGHT_BOTTOM);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.LEFT_TOP);
        assertEquals(LimitLine.LimitLabelPosition.LEFT_TOP, limitLine.getLabelPosition());
    }

    //  left Top -> left Top
    @Test
    public void LimitLineFSMLeftTopToLeftTop() {
        LimitLine limitLine = new LimitLine(0);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.LEFT_TOP);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.LEFT_TOP);
        assertEquals(LimitLine.LimitLabelPosition.LEFT_TOP, limitLine.getLabelPosition());
    }

    //  left Top -> left Bottom
    @Test
    public void LimitLineFSMLeftTopToLeftBottom() {
        LimitLine limitLine = new LimitLine(0);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.LEFT_TOP);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.LEFT_BOTTOM);
        assertEquals(LimitLine.LimitLabelPosition.LEFT_BOTTOM, limitLine.getLabelPosition());
    }

    //  left Bottom -> left Top
    @Test
    public void LimitLineFSMLeftBottomToLeftTop() {
        LimitLine limitLine = new LimitLine(0);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.LEFT_BOTTOM);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.LEFT_TOP);
        assertEquals(LimitLine.LimitLabelPosition.LEFT_TOP, limitLine.getLabelPosition());
    }


    //  left Bottom -> left Bottom
    @Test
    public void LimitLineFSMLeftBottomToLeftBottom() {
        LimitLine limitLine = new LimitLine(0);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.LEFT_BOTTOM);
        limitLine.setLabelPosition(LimitLine.LimitLabelPosition.LEFT_BOTTOM);
        assertEquals(LimitLine.LimitLabelPosition.LEFT_BOTTOM, limitLine.getLabelPosition());
    }


}
