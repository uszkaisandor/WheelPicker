package com.aigestudio.wheelpicker.widgets;

import android.widget.TextView;

import com.aigestudio.wheelpicker.model.YearMonthDay;

import java.util.Date;

public interface IWheelDatePicker {
    void setOnDateSelectedListener(WheelDatePicker.OnDateSelectedListener listener);

    YearMonthDay getCurrentDate();

    int getItemAlignYear();

    void setItemAlignYear(int align);

    int getItemAlignMonth();

    void setItemAlignMonth(int align);

    int getItemAlignDay();

    void setItemAlignDay(int align);

    WheelYearPicker getWheelYearPicker();

    WheelMonthPicker getWheelMonthPicker();

    WheelDayPicker getWheelDayPicker();

    TextView getTextViewYear();

    TextView getTextViewMonth();

    TextView getTextViewDay();
}