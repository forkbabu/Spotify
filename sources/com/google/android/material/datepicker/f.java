package com.google.android.material.datepicker;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.spotify.music.C0707R;
import java.util.Calendar;
import java.util.Locale;

class f extends BaseAdapter {
    private static final int f = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);
    private final Calendar a;
    private final int b;
    private final int c;

    public f() {
        Calendar f2 = v.f();
        this.a = f2;
        this.b = f2.getMaximum(7);
        this.c = f2.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        int i2 = this.b;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.c;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) je.G(viewGroup, C0707R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        Calendar calendar = this.a;
        int i2 = i + this.c;
        int i3 = this.b;
        if (i2 > i3) {
            i2 -= i3;
        }
        calendar.set(7, i2);
        textView.setText(this.a.getDisplayName(7, f, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C0707R.string.mtrl_picker_day_of_week_column_header), this.a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
