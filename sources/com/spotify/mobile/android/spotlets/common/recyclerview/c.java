package com.spotify.mobile.android.spotlets.common.recyclerview;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class c extends RecyclerView.l implements RecyclerView.n {
    protected final int a;
    protected boolean b;

    protected c(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void b(View view) {
        view.setTag(this.a, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void d(View view) {
        view.setTag(this.a, null);
    }

    public void g(RecyclerView recyclerView) {
        this.b = false;
        recyclerView.k(this, -1);
        recyclerView.l(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        int X = recyclerView.X(view);
        if (X > -1) {
            Boolean bool = (Boolean) view.getTag(this.a);
            if (bool == null || bool.booleanValue()) {
                n(X, view, recyclerView.a0(view));
                view.setTag(this.a, Boolean.valueOf(this.b));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
        this.b = true;
    }

    public void m(RecyclerView recyclerView) {
        this.b = false;
        recyclerView.A0(this);
        recyclerView.B0(this);
    }

    /* access modifiers changed from: protected */
    public abstract void n(int i, View view, RecyclerView.b0 b0Var);
}
