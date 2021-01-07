package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Iterator;

class q implements AdapterView.OnItemClickListener {
    final /* synthetic */ MaterialCalendarGridView a;
    final /* synthetic */ r b;

    q(r rVar, MaterialCalendarGridView materialCalendarGridView) {
        this.b = rVar;
        this.a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        p a2 = this.a.getAdapter();
        if (i >= a2.a() && i <= a2.c()) {
            MaterialCalendar.e eVar = this.b.n;
            long longValue = this.a.getAdapter().getItem(i).longValue();
            MaterialCalendar.d dVar = (MaterialCalendar.d) eVar;
            if (MaterialCalendar.this.j0.g().s0(longValue)) {
                MaterialCalendar.this.i0.h2(longValue);
                Iterator<s<S>> it = MaterialCalendar.this.g0.iterator();
                while (it.hasNext()) {
                    it.next().a((S) MaterialCalendar.this.i0.Z1());
                }
                MaterialCalendar.this.o0.getAdapter().z();
                if (MaterialCalendar.this.n0 != null) {
                    MaterialCalendar.this.n0.getAdapter().z();
                }
            }
        }
    }
}
