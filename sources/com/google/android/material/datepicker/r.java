package com.google.android.material.datepicker;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
public class r extends RecyclerView.e<a> {
    private final a c;
    private final d<?> f;
    private final MaterialCalendar.e n;
    private final int o;

    public static class a extends RecyclerView.b0 {
        final TextView C;
        final MaterialCalendarGridView D;

        a(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C0707R.id.month_title);
            this.C = textView;
            q4.J(textView, true);
            this.D = (MaterialCalendarGridView) linearLayout.findViewById(C0707R.id.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    r(Context context, d<?> dVar, a aVar, MaterialCalendar.e eVar) {
        o k = aVar.k();
        o h = aVar.h();
        o j = aVar.j();
        if (k.compareTo(j) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (j.compareTo(h) <= 0) {
            int i = p.n;
            int i2 = MaterialCalendar.r0;
            this.o = (i * context.getResources().getDimensionPixelSize(C0707R.dimen.mtrl_calendar_day_height)) + (MaterialDatePicker.k5(context) ? context.getResources().getDimensionPixelSize(C0707R.dimen.mtrl_calendar_day_height) : 0);
            this.c = aVar;
            this.f = dVar;
            this.n = eVar;
            U(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(a aVar, int i) {
        a aVar2 = aVar;
        o q = this.c.k().q(i);
        aVar2.C.setText(q.n());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar2.D.findViewById(C0707R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !q.equals(materialCalendarGridView.getAdapter().a)) {
            p pVar = new p(q, this.f, this.c);
            materialCalendarGridView.setNumColumns(q.n);
            materialCalendarGridView.setAdapter((ListAdapter) pVar);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new q(this, materialCalendarGridView));
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a M(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) je.G(viewGroup, C0707R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.k5(viewGroup.getContext())) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.o));
        return new a(linearLayout, true);
    }

    /* access modifiers changed from: package-private */
    public o Y(int i) {
        return this.c.k().q(i);
    }

    /* access modifiers changed from: package-private */
    public CharSequence Z(int i) {
        return this.c.k().q(i).n();
    }

    /* access modifiers changed from: package-private */
    public int b0(o oVar) {
        return this.c.k().r(oVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        return this.c.k().q(i).p();
    }
}
