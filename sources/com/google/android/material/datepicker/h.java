package com.google.android.material.datepicker;

import android.view.View;
import com.spotify.music.C0707R;

class h extends z3 {
    final /* synthetic */ MaterialCalendar a;

    h(MaterialCalendar materialCalendar) {
        this.a = materialCalendar;
    }

    @Override // defpackage.z3
    public void onInitializeAccessibilityNodeInfo(View view, d5 d5Var) {
        String str;
        super.onInitializeAccessibilityNodeInfo(view, d5Var);
        if (MaterialCalendar.P4(this.a).getVisibility() == 0) {
            str = this.a.V2(C0707R.string.mtrl_picker_toggle_to_year_selection);
        } else {
            str = this.a.V2(C0707R.string.mtrl_picker_toggle_to_day_selection);
        }
        d5Var.c0(str);
    }
}
