package com.spotify.music.features.entityselector.pages.tracks.view;

import androidx.recyclerview.widget.m;
import kotlin.jvm.internal.h;

public final class b extends m.d<uy4> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.m.d
    public boolean a(uy4 uy4, uy4 uy42) {
        uy4 uy43 = uy4;
        uy4 uy44 = uy42;
        h.e(uy43, "oldItem");
        h.e(uy44, "newItem");
        return h.a(uy43, uy44);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.m.d
    public boolean b(uy4 uy4, uy4 uy42) {
        uy4 uy43 = uy4;
        uy4 uy44 = uy42;
        h.e(uy43, "oldItem");
        h.e(uy44, "newItem");
        return h.a(uy43.c(), uy44.c());
    }
}
