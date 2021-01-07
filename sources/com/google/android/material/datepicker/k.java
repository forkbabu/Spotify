package com.google.android.material.datepicker;

import android.view.View;

class k implements View.OnClickListener {
    final /* synthetic */ r a;
    final /* synthetic */ MaterialCalendar b;

    k(MaterialCalendar materialCalendar, r rVar) {
        this.b = materialCalendar;
        this.a = rVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int Y1 = this.b.V4().Y1() + 1;
        if (Y1 < MaterialCalendar.K4(this.b).getAdapter().u()) {
            this.b.X4(this.a.Y(Y1));
        }
    }
}
