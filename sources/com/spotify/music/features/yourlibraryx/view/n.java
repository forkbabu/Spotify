package com.spotify.music.features.yourlibraryx.view;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.h;

public final class n extends RecyclerView.l {
    private final int a;
    private final int b;

    public n(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        h.e(rect, "outRect");
        h.e(view, "view");
        h.e(recyclerView, "parent");
        h.e(yVar, "state");
        if (recyclerView.X(view) != -1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof GridLayoutManager.LayoutParams) {
                GridLayoutManager.LayoutParams layoutParams2 = (GridLayoutManager.LayoutParams) layoutParams;
                if (layoutParams2.h() == this.a) {
                    rect.set(0, 0, 0, 0);
                    return;
                }
                int g = layoutParams2.g();
                if (g == 0) {
                    int i = this.b;
                    rect.set(i, i, i / 2, i);
                    return;
                }
                int h = layoutParams2.h() - 1;
                if (1 <= g && h > g) {
                    int i2 = this.b;
                    rect.set(i2 / 2, i2, i2 / 2, i2);
                    return;
                }
                int i3 = this.b;
                rect.set(i3 / 2, i3, i3, i3);
            }
        }
    }
}
