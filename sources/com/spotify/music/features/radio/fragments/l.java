package com.spotify.music.features.radio.fragments;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

class l extends RecyclerView.l {
    final /* synthetic */ RecyclerView a;
    final /* synthetic */ RecyclerView.m b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    l(RadioFragment radioFragment, RecyclerView recyclerView, RecyclerView.m mVar, int i, int i2) {
        this.a = recyclerView;
        this.b = mVar;
        this.c = i;
        this.d = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        ((RecyclerView.LayoutParams) view.getLayoutParams()).b();
        rect.set(0, 0, 0, 0);
        int Z = this.a.Z(view);
        rect.set(Z == 0 ? this.c : this.d, 0, Z == this.b.i0() + -1 ? this.c : this.d, 0);
    }
}
