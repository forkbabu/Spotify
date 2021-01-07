package com.spotify.mobile.android.ui.layout_traits;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

class b extends GridLayoutManager.b {
    final /* synthetic */ RecyclerView d;
    final /* synthetic */ TraitsLayoutManager e;

    b(TraitsLayoutManager traitsLayoutManager, RecyclerView recyclerView) {
        this.e = traitsLayoutManager;
        this.d = recyclerView;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.b
    public int e(int i) {
        int C2 = this.e.C2();
        RecyclerView.e<?> adapter = this.d.getAdapter();
        if (adapter == null || this.e.b0 == null) {
            return this.e.C2();
        }
        if (i >= adapter.u()) {
            return 1;
        }
        return this.e.a0.c(i, adapter.u(), C2, this.e.b0, adapter);
    }
}
