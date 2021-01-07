package com.google.android.material.datepicker;

import android.widget.BaseAdapter;

/* access modifiers changed from: package-private */
public class p extends BaseAdapter {
    static final int n = v.f().getMaximum(4);
    final o a;
    final d<?> b;
    c c;
    final a f;

    p(o oVar, d<?> dVar, a aVar) {
        this.a = oVar;
        this.b = dVar;
        this.f = aVar;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.a.l();
    }

    /* renamed from: b */
    public Long getItem(int i) {
        if (i < this.a.l() || i > c()) {
            return null;
        }
        o oVar = this.a;
        return Long.valueOf(oVar.m((i - oVar.l()) + 1));
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return (this.a.l() + this.a.o) - 1;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.a.o + a();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return (long) (i / this.a.n);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ca  */
    @Override // android.widget.Adapter
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
        // Method dump skipped, instructions count: 314
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.p.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
