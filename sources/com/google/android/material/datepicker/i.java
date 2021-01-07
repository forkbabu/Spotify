package com.google.android.material.datepicker;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

class i extends RecyclerView.q {
    final /* synthetic */ r a;
    final /* synthetic */ MaterialButton b;
    final /* synthetic */ MaterialCalendar c;

    i(MaterialCalendar materialCalendar, r rVar, MaterialButton materialButton) {
        this.c = materialCalendar;
        this.a = rVar;
        this.b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            CharSequence text = this.b.getText();
            int i2 = Build.VERSION.SDK_INT;
            recyclerView.announceForAccessibility(text);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c(RecyclerView recyclerView, int i, int i2) {
        int i3;
        if (i < 0) {
            i3 = this.c.V4().Y1();
        } else {
            i3 = this.c.V4().b2();
        }
        MaterialCalendar.Q4(this.c, this.a.Y(i3));
        this.b.setText(this.a.Z(i3));
    }
}
