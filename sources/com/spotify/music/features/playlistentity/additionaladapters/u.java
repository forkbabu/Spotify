package com.spotify.music.features.playlistentity.additionaladapters;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.subjects.a;

class u extends RecyclerView.q {
    private final int a;
    private final a<Integer> b;
    private final twd c;

    u(int i, a<Integer> aVar, twd twd) {
        this.a = i;
        this.b = aVar;
        this.c = twd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager != null && this.c.j0(this.a)) {
            this.b.onNext(Integer.valueOf(this.c.g0(this.a) - linearLayoutManager.b2()));
        }
    }
}
