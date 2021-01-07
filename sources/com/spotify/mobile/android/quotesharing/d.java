package com.spotify.mobile.android.quotesharing;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.h;

public final class d extends RecyclerView.l {
    private final int a;

    public d(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        h.e(rect, "outRect");
        h.e(view, "view");
        h.e(recyclerView, "parent");
        h.e(yVar, "state");
        int X = recyclerView.X(view);
        if (X != -1) {
            int i = this.a;
            if (X != 0) {
                i /= 2;
            }
            rect.left = i;
            rect.top = this.a;
            rect.right = X == yVar.c() + -1 ? this.a : this.a / 2;
            rect.bottom = this.a;
        }
    }
}
