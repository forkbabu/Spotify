package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.MaterialCalendar;

class w implements View.OnClickListener {
    final /* synthetic */ int a;
    final /* synthetic */ x b;

    w(x xVar, int i) {
        this.b = xVar;
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.b.c.X4(this.b.c.R4().f(o.h(this.a, this.b.c.T4().c)));
        this.b.c.Y4(MaterialCalendar.CalendarSelector.DAY);
    }
}
