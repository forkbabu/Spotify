package com.spotify.music.features.yourlibraryx.view;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.e;
import com.spotify.music.features.yourlibraryx.view.e;
import kotlin.jvm.internal.h;

/* JADX WARN: Incorrect field signature: TT; */
public final class o<T extends RecyclerView.e<?> & e> extends GridLayoutManager.b {
    private final RecyclerView.e d;
    private final int e;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T extends androidx.recyclerview.widget.RecyclerView$e<?> & com.spotify.music.features.yourlibraryx.view.e */
    /* JADX WARN: Multi-variable type inference failed */
    public o(T t, int i) {
        h.e(t, "adapter");
        this.d = t;
        this.e = i;
        f(true);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.b
    public int e(int i) {
        return ((e) this.d).l(i, this.e);
    }
}
