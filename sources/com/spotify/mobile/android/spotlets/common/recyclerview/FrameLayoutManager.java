package com.spotify.mobile.android.spotlets.common.recyclerview;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public class FrameLayoutManager extends RecyclerView.m {
    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.LayoutParams R() {
        return new RecyclerView.LayoutParams(-1, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void c1(RecyclerView.s sVar, RecyclerView.y yVar) {
        N(sVar);
        int i0 = i0();
        for (int i = 0; i < i0; i++) {
            View g = sVar.g(i);
            G0(g, 0, 0);
            v(g);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) g.getLayoutParams();
            int g0 = g0();
            int v0 = v0();
            int paddingTop = getPaddingTop();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingBottom = getPaddingBottom();
            int c0 = (((g0 - paddingTop) - paddingBottom) - c0(g)) / 2;
            int d = (((v0 - paddingLeft) - paddingRight) - d(g)) / 2;
            E0(g, paddingLeft + d + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, paddingTop + c0 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, ((v0 - paddingRight) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) - d, ((g0 - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - c0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void v1(int i) {
    }
}
