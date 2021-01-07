package com.spotify.music.features.yourlibraryx.quickscroll;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.yourlibrary.quickscroll.QuickScrollView;
import kotlin.jvm.internal.h;

public final class d extends RecyclerView.q {
    final /* synthetic */ QuickScrollConnectable a;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    d(QuickScrollConnectable quickScrollConnectable) {
        this.a = quickScrollConnectable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c(RecyclerView recyclerView, int i, int i2) {
        h.e(recyclerView, "recyclerView");
        if (i2 != this.a.m()) {
            QuickScrollView g = QuickScrollConnectable.g(this.a);
            h.c(g);
            g.b(QuickScrollConnectable.b(this.a));
        }
        this.a.o(i2);
    }
}
