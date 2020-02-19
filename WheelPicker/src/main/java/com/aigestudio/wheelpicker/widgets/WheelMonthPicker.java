package com.aigestudio.wheelpicker.widgets;

import android.content.Context;
import android.util.AttributeSet;

import com.aigestudio.wheelpicker.WheelPicker;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

/**
 * 月份选择器
 * <p>
 * Picker for Months
 *
 * @author AigeStudio 2016-07-12
 * @version 1
 */
public class WheelMonthPicker extends WheelPicker implements IWheelMonthPicker {
    private int mSelectedMonth;
    private String selectedMonthString;

    List<String> data = new ArrayList<>();

    public WheelMonthPicker(Context context) {
        this(context, null);
    }

    public void bind(List<String> months) {
        for (int i = 0; i < 12; i++) {
            data.add(months.get(i));
        }
        super.setData(data);

        mSelectedMonth = 0;
        selectedMonthString = data.get(0);
        updateSelectedYear();
    }

    public WheelMonthPicker(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private void updateSelectedYear() {
        setSelectedItemPosition(mSelectedMonth);
        selectedMonthString = data.get(mSelectedMonth);
    }

    @Override
    public void setData(List data) {
        throw new UnsupportedOperationException("You can not invoke setData in WheelMonthPicker");
    }

    @Override
    public int getSelectedMonth() {
        return mSelectedMonth;
    }

    @Override
    public void setSelectedMonth(int month) {
        mSelectedMonth = month;
        updateSelectedYear();
    }

    @Override
    public int getCurrentMonth() {
        return data.indexOf(selectedMonthString);
    }
}