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
        for (int i = 1; i <= 12; i++) {
            data.add(months.get(i - 1));
        }
        super.setData(data);

        mSelectedMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        selectedMonthString = data.get(mSelectedMonth - 1);
        updateSelectedYear();
    }

    public WheelMonthPicker(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private void updateSelectedYear() {
        if( mSelectedMonth > 0){
            setSelectedItemPosition(mSelectedMonth - 1);
        }
        selectedMonthString = data.get(mSelectedMonth - 1);
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