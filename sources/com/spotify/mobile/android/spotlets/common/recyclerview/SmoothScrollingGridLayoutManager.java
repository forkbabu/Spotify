package com.spotify.mobile.android.spotlets.common.recyclerview;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;

public class SmoothScrollingGridLayoutManager extends GridLayoutManager {

    class a extends t {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.x
        public PointF a(int i) {
            return SmoothScrollingGridLayoutManager.this.b(i);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.t
        public float q(DisplayMetrics displayMetrics) {
            SmoothScrollingGridLayoutManager.this.getClass();
            return 0.0f / ((float) displayMetrics.densityDpi);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void I1(RecyclerView recyclerView, RecyclerView.y yVar, int i) {
        a aVar = new a(recyclerView.getContext());
        aVar.m(i);
        J1(aVar);
    }
}
