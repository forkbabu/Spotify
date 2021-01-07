package com.google.android.material.datepicker;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import java.util.Calendar;
import java.util.Locale;

class x extends RecyclerView.e<a> {
    private final MaterialCalendar<?> c;

    public static class a extends RecyclerView.b0 {
        final TextView C;

        a(TextView textView) {
            super(textView);
            this.C = textView;
        }
    }

    x(MaterialCalendar<?> materialCalendar) {
        this.c = materialCalendar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(a aVar, int i) {
        a aVar2 = aVar;
        int i2 = this.c.R4().k().f + i;
        String string = aVar2.C.getContext().getString(C0707R.string.mtrl_picker_navigate_to_year_description);
        aVar2.C.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        aVar2.C.setContentDescription(String.format(string, Integer.valueOf(i2)));
        c S4 = this.c.S4();
        Calendar e = v.e();
        b bVar = e.get(1) == i2 ? S4.f : S4.d;
        for (Long l : this.c.U4().U1()) {
            e.setTimeInMillis(l.longValue());
            if (e.get(1) == i2) {
                bVar = S4.e;
            }
        }
        bVar.d(aVar2.C);
        aVar2.C.setOnClickListener(new w(this, i2));
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a M(ViewGroup viewGroup, int i) {
        return new a((TextView) je.G(viewGroup, C0707R.layout.mtrl_calendar_year, viewGroup, false));
    }

    /* access modifiers changed from: package-private */
    public int Y(int i) {
        return i - this.c.R4().k().f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.R4().l();
    }
}
