package com.spotify.music.features.editplaylist.header;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

class d extends RecyclerView.l {
    final /* synthetic */ SimpleHeaderLayout a;

    d(SimpleHeaderLayout simpleHeaderLayout) {
        this.a = simpleHeaderLayout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        ((RecyclerView.LayoutParams) view.getLayoutParams()).b();
        rect.set(0, 0, 0, 0);
        int Z = recyclerView.Z(view);
        if (Z != -1 && Z == 0) {
            rect.top = SimpleHeaderLayout.a(this.a);
        }
    }
}
