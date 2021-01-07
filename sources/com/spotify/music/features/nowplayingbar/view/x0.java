package com.spotify.music.features.nowplayingbar.view;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class x0 extends RecyclerView.q {
    private final Rect a = new Rect();

    x0() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c(RecyclerView recyclerView, int i, int i2) {
        for (int i3 = 0; i3 < recyclerView.getChildCount(); i3++) {
            View childAt = recyclerView.getChildAt(i3);
            int paddingLeft = recyclerView.getPaddingLeft();
            int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            recyclerView.c0(childAt, this.a);
            childAt.setAlpha(e2.e(((1.0f - (((float) (Math.max(this.a.right - width, 0) + Math.max(paddingLeft - this.a.left, 0))) / ((float) this.a.width()))) * 2.0f) - 1.0f, 0.0f, 1.0f));
        }
    }
}
