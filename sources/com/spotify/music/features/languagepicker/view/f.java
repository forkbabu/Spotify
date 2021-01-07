package com.spotify.music.features.languagepicker.view;

import androidx.recyclerview.widget.RecyclerView;

public class f extends RecyclerView.q {
    private final a a;
    private final int b;
    private int c;

    public interface a {
        void a();
    }

    private f(a aVar, RecyclerView recyclerView, int i) {
        aVar.getClass();
        this.a = aVar;
        this.b = i;
        recyclerView.getClass();
        recyclerView.n(this);
    }

    public static f e(a aVar, RecyclerView recyclerView, int i) {
        return new f(aVar, recyclerView, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.c + i2;
        this.c = i3;
        if (i3 > this.b) {
            recyclerView.D0(this);
            this.a.a();
        }
    }
}
