package com.spotify.music.features.editplaylist.header;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

class e extends RecyclerView.q {
    final /* synthetic */ SimpleHeaderLayout a;

    e(SimpleHeaderLayout simpleHeaderLayout) {
        this.a = simpleHeaderLayout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c(RecyclerView recyclerView, int i, int i2) {
        int top;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) SimpleHeaderLayout.b(this.a).getLayoutManager();
        if (linearLayoutManager != null) {
            int i3 = 0;
            if (linearLayoutManager.Y1() == 0 && (top = recyclerView.getChildAt(0).getTop()) >= 0) {
                i3 = top;
            }
            SimpleHeaderLayout simpleHeaderLayout = this.a;
            SimpleHeaderLayout.c(simpleHeaderLayout, Math.min(i3, SimpleHeaderLayout.a(simpleHeaderLayout)));
        }
    }
}
