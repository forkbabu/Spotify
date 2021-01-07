package com.spotify.music.features.podcast.episode.transcript.ui.page;

import androidx.recyclerview.widget.RecyclerView;

public final class h extends RecyclerView.q {
    final /* synthetic */ i a;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    h(i iVar) {
        this.a = iVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c(RecyclerView recyclerView, int i, int i2) {
        kotlin.jvm.internal.h.e(recyclerView, "ecyclerView");
        if (i2 != this.a.e) {
            i.f(this.a).b(i.e(this.a));
            this.a.e = i2;
        }
    }
}
