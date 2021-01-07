package com.spotify.music.nowplaying.drivingmode.view.voicesuggestions;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public class b extends RecyclerView.l {
    private final Drawable a;

    public b(Drawable drawable) {
        this.a = drawable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        ((RecyclerView.LayoutParams) view.getLayoutParams()).b();
        rect.set(0, 0, 0, 0);
        if (recyclerView.X(view) != 0) {
            rect.top = this.a.getIntrinsicHeight();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            this.a.setBounds(paddingLeft, bottom, width, this.a.getIntrinsicHeight() + bottom);
            this.a.draw(canvas);
        }
    }
}
