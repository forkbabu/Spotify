package com.google.android.material.datepicker;

import android.view.View;

class l implements View.OnClickListener {
    final /* synthetic */ r a;
    final /* synthetic */ MaterialCalendar b;

    l(MaterialCalendar materialCalendar, r rVar) {
        this.b = materialCalendar;
        this.a = rVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int b2 = this.b.V4().b2() - 1;
        if (b2 >= 0) {
            this.b.X4(this.a.Y(b2));
        }
    }
}
